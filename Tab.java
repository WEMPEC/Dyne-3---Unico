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
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Tab extends JPanel {
  private JTextField textField_1;
  private JTextField textField_2;
  private JTextField txtConverter;
  private JTextField textField_4;
  private JTextField textField_5;
  private JTextField textField_6;
  private JTextField textField_7;
  private JTable table;
  private JTextField textField_8;

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
    Cool.addTab("New tab", null, panel, null);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[]{72, 65, 82, 0, 0, 0, 0};
    gbl_panel.rowHeights = new int[]{84, 0, 0, 185, 0, 0, 122, 0, 0, 0, 0, 0, 0};
    gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel.setLayout(gbl_panel);
    
    JSlider slider_7 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_7.setPaintTicks(true);
    slider_7.setPaintLabels(true);
    slider_7.setMinorTickSpacing(1);
    slider_7.setMajorTickSpacing(10);
    slider_7.setEnabled(false);
    GridBagConstraints gbc_slider_7 = new GridBagConstraints();
    gbc_slider_7.gridheight = 2;
    gbc_slider_7.insets = new Insets(0, 0, 5, 5);
    gbc_slider_7.gridx = 0;
    gbc_slider_7.gridy = 3;
    panel.add(slider_7, gbc_slider_7);
    
    JSlider slider_4 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_4.setPaintTicks(true);
    slider_4.setPaintLabels(true);
    slider_4.setMinorTickSpacing(1);
    slider_4.setMajorTickSpacing(10);
    slider_4.setEnabled(false);
    GridBagConstraints gbc_slider_4 = new GridBagConstraints();
    gbc_slider_4.insets = new Insets(0, 0, 5, 5);
    gbc_slider_4.gridx = 1;
    gbc_slider_4.gridy = 3;
    panel.add(slider_4, gbc_slider_4);
    
    JSlider slider_6 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_6.setPaintTicks(true);
    slider_6.setPaintLabels(true);
    slider_6.setMinorTickSpacing(1);
    slider_6.setMajorTickSpacing(10);
    slider_6.setEnabled(false);
    GridBagConstraints gbc_slider_6 = new GridBagConstraints();
    gbc_slider_6.insets = new Insets(0, 0, 5, 5);
    gbc_slider_6.gridx = 2;
    gbc_slider_6.gridy = 3;
    panel.add(slider_6, gbc_slider_6);
    
    JSlider slider_8 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_8.setPaintTicks(true);
    slider_8.setPaintLabels(true);
    slider_8.setMinorTickSpacing(1);
    slider_8.setMajorTickSpacing(10);
    slider_8.setEnabled(false);
    GridBagConstraints gbc_slider_8 = new GridBagConstraints();
    gbc_slider_8.insets = new Insets(0, 0, 5, 5);
    gbc_slider_8.gridx = 3;
    gbc_slider_8.gridy = 3;
    panel.add(slider_8, gbc_slider_8);
    
    
    JSlider slider_3 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_3.setPaintTicks(true);
    slider_3.setPaintLabels(true);
    slider_3.setMinorTickSpacing(1);
    slider_3.setMajorTickSpacing(10);
    slider_3.setEnabled(false);
    
    JButton btnNewButton_2 = new JButton("Coolll");

    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {}
    });
    btnNewButton_2.setBackground(Color.GREEN);
    btnNewButton_2.setEnabled(false);

    JTabbedPane Abs = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Abs", null, Abs, null);

    JPanel panel_1 = new JPanel();
    Abs.addTab("New tab", null, panel_1, null);
    GridBagLayout gbl_panel_1 = new GridBagLayout();
    gbl_panel_1.columnWidths = new int[] {1, 192, 151, 78, 123, 0};
    gbl_panel_1.rowHeights = new int[] {62, 53, 58, 59, 53, 29, 26, 26, 0, 26, 20, 26, 26, 26, 0};
    gbl_panel_1.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_1.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
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
        spinner_5.addContainerListener(new ContainerAdapter() {
          @Override
          public void componentAdded(ContainerEvent arg0) {
          }
        });
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
    gbc_textField_2.gridy = 9;
    panel_1.add(textField_2, gbc_textField_2);

    JLabel lblTorqTransducerCal = new JLabel("Torq Transducer Cal");
    GridBagConstraints gbc_lblTorqTransducerCal = new GridBagConstraints();
    gbc_lblTorqTransducerCal.anchor = GridBagConstraints.NORTHWEST;
    gbc_lblTorqTransducerCal.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqTransducerCal.gridx = 1;
    gbc_lblTorqTransducerCal.gridy = 10;
    panel_1.add(lblTorqTransducerCal, gbc_lblTorqTransducerCal);

    JLabel lblStates = new JLabel("States");
    GridBagConstraints gbc_lblStates = new GridBagConstraints();
    gbc_lblStates.anchor = GridBagConstraints.NORTH;
    gbc_lblStates.insets = new Insets(0, 0, 5, 0);
    gbc_lblStates.gridx = 4;
    gbc_lblStates.gridy = 10;
    panel_1.add(lblStates, gbc_lblStates);

    JLabel lblCalSignalAe = new JLabel("CAL Signal AE (Nm)");
    GridBagConstraints gbc_lblCalSignalAe = new GridBagConstraints();
    gbc_lblCalSignalAe.anchor = GridBagConstraints.EAST;
    gbc_lblCalSignalAe.insets = new Insets(0, 0, 5, 5);
    gbc_lblCalSignalAe.gridx = 1;
    gbc_lblCalSignalAe.gridy = 11;
    panel_1.add(lblCalSignalAe, gbc_lblCalSignalAe);

    textField_6 = new JTextField();
    textField_6.setColumns(10);
    GridBagConstraints gbc_textField_6 = new GridBagConstraints();
    gbc_textField_6.anchor = GridBagConstraints.NORTH;
    gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_6.insets = new Insets(0, 0, 5, 5);
    gbc_textField_6.gridx = 2;
    gbc_textField_6.gridy = 11;
    panel_1.add(textField_6, gbc_textField_6);

    JLabel lblConverter = new JLabel("Converter");
    GridBagConstraints gbc_lblConverter = new GridBagConstraints();
    gbc_lblConverter.anchor = GridBagConstraints.EAST;
    gbc_lblConverter.insets = new Insets(0, 0, 5, 5);
    gbc_lblConverter.gridx = 3;
    gbc_lblConverter.gridy = 11;
    panel_1.add(lblConverter, gbc_lblConverter);

    txtConverter = new JTextField("");
    txtConverter.setColumns(10);
    GridBagConstraints gbc_txtConverter = new GridBagConstraints();
    gbc_txtConverter.anchor = GridBagConstraints.NORTH;
    gbc_txtConverter.fill = GridBagConstraints.HORIZONTAL;
    gbc_txtConverter.insets = new Insets(0, 0, 5, 0);
    gbc_txtConverter.gridx = 4;
    gbc_txtConverter.gridy = 11;
    panel_1.add(txtConverter, gbc_txtConverter);

    JLabel lblTorqFbAenm = new JLabel("Torq F/B AE(Nm)");
    GridBagConstraints gbc_lblTorqFbAenm = new GridBagConstraints();
    gbc_lblTorqFbAenm.anchor = GridBagConstraints.EAST;
    gbc_lblTorqFbAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqFbAenm.gridx = 1;
    gbc_lblTorqFbAenm.gridy = 12;
    panel_1.add(lblTorqFbAenm, gbc_lblTorqFbAenm);

    textField_7 = new JTextField();
    textField_7.setColumns(10);
    GridBagConstraints gbc_textField_7 = new GridBagConstraints();
    gbc_textField_7.anchor = GridBagConstraints.NORTH;
    gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_7.insets = new Insets(0, 0, 5, 5);
    gbc_textField_7.gridx = 2;
    gbc_textField_7.gridy = 12;
    panel_1.add(textField_7, gbc_textField_7);

    JLabel lblInverter = new JLabel("Inverter");
    GridBagConstraints gbc_lblInverter = new GridBagConstraints();
    gbc_lblInverter.anchor = GridBagConstraints.EAST;
    gbc_lblInverter.insets = new Insets(0, 0, 5, 5);
    gbc_lblInverter.gridx = 3;
    gbc_lblInverter.gridy = 12;
    panel_1.add(lblInverter, gbc_lblInverter);

    textField_4 = new JTextField();
    textField_4.setColumns(10);
    GridBagConstraints gbc_textField_4 = new GridBagConstraints();
    gbc_textField_4.anchor = GridBagConstraints.NORTH;
    gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_4.insets = new Insets(0, 0, 5, 0);
    gbc_textField_4.gridx = 4;
    gbc_textField_4.gridy = 12;
    panel_1.add(textField_4, gbc_textField_4);

    JLabel lblHostcontr = new JLabel("HostContr");
    GridBagConstraints gbc_lblHostcontr = new GridBagConstraints();
    gbc_lblHostcontr.anchor = GridBagConstraints.EAST;
    gbc_lblHostcontr.insets = new Insets(0, 0, 0, 5);
    gbc_lblHostcontr.gridx = 3;
    gbc_lblHostcontr.gridy = 13;
    panel_1.add(lblHostcontr, gbc_lblHostcontr);

    textField_5 = new JTextField();
    textField_5.setColumns(10);
    GridBagConstraints gbc_textField_5 = new GridBagConstraints();
    gbc_textField_5.anchor = GridBagConstraints.NORTH;
    gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_5.gridx = 4;
    gbc_textField_5.gridy = 13;
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
    gbl_panel_4.columnWidths = new int[]{68, 175, 57, 40, 178, 73, 0};
    gbl_panel_4.rowHeights = new int[]{47, 47, 47, 55, 51, 51, 51, 51, 51, 51, 56, 45, 0, 0};
    gbl_panel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel_4.setLayout(gbl_panel_4);
    
    JLabel label_34 = new JLabel("1. ");
    GridBagConstraints gbc_label_34 = new GridBagConstraints();
    gbc_label_34.anchor = GridBagConstraints.EAST;
    gbc_label_34.insets = new Insets(0, 0, 5, 5);
    gbc_label_34.gridx = 0;
    gbc_label_34.gridy = 0;
    panel_4.add(label_34, gbc_label_34);
    
    JLabel label_9 = new JLabel("5V or 15 V M620");
    GridBagConstraints gbc_label_9 = new GridBagConstraints();
    gbc_label_9.fill = GridBagConstraints.BOTH;
    gbc_label_9.insets = new Insets(0, 0, 5, 5);
    gbc_label_9.gridx = 1;
    gbc_label_9.gridy = 0;
    panel_4.add(label_9, gbc_label_9);
    
    JLabel lblOk = new JLabel("OK");
    GridBagConstraints gbc_lblOk = new GridBagConstraints();
    gbc_lblOk.anchor = GridBagConstraints.WEST;
    gbc_lblOk.insets = new Insets(0, 0, 5, 5);
    gbc_lblOk.gridx = 2;
    gbc_lblOk.gridy = 0;
    panel_4.add(lblOk, gbc_lblOk);
    
    JLabel label_46 = new JLabel("13. ");
    GridBagConstraints gbc_label_46 = new GridBagConstraints();
    gbc_label_46.insets = new Insets(0, 0, 5, 5);
    gbc_label_46.gridx = 3;
    gbc_label_46.gridy = 0;
    panel_4.add(label_46, gbc_label_46);
    
    JLabel lblTorqTransducetM = new JLabel("Torq Transducet M631");
    GridBagConstraints gbc_lblTorqTransducetM = new GridBagConstraints();
    gbc_lblTorqTransducetM.anchor = GridBagConstraints.WEST;
    gbc_lblTorqTransducetM.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqTransducetM.gridx = 4;
    gbc_lblTorqTransducetM.gridy = 0;
    panel_4.add(lblTorqTransducetM, gbc_lblTorqTransducetM);
    
    JLabel label_22 = new JLabel("OK");
    GridBagConstraints gbc_label_22 = new GridBagConstraints();
    gbc_label_22.anchor = GridBagConstraints.WEST;
    gbc_label_22.insets = new Insets(0, 0, 5, 0);
    gbc_label_22.gridx = 5;
    gbc_label_22.gridy = 0;
    panel_4.add(label_22, gbc_label_22);
    
    JLabel label_35 = new JLabel("2. ");
    GridBagConstraints gbc_label_35 = new GridBagConstraints();
    gbc_label_35.anchor = GridBagConstraints.EAST;
    gbc_label_35.insets = new Insets(0, 0, 5, 5);
    gbc_label_35.gridx = 0;
    gbc_label_35.gridy = 1;
    panel_4.add(label_35, gbc_label_35);
    
    JLabel lblJajbM = new JLabel("J1A_J1B M621");
    GridBagConstraints gbc_lblJajbM = new GridBagConstraints();
    gbc_lblJajbM.fill = GridBagConstraints.BOTH;
    gbc_lblJajbM.insets = new Insets(0, 0, 5, 5);
    gbc_lblJajbM.gridx = 1;
    gbc_lblJajbM.gridy = 1;
    panel_4.add(lblJajbM, gbc_lblJajbM);
    
    JLabel label_11 = new JLabel("OK");
    GridBagConstraints gbc_label_11 = new GridBagConstraints();
    gbc_label_11.anchor = GridBagConstraints.WEST;
    gbc_label_11.insets = new Insets(0, 0, 5, 5);
    gbc_label_11.gridx = 2;
    gbc_label_11.gridy = 1;
    panel_4.add(label_11, gbc_label_11);
    
    JLabel label_47 = new JLabel("14.  ");
    GridBagConstraints gbc_label_47 = new GridBagConstraints();
    gbc_label_47.insets = new Insets(0, 0, 5, 5);
    gbc_label_47.gridx = 3;
    gbc_label_47.gridy = 1;
    panel_4.add(label_47, gbc_label_47);
    
    JLabel lblConverterFaultM = new JLabel("Converter Fault M632");
    GridBagConstraints gbc_lblConverterFaultM = new GridBagConstraints();
    gbc_lblConverterFaultM.anchor = GridBagConstraints.WEST;
    gbc_lblConverterFaultM.insets = new Insets(0, 0, 5, 5);
    gbc_lblConverterFaultM.gridx = 4;
    gbc_lblConverterFaultM.gridy = 1;
    panel_4.add(lblConverterFaultM, gbc_lblConverterFaultM);
    
    JLabel label_23 = new JLabel("OK");
    GridBagConstraints gbc_label_23 = new GridBagConstraints();
    gbc_label_23.anchor = GridBagConstraints.WEST;
    gbc_label_23.insets = new Insets(0, 0, 5, 0);
    gbc_label_23.gridx = 5;
    gbc_label_23.gridy = 1;
    panel_4.add(label_23, gbc_label_23);
    
    JLabel label_36 = new JLabel("3. ");
    GridBagConstraints gbc_label_36 = new GridBagConstraints();
    gbc_label_36.anchor = GridBagConstraints.EAST;
    gbc_label_36.insets = new Insets(0, 0, 5, 5);
    gbc_label_36.gridx = 0;
    gbc_label_36.gridy = 2;
    panel_4.add(label_36, gbc_label_36);
    
    JLabel lblBoardselM = new JLabel("BoardSel0/1 M 622");
    GridBagConstraints gbc_lblBoardselM = new GridBagConstraints();
    gbc_lblBoardselM.fill = GridBagConstraints.BOTH;
    gbc_lblBoardselM.insets = new Insets(0, 0, 5, 5);
    gbc_lblBoardselM.gridx = 1;
    gbc_lblBoardselM.gridy = 2;
    panel_4.add(lblBoardselM, gbc_lblBoardselM);
    
    JLabel label_12 = new JLabel("OK");
    GridBagConstraints gbc_label_12 = new GridBagConstraints();
    gbc_label_12.anchor = GridBagConstraints.WEST;
    gbc_label_12.insets = new Insets(0, 0, 5, 5);
    gbc_label_12.gridx = 2;
    gbc_label_12.gridy = 2;
    panel_4.add(label_12, gbc_label_12);
    
    JLabel label_48 = new JLabel("15. ");
    GridBagConstraints gbc_label_48 = new GridBagConstraints();
    gbc_label_48.insets = new Insets(0, 0, 5, 5);
    gbc_label_48.gridx = 3;
    gbc_label_48.gridy = 2;
    panel_4.add(label_48, gbc_label_48);
    
    JLabel label_10 = new JLabel("Converter Fault M632");
    label_10.setBackground(new Color(0, 128, 0));
    GridBagConstraints gbc_label_10 = new GridBagConstraints();
    gbc_label_10.anchor = GridBagConstraints.WEST;
    gbc_label_10.insets = new Insets(0, 0, 5, 5);
    gbc_label_10.gridx = 4;
    gbc_label_10.gridy = 2;
    panel_4.add(label_10, gbc_label_10);
    
    JLabel label_24 = new JLabel("OK");
    GridBagConstraints gbc_label_24 = new GridBagConstraints();
    gbc_label_24.anchor = GridBagConstraints.WEST;
    gbc_label_24.insets = new Insets(0, 0, 5, 0);
    gbc_label_24.gridx = 5;
    gbc_label_24.gridy = 2;
    panel_4.add(label_24, gbc_label_24);
    
    JLabel label_37 = new JLabel("4. ");
    GridBagConstraints gbc_label_37 = new GridBagConstraints();
    gbc_label_37.anchor = GridBagConstraints.EAST;
    gbc_label_37.insets = new Insets(0, 0, 5, 5);
    gbc_label_37.gridx = 0;
    gbc_label_37.gridy = 3;
    panel_4.add(label_37, gbc_label_37);
    
    JLabel lblPwmswapM = new JLabel("PwmSwap M623");
    GridBagConstraints gbc_lblPwmswapM = new GridBagConstraints();
    gbc_lblPwmswapM.fill = GridBagConstraints.BOTH;
    gbc_lblPwmswapM.insets = new Insets(0, 0, 5, 5);
    gbc_lblPwmswapM.gridx = 1;
    gbc_lblPwmswapM.gridy = 3;
    panel_4.add(lblPwmswapM, gbc_lblPwmswapM);
    
    JLabel label_13 = new JLabel("OK");
    GridBagConstraints gbc_label_13 = new GridBagConstraints();
    gbc_label_13.anchor = GridBagConstraints.WEST;
    gbc_label_13.insets = new Insets(0, 0, 5, 5);
    gbc_label_13.gridx = 2;
    gbc_label_13.gridy = 3;
    panel_4.add(label_13, gbc_label_13);
    
    JLabel label_49 = new JLabel("16. ");
    GridBagConstraints gbc_label_49 = new GridBagConstraints();
    gbc_label_49.insets = new Insets(0, 0, 5, 5);
    gbc_label_49.gridx = 3;
    gbc_label_49.gridy = 3;
    panel_4.add(label_49, gbc_label_49);
    
    JLabel lblNoRunBit = new JLabel("No Run Bit Drive M635");
    GridBagConstraints gbc_lblNoRunBit = new GridBagConstraints();
    gbc_lblNoRunBit.anchor = GridBagConstraints.WEST;
    gbc_lblNoRunBit.insets = new Insets(0, 0, 5, 5);
    gbc_lblNoRunBit.gridx = 4;
    gbc_lblNoRunBit.gridy = 3;
    panel_4.add(lblNoRunBit, gbc_lblNoRunBit);
    
    JLabel label_25 = new JLabel("OK");
    GridBagConstraints gbc_label_25 = new GridBagConstraints();
    gbc_label_25.anchor = GridBagConstraints.WEST;
    gbc_label_25.insets = new Insets(0, 0, 5, 0);
    gbc_label_25.gridx = 5;
    gbc_label_25.gridy = 3;
    panel_4.add(label_25, gbc_label_25);
    
    JLabel label_38 = new JLabel("5. ");
    GridBagConstraints gbc_label_38 = new GridBagConstraints();
    gbc_label_38.anchor = GridBagConstraints.EAST;
    gbc_label_38.insets = new Insets(0, 0, 5, 5);
    gbc_label_38.gridx = 0;
    gbc_label_38.gridy = 4;
    panel_4.add(label_38, gbc_label_38);
    
    JLabel lblGatedriveM = new JLabel("GateDrive 5678 M624");
    GridBagConstraints gbc_lblGatedriveM = new GridBagConstraints();
    gbc_lblGatedriveM.fill = GridBagConstraints.BOTH;
    gbc_lblGatedriveM.insets = new Insets(0, 0, 5, 5);
    gbc_lblGatedriveM.gridx = 1;
    gbc_lblGatedriveM.gridy = 4;
    panel_4.add(lblGatedriveM, gbc_lblGatedriveM);
    
    JLabel label_14 = new JLabel("OK");
    GridBagConstraints gbc_label_14 = new GridBagConstraints();
    gbc_label_14.anchor = GridBagConstraints.WEST;
    gbc_label_14.insets = new Insets(0, 0, 5, 5);
    gbc_label_14.gridx = 2;
    gbc_label_14.gridy = 4;
    panel_4.add(label_14, gbc_label_14);
    
    JLabel label_50 = new JLabel("17. ");
    GridBagConstraints gbc_label_50 = new GridBagConstraints();
    gbc_label_50.insets = new Insets(0, 0, 5, 5);
    gbc_label_50.gridx = 3;
    gbc_label_50.gridy = 4;
    panel_4.add(label_50, gbc_label_50);
    
    JLabel lblIgbtTempM = new JLabel("Igbt Temp M634");
    GridBagConstraints gbc_lblIgbtTempM = new GridBagConstraints();
    gbc_lblIgbtTempM.anchor = GridBagConstraints.WEST;
    gbc_lblIgbtTempM.insets = new Insets(0, 0, 5, 5);
    gbc_lblIgbtTempM.gridx = 4;
    gbc_lblIgbtTempM.gridy = 4;
    panel_4.add(lblIgbtTempM, gbc_lblIgbtTempM);
    
    JLabel label_26 = new JLabel("OK");
    GridBagConstraints gbc_label_26 = new GridBagConstraints();
    gbc_label_26.anchor = GridBagConstraints.WEST;
    gbc_label_26.insets = new Insets(0, 0, 5, 0);
    gbc_label_26.gridx = 5;
    gbc_label_26.gridy = 4;
    panel_4.add(label_26, gbc_label_26);
    
    JLabel label_39 = new JLabel("6. ");
    GridBagConstraints gbc_label_39 = new GridBagConstraints();
    gbc_label_39.anchor = GridBagConstraints.EAST;
    gbc_label_39.insets = new Insets(0, 0, 5, 5);
    gbc_label_39.gridx = 0;
    gbc_label_39.gridy = 5;
    panel_4.add(label_39, gbc_label_39);
    
    JLabel lblGblM = new JLabel("Gbl 5010/5003 M625");
    GridBagConstraints gbc_lblGblM = new GridBagConstraints();
    gbc_lblGblM.fill = GridBagConstraints.BOTH;
    gbc_lblGblM.insets = new Insets(0, 0, 5, 5);
    gbc_lblGblM.gridx = 1;
    gbc_lblGblM.gridy = 5;
    panel_4.add(lblGblM, gbc_lblGblM);
    
    JLabel label_15 = new JLabel("OK");
    GridBagConstraints gbc_label_15 = new GridBagConstraints();
    gbc_label_15.anchor = GridBagConstraints.WEST;
    gbc_label_15.insets = new Insets(0, 0, 5, 5);
    gbc_label_15.gridx = 2;
    gbc_label_15.gridy = 5;
    panel_4.add(label_15, gbc_label_15);
    
    JLabel label_51 = new JLabel("18. ");
    GridBagConstraints gbc_label_51 = new GridBagConstraints();
    gbc_label_51.insets = new Insets(0, 0, 5, 5);
    gbc_label_51.gridx = 3;
    gbc_label_51.gridy = 5;
    panel_4.add(label_51, gbc_label_51);
    
    JLabel lblEncQuadLoss = new JLabel("Enc Quad Loss M636");
    GridBagConstraints gbc_lblEncQuadLoss = new GridBagConstraints();
    gbc_lblEncQuadLoss.anchor = GridBagConstraints.WEST;
    gbc_lblEncQuadLoss.insets = new Insets(0, 0, 5, 5);
    gbc_lblEncQuadLoss.gridx = 4;
    gbc_lblEncQuadLoss.gridy = 5;
    panel_4.add(lblEncQuadLoss, gbc_lblEncQuadLoss);
    
    JLabel label_27 = new JLabel("OK");
    GridBagConstraints gbc_label_27 = new GridBagConstraints();
    gbc_label_27.anchor = GridBagConstraints.WEST;
    gbc_label_27.insets = new Insets(0, 0, 5, 0);
    gbc_label_27.gridx = 5;
    gbc_label_27.gridy = 5;
    panel_4.add(label_27, gbc_label_27);
    
    JLabel label_40 = new JLabel("7. ");
    GridBagConstraints gbc_label_40 = new GridBagConstraints();
    gbc_label_40.anchor = GridBagConstraints.EAST;
    gbc_label_40.insets = new Insets(0, 0, 5, 5);
    gbc_label_40.gridx = 0;
    gbc_label_40.gridy = 6;
    panel_4.add(label_40, gbc_label_40);
    
    JLabel lblOvercurrentM = new JLabel("Overcurrent 1/2 M626");
    GridBagConstraints gbc_lblOvercurrentM = new GridBagConstraints();
    gbc_lblOvercurrentM.fill = GridBagConstraints.BOTH;
    gbc_lblOvercurrentM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOvercurrentM.gridx = 1;
    gbc_lblOvercurrentM.gridy = 6;
    panel_4.add(lblOvercurrentM, gbc_lblOvercurrentM);
    
    JLabel label_16 = new JLabel("OK");
    GridBagConstraints gbc_label_16 = new GridBagConstraints();
    gbc_label_16.anchor = GridBagConstraints.WEST;
    gbc_label_16.insets = new Insets(0, 0, 5, 5);
    gbc_label_16.gridx = 2;
    gbc_label_16.gridy = 6;
    panel_4.add(label_16, gbc_label_16);
    
    JLabel label_52 = new JLabel("19. ");
    GridBagConstraints gbc_label_52 = new GridBagConstraints();
    gbc_label_52.insets = new Insets(0, 0, 5, 5);
    gbc_label_52.gridx = 3;
    gbc_label_52.gridy = 6;
    panel_4.add(label_52, gbc_label_52);
    
    JLabel lbltM = new JLabel("12T M637");
    GridBagConstraints gbc_lbltM = new GridBagConstraints();
    gbc_lbltM.anchor = GridBagConstraints.WEST;
    gbc_lbltM.insets = new Insets(0, 0, 5, 5);
    gbc_lbltM.gridx = 4;
    gbc_lbltM.gridy = 6;
    panel_4.add(lbltM, gbc_lbltM);
    
    JLabel label_28 = new JLabel("OK");
    GridBagConstraints gbc_label_28 = new GridBagConstraints();
    gbc_label_28.anchor = GridBagConstraints.WEST;
    gbc_label_28.insets = new Insets(0, 0, 5, 0);
    gbc_label_28.gridx = 5;
    gbc_label_28.gridy = 6;
    panel_4.add(label_28, gbc_label_28);
    
    JLabel label_41 = new JLabel("8. ");
    GridBagConstraints gbc_label_41 = new GridBagConstraints();
    gbc_label_41.anchor = GridBagConstraints.EAST;
    gbc_label_41.insets = new Insets(0, 0, 5, 5);
    gbc_label_41.gridx = 0;
    gbc_label_41.gridy = 7;
    panel_4.add(label_41, gbc_label_41);
    
    JLabel lblEstopM = new JLabel("Estop M627");
    GridBagConstraints gbc_lblEstopM = new GridBagConstraints();
    gbc_lblEstopM.fill = GridBagConstraints.BOTH;
    gbc_lblEstopM.insets = new Insets(0, 0, 5, 5);
    gbc_lblEstopM.gridx = 1;
    gbc_lblEstopM.gridy = 7;
    panel_4.add(lblEstopM, gbc_lblEstopM);
    
    JLabel label_17 = new JLabel("OK");
    GridBagConstraints gbc_label_17 = new GridBagConstraints();
    gbc_label_17.anchor = GridBagConstraints.WEST;
    gbc_label_17.insets = new Insets(0, 0, 5, 5);
    gbc_label_17.gridx = 2;
    gbc_label_17.gridy = 7;
    panel_4.add(label_17, gbc_label_17);
    
    JLabel label_53 = new JLabel("20. ");
    GridBagConstraints gbc_label_53 = new GridBagConstraints();
    gbc_label_53.insets = new Insets(0, 0, 5, 5);
    gbc_label_53.gridx = 3;
    gbc_label_53.gridy = 7;
    panel_4.add(label_53, gbc_label_53);
    
    JLabel lblOverspeedM = new JLabel("Overspeed M638");
    GridBagConstraints gbc_lblOverspeedM = new GridBagConstraints();
    gbc_lblOverspeedM.anchor = GridBagConstraints.WEST;
    gbc_lblOverspeedM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOverspeedM.gridx = 4;
    gbc_lblOverspeedM.gridy = 7;
    panel_4.add(lblOverspeedM, gbc_lblOverspeedM);
    
    JLabel label_29 = new JLabel("OK");
    GridBagConstraints gbc_label_29 = new GridBagConstraints();
    gbc_label_29.anchor = GridBagConstraints.WEST;
    gbc_label_29.insets = new Insets(0, 0, 5, 0);
    gbc_label_29.gridx = 5;
    gbc_label_29.gridy = 7;
    panel_4.add(label_29, gbc_label_29);
    
    JLabel label_42 = new JLabel("9. ");
    GridBagConstraints gbc_label_42 = new GridBagConstraints();
    gbc_label_42.anchor = GridBagConstraints.EAST;
    gbc_label_42.insets = new Insets(0, 0, 5, 5);
    gbc_label_42.gridx = 0;
    gbc_label_42.gridy = 8;
    panel_4.add(label_42, gbc_label_42);
    
    JLabel lblLossOfHbeat = new JLabel("Loss of Hbeat (H) M628");
    GridBagConstraints gbc_lblLossOfHbeat = new GridBagConstraints();
    gbc_lblLossOfHbeat.fill = GridBagConstraints.BOTH;
    gbc_lblLossOfHbeat.insets = new Insets(0, 0, 5, 5);
    gbc_lblLossOfHbeat.gridx = 1;
    gbc_lblLossOfHbeat.gridy = 8;
    panel_4.add(lblLossOfHbeat, gbc_lblLossOfHbeat);
    
    JLabel label_18 = new JLabel("OK");
    GridBagConstraints gbc_label_18 = new GridBagConstraints();
    gbc_label_18.anchor = GridBagConstraints.WEST;
    gbc_label_18.insets = new Insets(0, 0, 5, 5);
    gbc_label_18.gridx = 2;
    gbc_label_18.gridy = 8;
    panel_4.add(label_18, gbc_label_18);
    
    JLabel label_54 = new JLabel("21. ");
    GridBagConstraints gbc_label_54 = new GridBagConstraints();
    gbc_label_54.insets = new Insets(0, 0, 5, 5);
    gbc_label_54.gridx = 3;
    gbc_label_54.gridy = 8;
    panel_4.add(label_54, gbc_label_54);
    
    JLabel lblCsgblmtrM = new JLabel("CsGblMtr M639");
    GridBagConstraints gbc_lblCsgblmtrM = new GridBagConstraints();
    gbc_lblCsgblmtrM.anchor = GridBagConstraints.WEST;
    gbc_lblCsgblmtrM.insets = new Insets(0, 0, 5, 5);
    gbc_lblCsgblmtrM.gridx = 4;
    gbc_lblCsgblmtrM.gridy = 8;
    panel_4.add(lblCsgblmtrM, gbc_lblCsgblmtrM);
    
    JLabel label_30 = new JLabel("OK");
    GridBagConstraints gbc_label_30 = new GridBagConstraints();
    gbc_label_30.anchor = GridBagConstraints.WEST;
    gbc_label_30.insets = new Insets(0, 0, 5, 0);
    gbc_label_30.gridx = 5;
    gbc_label_30.gridy = 8;
    panel_4.add(label_30, gbc_label_30);
    
    JLabel label_43 = new JLabel("10. ");
    GridBagConstraints gbc_label_43 = new GridBagConstraints();
    gbc_label_43.anchor = GridBagConstraints.EAST;
    gbc_label_43.insets = new Insets(0, 0, 5, 5);
    gbc_label_43.gridx = 0;
    gbc_label_43.gridy = 9;
    panel_4.add(label_43, gbc_label_43);
    
    JLabel lblOutputContactM = new JLabel("Output Contact M629");
    GridBagConstraints gbc_lblOutputContactM = new GridBagConstraints();
    gbc_lblOutputContactM.fill = GridBagConstraints.BOTH;
    gbc_lblOutputContactM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOutputContactM.gridx = 1;
    gbc_lblOutputContactM.gridy = 9;
    panel_4.add(lblOutputContactM, gbc_lblOutputContactM);
    
    JLabel label_19 = new JLabel("OK");
    GridBagConstraints gbc_label_19 = new GridBagConstraints();
    gbc_label_19.anchor = GridBagConstraints.WEST;
    gbc_label_19.insets = new Insets(0, 0, 5, 5);
    gbc_label_19.gridx = 2;
    gbc_label_19.gridy = 9;
    panel_4.add(label_19, gbc_label_19);
    
    JLabel label_55 = new JLabel("22. ");
    GridBagConstraints gbc_label_55 = new GridBagConstraints();
    gbc_label_55.insets = new Insets(0, 0, 5, 5);
    gbc_label_55.gridx = 3;
    gbc_label_55.gridy = 9;
    panel_4.add(label_55, gbc_label_55);
    
    JLabel lblExttripM = new JLabel("ExtTrip M640");
    GridBagConstraints gbc_lblExttripM = new GridBagConstraints();
    gbc_lblExttripM.anchor = GridBagConstraints.WEST;
    gbc_lblExttripM.insets = new Insets(0, 0, 5, 5);
    gbc_lblExttripM.gridx = 4;
    gbc_lblExttripM.gridy = 9;
    panel_4.add(lblExttripM, gbc_lblExttripM);
    
    JLabel label_31 = new JLabel("OK");
    GridBagConstraints gbc_label_31 = new GridBagConstraints();
    gbc_label_31.anchor = GridBagConstraints.WEST;
    gbc_label_31.insets = new Insets(0, 0, 5, 0);
    gbc_label_31.gridx = 5;
    gbc_label_31.gridy = 9;
    panel_4.add(label_31, gbc_label_31);
    
    JLabel label_44 = new JLabel("11. ");
    GridBagConstraints gbc_label_44 = new GridBagConstraints();
    gbc_label_44.anchor = GridBagConstraints.EAST;
    gbc_label_44.insets = new Insets(0, 0, 5, 5);
    gbc_label_44.gridx = 0;
    gbc_label_44.gridy = 10;
    panel_4.add(label_44, gbc_label_44);
    
    JLabel lblHosttrippedM = new JLabel("HostTripped M630");
    GridBagConstraints gbc_lblHosttrippedM = new GridBagConstraints();
    gbc_lblHosttrippedM.insets = new Insets(0, 0, 5, 5);
    gbc_lblHosttrippedM.fill = GridBagConstraints.BOTH;
    gbc_lblHosttrippedM.gridx = 1;
    gbc_lblHosttrippedM.gridy = 10;
    panel_4.add(lblHosttrippedM, gbc_lblHosttrippedM);
    
    JLabel label_20 = new JLabel("OK");
    GridBagConstraints gbc_label_20 = new GridBagConstraints();
    gbc_label_20.anchor = GridBagConstraints.WEST;
    gbc_label_20.insets = new Insets(0, 0, 5, 5);
    gbc_label_20.gridx = 2;
    gbc_label_20.gridy = 10;
    panel_4.add(label_20, gbc_label_20);
    
    JLabel label_56 = new JLabel("23. ");
    GridBagConstraints gbc_label_56 = new GridBagConstraints();
    gbc_label_56.insets = new Insets(0, 0, 5, 5);
    gbc_label_56.gridx = 3;
    gbc_label_56.gridy = 10;
    panel_4.add(label_56, gbc_label_56);
    
    JLabel lblInvalidvarM = new JLabel("Invalidvar M642");
    GridBagConstraints gbc_lblInvalidvarM = new GridBagConstraints();
    gbc_lblInvalidvarM.insets = new Insets(0, 0, 5, 5);
    gbc_lblInvalidvarM.anchor = GridBagConstraints.WEST;
    gbc_lblInvalidvarM.gridx = 4;
    gbc_lblInvalidvarM.gridy = 10;
    panel_4.add(lblInvalidvarM, gbc_lblInvalidvarM);
    
    JLabel label_32 = new JLabel("OK");
    GridBagConstraints gbc_label_32 = new GridBagConstraints();
    gbc_label_32.anchor = GridBagConstraints.WEST;
    gbc_label_32.insets = new Insets(0, 0, 5, 0);
    gbc_label_32.gridx = 5;
    gbc_label_32.gridy = 10;
    panel_4.add(label_32, gbc_label_32);
    
    JLabel label_45 = new JLabel("12. ");
    GridBagConstraints gbc_label_45 = new GridBagConstraints();
    gbc_label_45.anchor = GridBagConstraints.EAST;
    gbc_label_45.insets = new Insets(0, 0, 5, 5);
    gbc_label_45.gridx = 0;
    gbc_label_45.gridy = 11;
    panel_4.add(label_45, gbc_label_45);
    
    JLabel lblCoolsystrunM = new JLabel("CoolSystRun M642");
    GridBagConstraints gbc_lblCoolsystrunM = new GridBagConstraints();
    gbc_lblCoolsystrunM.anchor = GridBagConstraints.WEST;
    gbc_lblCoolsystrunM.insets = new Insets(0, 0, 5, 5);
    gbc_lblCoolsystrunM.gridx = 1;
    gbc_lblCoolsystrunM.gridy = 11;
    panel_4.add(lblCoolsystrunM, gbc_lblCoolsystrunM);
    
    JLabel label_21 = new JLabel("OK");
    GridBagConstraints gbc_label_21 = new GridBagConstraints();
    gbc_label_21.anchor = GridBagConstraints.WEST;
    gbc_label_21.insets = new Insets(0, 0, 5, 5);
    gbc_label_21.gridx = 2;
    gbc_label_21.gridy = 11;
    panel_4.add(label_21, gbc_label_21);
    
    JLabel label_57 = new JLabel("24.  ");
    GridBagConstraints gbc_label_57 = new GridBagConstraints();
    gbc_label_57.insets = new Insets(0, 0, 5, 5);
    gbc_label_57.gridx = 3;
    gbc_label_57.gridy = 11;
    panel_4.add(label_57, gbc_label_57);
    
    JLabel lblSpareM = new JLabel("Spare M643");
    GridBagConstraints gbc_lblSpareM = new GridBagConstraints();
    gbc_lblSpareM.insets = new Insets(0, 0, 5, 5);
    gbc_lblSpareM.anchor = GridBagConstraints.WEST;
    gbc_lblSpareM.gridx = 4;
    gbc_lblSpareM.gridy = 11;
    panel_4.add(lblSpareM, gbc_lblSpareM);
    
    JLabel label_33 = new JLabel("OK");
    GridBagConstraints gbc_label_33 = new GridBagConstraints();
    gbc_label_33.anchor = GridBagConstraints.WEST;
    gbc_label_33.insets = new Insets(0, 0, 5, 0);
    gbc_label_33.gridx = 5;
    gbc_label_33.gridy = 11;
    panel_4.add(label_33, gbc_label_33);

    JTabbedPane Piu = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Piu", null, Piu, null);

    //Create the label table
    Hashtable labelTable = new Hashtable();
    labelTable.put( new Integer( 0 ), new JLabel("Stop") );
    labelTable.put( new Integer( 30/10 ), new JLabel("Slow") );
    labelTable.put( new Integer( 30 ), new JLabel("Fast") );

    //Create the label table
   
    labelTable.put( new Integer( 0 ), new JLabel("Stop") );
    labelTable.put( new Integer( 30/10 ), new JLabel("Slow") );
    labelTable.put( new Integer( 30 ), new JLabel("Fast") );
    
    JPanel panel_3 = new JPanel();
    Piu.addTab("New tab", null, panel_3, null);
    
        Panel Detail = new Panel();
        Piu.addTab("New tab", null, Detail, null);
        GridBagLayout gbl_Detail = new GridBagLayout();
        gbl_Detail.columnWidths = new int[]{86, 32, 1, 312, 152, 168, 168, 154, 266, 0};
        gbl_Detail.rowHeights = new int[]{29, 26, 26, 4, 46, 20, 0, 29, 20, 39, 414, 0};
        gbl_Detail.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_Detail.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        Detail.setLayout(gbl_Detail);
        
            JLabel lblNewLabel_1 = new JLabel("Vslew Act");
            GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
            gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTHEAST;
            gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
            gbc_lblNewLabel_1.gridx = 0;
            gbc_lblNewLabel_1.gridy = 1;
            Detail.add(lblNewLabel_1, gbc_lblNewLabel_1);
            
            JButton button = new JButton("Bus Off");
            button.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent arg0) {
              }
            });
            
            textField_8 = new JTextField();
            textField_8.setColumns(10);
            GridBagConstraints gbc_textField_8 = new GridBagConstraints();
            gbc_textField_8.anchor = GridBagConstraints.NORTHWEST;
            gbc_textField_8.insets = new Insets(0, 0, 5, 5);
            gbc_textField_8.gridwidth = 3;
            gbc_textField_8.gridx = 1;
            gbc_textField_8.gridy = 1;
            Detail.add(textField_8, gbc_textField_8);
            button.setForeground(Color.WHITE);
            button.setBackground(Color.RED);
            GridBagConstraints gbc_button = new GridBagConstraints();
            gbc_button.anchor = GridBagConstraints.WEST;
            gbc_button.insets = new Insets(0, 0, 5, 5);
            gbc_button.gridheight = 2;
            gbc_button.gridx = 5;
            gbc_button.gridy = 1;
            Detail.add(button, gbc_button);
            
            JSeparator separator = new JSeparator();
            separator.setBackground(new Color(0, 0, 0));
            GridBagConstraints gbc_separator = new GridBagConstraints();
            gbc_separator.fill = GridBagConstraints.BOTH;
            gbc_separator.insets = new Insets(0, 0, 5, 5);
            gbc_separator.gridwidth = 6;
            gbc_separator.gridx = 0;
            gbc_separator.gridy = 3;
            Detail.add(separator, gbc_separator);
            
            JButton button_1 = new JButton("Bus On");
            button_1.setBackground(Color.GREEN);
            GridBagConstraints gbc_button_1 = new GridBagConstraints();
            gbc_button_1.anchor = GridBagConstraints.NORTHWEST;
            gbc_button_1.insets = new Insets(0, 0, 5, 5);
            gbc_button_1.gridx = 5;
            gbc_button_1.gridy = 4;
            Detail.add(button_1, gbc_button_1);
            
                JLabel lblNewLabel_2 = new JLabel("Vslew Cmd");
                GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
                gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
                gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
                gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
                gbc_lblNewLabel_2.gridwidth = 2;
                gbc_lblNewLabel_2.gridx = 0;
                gbc_lblNewLabel_2.gridy = 5;
                Detail.add(lblNewLabel_2, gbc_lblNewLabel_2);
                
                JToggleButton tglbtnNewToggleButton = new JToggleButton("Volt Mode");
                GridBagConstraints gbc_tglbtnNewToggleButton = new GridBagConstraints();
                gbc_tglbtnNewToggleButton.anchor = GridBagConstraints.NORTH;
                gbc_tglbtnNewToggleButton.fill = GridBagConstraints.HORIZONTAL;
                gbc_tglbtnNewToggleButton.insets = new Insets(0, 0, 5, 5);
                gbc_tglbtnNewToggleButton.gridx = 6;
                gbc_tglbtnNewToggleButton.gridy = 6;
                Detail.add(tglbtnNewToggleButton, gbc_tglbtnNewToggleButton);
                
                JLabel label_4 = new JLabel("PowerLim (kw)");
                GridBagConstraints gbc_label_4 = new GridBagConstraints();
                gbc_label_4.fill = GridBagConstraints.BOTH;
                gbc_label_4.insets = new Insets(0, 0, 5, 5);
                gbc_label_4.gridx = 6;
                gbc_label_4.gridy = 7;
                Detail.add(label_4, gbc_label_4);
                
                JLabel label_8 = new JLabel("PowerLim (kw)");
                GridBagConstraints gbc_label_8 = new GridBagConstraints();
                gbc_label_8.fill = GridBagConstraints.BOTH;
                gbc_label_8.insets = new Insets(0, 0, 5, 5);
                gbc_label_8.gridx = 5;
                gbc_label_8.gridy = 9;
                Detail.add(label_8, gbc_label_8);
                
                JLabel label_5 = new JLabel("PowerLim (kw)");
                GridBagConstraints gbc_label_5 = new GridBagConstraints();
                gbc_label_5.fill = GridBagConstraints.BOTH;
                gbc_label_5.insets = new Insets(0, 0, 5, 5);
                gbc_label_5.gridx = 6;
                gbc_label_5.gridy = 9;
                Detail.add(label_5, gbc_label_5);
                
                JSlider slider = new JSlider(JSlider.VERTICAL,
                    0, 30, 15);
                slider.setLabelTable( labelTable );
                    
                    JSlider slider_5 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
                    slider_5.setPaintTicks(true);
                    slider_5.setPaintLabels(true);
                    slider_5.setMinorTickSpacing(1);
                    slider_5.setMajorTickSpacing(10);
                    GridBagConstraints gbc_slider_5 = new GridBagConstraints();
                    gbc_slider_5.insets = new Insets(0, 0, 0, 5);
                    gbc_slider_5.gridx = 3;
                    gbc_slider_5.gridy = 10;
                    Detail.add(slider_5, gbc_slider_5);
                
                    slider.setPaintLabels(true);
                    //Turn on labels at major tick marks.
                    slider.setMajorTickSpacing(10);
                    slider.setMinorTickSpacing(1);
                    slider.setPaintTicks(true);
                    slider.setPaintLabels(true);
                    GridBagConstraints gbc_slider = new GridBagConstraints();
                    gbc_slider.fill = GridBagConstraints.VERTICAL;
                    gbc_slider.insets = new Insets(0, 0, 0, 5);
                    gbc_slider.gridx = 1;
                    gbc_slider.gridy = 10;
                    Detail.add(slider, gbc_slider);
                    
                    JSlider slider_2 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
                    slider_2.setPaintTicks(true);
                    slider_2.setPaintLabels(true);
                    slider_2.setMinorTickSpacing(1);
                    slider_2.setMajorTickSpacing(10);
                    GridBagConstraints gbc_slider_2 = new GridBagConstraints();
                    gbc_slider_2.anchor = GridBagConstraints.WEST;
                    gbc_slider_2.fill = GridBagConstraints.VERTICAL;
                    gbc_slider_2.insets = new Insets(0, 0, 0, 5);
                    gbc_slider_2.gridx = 2;
                    gbc_slider_2.gridy = 10;
                    Detail.add(slider_2, gbc_slider_2);
                    
                    JSlider slider_1 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
                    slider_1.setPaintTicks(true);
                    slider_1.setPaintLabels(true);
                    slider_1.setMinorTickSpacing(1);
                    slider_1.setMajorTickSpacing(10);
                    GridBagConstraints gbc_slider_1 = new GridBagConstraints();
                    gbc_slider_1.anchor = GridBagConstraints.WEST;
                    gbc_slider_1.fill = GridBagConstraints.VERTICAL;
                    gbc_slider_1.insets = new Insets(0, 0, 0, 5);
                    gbc_slider_1.gridx = 5;
                    gbc_slider_1.gridy = 10;
                    Detail.add(slider_1, gbc_slider_1);
    // frame.getContentPane().add(tabbedPane, "name_1947731274467900");
  }
  public boolean isCellEditable(int row, int col) { 
    return true; 
}
}
