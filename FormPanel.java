import java.awt.BorderLayout;
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
import java.io.FileWriter;
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
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.ParserConfigurationException;

public class FormPanel extends JPanel {

  private JLabel headerLabel, imageLabel, loadNotify, temp;
  private JTextField headertextField;
  private Image image;
  private JButton stopDrive, stopPiu, savebutton, loadbutton;
  private JButton reset;
  private TabPanel tab;
  private Boolean upload;
  private ParseXml loadinfo;
  private JSpinner spinner;
  private GridBagConstraints gc;
  private MiddlePanel middlep;
  private boolean restcheck;
  private String filename;


  /**
   * @return the restcheck
   */
  public boolean isRestcheck() {
    return restcheck;
  }


  public FormPanel() {
    filename = null;
    JSpinner spinner = new JSpinner();
    JComponent editor = spinner.getEditor();
    JFormattedTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
    tf.setColumns(7);
    spinner.setPreferredSize(new Dimension(150, 100));
    spinner.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner.setModel(new SpinnerNumberModel(new Integer(300), null, null, new Integer(1)));

    upload = false;
    headerLabel = new JLabel("  Dyne 3");
    headerLabel.setFont(new Font("Courier New", Font.BOLD, 46));
    headertextField = new JTextField("WEMPEC CELL4 170KW");
    reset = new JButton("RESET");
    reset.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    loadNotify = new JLabel("Load Notify Message");
    loadNotify.setFont((new Font("Times New Roman", Font.BOLD, 18)));
    temp = new JLabel("Save Notify Message");
    temp.setFont((new Font("Times New Roman", Font.BOLD, 18)));
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


    // call layout manager to determines the perferred size.
    tab = new TabPanel(loadinfo);

    Dimension dim = getPreferredSize();

    // resize the panel.
    dim.width = 1000;
    dim.height = 900;

    setPreferredSize(dim);
    // layout();
    //
    // public void layout() {
    setLayout(new GridBagLayout());
    gc = new GridBagConstraints();
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
    gc.insets = new Insets(20, 300, 0, 0);
    // add(reset, gc);
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
    gc.insets = new Insets(0, 10, 0, 0);

    add(loadNotify, gc);
    gc.insets = new Insets(0, 100, 0, 0);
    // gc.insets = new Insets(0, 0, 0, 300);
    //
    // add(temp, gc);

    // // THIRD ROW
    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;

    gc.insets = new Insets(0, 10, 0, 0);

    add(temp, gc);
    if (!upload) {
      gc.anchor = GridBagConstraints.LINE_START;
      gc.gridx = 0;
      gc.gridy++;
      gc.weightx = 1;
      gc.weighty = 0.5;
      gc.insets = new Insets(0, 10, 40, 0);
      add(tab, gc);
      gc.anchor = GridBagConstraints.LINE_END;
    }



    // reset.addActionListener(new ActionListener() {
    //
    // @Override
    // public void actionPerformed(ActionEvent arg0) {
    // restcheck = true;
    // try {
    // loadinfo = new ParseXml(null);
    // new MiddlePanel (null);
    //
    // } catch (ParserConfigurationException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // // TODO Auto-generated method stub
    // tab.removeAll();
    // //middlep.removeAll();
    // revalidate();
    // System.out.print("reset is clicked");
    // tab = new TabPanel(null);
    // revalidate();
    // gc.gridx = 0;
    // gc.gridy = 4;
    // add(tab, gc);
    // }
    // });
  }


  public MiddlePanel getActionLoadListener(JFileChooser j) {

    MiddlePanel middle = new MiddlePanel(loadinfo);

    int returnVal = j.showOpenDialog(null);

    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = j.getSelectedFile();
      // This is where a real application would open the file.
      loadNotify.setText("Load: " + file.getName() + " successfully.");
      filename = file.getAbsolutePath();
      try {
        this.loadinfo = new ParseXml(file);
        upload = true;
        tab.removeAll();
        tab = new TabPanel(loadinfo);
        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 0;
        gc.gridy = 4;
        gc.insets = new Insets(0, 10, 35, 0);
        add(tab, gc);

        middle = new MiddlePanel(loadinfo);


        System.out.println("load infor in formpanel           " + loadinfo.getSentVal()[2]);

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
    return middle;
  }

  public void getActionSaveListener(String sliderinfo, Boolean saveCheck) {
    if (filename == null || !saveCheck) {
      FileNameExtensionFilter filter = new FileNameExtensionFilter("XML file", "xml");
      JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      j.setFileFilter(filter);
      j.setPreferredSize(new Dimension(800, 600));

      // invoke the showsSaveDialog function to show the save dialog
      int r = j.showSaveDialog(null);
      // if the user selects a file
      if (r == JFileChooser.APPROVE_OPTION) {
        try {
          FileWriter fw = new FileWriter(j.getSelectedFile() + ".xml");
          String tempinfo = tab.getInfo(sliderinfo);
          fw.write(tempinfo);
          fw.close();
        } catch (Exception ex) {
          ex.printStackTrace();
        }
        // set the label to the path of the selected file
        temp.setText("Save" + j.getSelectedFile().getAbsolutePath() + " successfully");
      }
      // if the user cancelled the operation
      else if (j.getSelectedFile() == null) {
        temp.setText("SAVE operation cancel");
      } else {
        temp.setText("Save" + j.getSelectedFile().getAbsolutePath() + "Failed");
      }
    } else {
      try {
        FileWriter fw = new FileWriter(filename);
        String tempinfo = tab.getInfo(sliderinfo);
        fw.write(tempinfo);
        fw.close();
      } catch (Exception ex) {
        ex.printStackTrace();
        temp.setText("Save" + filename + "Failed");

      }
      // set the label to the path of the selected file
      temp.setText("Save" + filename + " successfully");
    }
    // if the user cancelled the operation


  }


  public ParseXml getLoadinfo() {
    // TODO Auto-generated method stub
    return loadinfo;
  }

}


