import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TabCool {
private  GroupLayout gl_panel ;
private  JPanel panel;
  public TabCool(JPanel panel, GroupLayout gl_panel) {
    // TODO Auto-generated constructor stub
    this.gl_panel = gl_panel;
    this.panel = panel;
    JButton btnNewButton = new JButton("Stop");
    btnNewButton.setForeground(Color.white);
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {}
    });
    btnNewButton.setBackground(Color.RED);

    JButton btnNewButton_1 = new JButton("Start");
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {}
    });
    btnNewButton_1.setBackground(Color.GREEN);
    JLabel lblCoolsyst = new JLabel("CoolSystem: ");
    lblCoolsyst.setFont(new Font("Times New Roman", Font.BOLD, 16));

    JLabel lblCoolsystStatus = new JLabel("CoolSystem Status: ");
    lblCoolsystStatus.setFont(new Font("Times New Roman", Font.BOLD, 16));

    JSeparator separator = new JSeparator();
    separator.setToolTipText("ok");
    separator.setOrientation(SwingConstants.VERTICAL);

    //OR Comms BAD
    JLabel lblCommsOk = createJLabel("CommsOK: ", Color.BLACK, Color.green);
    lblCommsOk.setBorder(BorderFactory.createBevelBorder(0));
    lblCommsOk.setFont(new Font("Times New Roman", Font.BOLD, 16));
   // lblCommsOk.setSize(40, 10);
//OR Fault
    JLabel lblReady = createJLabel("Ready", Color.BLACK, Color.green);
    lblReady.setBorder(BorderFactory.createBevelBorder(0));
    lblReady.setFont(new Font("Times New Roman", Font.BOLD, 16));

//OR CS write enable
    JLabel lblAcdWriteEnable = createJLabel("AcD Write Enable", Color.BLACK, Color.green);
    lblAcdWriteEnable.setBorder(BorderFactory.createBevelBorder(0));
    lblAcdWriteEnable.setFont(new Font("Times New Roman", Font.BOLD, 16));

//stopped
    JLabel lblPressOk = createJLabel("Press OK", Color.BLACK, Color.green);
    lblPressOk.setBorder(BorderFactory.createBevelBorder(0));
    lblPressOk.setBackground(new Color(0, 255, 0));
    lblPressOk.setFont(new Font("Times New Roman", Font.BOLD, 16));

//OR press low---new label is needed in deactivated mode.
    JLabel lblLubesystem = new JLabel("LubeSystem: ");
    lblLubesystem.setFont(new Font("Times New Roman", Font.BOLD, 16));
    lblLubesystem.setFont(new Font("Times New Roman", Font.BOLD, 16));

    //May be added in lube?
    JLabel lblNewLabel = new JLabel("New label");
    //Set align
  //  GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        .addGroup(gl_panel.createSequentialGroup().addGap(42)
            .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup().addComponent(btnNewButton).addGap(1)
                    .addComponent(btnNewButton_1))
                .addComponent(lblCoolsyst).addComponent(lblNewLabel).addComponent(lblLubesystem))
            .addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
            .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                .addComponent(lblCoolsystStatus)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(lblPressOk, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
                           160, Short.MAX_VALUE)
                        .addComponent(lblCommsOk, GroupLayout.DEFAULT_SIZE,
                            160, Short.MAX_VALUE)
                        .addComponent(lblReady, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAcdWriteEnable, Alignment.LEADING,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(39).addComponent(separator, GroupLayout.PREFERRED_SIZE, 130,
                        GroupLayout.PREFERRED_SIZE)))
            .addGap(51)));

    gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
        .createSequentialGroup().addContainerGap()
        .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblCoolsystStatus)
            .addComponent(lblCoolsyst))
        .addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
            .createSequentialGroup()
            .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup().addGap(19).addComponent(separator,
                    GroupLayout.PREFERRED_SIZE, 400,
                    GroupLayout.PREFERRED_SIZE))
                .addGroup(gl_panel.createSequentialGroup().addGap(9).addComponent(lblCommsOk)
                    .addPreferredGap(ComponentPlacement.RELATED).addComponent(lblReady)
                    .addPreferredGap(ComponentPlacement.RELATED).addComponent(lblAcdWriteEnable)))
            .addPreferredGap(ComponentPlacement.RELATED).addComponent(lblPressOk)
            .addPreferredGap(ComponentPlacement.RELATED))
            .addGroup(gl_panel.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                    .addComponent(btnNewButton_1).addComponent(btnNewButton))
                .addGap(26).addComponent(lblLubesystem).addGap(1).addComponent(lblNewLabel)))
        .addContainerGap(29, Short.MAX_VALUE)));
   
  }
  private JLabel createJLabel(String text, Color textColor, Color backgroundColor) {
    JLabel labeltemp = new JLabel(text);
    // set align
    labeltemp.setHorizontalAlignment(JLabel.CENTER);
    // set color
    labeltemp.setForeground(textColor);
    // set background color
    labeltemp.setOpaque(true);
    labeltemp.setBackground(backgroundColor);

    return labeltemp;
  }
  /**
   * @return the gl_panel
   */
  public GroupLayout getGlpanel() {
    return gl_panel;
  }

}
