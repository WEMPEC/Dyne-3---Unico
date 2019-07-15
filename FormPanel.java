import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.ParserConfigurationException;

public class FormPanel extends JPanel {
  private FormListener formev;
  private JLabel headerLabel, imageLabel, loadNotify, temp;
  private JTextField headertextField;
  private Image image;
  private JButton stopDrive, stopPiu, savebutton, loadbutton;
  private JButton reset;
  private TabPanel tab;


  public FormPanel() {
    headerLabel = new JLabel("  Dyne 3");
    headerLabel.setFont(new Font("Courier New", Font.BOLD, 46));
    headertextField = new JTextField("WEMPEC CELL4 170KW");
    reset = new JButton("RESET");
    reset.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    loadNotify = new JLabel("load Notify message");
    temp = new JLabel("Save Notify Message");
    try {
      image = ImageIO.read(new File("letter.png")).getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    Image imgresize = image.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    imageLabel = new JLabel(new ImageIcon(imgresize));

    // Buttons
    stopDrive = new JButton("Stop Drives");
    stopPiu = new JButton("Stop  Piu     ");
    stopDrive.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    stopPiu.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    stopDrive.setBackground(Color.red);
    stopDrive.setForeground(Color.WHITE);
    stopPiu.setBackground(Color.red);
    stopPiu.setForeground(Color.WHITE);

    savebutton = new JButton("  SAVE ");
    savebutton.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    savebutton.setSize(200, 50);
    LoadButton fileUpload = new LoadButton(savebutton, loadbutton);
    savebutton.addActionListener(new ActionListener() {
      // temp = new JLabel();

      @Override
      public void actionPerformed(ActionEvent arg0) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML file", "xml");
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileFilter(filter);
        j.setPreferredSize(new Dimension(800, 600));

        // invoke the showsSaveDialog function to show the save dialog
        int r = j.showSaveDialog(null);

        // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION)

        {
          // set the label to the path of the selected file
          temp.setText("Save" + j.getSelectedFile().getAbsolutePath() + "successfully");
        }

        // if the user cancelled the operation
        else if (j.getSelectedFile() == null) {
          temp.setText("SAVE operation cancel");
        } else {
          temp.setText("Save" + j.getSelectedFile().getAbsolutePath() + "Failed");
        }

      }
    });
    loadbutton = new JButton(" LOAD  ");
    loadbutton.setSize(200, 50);
    loadbutton.setFont((new Font("Times New Roman", Font.BOLD, 17)));

    loadbutton.addActionListener(new ActionListener() {
      JLabel temp = new JLabel();

      @Override
      public void actionPerformed(ActionEvent arg0) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML file", "xml");
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setPreferredSize(new Dimension(800, 600));
        j.setFont((new Font("Times New Roman", Font.BOLD, 26)));
        j.setFileFilter(filter);

        // invoke the showsOpenDialog function to show the save dialog
        // int r = j.showOpenDialog(null);
        //
        // // if the user selects a file
        // if (r == JFileChooser.APPROVE_OPTION)
        //
        // {
        // // set the label to the path of the selected file
        // temp.setText(j.getSelectedFile().getAbsolutePath());
        // }
        // // if the user cancelled the operation
        // else
        // temp.setText("the user cancelled the operation");
        // }



        int returnVal = j.showOpenDialog(null);


        if (returnVal == JFileChooser.APPROVE_OPTION) {
          File file = j.getSelectedFile();
          // This is where a real application would open the file.
          loadNotify.setText("Load: " + file.getName() + " successfully.");
          try {
            ParseXml loadinfo = new ParseXml (file);
          } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          
          
        } else {
          if (j.getSelectedFile() == null) {
            loadNotify.setText("LOAD operation cancel");
          } else {
            loadNotify.setText("Load" + j.getSelectedFile().getAbsolutePath() + "Failed");
          }
        }
      }

    });

    tab = new TabPanel();
    // call layout manager to determines the perferred size.

    Dimension dim = getPreferredSize();

    // resize the panel.
    dim.width = 1000;
    dim.height = 900;

    setPreferredSize(dim);
    // layout();
    //
    // public void layout() {
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();
    // x from left to right


    ///////////// first row/////////////////////
    gc.weightx = 1;
    gc.weighty = 0;
    // fill can be horizontal, vertical, none or both.
    gc.fill = GridBagConstraints.NONE;
    // make sure the line is start in from left to the right.
    gc.anchor = GridBagConstraints.LINE_START;
    gc.gridx = 0;
    gc.gridy = 1;
    gc.insets = new Insets(20, 20, 0, 0);
    add(headerLabel, gc);
    gc.insets = new Insets(20, 20, 0, 0);
    add(imageLabel, gc);
    gc.insets = new Insets(20, 200, 0, 0);

    // gc.gridx = 2;
    gc.insets = new Insets(20, 300, 0, 0);
    add(reset, gc);
    gc.insets = new Insets(20, 450, 0, 0);
    add(stopDrive, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    ///////////// SECOND ROW ///////////////////////
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    gc.gridy++;
    gc.weighty = 0;
    gc.insets = new Insets(0, 450, 0, 0);
    add(stopPiu, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    //////// Save and load button/////////

    gc.anchor = GridBagConstraints.LINE_START;

    gc.weighty = 0;
    gc.insets = new Insets(0, 195, 0, 0);

    add(loadNotify, gc);
    gc.insets = new Insets(0, 100, 0, 0);
    add(savebutton, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    gc.insets = new Insets(0, 0, 0, 500);
    add(loadbutton, gc);

    // gc.insets = new Insets(0, 0, 0, 300);
    //
    // add(temp, gc);

    // // THIRD ROW
    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;

    // add(loadNotify, gc);
    gc.insets = new Insets(0, 195, 0, 0);

    add(temp, gc);

    //
    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.insets = new Insets(0, 10, 0, 0);
    add(tab, gc);

    // gc.weightx = 1;
    // gc.weighty = 0.2;
    // gc.gridx = 1;
    // gc.insets = new Insets(0, 0, 0, 0);
    // add(ageList, gc);
    gc.anchor = GridBagConstraints.LINE_END;



  }

  public void setFormListener(FormListener formListener) {
    // TODO Auto-generated method stub

    this.formev = formListener;
  }

}


class AgeCat {
  private String text;
  private int id;

  public AgeCat(int id, String text) {
    this.text = text;
    this.id = id;
  }

  public String toString() {
    return text;
  }

  public int getID() {
    return id;
  }
}
