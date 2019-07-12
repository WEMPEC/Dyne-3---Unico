import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.*;

public class LoadButton extends JFrame implements ActionListener {

  private JButton load, save;
  private JLabel one;

  public LoadButton(JButton save, JButton load) {
    // TODO Auto-generated constructor stub
    this.load = load;
    this.save = save;
    one = new JLabel();
  }

  @Override
  public void actionPerformed(ActionEvent evt) {
    // TODO Auto-generated method stub
    // if the user presses the save button show the save dialog 
    String com = evt.getActionCommand(); 

    if (com.equals("  SAVE ")) { 
        // create an object of JFileChooser class 
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 

        // invoke the showsSaveDialog function to show the save dialog 
        int r = j.showSaveDialog(null); 

        // if the user selects a file 
        if (r == JFileChooser.APPROVE_OPTION) 

        { 
            // set the label to the path of the selected file 
           one .setText(j.getSelectedFile().getAbsolutePath()); 
        } 
        // if the user cancelled the operation 
        else
            one.setText("the user cancelled the operation"); 
    } 

    // if the user presses the open dialog show the open dialog 
    else { 
        // create an object of JFileChooser class 
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); 

        // invoke the showsOpenDialog function to show the save dialog 
        int r = j.showOpenDialog(null); 

        // if the user selects a file 
        if (r == JFileChooser.APPROVE_OPTION) 

        { 
            // set the label to the path of the selected file 
            one.setText(j.getSelectedFile().getAbsolutePath()); 
        } 
        // if the user cancelled the operation 
        else
         one .setText("the user cancelled the operation"); 
  } 
}
}


