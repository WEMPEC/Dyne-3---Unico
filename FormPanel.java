import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
  private JLabel nameLabel;
  private JLabel jobLabel;
  private JLabel ageLabel;
  private JTextField textField;
  private JTextField textField2;
  private JButton btn;
  private JList ageList;
  private JComboBox empcom;
  private JCheckBox citizen;
  //for radio
  private JRadioButton maleRadio;
  private JRadioButton femaleRadio;
  private ButtonGroup genderGroup;
  //
  private JTextField taxField;
private JLabel taxLabel;


  public FormPanel() {
    ageLabel = new JLabel("AGE: ");
    nameLabel = new JLabel("NAME: ");
    jobLabel = new JLabel("JOB:  ");
    // specify how large the textield;
    textField = new JTextField(10);
    textField2 = new JTextField(10);
    ageList = new JList();
    citizen = new JCheckBox();
    taxField = new JTextField (10);
    maleRadio = new JRadioButton(" maleRadio");
    femaleRadio = new JRadioButton(" femaleRadio");
    genderGroup = new  ButtonGroup();
    maleRadio.setActionCommand("male");
    femaleRadio.setActionCommand("female");
    //set radio
    genderGroup.add(femaleRadio);
    genderGroup.add(maleRadio);
    
    taxLabel = new JLabel ("TAX ID: ");
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
    combomodel.addElement("employed");
    combomodel.addElement("self-employed");
    combomodel.addElement("unemployed");
    empcom.setModel(combomodel);
    empcom.setSelectedIndex(0);
    empcom.setEditable(true);

    // Set a list box
    DefaultListModel ageModel = new DefaultListModel();
    // use the utility class.
    ageModel.addElement(new AgeCat(0, "Under 18"));
    ageModel.addElement(new AgeCat(1, "Under 65"));
    ageModel.addElement(new AgeCat(2, "65 or over"));
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
        String name = textField.getText();
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
    dim.width = 250;
    setPreferredSize(dim);

    TitledBorder innerBorder = BorderFactory.createTitledBorder("ADD Person");
    javax.swing.border.Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

    setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));


    // layout();
    //
    // public void layout() {
    setLayout(new GridBagLayout());
    GridBagConstraints gc = new GridBagConstraints();
    // x from left to right
    gc.gridx = 0;
    gc.gridy = 0;


    ///////////// first row/////////////////////
    gc.weightx = 1;
    gc.weighty = 0.1;
    // fill can be horizontal, vertical, none or both.
    gc.fill = GridBagConstraints.NONE;
    // make sure the line is startin from left to the right.
    gc.anchor = GridBagConstraints.LINE_START;
    add(nameLabel, gc);

    gc.gridx = 1;
    gc.gridy = 0;
    add(textField, gc);
    gc.insets = new Insets(0, 0, 0, 2);
    gc.anchor = GridBagConstraints.LINE_END;
    ///////////// SECOND ROW ///////////////////////
    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    gc.insets = new Insets(0, 0, 0, 5);
    gc.anchor = GridBagConstraints.LINE_START;
    add(jobLabel, gc);

    gc.gridx = 1;
    add(textField2, gc);
    gc.insets = new Insets(0, 0, 0, 5);
    gc.anchor = GridBagConstraints.LINE_END;

    // THIRD ROW

    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    add(ageLabel, gc);

    gc.weightx = 1;
    gc.weighty = 0.2;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(ageList, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    // THIRD ROW

    gc.anchor = GridBagConstraints.LINE_START;

    gc.gridx = 0;
    gc.gridy = 3;
    gc.weightx = 1;
    gc.weighty = 0.5;
    add(new JLabel("EMPLOY"), gc);
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
    gc.gridy ++;
    gc.weightx = 1;
    gc.weighty = 0.5;
    add(new JLabel("US CITIZEN"), gc);
    gc.weightx = 1;
    gc.weighty = 1;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(citizen, gc);
    gc.anchor = GridBagConstraints.LINE_END;
    
    //FIFTH ROW


    gc.anchor = GridBagConstraints.LINE_START;
    gc.gridx = 0;
    gc.gridy ++;
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
    add(new JLabel("GENDER"), gc);
    gc.weightx = 1;
    gc.weighty = 0.02;
    gc.gridx = 1;
    gc.insets = new Insets(0, 0, 0, 0);
    add(maleRadio, gc);
    gc.anchor = GridBagConstraints.LINE_END;

    // seventh ROW

    gc.anchor = GridBagConstraints.LINE_START;


    gc.gridy ++;  
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
