//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (SaveButton)
// Files: .java
// Semester: CS 300 Summer 2018
//
// Author: (Yu (Katy)Dong)
// Email: (ydong65@wisc.edu)
// CS Login: (Katy)
// Lecturer's Name: (Mouna Kacem)
// Lecture Section: 001
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates
// strangers, etc do. If you received no outside help from either type of
// source, then please explicitly indicate NONE.
//
// Persons: (identify each person and describe their help in detail)
// Online Sources: (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

/**
 * The SaveButton Class of the dorm designer program.
 * 
 * @author KatyDong
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;


public class SaveButton extends Button implements DormGUI {

  /**
   * Constructor creates a new Save button whose name is "Save Room".
   * 
   * @param x the x-position of the center of the button
   * @param y the y-position of the center of the button
   * @param processing the parameter where the utility class will pass in.
   */
  public SaveButton(float x, float y, PApplet processing) {
    super(x, y, processing);
    this.label = "Save Room";
  }



  /**
   * if the button is being pressed, save the arrangement of the furniture in the display screen.
   * 
   */
  @Override
  public void mouseDown(Furniture[] furniture) {
    // If mouse is over and is pressed down the region of save button, call save (furniture) method.
    if (isMouseOver()) {
      save(furniture);
    }
  }



  /**
   * helper method that helps the user to save the content on the display to a file called
   * "RoomData.ddd".
   * 
   * @param furniture represents a array that contains all of the furniture information.
   */
  private void save(Furniture[] furniture) {

    File file = new File("RoomData.ddd");
    // creates the file
    try {
      file.createNewFile();

      // creates a FileWriter Object
      PrintStream writeFurniture = new PrintStream(file);

      // if mouse is over the region of the button, go through the furniture array to extract
      // information of its type, position, and number of rotations.
      if (isMouseOver()) {
        for (int x = 0; x < furniture.length; ++x) {
          if (furniture[x] != null) {
            writeFurniture.append(furniture[x].getName() + ":" + furniture[x].getPositionX() + ","
                + furniture[x].getPositionY() + "," + furniture[x].getRotations());
            writeFurniture.append("\r\n");
          }
        }
        writeFurniture.close();
      }
    }
    // catch blocks would catch the FileNotFoundException exception and print warning message.
    catch (FileNotFoundException e) {

      System.out.print("WARNING: Could not save room contents to file RoomData.ddd.");

    } catch (IOException e) {

      System.out.print("WARNING: Catch IOException");

    }
  }
}
