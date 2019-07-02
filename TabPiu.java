import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
  private GroupLayout gl_Detail;
  private JTextField textField_9, textField_10, textField_11, textField_3, textField_8, textField;
  private JButton button_1, button;
  private JLabel lblNewLabel_2, lblNewLabel, lblNewLabel_1, lblLimAct, label_1, label_2, label;
  private JCheckBox tglbtnNewToggleButton;
  private JTable table;
  private GridBagLayout gbl_panel_2;
  private JPanel panel_2;

  public TabPiu(JPanel panel, GroupLayout gl_panel, JPanel panel1, GridBagLayout gl_panel1) {
    // TODO Auto-generated constructor stub
    this.gl_Detail = gl_panel;
    this.panel3 = panel;
    panel_2 = panel1;
    gbl_panel_2 = gl_panel1;

    tglbtnNewToggleButton = new JCheckBox("Volt Mode");

    label = new JLabel("Vslew Cmd");

    JSeparator separator = new JSeparator();
    separator.setBackground(new Color(0, 0, 0));
    textField_8 = new JTextField();
    textField_3 = new JTextField();
    textField = new JTextField();



    lblNewLabel_1 = new JLabel("Vslew Cmd");
    lblNewLabel_2 = new JLabel("Vslew Cmd");
    lblNewLabel = new JLabel("Vslew Cmd");
    lblLimAct = new JLabel("Vslew Cmd");

    label_1 = new JLabel("Vslew Cmd");
    label_2 = new JLabel("Vslew Cmd");
    button = new JButton();
    button_1 = new JButton();
    JLabel lblNewLabel_2 = new JLabel("Vslew Cmd");

    JLabel lblNewLabel_1 = new JLabel("Vslew Act");

    JButton button = new JButton("Bus Off");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {}
    });
    button.setForeground(Color.WHITE);
    button.setBackground(Color.RED);

    JButton button_1 = new JButton("Bus On");
    button_1.setBackground(Color.GREEN);

    JLabel lblLimAct = new JLabel("Lim Act");

    textField = new JTextField();
    textField.setColumns(10);

    textField_3 = new JTextField();
    textField_3.setColumns(10);

    textField_8 = new JTextField();
    textField_8.setColumns(10);


    label = new JLabel("Volt Cmd");


    separator.setBackground(new Color(0, 0, 0));

    textField_9 = new JTextField();
    textField_9.setEnabled(false);
    textField_9.setColumns(10);

    textField_10 = new JTextField();
    textField_10.setEnabled(false);
    textField_10.setColumns(10);

    textField_11 = new JTextField();
    textField_11.setEnabled(false);
    textField_11.setColumns(10);

    label_1 = new JLabel("Curr Lim");
    label_1.setEnabled(false);
    label_2 = new JLabel("IntRes mOhm");
    label_2.setEnabled(false);
    label.setEnabled(false);



    JSlider framesPerSecond = new JSlider(JSlider.VERTICAL, 0, 30, 15);
    // framesPerSecond.addChangeListener(this);
    framesPerSecond.setMajorTickSpacing(10);
    framesPerSecond.setPaintTicks(true);


    // framesPerSecond.setLabelTable( labelTable );

    framesPerSecond.setPaintLabels(true);
    // Turn on labels at major tick marks.
    framesPerSecond.setMajorTickSpacing(10);
    framesPerSecond.setMinorTickSpacing(1);
    framesPerSecond.setPaintTicks(true);
    framesPerSecond.setPaintLabels(true);

    JLabel lblPowerlimkw = new JLabel("Volt Cmd (kw)");

    JLabel label_3 = new JLabel("Curr Lim (A)");

    JLabel label_4 = new JLabel("PwrLim (kw)");

    JLabel label_5 = new JLabel("IntRes (mOhm)");

    JSlider slider = new JSlider(JSlider.VERTICAL, 0, 30, 15);
    // framesPerSecond.addChangeListener(this);
    framesPerSecond.setMajorTickSpacing(10);
    framesPerSecond.setPaintTicks(true);
    framesPerSecond.setEnabled(false);


    // slider.setLabelTable( labelTable );

    slider.setPaintLabels(true);
    // Turn on labels at major tick marks.
    slider.setMajorTickSpacing(10);
    slider.setMinorTickSpacing(1);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setEnabled(false);
    JSlider slider_1 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_1.setPaintTicks(true);
    slider_1.setPaintLabels(true);
    slider_1.setMinorTickSpacing(1);
    slider_1.setMajorTickSpacing(10);


    JSlider slider_2 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_2.setPaintTicks(true);
    slider_2.setPaintLabels(true);
    slider_2.setMinorTickSpacing(1);
    slider_2.setMajorTickSpacing(10);
    slider_2.setEnabled(false);

    JLabel label_8 = new JLabel("PowerLim (kw)");
    // JProgressBar progressBar = new JProgressBar();


    tglbtnNewToggleButton.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        boolean isclicked = tglbtnNewToggleButton.isSelected();
        label_1.setEnabled(true);
        label_2.setEnabled(true);
        label.setEnabled(true);
        slider.setEnabled(true);

        framesPerSecond.setEnabled(true);
        slider_2.setEnabled(true);
      }

    });



    gl_Detail
        .setHorizontalGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_Detail.createSequentialGroup().addContainerGap()
                .addComponent(separator, GroupLayout.PREFERRED_SIZE, 394,
                    GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(gl_Detail.createSequentialGroup().addGap(32).addGroup(gl_Detail
                .createParallelGroup(Alignment.LEADING)
                .addGroup(gl_Detail.createSequentialGroup()
                    .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(lblLimAct, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
                            84, Short.MAX_VALUE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                        .addComponent(textField_8, GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField, GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED, 360, Short.MAX_VALUE))
                .addGroup(gl_Detail.createSequentialGroup().addGroup(gl_Detail
                    .createParallelGroup(Alignment.LEADING)
                    .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                        .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 84,
                            GroupLayout.PREFERRED_SIZE)
                        .addComponent(label, GroupLayout.PREFERRED_SIZE, 84,
                            GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 84,
                            GroupLayout.PREFERRED_SIZE))
                    .addComponent(framesPerSecond, GroupLayout.PREFERRED_SIZE, 87,
                        GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING).addComponent(
                        textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE)
                        .addGroup(gl_Detail.createSequentialGroup().addGroup(gl_Detail
                            .createParallelGroup(Alignment.LEADING)
                            .addComponent(textField_9, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_10, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(gl_Detail.createSequentialGroup().addGap(32)
                                .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                                    .addComponent(slider, GroupLayout.PREFERRED_SIZE, 99,
                                        GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_3, GroupLayout.PREFERRED_SIZE, 107,
                                        GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                            .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                                .addComponent(tglbtnNewToggleButton, 0, 0, Short.MAX_VALUE)
                                .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING, false)
                                    .addComponent(button, Alignment.LEADING,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addComponent(button_1, Alignment.LEADING,
                                        GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addGroup(gl_Detail.createSequentialGroup()
                                    .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_Detail.createSequentialGroup().addGap(2)
                                            .addComponent(slider_1, GroupLayout.PREFERRED_SIZE, 99,
                                                GroupLayout.PREFERRED_SIZE))
                                        .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 168,
                                            GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 150,
                                            GroupLayout.PREFERRED_SIZE)
                                        .addComponent(slider_2, GroupLayout.PREFERRED_SIZE, 99,
                                            GroupLayout.PREFERRED_SIZE)))))))
                .addComponent(lblPowerlimkw)).addGap(154)
                .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
                .addGap(63)));
    gl_Detail.setVerticalGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_Detail.createSequentialGroup().addGap(19)
            .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(button_1))
            .addGroup(gl_Detail
                .createParallelGroup(
                    Alignment.LEADING)
                .addGroup(gl_Detail.createSequentialGroup().addGap(18)
                    .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                        .addComponent(lblNewLabel_1)
                        .addComponent(textField_8, GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(
                        gl_Detail.createParallelGroup(Alignment.BASELINE).addComponent(lblLimAct)
                            .addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(
                        separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
                    .addGap(21)
                    .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING).addComponent(label)
                        .addComponent(textField_9, GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGroup(gl_Detail.createSequentialGroup().addGap(30).addComponent(button)))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                .addComponent(tglbtnNewToggleButton)
                .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE).addComponent(label_1)
                    .addComponent(textField_10, GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            .addGap(15)
            .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING).addGroup(gl_Detail
                .createSequentialGroup()
                .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE).addComponent(label_2)
                    .addComponent(textField_11, GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(27)
                .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
                    .addComponent(lblPowerlimkw).addComponent(label_3)
                    .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 39,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 39,
                        GroupLayout.PREFERRED_SIZE)))
                .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
            .addGap(18)
            .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
                .addComponent(slider, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
                .addComponent(slider_2, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
                .addComponent(framesPerSecond, GroupLayout.PREFERRED_SIZE, 390,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(slider_1, GroupLayout.PREFERRED_SIZE, 390,
                    GroupLayout.PREFERRED_SIZE))
            .addContainerGap()));


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
          return column == 1  ? true : false;
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

  /**
   * @return the gl_panel
   */
  public GroupLayout getGlpanel() {
    return gl_Detail;
  }

  public boolean isCellEditable(int row, int col) {
    return true;
  }
}
