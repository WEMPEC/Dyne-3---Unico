

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TabPanel extends JPanel {
  public TabPanel() {

    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    ImageIcon icon = createImageIcon("");

    JTabbedPane Cool = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Cool/ Lube", null, Cool, null);
    JPanel panel = new JPanel();
    Cool.addTab("Detail", null, panel, null);

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
    GroupLayout gl_panel = new GroupLayout(panel);
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
                    .addGap(39).addComponent(separator, GroupLayout.PREFERRED_SIZE, 1,
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
                    GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
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
    panel.setLayout(gl_panel);

    JComponent panel1 = makeTextPanel("Panel #1");
    tabbedPane.addTab("Tab 1", icon, panel1, "Does nothing");
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

    JComponent panel2 = makeTextPanel("Panel #2");
    tabbedPane.addTab("Tab 2", icon, panel2, "Does twice as much nothing");
    tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

    JComponent panel3 = makeTextPanel("Panel #3");
    tabbedPane.addTab("Tab 3", icon, panel3, "Still does nothing");
    tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

    JComponent panel4 = makeTextPanel("Panel #4 (has a preferred size of 410 x 50).");
    panel4.setPreferredSize(new Dimension(410, 50));
    tabbedPane.addTab("Tab 4", icon, panel4, "Does nothing at all");
    tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

    // Add the tabbed pane to this panel.
    add(tabbedPane);

    // The following line enables to use scrolling tabs.
    tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
  }

  protected JComponent makeTextPanel(String text) {
    JPanel panel = new JPanel(false);
    JLabel filler = new JLabel(text);
    filler.setHorizontalAlignment(JLabel.CENTER);
    panel.setLayout(new GridLayout(1, 1));
    panel.add(filler);
    return panel;
  }

  /** Returns an ImageIcon, or null if the path was invalid. */
  protected static ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = TabPanel.class.getResource(path);
    if (imgURL != null) {
      return new ImageIcon(imgURL);
    } else {
      System.err.println("Couldn't find file: " + path);
      return null;
    }
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


}
