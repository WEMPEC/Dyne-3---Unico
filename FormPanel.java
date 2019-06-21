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
import javax.swing.border.TitledBorder;

public class FormPanel extends JPanel {
  private FormListener formev;
  private JLabel headerLabel, imageLabel;
  private JTextField headertextField;
  private Image image;
  private JCheckBox Tcp, Rem, AcD;
  private JButton reset;


  private JLabel jobLabel;
  private JLabel ageLabel;

  private JTextField textField2;
  private JButton btn;
  private JList ageList;
  private JComboBox empcom;
  private JCheckBox citizen;
  // for radio
  private JRadioButton maleRadio;
  private JRadioButton femaleRadio;
  private ButtonGroup genderGroup;
  //
  private JTextField taxField;
  private JLabel taxLabel;


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

    // imageLabel.setSize(3,4);
    // specify how large the textield;

    textField2 = new JTextField(10);
    ageList = new JList();
    citizen = new JCheckBox();
    taxField = new JTextField(10);
    maleRadio = new JRadioButton(" off");
    femaleRadio = new JRadioButton(" on");
    genderGroup = new ButtonGroup();
    maleRadio.setActionCommand("on");
    femaleRadio.setActionCommand("off");
    // set radio
    genderGroup.add(femaleRadio);
    genderGroup.add(maleRadio);

    taxLabel = new JLabel("Cool");
    // set up tax id
    taxLabel.setEnabled(false);
    taxField.setEnabled(false);
    citizen.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        boolean isclicked = citizen.isSelected();
        taxLabel.setEnabled(true);
        taxField.setEnabled(true);
      }

    });
    // set up combo box
    empcom = new JComboBox();
    DefaultComboBoxModel combomodel = new DefaultComboBoxModel();
    combomodel.addElement("ABS");
    combomodel.addElement("self-employed");
    combomodel.addElement("unemployed");
    empcom.setModel(combomodel);
    empcom.setSelectedIndex(0);
    empcom.setEditable(true);

    // Set a list box
    DefaultListModel ageModel = new DefaultListModel();
    // use the utility class.
    ageModel.addElement(new AgeCat(0, "bUS"));
    ageModel.addElement(new AgeCat(1, "bus on"));
    ageModel.addElement(new AgeCat(2, "bus off"));
    ageList.setModel(ageModel);
    // make the age list better
    ageList.setPreferredSize(new Dimension(110, 70));
    ageList.setBorder(BorderFactory.createEtchedBorder());
    ageList.setSelectedIndex(1);
    btn = new JButton("OK");
    // add button listener
    btn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        String name = taxField.getText();
        String job = textField2.getText();
        String empCat = (String) empcom.getSelectedItem();
        System.out.println(empCat);
        String genderc = genderGroup.getSelection().getActionCommand();
        AgeCat age = (AgeCat) ageList.getSelectedValue();
        // int id = ageList.getSelectedIndex();
        int id = age.getID();
        System.out.println(id);
        String taxID = taxField.getText();
        boolean citizenSelect = citizen.isSelected();
        FormEvent ev = new FormEvent(this, name, job, id, empCat, citizenSelect, taxID, genderc);
        if (formev != null) {
          formev.formEventOccured(ev);

        }
      }
    });
    // call layout manager to determines the perferred size.

    Dimension dim = getPreferredSize();

    // resize the panel.
    dim.width = 600;
    dim.height = 100;

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
    gc.weighty = 0.1;
    // fill can be horizontal, vertical, none or both.
    gc.fill = GridBagConstraints.NONE;
    // make sure the line is start in from left to the right.
    gc.anchor = GridBagConstraints.LINE_START;
    gc.gridx = 0;
    gc.gridy = 0;
    gc.insets = new Insets(0, 0, 0, 2);
    add(headerLabel, gc);
    add(imageLabel, gc);
    gc.gridx = 1;
    add(Tcp, gc);
    // gc.gridx = 2;
    gc.insets = new Insets(0, 55, 0, 0);
    add(reset, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    ///////////// SECOND ROW ///////////////////////
    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 5;
    gc.weighty = 0.04;
    gc.insets = new Insets(0, 5, 0, 0);
    gc.anchor = GridBagConstraints.LINE_START;
    add(headertextField, gc);
    gc.weightx = 0.1;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 5);
    add(Rem, gc);
    gc.gridy = 2;
    gc.insets = new Insets(0, 0, 0, 0);
    
    add(AcD, gc);
    gc.anchor = GridBagConstraints.LINE_END;

    // // THIRD ROW
    //
    // gc.anchor = GridBagConstraints.LINE_START;
    //
    // gc.gridx = 0;
    // gc.gridy++;
    // gc.weightx = 1;
    // gc.weighty = 0.5;
    // add(ageLabel, gc);
    //
    // gc.weightx = 1;
    // gc.weighty = 0.2;
    // gc.gridx = 1;
    // gc.insets = new Insets(0, 0, 0, 0);
    // add(ageList, gc);
    // gc.anchor = GridBagConstraints.LINE_END;
    // THIRD ROW

    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy = 3;
    gc.weightx = 1;
    gc.weighty = 0.5;
    add(new JLabel("new section"), gc);
    gc.weightx = 1;
    gc.weighty = 1;
    gc.gridx = 1;
    gc.gridy = 3;
    gc.insets = new Insets(0, 0, 0, 0);
    add(empcom, gc);
    gc.anchor = GridBagConstraints.LINE_END;


    // Forth ROW

    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    add(new JLabel("PIU"), gc);
    gc.weightx = 1;
    gc.weighty = 1;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(citizen, gc);
    gc.anchor = GridBagConstraints.LINE_END;

    // FIFTH ROW


    gc.anchor = GridBagConstraints.LINE_START;
    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    add(taxLabel, gc);
    gc.weightx = 1;
    gc.weighty = 0.1;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(taxField, gc);
    gc.anchor = GridBagConstraints.LINE_END;

    // sixth ROW

    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.05;
    add(new JLabel("Volt mode"), gc);
    gc.weightx = 1;
    gc.weighty = 0.02;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(maleRadio, gc);
    gc.anchor = GridBagConstraints.LINE_END;

    // seventh ROW

    gc.anchor = GridBagConstraints.LINE_START;


    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.02;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(femaleRadio, gc);
    gc.anchor = GridBagConstraints.LINE_END;


    // Last ROW
    gc.weightx = 1;
    gc.weighty = 1.0;
    gc.gridx = 1;
    gc.gridy++;
    gc.anchor = GridBagConstraints.FIRST_LINE_START;
    gc.insets = new Insets(0, 0, 0, 0);


    add(btn, gc);
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
