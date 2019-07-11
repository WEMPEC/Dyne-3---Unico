//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (LoadButton)
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Dorm Designer 3000 LoadButton Class.
 * 
 * @author KatyDong
 *
 */
public class LoadButton extends Button implements DormGUI {

  /**
   * Constructor creates a new Load button whose name is "Load Room".
   * 
   * @param x the x-position of the center of the button
   * @param y the y-position of the center of the button
   * @param processing the parameter where the utility class will pass in.
   */
  public LoadButton(float x, float y, PApplet processing) {
    super(x, y, processing);
    this.label = "Load Room";
  }


  /**
   * if the button is being pressed, load the arrangement of the furniture, that has been saved
   * previously in the display screen.
   * 
   */
  @Override
  public void mouseDown(Furniture[] furniture) {
    if (isMouseOver()) {
      load(furniture);

    }
  }

  /**
   * Helper method that loads the furniture array.
   * 
   * @param furniture
   */
  private void load(Furniture[] furniture) {
    // initializing local variables
    String type = "";
    String[] ar = new String[3];
    String line = "";
    int i = 0;
    float xLocation = 0;
    float yLocation = 0;
    int rotation = 0;
    String file = "RoomData.ddd";

    // first clear all the objects in the display screen before loading the file.

    if (furniture != null) {
      for (int a = 0; a < furniture.length; ++a) {
        furniture[a] = null;
      }
    }
    try {
      File f = new File(file);
      FileReader in = new FileReader(f);
      BufferedReader br = new BufferedReader(in);
      line = br.readLine();

      // While the line being read by bufferedreader is not null enter the while loop.
      while (line != null) {
        // If the line is not empty, going through each line to extract necessary information of
        // furniture.
        if (!line.isEmpty()) {
          try {
            // The maximum furniture can be loaded to the display screen is six. If the number i is
            // exceed this boundary, throw exception.
            if (i > 5) {
              throw new IndexOutOfBoundsException();
            }

            // Extract the type of furniture. If the type is not one of the types we have, throw
            // null pointer exception.
            type = line.split(":")[0].trim().toLowerCase();
            if (!(type.equals("bed") || type.equals("sofa") || type.equals("desk")
                || type.equals("dresser") || type.equals("sink"))) {
              throw new NullPointerException(type);
            }

            ar = line.split(":")[1].split(",");
            xLocation = Float.parseFloat(ar[0].trim());
            yLocation = Float.parseFloat(ar[1].trim());
            rotation = Integer.parseInt(ar[2].trim());
            // creating a new furniture object based on the information we extract previously.
            furniture[i] = new Furniture(type, xLocation, yLocation, rotation, processing);
            ++i;

          } catch (NumberFormatException e2) {
            System.out.println("WARNING: Found incorrectly formatted line in file: " + line);
          } catch (NullPointerException e1) {
            System.out.println(
                "WARNING: Could not find an image for a furniture object of type: <" + type + ">");
          }
        }
        line = br.readLine();
      }
      br.close();
      in.close();
      // Catch blocks will catch different types of exception and print different warning message.
    } catch (IndexOutOfBoundsException e3) {
      System.out.print("WARNING: Unable to load more furniture.");
    } catch (FileNotFoundException e4) {
      System.out.print("WARNING: Could not load room contents from file RoomData.ddd.");
    } catch (IOException e5) {
      System.out.print("Catch IOException");

    }
  }
}

