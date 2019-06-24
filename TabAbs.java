import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TabAbs {
  private GroupLayout gl_panel_1;
  private JPanel panel;

  public TabAbs(JPanel panel, GroupLayout gl_panel) {
    // TODO Auto-generated constructor stub
    this.gl_panel_1 = gl_panel;
    this.panel = panel;

    // elements

    JLabel lblNewLabel_3 = new JLabel("Configure Values to Drive Dsp");

    JSpinner spinner = new JSpinner();

    JLabel lblAbortRate = new JLabel("");

    JLabel label = new JLabel("Abort Rate (rpm/sec)");

    JLabel label_1 = new JLabel("TorqFullScale AE (Nm)");

    JLabel label_2 = new JLabel("TorqZero AE (Nm)");

    JLabel label_3 = new JLabel("Not Used");

    JLabel label_4 = new JLabel("Not Used");

    JSpinner spinner_2 = new JSpinner();

    JSpinner spinner_3 = new JSpinner();

    JSpinner spinner_4 = new JSpinner();

    JSpinner spinner_5 = new JSpinner();

    JLabel spinner_6 = new JLabel();

    JSpinner spinner_7 = new JSpinner();

    JSpinner spinner_8 = new JSpinner();

    JSpinner spinner_9 = new JSpinner();

    JSpinner spinner_10 = new JSpinner();

    JSpinner spinner_11 = new JSpinner();

    JLabel label_5 = new JLabel("Tcmd Filt Tconst (ms)");

    JSpinner spinner_12 = new JSpinner();

    JSpinner spinner_13 = new JSpinner();

    JLabel lblSent = new JLabel("       Sent");

    JLabel lblReturned = new JLabel("Returned");
    JLabel lblTorq = new JLabel("TORQ");

    JLabel lblNewLabel_4 = new JLabel("New label");

    JLabel lblNewLabel_5 = new JLabel("New label");

    JTextField textField_1 = new JTextField();
    textField_1.setColumns(10);

    JTextField textField_2 = new JTextField();
    textField_2.setColumns(10);

    JCheckBox chckbxCalOff = new JCheckBox("Cal OFF");

    gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel_1.createSequentialGroup().addGap(89).addComponent(lblNewLabel_3))
        .addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addGroup(gl_panel_1
            .createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1
                .createParallelGroup(Alignment.TRAILING).addComponent(lblTorq).addGroup(gl_panel_1
                    .createParallelGroup(Alignment.TRAILING, false)
                    .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 76,
                            GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(spinner_12, GroupLayout.PREFERRED_SIZE, 57,
                            GroupLayout.PREFERRED_SIZE))
                    .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 76,
                            GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(spinner_5, GroupLayout.PREFERRED_SIZE, 57,
                            GroupLayout.PREFERRED_SIZE))
                    .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_3, GroupLayout.PREFERRED_SIZE, 76,
                            GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, 57,
                            GroupLayout.PREFERRED_SIZE))
                    .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 76,
                            GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, 57,
                            GroupLayout.PREFERRED_SIZE))
                    .addGroup(gl_panel_1.createSequentialGroup()
                        .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 76,
                            GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, 57,
                            GroupLayout.PREFERRED_SIZE))
                    .addGroup(gl_panel_1.createSequentialGroup()
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                            .addComponent(label, GroupLayout.PREFERRED_SIZE, 76,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAbortRate, GroupLayout.DEFAULT_SIZE, 114,
                                Short.MAX_VALUE))
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
                            .addComponent(lblSent, GroupLayout.PREFERRED_SIZE, 76,
                                GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinner, GroupLayout.PREFERRED_SIZE, 57,
                                GroupLayout.PREFERRED_SIZE)))))
                .addGap(44)
                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblReturned, GroupLayout.PREFERRED_SIZE, 76,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_13, GroupLayout.PREFERRED_SIZE, 57,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_11, GroupLayout.PREFERRED_SIZE, 57,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_10, GroupLayout.PREFERRED_SIZE, 57,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_9, GroupLayout.PREFERRED_SIZE, 57,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_8, GroupLayout.PREFERRED_SIZE, 57,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_7, GroupLayout.PREFERRED_SIZE, 57,
                        GroupLayout.PREFERRED_SIZE)
                    .addGroup(gl_panel_1.createSequentialGroup().addGap(156).addComponent(spinner_6,
                        GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))))
            .addGroup(gl_panel_1.createSequentialGroup()
                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblNewLabel_4).addComponent(lblNewLabel_5))
                .addGap(26)
                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                    .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE))
                .addComponent(chckbxCalOff, GroupLayout.PREFERRED_SIZE, 87,
                    GroupLayout.PREFERRED_SIZE)))));
    gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_panel_1.createSequentialGroup().addGap(24).addComponent(lblNewLabel_3)
            .addGap(30)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblAbortRate)
                .addComponent(spinner_6).addComponent(lblReturned).addComponent(lblSent))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(label)
                .addComponent(spinner_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(label_1)
                .addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(spinner_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(label_2)
                .addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(spinner_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(label_3)
                .addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(spinner_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(label_4)
                .addComponent(spinner_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(spinner_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.RELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(label_5)
                .addComponent(spinner_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(spinner_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(ComponentPlacement.UNRELATED)
            .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_1.createSequentialGroup()
                  .addGap(15)
                  .addComponent(lblTorq)
                  .addGap(1)
                  .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                    .addComponent(lblNewLabel_4)
                    .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                  .addGap(30)
                  .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblNewLabel_5)
                    .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGroup(gl_panel_1.createSequentialGroup()
                  .addGap(61)
                  .addComponent(chckbxCalOff)))
              .addGap(38))
        );
  }
}
