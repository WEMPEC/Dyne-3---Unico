import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.Button;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpinnerNumberModel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class Tab extends JPanel {
  private JTextField textField_1;
  private JTextField textField_2;
  private JTextField txtConverter;
  private JTextField textField_4;
  private JTextField textField_5;
  private JTextField textField_6;
  private JTextField textField_7;
  private JTable table;
  private JTextField textField;
  private JTextField textField_3;
  private JTextField textField_8;
  private JTextField textField_9;
  private JTextField textField_10;
  private JTextField textField_11;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Tab window = new Tab();
          // window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Tab() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    // frame = new JFrame();
    // frame.setBounds(100, 100, 450, 300);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.getContentPane().setLayout(new CardLayout(0, 0));
    //
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

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

    JLabel lblCommsOk = new JLabel("CommsOK: ");
    lblCommsOk.setForeground(new Color(0, 128, 0));
    lblCommsOk.setEnabled(false);
    lblCommsOk.setBorder(new LineBorder(Color.GREEN));
    // lblCommsOk.setForeground(Color.BLACK);
    // lblCommsOk.setBackground(Color.GREEN);
    //
    JLabel lblReady = new JLabel("Ready");
    lblReady.setBackground(Color.GREEN);
    lblReady.setBorder(BorderFactory.createBevelBorder(0));

    JLabel lblAcdWriteEnable = new JLabel("AcD Write Enable");
    lblAcdWriteEnable.setBackground(Color.GREEN);
    lblAcdWriteEnable.setBorder(BorderFactory.createBevelBorder(0));


    JLabel lblPressOk = new JLabel("Press OK");
    lblPressOk.setBorder(BorderFactory.createBevelBorder(0));

    lblPressOk.setBackground(new Color(0, 255, 0));

    JLabel lblLubesystem = new JLabel("LubeSystem: ");
    lblLubesystem.setFont(new Font("Times New Roman", Font.BOLD, 16));

    JLabel lblNewLabel = new JLabel("New label");

    JButton btnNewButton_2 = new JButton("Coolll");

    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {}
    });
    btnNewButton_2.setBackground(Color.GREEN);
    btnNewButton_2.setEnabled(false);

    JLabel lblCoolsystStatus = new JLabel("CoolSystem Status: ");
    lblCoolsystStatus.setFont(new Font("Times New Roman", Font.BOLD, 16));
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
        .createSequentialGroup().addContainerGap()
        .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup().addComponent(lblLubesystem)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                    .addGroup(gl_panel.createSequentialGroup().addComponent(btnNewButton)
                        .addPreferredGap(ComponentPlacement.RELATED).addComponent(btnNewButton_1))
                    .addComponent(lblCoolsyst).addComponent(lblNewLabel))
                .addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                    .addComponent(lblReady, GroupLayout.PREFERRED_SIZE, 233,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommsOk, GroupLayout.PREFERRED_SIZE, 233,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoolsystStatus)
                    .addComponent(lblAcdWriteEnable, GroupLayout.PREFERRED_SIZE, 233,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPressOk, GroupLayout.PREFERRED_SIZE, 233,
                        GroupLayout.PREFERRED_SIZE))
                .addGap(36)))));
    gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
        .createSequentialGroup().addContainerGap()
        .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblCoolsyst)
            .addComponent(lblCoolsystStatus))
        .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup().addGap(6).addComponent(lblCommsOk)
                .addPreferredGap(ComponentPlacement.RELATED).addComponent(lblReady)
                .addPreferredGap(ComponentPlacement.RELATED).addComponent(lblAcdWriteEnable))
            .addGroup(gl_panel.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                    .addComponent(btnNewButton_1).addComponent(btnNewButton))))
        .addPreferredGap(ComponentPlacement.RELATED).addComponent(lblPressOk).addGap(58)
        .addComponent(lblLubesystem).addGap(29).addComponent(lblNewLabel)
        .addContainerGap(176, Short.MAX_VALUE)));
    panel.setLayout(gl_panel);

    JTabbedPane Abs = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Abs", null, Abs, null);

    JPanel panel_1 = new JPanel();
    Abs.addTab("New tab", null, panel_1, null);
    GridBagLayout gbl_panel_1 = new GridBagLayout();
    gbl_panel_1.columnWidths = new int[] {1, 162, 73, 78, 123, 0};
    gbl_panel_1.rowHeights = new int[] {20, 29, 29, 29, 29, 29, 26, 26, 26, 20, 26, 26, 26, 0};
    gbl_panel_1.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_1.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, Double.MIN_VALUE};
    panel_1.setLayout(gbl_panel_1);

    JLabel lblToDrivedsp = new JLabel("");
    GridBagConstraints gbc_lblToDrivedsp = new GridBagConstraints();
    gbc_lblToDrivedsp.anchor = GridBagConstraints.NORTHWEST;
    gbc_lblToDrivedsp.insets = new Insets(0, 0, 5, 5);
    gbc_lblToDrivedsp.gridx = 0;
    gbc_lblToDrivedsp.gridy = 0;
    panel_1.add(lblToDrivedsp, gbc_lblToDrivedsp);

    JLabel lblConfigureValuesTo = new JLabel("Configure Values to");
    lblConfigureValuesTo.setFont(new Font("Times New Roman", Font.BOLD, 18));
    GridBagConstraints gbc_lblConfigureValuesTo = new GridBagConstraints();
    gbc_lblConfigureValuesTo.anchor = GridBagConstraints.NORTHEAST;
    gbc_lblConfigureValuesTo.insets = new Insets(0, 0, 5, 5);
    gbc_lblConfigureValuesTo.gridx = 1;
    gbc_lblConfigureValuesTo.gridy = 0;
    panel_1.add(lblConfigureValuesTo, gbc_lblConfigureValuesTo);

    JLabel lblValues = new JLabel("Drive Dsp");
    GridBagConstraints gbc_lblValues = new GridBagConstraints();
    gbc_lblValues.anchor = GridBagConstraints.NORTH;
    gbc_lblValues.insets = new Insets(0, 0, 5, 5);
    gbc_lblValues.gridx = 2;
    gbc_lblValues.gridy = 0;
    panel_1.add(lblValues, gbc_lblValues);

    JLabel lblConfigStatus = new JLabel("Config Status");
    GridBagConstraints gbc_lblConfigStatus = new GridBagConstraints();
    gbc_lblConfigStatus.anchor = GridBagConstraints.NORTH;
    gbc_lblConfigStatus.insets = new Insets(0, 0, 5, 0);
    gbc_lblConfigStatus.gridx = 4;
    gbc_lblConfigStatus.gridy = 0;
    panel_1.add(lblConfigStatus, gbc_lblConfigStatus);

    JLabel label_6 = new JLabel("New label");
    GridBagConstraints gbc_label_6 = new GridBagConstraints();
    gbc_label_6.insets = new Insets(0, 0, 5, 5);
    gbc_label_6.gridx = 2;
    gbc_label_6.gridy = 1;
    panel_1.add(label_6, gbc_label_6);

    JLabel label_7 = new JLabel("New label");
    GridBagConstraints gbc_label_7 = new GridBagConstraints();
    gbc_label_7.anchor = GridBagConstraints.WEST;
    gbc_label_7.insets = new Insets(0, 0, 5, 5);
    gbc_label_7.gridx = 3;
    gbc_label_7.gridy = 1;
    panel_1.add(label_7, gbc_label_7);

    JToggleButton tglbtnDigReady = new JToggleButton("Dig Done");
    GridBagConstraints gbc_tglbtnDigReady = new GridBagConstraints();
    gbc_tglbtnDigReady.anchor = GridBagConstraints.NORTH;
    gbc_tglbtnDigReady.insets = new Insets(0, 0, 5, 0);
    gbc_tglbtnDigReady.gridx = 4;
    gbc_tglbtnDigReady.gridy = 1;
    panel_1.add(tglbtnDigReady, gbc_tglbtnDigReady);

    JLabel lblAbortRaterpmsec = new JLabel("Abort Rate (rpm/sec)");
    GridBagConstraints gbc_lblAbortRaterpmsec = new GridBagConstraints();
    gbc_lblAbortRaterpmsec.anchor = GridBagConstraints.EAST;
    gbc_lblAbortRaterpmsec.fill = GridBagConstraints.VERTICAL;
    gbc_lblAbortRaterpmsec.insets = new Insets(0, 0, 5, 5);
    gbc_lblAbortRaterpmsec.gridx = 1;
    gbc_lblAbortRaterpmsec.gridy = 2;
    panel_1.add(lblAbortRaterpmsec, gbc_lblAbortRaterpmsec);

    JSpinner spinner = new JSpinner();
    spinner.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner = new GridBagConstraints();
    gbc_spinner.insets = new Insets(0, 0, 5, 5);
    gbc_spinner.gridx = 2;
    gbc_spinner.gridy = 2;
    panel_1.add(spinner, gbc_spinner);

    JSpinner spinner_6 = new JSpinner();
    spinner_6.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_6 = new GridBagConstraints();
    gbc_spinner_6.anchor = GridBagConstraints.WEST;
    gbc_spinner_6.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_6.gridx = 3;
    gbc_spinner_6.gridy = 2;
    panel_1.add(spinner_6, gbc_spinner_6);

    JToggleButton tglbtnTorsReady = new JToggleButton("Dig Ready");
    GridBagConstraints gbc_tglbtnTorsReady = new GridBagConstraints();
    gbc_tglbtnTorsReady.anchor = GridBagConstraints.NORTH;
    gbc_tglbtnTorsReady.insets = new Insets(0, 0, 5, 0);
    gbc_tglbtnTorsReady.gridx = 4;
    gbc_tglbtnTorsReady.gridy = 2;
    panel_1.add(tglbtnTorsReady, gbc_tglbtnTorsReady);

    JLabel lblTorqfullscaleAenm = new JLabel("TorqFullScale AE (Nm)");
    GridBagConstraints gbc_lblTorqfullscaleAenm = new GridBagConstraints();
    gbc_lblTorqfullscaleAenm.anchor = GridBagConstraints.WEST;
    gbc_lblTorqfullscaleAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqfullscaleAenm.gridx = 1;
    gbc_lblTorqfullscaleAenm.gridy = 3;
    panel_1.add(lblTorqfullscaleAenm, gbc_lblTorqfullscaleAenm);

    JSpinner spinner_1 = new JSpinner();
    spinner_1.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
    gbc_spinner_1.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_1.gridx = 2;
    gbc_spinner_1.gridy = 3;
    panel_1.add(spinner_1, gbc_spinner_1);

    JSpinner spinner_7 = new JSpinner();
    spinner_7.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_7 = new GridBagConstraints();
    gbc_spinner_7.anchor = GridBagConstraints.WEST;
    gbc_spinner_7.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_7.gridx = 3;
    gbc_spinner_7.gridy = 3;
    panel_1.add(spinner_7, gbc_spinner_7);

    JToggleButton tglbtnTorsReady_1 = new JToggleButton("Tors Ready");
    tglbtnTorsReady_1.setHorizontalAlignment(SwingConstants.LEFT);
    tglbtnTorsReady_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
    GridBagConstraints gbc_tglbtnTorsReady_1 = new GridBagConstraints();
    gbc_tglbtnTorsReady_1.anchor = GridBagConstraints.NORTHWEST;
    gbc_tglbtnTorsReady_1.insets = new Insets(0, 0, 5, 0);
    gbc_tglbtnTorsReady_1.gridx = 4;
    gbc_tglbtnTorsReady_1.gridy = 3;
    panel_1.add(tglbtnTorsReady_1, gbc_tglbtnTorsReady_1);

    JLabel lblTorqzeroAenm = new JLabel("TorqZero AE(Nm)");
    GridBagConstraints gbc_lblTorqzeroAenm = new GridBagConstraints();
    gbc_lblTorqzeroAenm.anchor = GridBagConstraints.EAST;
    gbc_lblTorqzeroAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqzeroAenm.gridx = 1;
    gbc_lblTorqzeroAenm.gridy = 4;
    panel_1.add(lblTorqzeroAenm, gbc_lblTorqzeroAenm);

    JSpinner spinner_2 = new JSpinner();
    spinner_2.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
    gbc_spinner_2.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_2.gridx = 2;
    gbc_spinner_2.gridy = 4;
    panel_1.add(spinner_2, gbc_spinner_2);

    JSpinner spinner_8 = new JSpinner();
    spinner_8.setModel(new SpinnerNumberModel(new Long(-2), null, null, new Long(1)));
    GridBagConstraints gbc_spinner_8 = new GridBagConstraints();
    gbc_spinner_8.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_8.gridx = 3;
    gbc_spinner_8.gridy = 4;
    panel_1.add(spinner_8, gbc_spinner_8);

    JToggleButton tglbtnTorsSent = new JToggleButton("Tors Sent");
    GridBagConstraints gbc_tglbtnTorsSent = new GridBagConstraints();
    gbc_tglbtnTorsSent.anchor = GridBagConstraints.NORTH;
    gbc_tglbtnTorsSent.insets = new Insets(0, 0, 5, 0);
    gbc_tglbtnTorsSent.gridx = 4;
    gbc_tglbtnTorsSent.gridy = 4;
    panel_1.add(tglbtnTorsSent, gbc_tglbtnTorsSent);

    JLabel lblNotUsed = new JLabel("Not Used");
    GridBagConstraints gbc_lblNotUsed = new GridBagConstraints();
    gbc_lblNotUsed.anchor = GridBagConstraints.EAST;
    gbc_lblNotUsed.insets = new Insets(0, 0, 5, 5);
    gbc_lblNotUsed.gridx = 1;
    gbc_lblNotUsed.gridy = 5;
    panel_1.add(lblNotUsed, gbc_lblNotUsed);

    JSpinner spinner_3 = new JSpinner();
    spinner_3.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_3 = new GridBagConstraints();
    gbc_spinner_3.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_3.gridx = 2;
    gbc_spinner_3.gridy = 5;
    panel_1.add(spinner_3, gbc_spinner_3);

    JSpinner spinner_9 = new JSpinner();
    GridBagConstraints gbc_spinner_9 = new GridBagConstraints();
    gbc_spinner_9.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_9.gridx = 3;
    gbc_spinner_9.gridy = 5;
    panel_1.add(spinner_9, gbc_spinner_9);

    JCheckBox chckbxTorsTransfer = new JCheckBox("Tors Transfer");
    chckbxTorsTransfer.setFont(new Font("Tahoma", Font.BOLD, 12));
    GridBagConstraints gbc_chckbxTorsTransfer = new GridBagConstraints();
    gbc_chckbxTorsTransfer.anchor = GridBagConstraints.NORTHEAST;
    gbc_chckbxTorsTransfer.insets = new Insets(0, 0, 5, 0);
    gbc_chckbxTorsTransfer.gridx = 4;
    gbc_chckbxTorsTransfer.gridy = 5;
    panel_1.add(chckbxTorsTransfer, gbc_chckbxTorsTransfer);

    JLabel lblNotUsed_1 = new JLabel("Not Used");
    GridBagConstraints gbc_lblNotUsed_1 = new GridBagConstraints();
    gbc_lblNotUsed_1.anchor = GridBagConstraints.EAST;
    gbc_lblNotUsed_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblNotUsed_1.gridx = 1;
    gbc_lblNotUsed_1.gridy = 6;
    panel_1.add(lblNotUsed_1, gbc_lblNotUsed_1);

    JSpinner spinner_4 = new JSpinner();
    spinner_4.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_4 = new GridBagConstraints();
    gbc_spinner_4.anchor = GridBagConstraints.NORTH;
    gbc_spinner_4.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_4.gridx = 2;
    gbc_spinner_4.gridy = 6;
    panel_1.add(spinner_4, gbc_spinner_4);

    JSpinner spinner_10 = new JSpinner();
    GridBagConstraints gbc_spinner_10 = new GridBagConstraints();
    gbc_spinner_10.anchor = GridBagConstraints.NORTH;
    gbc_spinner_10.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_10.gridx = 3;
    gbc_spinner_10.gridy = 6;
    panel_1.add(spinner_10, gbc_spinner_10);

    JLabel lblConfig = new JLabel("Config");
    GridBagConstraints gbc_lblConfig = new GridBagConstraints();
    gbc_lblConfig.insets = new Insets(0, 0, 5, 0);
    gbc_lblConfig.gridx = 4;
    gbc_lblConfig.gridy = 6;
    panel_1.add(lblConfig, gbc_lblConfig);

    JLabel lblTcmdFiltTconst = new JLabel("Tcmd Filt Tconst (ms)");
    GridBagConstraints gbc_lblTcmdFiltTconst = new GridBagConstraints();
    gbc_lblTcmdFiltTconst.anchor = GridBagConstraints.EAST;
    gbc_lblTcmdFiltTconst.insets = new Insets(0, 0, 5, 5);
    gbc_lblTcmdFiltTconst.gridx = 1;
    gbc_lblTcmdFiltTconst.gridy = 7;
    panel_1.add(lblTcmdFiltTconst, gbc_lblTcmdFiltTconst);

    JSpinner spinner_5 = new JSpinner();
    spinner_5.setModel(new SpinnerNumberModel(new Integer(1000), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_5 = new GridBagConstraints();
    gbc_spinner_5.anchor = GridBagConstraints.NORTH;
    gbc_spinner_5.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_5.gridx = 2;
    gbc_spinner_5.gridy = 7;
    panel_1.add(spinner_5, gbc_spinner_5);

    JSpinner spinner_11 = new JSpinner();
    GridBagConstraints gbc_spinner_11 = new GridBagConstraints();
    gbc_spinner_11.anchor = GridBagConstraints.NORTH;
    gbc_spinner_11.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_11.gridx = 3;
    gbc_spinner_11.gridy = 7;
    panel_1.add(spinner_11, gbc_spinner_11);

    textField_1 = new JTextField();
    textField_1.setColumns(10);
    GridBagConstraints gbc_textField_1 = new GridBagConstraints();
    gbc_textField_1.anchor = GridBagConstraints.NORTH;
    gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_1.insets = new Insets(0, 0, 5, 0);
    gbc_textField_1.gridx = 4;
    gbc_textField_1.gridy = 7;
    panel_1.add(textField_1, gbc_textField_1);

    textField_2 = new JTextField();
    textField_2.setColumns(10);
    GridBagConstraints gbc_textField_2 = new GridBagConstraints();
    gbc_textField_2.anchor = GridBagConstraints.NORTH;
    gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_2.insets = new Insets(0, 0, 5, 0);
    gbc_textField_2.gridx = 4;
    gbc_textField_2.gridy = 8;
    panel_1.add(textField_2, gbc_textField_2);

    JLabel lblTorqTransducerCal = new JLabel("Torq Transducer Cal");
    GridBagConstraints gbc_lblTorqTransducerCal = new GridBagConstraints();
    gbc_lblTorqTransducerCal.anchor = GridBagConstraints.NORTHWEST;
    gbc_lblTorqTransducerCal.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqTransducerCal.gridx = 1;
    gbc_lblTorqTransducerCal.gridy = 9;
    panel_1.add(lblTorqTransducerCal, gbc_lblTorqTransducerCal);

    JLabel lblStates = new JLabel("States");
    GridBagConstraints gbc_lblStates = new GridBagConstraints();
    gbc_lblStates.anchor = GridBagConstraints.NORTH;
    gbc_lblStates.insets = new Insets(0, 0, 5, 0);
    gbc_lblStates.gridx = 4;
    gbc_lblStates.gridy = 9;
    panel_1.add(lblStates, gbc_lblStates);

    JLabel lblCalSignalAe = new JLabel("CAL Signal AE (Nm)");
    GridBagConstraints gbc_lblCalSignalAe = new GridBagConstraints();
    gbc_lblCalSignalAe.anchor = GridBagConstraints.EAST;
    gbc_lblCalSignalAe.insets = new Insets(0, 0, 5, 5);
    gbc_lblCalSignalAe.gridx = 1;
    gbc_lblCalSignalAe.gridy = 10;
    panel_1.add(lblCalSignalAe, gbc_lblCalSignalAe);

    textField_6 = new JTextField();
    textField_6.setColumns(10);
    GridBagConstraints gbc_textField_6 = new GridBagConstraints();
    gbc_textField_6.anchor = GridBagConstraints.NORTH;
    gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_6.insets = new Insets(0, 0, 5, 5);
    gbc_textField_6.gridx = 2;
    gbc_textField_6.gridy = 10;
    panel_1.add(textField_6, gbc_textField_6);

    JLabel lblConverter = new JLabel("Converter");
    GridBagConstraints gbc_lblConverter = new GridBagConstraints();
    gbc_lblConverter.anchor = GridBagConstraints.EAST;
    gbc_lblConverter.insets = new Insets(0, 0, 5, 5);
    gbc_lblConverter.gridx = 3;
    gbc_lblConverter.gridy = 10;
    panel_1.add(lblConverter, gbc_lblConverter);

    txtConverter = new JTextField("");
    txtConverter.setColumns(10);
    GridBagConstraints gbc_txtConverter = new GridBagConstraints();
    gbc_txtConverter.anchor = GridBagConstraints.NORTH;
    gbc_txtConverter.fill = GridBagConstraints.HORIZONTAL;
    gbc_txtConverter.insets = new Insets(0, 0, 5, 0);
    gbc_txtConverter.gridx = 4;
    gbc_txtConverter.gridy = 10;
    panel_1.add(txtConverter, gbc_txtConverter);

    JLabel lblTorqFbAenm = new JLabel("Torq F/B AE(Nm)");
    GridBagConstraints gbc_lblTorqFbAenm = new GridBagConstraints();
    gbc_lblTorqFbAenm.anchor = GridBagConstraints.EAST;
    gbc_lblTorqFbAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqFbAenm.gridx = 1;
    gbc_lblTorqFbAenm.gridy = 11;
    panel_1.add(lblTorqFbAenm, gbc_lblTorqFbAenm);

    textField_7 = new JTextField();
    textField_7.setColumns(10);
    GridBagConstraints gbc_textField_7 = new GridBagConstraints();
    gbc_textField_7.anchor = GridBagConstraints.NORTH;
    gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_7.insets = new Insets(0, 0, 5, 5);
    gbc_textField_7.gridx = 2;
    gbc_textField_7.gridy = 11;
    panel_1.add(textField_7, gbc_textField_7);

    JLabel lblInverter = new JLabel("Inverter");
    GridBagConstraints gbc_lblInverter = new GridBagConstraints();
    gbc_lblInverter.anchor = GridBagConstraints.EAST;
    gbc_lblInverter.insets = new Insets(0, 0, 5, 5);
    gbc_lblInverter.gridx = 3;
    gbc_lblInverter.gridy = 11;
    panel_1.add(lblInverter, gbc_lblInverter);

    textField_4 = new JTextField();
    textField_4.setColumns(10);
    GridBagConstraints gbc_textField_4 = new GridBagConstraints();
    gbc_textField_4.anchor = GridBagConstraints.NORTH;
    gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_4.insets = new Insets(0, 0, 5, 0);
    gbc_textField_4.gridx = 4;
    gbc_textField_4.gridy = 11;
    panel_1.add(textField_4, gbc_textField_4);

    JLabel lblHostcontr = new JLabel("HostContr");
    GridBagConstraints gbc_lblHostcontr = new GridBagConstraints();
    gbc_lblHostcontr.anchor = GridBagConstraints.EAST;
    gbc_lblHostcontr.insets = new Insets(0, 0, 0, 5);
    gbc_lblHostcontr.gridx = 3;
    gbc_lblHostcontr.gridy = 12;
    panel_1.add(lblHostcontr, gbc_lblHostcontr);

    textField_5 = new JTextField();
    textField_5.setColumns(10);
    GridBagConstraints gbc_textField_5 = new GridBagConstraints();
    gbc_textField_5.anchor = GridBagConstraints.NORTH;
    gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_5.gridx = 4;
    gbc_textField_5.gridy = 12;
    panel_1.add(textField_5, gbc_textField_5);

    JPanel panel_2 = new JPanel();
    Abs.addTab("Limits", null, panel_2, null);

    // Table
    String data[][] =
        {{"Name", "Min", "Max", "Set"}, {"Min Speed (rpm) ", "0", "10000", "?"}, {"Def Speed(rpm) ", "0", "10000", "?"},
            {"Max Speed(rpm) ", "0", "1000", "?"}, {"Min Torque(Nm) ", "0", "10000", "Set"}, {"Def Torque(Nm) ", "0", "10000", "?"},
            {"Max Torque(Nm) ", "0", "1000", "?"}, {"Min Acceleration Limit(rpm/s)", "0", "10000", "Set"}, {"101","0", "10000", "Set"},
            {"101", "Sachin", "700000", "Set"}, {"101", "Sachin", "700000", "Set"}, {"101", "Sachin", "700000", "Set"},};
    String column[] = {"ID", "NAME", "SALARY", "set"};
    isCellEditable(4,4);
    GridBagLayout gbl_panel_2 = new GridBagLayout();
    gbl_panel_2.columnWidths = new int[]{488, 0};
    gbl_panel_2.rowHeights = new int[]{431, 0};
    gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
    gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
    panel_2.setLayout(gbl_panel_2);
    table = new JTable(data, column);
    table.setColumnSelectionAllowed(true);
    table.getColumnModel().getColumn(1).setPreferredWidth(600);
    table.getColumnModel().getColumn(2).setPreferredWidth(120);
    table.getColumnModel().getColumn(3).setPreferredWidth(120);
    GridBagConstraints gbc_table = new GridBagConstraints();
    gbc_table.fill = GridBagConstraints.BOTH;
    gbc_table.gridx = 0;
    gbc_table.gridy = 0;
    panel_2.add(table, gbc_table);


    JTabbedPane Eng = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Eng", null, Eng, null);
    
    JPanel panel_4 = new JPanel();
    Eng.addTab("New tab", null, panel_4, null);
    GridBagLayout gbl_panel_4 = new GridBagLayout();
    gbl_panel_4.columnWidths = new int[]{224, 67, 249, 0};
    gbl_panel_4.rowHeights = new int[]{47, 47, 47, 55, 51, 51, 51, 51, 51, 51, 56, 45, 0};
    gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel_4.setLayout(gbl_panel_4);
    
    JLabel label_9 = new JLabel("5V or 15 V M620");
    GridBagConstraints gbc_label_9 = new GridBagConstraints();
    gbc_label_9.fill = GridBagConstraints.BOTH;
    gbc_label_9.insets = new Insets(0, 0, 5, 5);
    gbc_label_9.gridx = 0;
    gbc_label_9.gridy = 0;
    panel_4.add(label_9, gbc_label_9);
    
    JLabel lblTorqTransducetM = new JLabel("Torq Transducet M631");
    GridBagConstraints gbc_lblTorqTransducetM = new GridBagConstraints();
    gbc_lblTorqTransducetM.anchor = GridBagConstraints.WEST;
    gbc_lblTorqTransducetM.insets = new Insets(0, 0, 5, 0);
    gbc_lblTorqTransducetM.gridx = 2;
    gbc_lblTorqTransducetM.gridy = 0;
    panel_4.add(lblTorqTransducetM, gbc_lblTorqTransducetM);
    
    JLabel lblJajbM = new JLabel("J1A_J1B M621");
    GridBagConstraints gbc_lblJajbM = new GridBagConstraints();
    gbc_lblJajbM.fill = GridBagConstraints.BOTH;
    gbc_lblJajbM.insets = new Insets(0, 0, 5, 5);
    gbc_lblJajbM.gridx = 0;
    gbc_lblJajbM.gridy = 1;
    panel_4.add(lblJajbM, gbc_lblJajbM);
    
    JLabel lblConverterFaultM = new JLabel("Converter Fault M632");
    GridBagConstraints gbc_lblConverterFaultM = new GridBagConstraints();
    gbc_lblConverterFaultM.anchor = GridBagConstraints.WEST;
    gbc_lblConverterFaultM.insets = new Insets(0, 0, 5, 0);
    gbc_lblConverterFaultM.gridx = 2;
    gbc_lblConverterFaultM.gridy = 1;
    panel_4.add(lblConverterFaultM, gbc_lblConverterFaultM);
    
    JLabel lblBoardselM = new JLabel("BoardSel0/1 M 622");
    GridBagConstraints gbc_lblBoardselM = new GridBagConstraints();
    gbc_lblBoardselM.fill = GridBagConstraints.BOTH;
    gbc_lblBoardselM.insets = new Insets(0, 0, 5, 5);
    gbc_lblBoardselM.gridx = 0;
    gbc_lblBoardselM.gridy = 2;
    panel_4.add(lblBoardselM, gbc_lblBoardselM);
    
    JLabel label_10 = new JLabel("Converter Fault M632");
    label_10.setBackground(new Color(0, 128, 0));
    GridBagConstraints gbc_label_10 = new GridBagConstraints();
    gbc_label_10.anchor = GridBagConstraints.WEST;
    gbc_label_10.insets = new Insets(0, 0, 5, 0);
    gbc_label_10.gridx = 2;
    gbc_label_10.gridy = 2;
    panel_4.add(label_10, gbc_label_10);
    
    JLabel lblPwmswapM = new JLabel("PwmSwap M623");
    GridBagConstraints gbc_lblPwmswapM = new GridBagConstraints();
    gbc_lblPwmswapM.fill = GridBagConstraints.BOTH;
    gbc_lblPwmswapM.insets = new Insets(0, 0, 5, 5);
    gbc_lblPwmswapM.gridx = 0;
    gbc_lblPwmswapM.gridy = 3;
    panel_4.add(lblPwmswapM, gbc_lblPwmswapM);
    
    JLabel lblNoRunBit = new JLabel("No Run Bit Drive M635");
    GridBagConstraints gbc_lblNoRunBit = new GridBagConstraints();
    gbc_lblNoRunBit.anchor = GridBagConstraints.WEST;
    gbc_lblNoRunBit.insets = new Insets(0, 0, 5, 0);
    gbc_lblNoRunBit.gridx = 2;
    gbc_lblNoRunBit.gridy = 3;
    panel_4.add(lblNoRunBit, gbc_lblNoRunBit);
    
    JLabel lblGatedriveM = new JLabel("GateDrive 5678 M624");
    GridBagConstraints gbc_lblGatedriveM = new GridBagConstraints();
    gbc_lblGatedriveM.fill = GridBagConstraints.BOTH;
    gbc_lblGatedriveM.insets = new Insets(0, 0, 5, 5);
    gbc_lblGatedriveM.gridx = 0;
    gbc_lblGatedriveM.gridy = 4;
    panel_4.add(lblGatedriveM, gbc_lblGatedriveM);
    
    JLabel lblIgbtTempM = new JLabel("Igbt Temp M634");
    GridBagConstraints gbc_lblIgbtTempM = new GridBagConstraints();
    gbc_lblIgbtTempM.anchor = GridBagConstraints.WEST;
    gbc_lblIgbtTempM.insets = new Insets(0, 0, 5, 0);
    gbc_lblIgbtTempM.gridx = 2;
    gbc_lblIgbtTempM.gridy = 4;
    panel_4.add(lblIgbtTempM, gbc_lblIgbtTempM);
    
    JLabel lblGblM = new JLabel("Gbl 5010/5003 M625");
    GridBagConstraints gbc_lblGblM = new GridBagConstraints();
    gbc_lblGblM.fill = GridBagConstraints.BOTH;
    gbc_lblGblM.insets = new Insets(0, 0, 5, 5);
    gbc_lblGblM.gridx = 0;
    gbc_lblGblM.gridy = 5;
    panel_4.add(lblGblM, gbc_lblGblM);
    
    JLabel lblEncQuadLoss = new JLabel("Enc Quad Loss M636");
    GridBagConstraints gbc_lblEncQuadLoss = new GridBagConstraints();
    gbc_lblEncQuadLoss.anchor = GridBagConstraints.WEST;
    gbc_lblEncQuadLoss.insets = new Insets(0, 0, 5, 0);
    gbc_lblEncQuadLoss.gridx = 2;
    gbc_lblEncQuadLoss.gridy = 5;
    panel_4.add(lblEncQuadLoss, gbc_lblEncQuadLoss);
    
    JLabel lblOvercurrentM = new JLabel("Overcurrent 1/2 M626");
    GridBagConstraints gbc_lblOvercurrentM = new GridBagConstraints();
    gbc_lblOvercurrentM.fill = GridBagConstraints.BOTH;
    gbc_lblOvercurrentM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOvercurrentM.gridx = 0;
    gbc_lblOvercurrentM.gridy = 6;
    panel_4.add(lblOvercurrentM, gbc_lblOvercurrentM);
    
    JLabel lbltM = new JLabel("12T M637");
    GridBagConstraints gbc_lbltM = new GridBagConstraints();
    gbc_lbltM.anchor = GridBagConstraints.WEST;
    gbc_lbltM.insets = new Insets(0, 0, 5, 0);
    gbc_lbltM.gridx = 2;
    gbc_lbltM.gridy = 6;
    panel_4.add(lbltM, gbc_lbltM);
    
    JLabel lblEstopM = new JLabel("Estop M627");
    GridBagConstraints gbc_lblEstopM = new GridBagConstraints();
    gbc_lblEstopM.fill = GridBagConstraints.BOTH;
    gbc_lblEstopM.insets = new Insets(0, 0, 5, 5);
    gbc_lblEstopM.gridx = 0;
    gbc_lblEstopM.gridy = 7;
    panel_4.add(lblEstopM, gbc_lblEstopM);
    
    JLabel lblOverspeedM = new JLabel("Overspeed M638");
    GridBagConstraints gbc_lblOverspeedM = new GridBagConstraints();
    gbc_lblOverspeedM.anchor = GridBagConstraints.WEST;
    gbc_lblOverspeedM.insets = new Insets(0, 0, 5, 0);
    gbc_lblOverspeedM.gridx = 2;
    gbc_lblOverspeedM.gridy = 7;
    panel_4.add(lblOverspeedM, gbc_lblOverspeedM);
    
    JLabel lblLossOfHbeat = new JLabel("Loss of Hbeat (H) M628");
    GridBagConstraints gbc_lblLossOfHbeat = new GridBagConstraints();
    gbc_lblLossOfHbeat.fill = GridBagConstraints.BOTH;
    gbc_lblLossOfHbeat.insets = new Insets(0, 0, 5, 5);
    gbc_lblLossOfHbeat.gridx = 0;
    gbc_lblLossOfHbeat.gridy = 8;
    panel_4.add(lblLossOfHbeat, gbc_lblLossOfHbeat);
    
    JLabel lblCsgblmtrM = new JLabel("CsGblMtr M639");
    GridBagConstraints gbc_lblCsgblmtrM = new GridBagConstraints();
    gbc_lblCsgblmtrM.anchor = GridBagConstraints.WEST;
    gbc_lblCsgblmtrM.insets = new Insets(0, 0, 5, 0);
    gbc_lblCsgblmtrM.gridx = 2;
    gbc_lblCsgblmtrM.gridy = 8;
    panel_4.add(lblCsgblmtrM, gbc_lblCsgblmtrM);
    
    JLabel lblOutputContactM = new JLabel("Output Contact M629");
    GridBagConstraints gbc_lblOutputContactM = new GridBagConstraints();
    gbc_lblOutputContactM.fill = GridBagConstraints.BOTH;
    gbc_lblOutputContactM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOutputContactM.gridx = 0;
    gbc_lblOutputContactM.gridy = 9;
    panel_4.add(lblOutputContactM, gbc_lblOutputContactM);
    
    JLabel lblExttripM = new JLabel("ExtTrip M640");
    GridBagConstraints gbc_lblExttripM = new GridBagConstraints();
    gbc_lblExttripM.anchor = GridBagConstraints.WEST;
    gbc_lblExttripM.insets = new Insets(0, 0, 5, 0);
    gbc_lblExttripM.gridx = 2;
    gbc_lblExttripM.gridy = 9;
    panel_4.add(lblExttripM, gbc_lblExttripM);
    
    JLabel lblHosttrippedM = new JLabel("HostTripped M630");
    GridBagConstraints gbc_lblHosttrippedM = new GridBagConstraints();
    gbc_lblHosttrippedM.insets = new Insets(0, 0, 5, 5);
    gbc_lblHosttrippedM.fill = GridBagConstraints.BOTH;
    gbc_lblHosttrippedM.gridx = 0;
    gbc_lblHosttrippedM.gridy = 10;
    panel_4.add(lblHosttrippedM, gbc_lblHosttrippedM);
    
    JLabel lblInvalidvarM = new JLabel("Invalidvar M642");
    GridBagConstraints gbc_lblInvalidvarM = new GridBagConstraints();
    gbc_lblInvalidvarM.insets = new Insets(0, 0, 5, 0);
    gbc_lblInvalidvarM.anchor = GridBagConstraints.WEST;
    gbc_lblInvalidvarM.gridx = 2;
    gbc_lblInvalidvarM.gridy = 10;
    panel_4.add(lblInvalidvarM, gbc_lblInvalidvarM);
    
    JLabel lblCoolsystrunM = new JLabel("CoolSystRun M642");
    GridBagConstraints gbc_lblCoolsystrunM = new GridBagConstraints();
    gbc_lblCoolsystrunM.anchor = GridBagConstraints.WEST;
    gbc_lblCoolsystrunM.insets = new Insets(0, 0, 0, 5);
    gbc_lblCoolsystrunM.gridx = 0;
    gbc_lblCoolsystrunM.gridy = 11;
    panel_4.add(lblCoolsystrunM, gbc_lblCoolsystrunM);
    
    JLabel lblSpareM = new JLabel("Spare M643");
    GridBagConstraints gbc_lblSpareM = new GridBagConstraints();
    gbc_lblSpareM.anchor = GridBagConstraints.WEST;
    gbc_lblSpareM.gridx = 2;
    gbc_lblSpareM.gridy = 11;
    panel_4.add(lblSpareM, gbc_lblSpareM);

    JTabbedPane Piu = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Piu", null, Piu, null);

    Panel Detail = new Panel();
    Piu.addTab("New tab", null, Detail, null);

    JLabel lblNewLabel_2 = new JLabel("Vslew Cmd");

    JLabel lblNewLabel_1 = new JLabel("Vslew Act");
    
    JButton button = new JButton("Bus Off");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
      }
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
    
    JToggleButton tglbtnNewToggleButton = new JToggleButton("Volt Mode");
    
    JLabel label = new JLabel("Vslew Cmd");
    
    JSeparator separator = new JSeparator();
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
    
    JLabel label_1 = new JLabel("Vslew Cmd");
    
    JLabel label_2 = new JLabel("Vslew Cmd");
    
   
    JSlider framesPerSecond = new JSlider(JSlider.VERTICAL,
        0, 30, 15);
    //framesPerSecond.addChangeListener(this);
    framesPerSecond.setMajorTickSpacing(10);
    framesPerSecond.setPaintTicks(true);

    //Create the label table
    Hashtable labelTable = new Hashtable();
    labelTable.put( new Integer( 0 ), new JLabel("Stop") );
    labelTable.put( new Integer( 30/10 ), new JLabel("Slow") );
    labelTable.put( new Integer( 30 ), new JLabel("Fast") );
    framesPerSecond.setLabelTable( labelTable );

    framesPerSecond.setPaintLabels(true);
    //Turn on labels at major tick marks.
    framesPerSecond.setMajorTickSpacing(10);
    framesPerSecond.setMinorTickSpacing(1);
    framesPerSecond.setPaintTicks(true);
    framesPerSecond.setPaintLabels(true);
    
      JLabel lblPowerlimkw = new JLabel("PowerLim (kw)");
    
    JLabel label_3 = new JLabel("PowerLim (kw)");
    
    JLabel label_4 = new JLabel("PowerLim (kw)");
    
    JLabel label_5 = new JLabel("PowerLim (kw)");
    
    JSlider slider = new JSlider(JSlider.VERTICAL,
        0, 30, 15);
    //framesPerSecond.addChangeListener(this);
    framesPerSecond.setMajorTickSpacing(10);
    framesPerSecond.setPaintTicks(true);

    //Create the label table
   
    labelTable.put( new Integer( 0 ), new JLabel("Stop") );
    labelTable.put( new Integer( 30/10 ), new JLabel("Slow") );
    labelTable.put( new Integer( 30 ), new JLabel("Fast") );
    slider.setLabelTable( labelTable );

    slider.setPaintLabels(true);
    //Turn on labels at major tick marks.
    slider.setMajorTickSpacing(10);
    slider.setMinorTickSpacing(1);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    
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
    
    JLabel label_8 = new JLabel("PowerLim (kw)");
   // JProgressBar progressBar = new JProgressBar();
      
    
    
    
    
    GroupLayout gl_Detail = new GroupLayout(Detail);
    gl_Detail.setHorizontalGroup(
      gl_Detail.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_Detail.createSequentialGroup()
          .addContainerGap()
          .addComponent(separator, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
          .addContainerGap(131, Short.MAX_VALUE))
        .addGroup(gl_Detail.createSequentialGroup()
          .addGap(32)
          .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_Detail.createSequentialGroup()
              .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING, false)
                .addComponent(lblLimAct, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.RELATED, 360, Short.MAX_VALUE))
            .addGroup(gl_Detail.createSequentialGroup()
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                  .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                  .addComponent(label, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                  .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                .addComponent(framesPerSecond, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                .addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(gl_Detail.createSequentialGroup()
                  .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                    .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(gl_Detail.createSequentialGroup()
                      .addGap(32)
                      .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                        .addComponent(slider, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))))
                  .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                    .addComponent(tglbtnNewToggleButton, 0, 0, Short.MAX_VALUE)
                    .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING, false)
                      .addComponent(button, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(button_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addGroup(gl_Detail.createSequentialGroup()
                      .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_Detail.createSequentialGroup()
                          .addGap(2)
                          .addComponent(slider_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                        .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                      .addPreferredGap(ComponentPlacement.RELATED)
                      .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                        .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                        .addComponent(slider_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))))))
            .addComponent(lblPowerlimkw))
          .addGap(154)
          .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
          .addGap(63))
    );
    gl_Detail.setVerticalGroup(
      gl_Detail.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_Detail.createSequentialGroup()
          .addGap(19)
          .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblNewLabel_2)
            .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(button_1))
          .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_Detail.createSequentialGroup()
              .addGap(18)
              .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                .addComponent(lblNewLabel_1)
                .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblLimAct)
                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
              .addGap(21)
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                .addComponent(label)
                .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            .addGroup(gl_Detail.createSequentialGroup()
              .addGap(30)
              .addComponent(button)))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
            .addComponent(tglbtnNewToggleButton)
            .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
              .addComponent(label_1)
              .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
          .addGap(15)
          .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
            .addGroup(gl_Detail.createSequentialGroup()
              .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
                .addComponent(label_2)
                .addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addGap(27)
              .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
                .addComponent(lblPowerlimkw)
                .addComponent(label_3)
                .addComponent(label_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
            .addComponent(label_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
          .addGap(18)
          .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
            .addComponent(slider, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
            .addComponent(slider_2, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
            .addComponent(framesPerSecond, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
            .addComponent(slider_1, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE))
          .addContainerGap())
    );
    Detail.setLayout(gl_Detail);
    
    JPanel panel_3 = new JPanel();
    Piu.addTab("New tab", null, panel_3, null);
    // frame.getContentPane().add(tabbedPane, "name_1947731274467900");
  }
  public boolean isCellEditable(int row, int col) { 
    return true; 
}
}
