import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TabPiu extends JPanel {

  private JPanel panel3;
  private GridBagLayout gl_Detail;
  private JTextField textField_9, textField_10, textField_11, textField_3, textField_8, textField;
  private JButton button_1, button;
  private JLabel lblNewLabel_2, lblNewLabel, lblNewLabel_1, lblLimAct, label_1, label_2, label;
  private JCheckBox tglbtnNewToggleButton;
  private JTable table;
  private GridBagLayout gbl_panel_2;
  private JPanel panel_2;

  public TabPiu(JPanel panel, GridBagLayout gl_panel, JPanel panel1, GridBagLayout gl_panel1) {
    // TODO Auto-generated constructor stub
    this.gl_Detail = gl_panel;
    this.panel3 = panel;
    panel_2 = panel1;
    gbl_panel_2 = gl_panel1;


    gl_Detail.columnWidths = new int[] {112, 112, 112, 112, 0, 0, 0, 0, 0, 0};
    gl_Detail.rowHeights = new int[] {50, 55, 26, 8, 22, 20, 0, 0, 0, 0, 514, 0};
    gl_Detail.columnWeights =
        new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gl_Detail.rowWeights =
        new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel3.setLayout(gl_Detail);


    JButton button1 = new JButton("Bus ON");
    button1.setBackground(Color.GREEN);
    GridBagConstraints gbc_button1 = new GridBagConstraints();
    gbc_button1.anchor = GridBagConstraints.WEST;
    gbc_button1.insets = new Insets(0, 35, 0, 0);
    gbc_button1.gridheight = 2;
    gbc_button1.gridx = 3;
    gbc_button1.gridy = 0;
    panel3.add(button1, gbc_button1);

    JButton button2 = new JButton("Start PIU");
    button2.setBackground(Color.GREEN);
    GridBagConstraints gbc_button2 = new GridBagConstraints();
    gbc_button2.anchor = GridBagConstraints.WEST;
    // gbc_button2.insets = new Insets(10, 0, 0, 0);
    gbc_button2.gridheight = 2;
    gbc_button2.gridx = 4;
    gbc_button2.gridy = 0;
    panel3.add(button2, gbc_button2);

    button1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {}
    });

    JButton button = new JButton("Bus Off");
    button.setForeground(Color.WHITE);
    button.setBackground(Color.RED);
    GridBagConstraints gbc_button = new GridBagConstraints();
    gbc_button.anchor = GridBagConstraints.WEST;
    gbc_button.insets = new Insets(0, 70, 0, 0);
    gbc_button.gridheight = 2;
    gbc_button.gridx = 2;
    gbc_button.gridy = 0;
    panel3.add(button, gbc_button);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {}
    });

    JLabel lblNewLabel_2 = new JLabel("Vslew Cmd");
    lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
    // gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
    gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
    // gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
    // gbc_lblNewLabel_2.gridwidth = 2;
    gbc_lblNewLabel_2.gridx = 0;
    gbc_lblNewLabel_2.gridy = 1;
    panel3.add(lblNewLabel_2, gbc_lblNewLabel_2);

    textField_8 = new JTextField("");
    GridBagConstraints gbc_textField_1 = new GridBagConstraints();
    textField_8.setColumns(2);// gbc_textField_1.insets = new Insets(0, 0, 5, 5);
    gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_1.gridx = 1;
    gbc_textField_1.gridy = 1;
    panel3.add(textField_8, gbc_textField_1);
    

    JLabel lblNewLabel_1 = new JLabel("Vslew Act");
    GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
    lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
    gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
    // gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 0);
    gbc_lblNewLabel_1.gridx = 0;
    gbc_lblNewLabel_1.gridy = 2;
    panel3.add(lblNewLabel_1, gbc_lblNewLabel_1);

    textField_9 = new JTextField("");
    GridBagConstraints gbc_textField_9 = new GridBagConstraints();
     gbc_textField_1.insets = new Insets(0, 0, 0, 0);
    gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_9.gridx = 1;
    gbc_textField_9.gridy = 2;
    panel3.add(textField_9, gbc_textField_9);
    textField_9.setColumns(5);

    JLabel lblNewLabel_3 = new JLabel("Lim Act");
    GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
    lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
    gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
gbc_lblNewLabel_3.insets = new Insets(0, 5, 0, 0);
    gbc_lblNewLabel_3.gridx = 2;
    gbc_lblNewLabel_3.gridy = 2;
    panel3.add(lblNewLabel_3, gbc_lblNewLabel_3);

    textField_10 = new JTextField("");
    GridBagConstraints gbc_textField_10 = new GridBagConstraints();
     gbc_textField_10.insets = new Insets(0, 70, 0, 0);
    gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_10.gridx = 2;
    gbc_textField_10.gridy = 2;
    panel3.add(textField_10, gbc_textField_10);
    textField_10.setColumns(5);

 JToggleButton tglbtnNewToggleButton = new JToggleButton("Volt Mode");
    GridBagConstraints gbc_tglbtnNewToggleButton = new GridBagConstraints();
    gbc_tglbtnNewToggleButton.anchor = GridBagConstraints.NORTH;
    gbc_tglbtnNewToggleButton.fill = GridBagConstraints.HORIZONTAL;
    gbc_tglbtnNewToggleButton.insets = new Insets(0, 0, 0, 0);
    gbc_tglbtnNewToggleButton.gridx = 4;
    gbc_tglbtnNewToggleButton.gridy = 2;
    panel3.add(tglbtnNewToggleButton, gbc_tglbtnNewToggleButton);


    JSeparator separator = new JSeparator();
    separator.setBackground(new Color(0, 0, 0));
    GridBagConstraints gbc_separator = new GridBagConstraints();
    gbc_separator.fill = GridBagConstraints.BOTH;
    gbc_separator.insets = new Insets(0, 0, 5, 5);
    gbc_separator.gridwidth = 6;
    gbc_separator.gridx = 0;
    gbc_separator.gridy = 4;
    panel3.add(separator, gbc_separator);



   
    JLabel label_4 = new JLabel("PowerLim (kw)");
    GridBagConstraints gbc_label_4 = new GridBagConstraints();
    gbc_label_4.fill = GridBagConstraints.BOTH;
    gbc_label_4.insets = new Insets(0, 0, 5, 5);
    gbc_label_4.gridx = 3;
    gbc_label_4.gridy = 7;
    panel3.add(label_4, gbc_label_4);

    JLabel label_8 = new JLabel("PowerLim (kw)");
    GridBagConstraints gbc_label_8 = new GridBagConstraints();
    gbc_label_8.fill = GridBagConstraints.BOTH;
    gbc_label_8.insets = new Insets(0, 0, 5, 5);
    gbc_label_8.gridx = 2;
    gbc_label_8.gridy = 9;
    panel3.add(label_8, gbc_label_8);

    JLabel label_5 = new JLabel("PowerLim (kw)");
    GridBagConstraints gbc_label_5 = new GridBagConstraints();
    gbc_label_5.fill = GridBagConstraints.BOTH;
    gbc_label_5.insets = new Insets(0, 0, 5, 5);
    gbc_label_5.gridx = 1;
    gbc_label_5.gridy = 9;
    panel3.add(label_5, gbc_label_5);

    JSlider slider_4 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_4.setPaintTicks(true);
    slider_4.setPaintLabels(true);
    slider_4.setMinorTickSpacing(1);
    slider_4.setMajorTickSpacing(10);
    GridBagConstraints gbc_slider_4 = new GridBagConstraints();
    gbc_slider_4.anchor = GridBagConstraints.WEST;
    gbc_slider_4.fill = GridBagConstraints.VERTICAL;
    gbc_slider_4.insets = new Insets(0, 0, 0, 5);
    gbc_slider_4.gridx = 4;
    gbc_slider_4.gridy = 10;
    slider_4.setEnabled(false);
    panel3.add(slider_4, gbc_slider_4);



    JSlider slider = new JSlider(JSlider.VERTICAL, 0, 30, 15);
    // slider.setLabelTable(labelTable);

    slider.setPaintLabels(true);
    // Turn on labels at major tick marks.
    slider.setMajorTickSpacing(10);
    slider.setMinorTickSpacing(1);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    GridBagConstraints gbc_slider = new GridBagConstraints();
    gbc_slider.fill = GridBagConstraints.VERTICAL;
    gbc_slider.insets = new Insets(0, 10, 0, 0);
    gbc_slider.gridx = 2;
    gbc_slider.gridy = 10;
    slider.setEnabled(false);
    panel3.add(slider, gbc_slider);

    JSlider slider_2 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_2.setPaintTicks(true);
    slider_2.setPaintLabels(true);
    slider_2.setMinorTickSpacing(1);
    slider_2.setMajorTickSpacing(10);
    GridBagConstraints gbc_slider_2 = new GridBagConstraints();
    gbc_slider_2.anchor = GridBagConstraints.WEST;
    gbc_slider_2.fill = GridBagConstraints.VERTICAL;
    gbc_slider_2.insets = new Insets(0, 10, 0, 0);
    gbc_slider_2.gridx = 1;
    gbc_slider_2.gridy = 10;
   slider_2.setEnabled(false);
    panel3.add(slider_2, gbc_slider_2);

    JSlider slider_1 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_1.setPaintTicks(true);
    slider_1.setPaintLabels(true);
    slider_1.setMinorTickSpacing(1);
    slider_1.setMajorTickSpacing(10);
    GridBagConstraints gbc_slider_1 = new GridBagConstraints();
    gbc_slider_1.anchor = GridBagConstraints.WEST;
    gbc_slider_1.fill = GridBagConstraints.VERTICAL;
    gbc_slider_1.insets = new Insets(0, 20, 0, 0);
    gbc_slider_1.gridx = 0;
    gbc_slider_1.gridy = 10;
    panel3.add(slider_1, gbc_slider_1);
    slider_1.setEnabled(false);

    tglbtnNewToggleButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        boolean isclicked = tglbtnNewToggleButton.isSelected();
//        label_1.setEnabled(isclicked);
//        label_2.setEnabled(isclicked);
//        label.setEnabled(isclicked);
        slider.setEnabled(isclicked);

        slider_1.setEnabled(isclicked);
       slider_2.setEnabled(isclicked);
        slider_4.setEnabled(isclicked);

      }

    });



    String data[][] = {{"Name", "Set", "Min", "Max"}, {"Min Speed (rpm) ", "?", "0", "10000"},
        {"Def Speed (rpm) ", "?", "0", "10000"}, {"Max Speed (rpm) ", "?", "0", "1000"},
        {"Min Torque(Nm) ", "?", "0", "10000"}, {"Def Torque (Nm) ", "?", "0", "10000"},
        {"Max Torque (Nm) ", "?", "0", "1000"},
        {"Min Acceleration Limit (rpm/s)", "?", "0", "10000"},
        {"Def Acceleration Limit (rpm/s)", "?", "0", "10000"},
        {"Max Acceleration Limit (rpm/s)", "?", "0", "70"},
        {"Minium Inertia (kgm2)", "?", "0", "70"}, {"Default Inertia (kgm2)", "?", "0", "700"},
        {"Max Inertia (kgm2)", "?", "0", "70"}};
    String column[] = {"ID", "NAME", "?", "SALARY"};
    isCellEditable(4, 4);
    // = new GridBagLayout();
    gbl_panel_2.columnWidths = new int[] {600, 0};
    gbl_panel_2.rowHeights = new int[] {800, 0};
    gbl_panel_2.columnWeights = new double[] {0.0, Double.MIN_VALUE};
    gbl_panel_2.rowWeights = new double[] {0.0, Double.MIN_VALUE};
    panel_2.setLayout(gbl_panel_2);

    JTable table = new JTable(data, column) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return column == 1 ? true : false;
      }
    };
    table.setColumnSelectionAllowed(true);

    table.getColumnModel().getColumn(0).setPreferredWidth(300);
    table.getColumnModel().getColumn(1).setPreferredWidth(180);
    table.getColumnModel().getColumn(3).setPreferredWidth(220);
    GridBagConstraints gbc_table = new GridBagConstraints();
    gbc_table.fill = GridBagConstraints.BOTH;
    gbc_table.gridx = 0;
    gbc_table.gridy = 0;
    panel_2.add(table, gbc_table);

  }



  public boolean isCellEditable(int row, int col) {
    return true;
  }
}
