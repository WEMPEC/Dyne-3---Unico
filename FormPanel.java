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
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class FormPanel extends JPanel {
  private FormListener formev;
  private JLabel headerLabel, imageLabel;
  private JTextField headertextField;
  private Image image;
  private JCheckBox Tcp, Rem, AcD;
  private JButton reset;
  private TabPanel tab;


  public FormPanel() {
    headerLabel = new JLabel("   ACSYSdyne");
    headerLabel.setFont(new Font("Courier New", Font.BOLD, 23));
    headertextField = new JTextField("WEMPEC CELL4 170KW");
    reset = new JButton("RESET");
    try {
      image = ImageIO.read(new File("letter.png")).getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    Image imgresize = image.getScaledInstance(33, 33, Image.SCALE_DEFAULT);
    imageLabel = new JLabel(new ImageIcon(imgresize));

    // check box
    Tcp = new JCheckBox("Tcp");

    Rem = new JCheckBox("Rem Not in Loop  ");
    Rem.setBackground(Color.red);
    Rem.setForeground(Color.WHITE);


    AcD = new JCheckBox("AcD Write Enable");
    AcD.setBackground(Color.yellow);
    tab = new TabPanel();
    // call layout manager to determines the perferred size.

    Dimension dim = getPreferredSize();

    // resize the panel.
    dim.width = 800;
    dim.height = 750;

    setPreferredSize(dim);
    //
    // TitledBorder innerBorder = BorderFactory.createTitledBorder("");
    // javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    //
    // setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));


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
    gc.insets = new Insets(20,20 , 0, 0);
    add(headerLabel, gc);
    gc.insets = new Insets(20,20 , 0, 0);
    add(imageLabel, gc);
    gc.insets = new Insets(20, 200, 0, 0);
    add(Tcp, gc);
    // gc.gridx = 2;
    gc.insets = new Insets(20, 255, 0, 0);
    add(reset, gc);
    gc.insets = new Insets(20, 350, 0, 0);

    add(Rem, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    ///////////// SECOND ROW ///////////////////////
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    gc.gridy++;
 gc.weighty =0;
    gc.insets = new Insets(0, 22, 0, 0);

    // add(headertextField, gc);
    //gc.weightx = 0.1;
    add(headertextField, gc);
    gc.insets = new Insets(0, 350, 0, 0);



    add(AcD, gc);
    gc.anchor = GridBagConstraints.LINE_END;

    // // THIRD ROW
    //
    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.insets = new Insets(0, 10, 30, 0);
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



}
