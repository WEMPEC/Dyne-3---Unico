import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Highlighter;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NodeList;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TabAbs implements ChangeListener {
  private GridBagLayout gbl_panel_1;
  private JPanel panel_1;
  private JTextField textField;
  private JTextField textField_1;
  private JTextField textField_2;
  private JTextField txtConverter;
  private JTextField textField_4;
  private JTextField textField_5;
  private JTextField textField_6;
  private JTextField textField_7;
  private JPanel panel_2;
  private JTable table;
  private GridBagLayout gbl_panel_2;
  private Boolean checkload;
  private JSpinner spinner_1, spinner_2;
  private int[] tempsent;
  private int[] tempreceived;
  private String[] tempstates;
  private String[] tempTorq;
  private String[] tempConfigStatus;
  private String[] tempLimit;

  public TabAbs(JPanel panel, GridBagLayout gl_panel, JPanel panel1, GridBagLayout gl_panel1,
      Boolean checkupload, ParseXml loadinfo) {
    // TODO Auto-generated constructor stub
    this.gbl_panel_1 = gl_panel;
    this.panel_1 = panel;
    this.panel_2 = panel1;
    gbl_panel_2 = gl_panel1;
    this.checkload = checkupload;
    // elements
    if (checkload & loadinfo != null) {
      tempsent = loadinfo.getSentVal();
      tempreceived = loadinfo.getRecVal();
      tempstates = loadinfo.getStates();
      tempTorq = loadinfo.getTorq();
      tempConfigStatus = loadinfo.getConfigStatus();
      tempLimit = loadinfo.getLimits();
      // absVDD = loadinfo.getAbsVDDList();
    } else {
      tempsent = new int[6];
      tempreceived = new int[6];
      tempstates = new String[6];
      tempTorq = new String[6];
      tempConfigStatus = new String[6];
      for (int i = 0; i < tempConfigStatus.length; ++i) {
        tempConfigStatus[i] = "OFF";
      }
      tempLimit = new String[15];
      for (int i = 0; i < tempLimit.length; ++i) {
        tempLimit[i] = "0";
      }
      
    }
    // System.out.println(tempConfigStatus[1]);
    // absVDD = getAbsVDDList();
    // GridBagLayout gbl_panel_1 = new GridBagLayout();
    gbl_panel_1.columnWidths = new int[] {90, 87, 91, 91, 0, 0};
    gbl_panel_1.rowHeights = new int[] {40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40};
    gbl_panel_1.columnWeights = new double[] {0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
    gbl_panel_1.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, Double.MIN_VALUE};
    panel_1.setLayout(gbl_panel_1);

    JLabel lblConfigureValuesTo = new JLabel("Configure Values to Drive Dsp");
    lblConfigureValuesTo.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblConfigureValuesTo = new GridBagConstraints();
    gbc_lblConfigureValuesTo.anchor = GridBagConstraints.EAST;
    gbc_lblConfigureValuesTo.insets = new Insets(0, 0, 5, 0);
    gbc_lblConfigureValuesTo.gridx = 0;
    gbc_lblConfigureValuesTo.gridy = 0;
    panel_1.add(lblConfigureValuesTo, gbc_lblConfigureValuesTo);



    JLabel lblConfigStatus = new JLabel("Config Status");
    lblConfigStatus.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblConfigStatus = new GridBagConstraints();
    gbc_lblConfigStatus.anchor = GridBagConstraints.EAST;
    gbc_lblConfigStatus.insets = new Insets(0, 0, 5, 5);
    gbc_lblConfigStatus.gridx = 3;
    gbc_lblConfigStatus.gridy = 0;
    panel_1.add(lblConfigStatus, gbc_lblConfigStatus);

    JLabel sent = new JLabel("Sent");
    sent.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_label_6 = new GridBagConstraints();
    gbc_label_6.insets = new Insets(0, 0, 5, 5);
    gbc_label_6.gridx = 1;
    gbc_label_6.gridy = 1;
    panel_1.add(sent, gbc_label_6);

    JLabel label_7 = new JLabel("Received");
    label_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_label_7 = new GridBagConstraints();
    gbc_label_7.insets = new Insets(0, 0, 5, 5);
    gbc_label_7.gridx = 2;
    gbc_label_7.gridy = 1;
    panel_1.add(label_7, gbc_label_7);

    JToggleButton tglbtnDigReady = new JToggleButton(" Dig Done   ");
    if (tempConfigStatus[0].equals("ON")) {

      tglbtnDigReady.doClick();
    }
    GridBagConstraints gbc_tglbtnDigReady = new GridBagConstraints();
    gbc_tglbtnDigReady.anchor = GridBagConstraints.NORTH;
    gbc_tglbtnDigReady.insets = new Insets(0, 13, 5, 0);
    gbc_tglbtnDigReady.gridx = 3;
    gbc_tglbtnDigReady.gridy = 1;
    panel_1.add(tglbtnDigReady, gbc_tglbtnDigReady);

    JLabel lblAbortRaterpmsec = new JLabel("Abort Rate (rpm/sec)");
    lblAbortRaterpmsec.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblAbortRaterpmsec = new GridBagConstraints();
    gbc_lblAbortRaterpmsec.fill = GridBagConstraints.VERTICAL;
    gbc_lblAbortRaterpmsec.anchor = GridBagConstraints.EAST;
    gbc_lblAbortRaterpmsec.insets = new Insets(0, 0, 5, 25);
    gbc_lblAbortRaterpmsec.gridx = 0;
    gbc_lblAbortRaterpmsec.gridy = 2;
    panel_1.add(lblAbortRaterpmsec, gbc_lblAbortRaterpmsec);

    JSpinner spinner = new JSpinner();
    JComponent editor = spinner.getEditor();
    JFormattedTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
    tf.setColumns(7);
    spinner.setPreferredSize(new Dimension(150, 100));
    spinner.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner.setModel(new SpinnerNumberModel(new Integer(tempsent[0]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner = new GridBagConstraints();
    gbc_spinner.insets = new Insets(0, 0, 5, 5);
    gbc_spinner.gridx = 1;
    gbc_spinner.gridy = 2;
    panel_1.add(spinner, gbc_spinner);

    JSpinner spinner_6 = new JSpinner();
    spinner_6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_6
        .setModel(new SpinnerNumberModel(new Integer(tempreceived[0]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_6 = new GridBagConstraints();
    gbc_spinner_6.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_6.gridx = 2;
    gbc_spinner_6.gridy = 2;
    panel_1.add(spinner_6, gbc_spinner_6);



    JToggleButton tglbtnTorsReady = new JToggleButton(" Dig Ready  ");
    GridBagConstraints gbc_tglbtnTorsReady = new GridBagConstraints();
    gbc_tglbtnTorsReady.anchor = GridBagConstraints.EAST;
    if (tempConfigStatus[1].equals("ON")) {

      tglbtnTorsReady.doClick();
    }
    // gbc_tglbtnDigReady.insets = new Insets(0, 13, 5, 0);
    gbc_tglbtnTorsReady.insets = new Insets(0, 13, 5, 0);
    gbc_tglbtnTorsReady.gridx = 3;
    gbc_tglbtnTorsReady.gridy = 2;
    panel_1.add(tglbtnTorsReady, gbc_tglbtnTorsReady);

    JLabel torqFS = new JLabel("TorqFullScale AE (Nm)");
    torqFS.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblTorqfullscaleAenm = new GridBagConstraints();
    gbc_lblTorqfullscaleAenm.anchor = GridBagConstraints.EAST;
    gbc_lblTorqfullscaleAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqfullscaleAenm.gridx = 0;
    gbc_lblTorqfullscaleAenm.gridy = 3;


    panel_1.add(torqFS, gbc_lblTorqfullscaleAenm);

    spinner_1 = new JSpinner();
    spinner_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_1
        .setModel(new SpinnerNumberModel(new Integer(tempsent[1]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_1 = new GridBagConstraints();
    gbc_spinner_1.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_1.gridx = 1;
    gbc_spinner_1.gridy = 3;
    panel_1.add(spinner_1, gbc_spinner_1);

    JSpinner spinner_7 = new JSpinner();
    spinner_7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_7
        .setModel(new SpinnerNumberModel(new Integer(tempreceived[1]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_7 = new GridBagConstraints();
    gbc_spinner_7.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_7.gridx = 2;
    gbc_spinner_7.gridy = 3;
    panel_1.add(spinner_7, gbc_spinner_7);

    JToggleButton tglbtnTorsReady_1 = new JToggleButton("Tors Ready");
    tglbtnTorsReady_1.setHorizontalAlignment(SwingConstants.LEFT);
    if (tempConfigStatus[2].equals("ON")) {

      tglbtnTorsReady_1.doClick();
    }
    // tglbtnTorsReady_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
    GridBagConstraints gbc_tglbtnTorsReady_1 = new GridBagConstraints();
    gbc_tglbtnTorsReady_1.anchor = GridBagConstraints.EAST;
    gbc_tglbtnTorsReady_1.insets = new Insets(0, 13, 5, 0);
    gbc_tglbtnTorsReady_1.gridx = 3;
    gbc_tglbtnTorsReady_1.gridy = 3;
    panel_1.add(tglbtnTorsReady_1, gbc_tglbtnTorsReady_1);

    JLabel torqzeroae = new JLabel("TorqZero AE(Nm)");
    torqzeroae.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblTorqzeroAenm = new GridBagConstraints();
    gbc_lblTorqzeroAenm.anchor = GridBagConstraints.EAST;
    gbc_lblTorqzeroAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqzeroAenm.gridx = 0;
    gbc_lblTorqzeroAenm.gridy = 4;
    panel_1.add(torqzeroae, gbc_lblTorqzeroAenm);


    spinner_2 = new JSpinner();
    spinner_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_2
        .setModel(new SpinnerNumberModel(new Integer(tempsent[2]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_2 = new GridBagConstraints();
    gbc_spinner_2.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_2.gridx = 1;
    gbc_spinner_2.gridy = 4;

    // spinner_2.addChangeListener(new ChangeListener() {
    // @Override
    // public void stateChanged(ChangeEvent e) {
    // System.out.println("add change listener");
    // spinner_2.setModel(
    // new SpinnerNumberModel(new Integer(1900), new Integer(0), null, new Integer(1)));
    //
    // spinner_2.setEditor(new JSpinner.NumberEditor(spinner, "00000"));
    //
    // }
    // });

    panel_1.add(spinner_2, gbc_spinner_2);

    JSpinner spinner_8 = new JSpinner();
    spinner_8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_8.setModel(new SpinnerNumberModel(new Long(tempreceived[2]), null, null, new Long(1)));
    GridBagConstraints gbc_spinner_8 = new GridBagConstraints();
    gbc_spinner_8.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_8.gridx = 2;
    gbc_spinner_8.gridy = 4;
    panel_1.add(spinner_8, gbc_spinner_8);

    JToggleButton tglbtnTorsSent = new JToggleButton(" Tors Sent  ");
    // tglbtnTorsSent.setFont(new Font("Times New Roman", Font.BOLD, 17));
    if (tempConfigStatus[3].equals("ON")) {

      tglbtnTorsSent.doClick();
    }
    GridBagConstraints gbc_tglbtnTorsSent = new GridBagConstraints();
    gbc_tglbtnTorsSent.anchor = GridBagConstraints.EAST;
    gbc_tglbtnTorsSent.insets = new Insets(0, 13, 5, 0);
    gbc_tglbtnTorsSent.gridx = 3;
    gbc_tglbtnTorsSent.gridy = 4;
    panel_1.add(tglbtnTorsSent, gbc_tglbtnTorsSent);

    JLabel lblNotUsed = new JLabel("Not Used");
    lblNotUsed.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblNotUsed = new GridBagConstraints();
    gbc_lblNotUsed.anchor = GridBagConstraints.EAST;
    gbc_lblNotUsed.insets = new Insets(0, 0, 5, 5);
    gbc_lblNotUsed.gridx = 0;
    gbc_lblNotUsed.gridy = 5;
    panel_1.add(lblNotUsed, gbc_lblNotUsed);

    JSpinner spinner_3 = new JSpinner();
    spinner_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_3
        .setModel(new SpinnerNumberModel(new Integer(tempsent[3]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_3 = new GridBagConstraints();
    gbc_spinner_3.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_3.gridx = 1;
    gbc_spinner_3.gridy = 5;
    panel_1.add(spinner_3, gbc_spinner_3);

    JSpinner spinner_9 = new JSpinner();
    spinner_9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    GridBagConstraints gbc_spinner_9 = new GridBagConstraints();
    gbc_spinner_9.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_9.gridx = 2;
    gbc_spinner_9.gridy = 5;
    panel_1.add(spinner_9, gbc_spinner_9);

    JCheckBox chckbxTorsTransfer = new JCheckBox("Tors Transfer");
    chckbxTorsTransfer.setFont(new Font("Tahoma", Font.BOLD, 17));
    GridBagConstraints gbc_chckbxTorsTransfer = new GridBagConstraints();
    gbc_chckbxTorsTransfer.gridwidth = 2;
    gbc_chckbxTorsTransfer.insets = new Insets(0, 0, 5, 5);
    gbc_chckbxTorsTransfer.gridx = 3;
    gbc_chckbxTorsTransfer.gridy = 5;
    panel_1.add(chckbxTorsTransfer, gbc_chckbxTorsTransfer);

    JLabel lblNotUsed_1 = new JLabel("Not Used");
    lblNotUsed_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblNotUsed_1 = new GridBagConstraints();
    gbc_lblNotUsed_1.anchor = GridBagConstraints.EAST;
    gbc_lblNotUsed_1.insets = new Insets(0, 0, 5, 5);
    gbc_lblNotUsed_1.gridx = 0;
    gbc_lblNotUsed_1.gridy = 6;
    panel_1.add(lblNotUsed_1, gbc_lblNotUsed_1);

    JSpinner spinner_4 = new JSpinner();
    spinner_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_4
        .setModel(new SpinnerNumberModel(new Integer(tempsent[4]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_4 = new GridBagConstraints();
    gbc_spinner_4.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_4.gridx = 1;
    gbc_spinner_4.gridy = 6;
    panel_1.add(spinner_4, gbc_spinner_4);

    JSpinner spinner_10 = new JSpinner();
    spinner_10.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    GridBagConstraints gbc_spinner_10 = new GridBagConstraints();
    gbc_spinner_10.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_10.gridx = 2;
    gbc_spinner_10.gridy = 6;
    panel_1.add(spinner_10, gbc_spinner_10);

    JLabel lblConfig = new JLabel("Config");
    lblConfig.setFont(new Font("Times New Roman", Font.BOLD, 17));

    GridBagConstraints gbc_lblConfig = new GridBagConstraints();
    gbc_lblConfig.insets = new Insets(0, 0, 5, 5);
    gbc_lblConfig.gridx = 3;
    gbc_lblConfig.gridy = 6;
    panel_1.add(lblConfig, gbc_lblConfig);

    JLabel lblTcmdFiltTconst = new JLabel("Tcmd Filt Tconst (ms)");
    lblTcmdFiltTconst.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblTcmdFiltTconst = new GridBagConstraints();
    gbc_lblTcmdFiltTconst.anchor = GridBagConstraints.EAST;
    gbc_lblTcmdFiltTconst.insets = new Insets(0, 0, 5, 5);
    gbc_lblTcmdFiltTconst.gridx = 0;
    gbc_lblTcmdFiltTconst.gridy = 7;
    panel_1.add(lblTcmdFiltTconst, gbc_lblTcmdFiltTconst);

    JSpinner spinner_5 = new JSpinner();
    spinner_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_5
        .setModel(new SpinnerNumberModel(new Integer(tempsent[5]), null, null, new Integer(1)));
    GridBagConstraints gbc_spinner_5 = new GridBagConstraints();
    gbc_spinner_5.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_5.gridx = 1;
    gbc_spinner_5.gridy = 7;
    panel_1.add(spinner_5, gbc_spinner_5);

    JSpinner spinner_11 = new JSpinner();
    spinner_11.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner_11
        .setModel(new SpinnerNumberModel(new Integer(tempreceived[5]), null, null, new Integer(1)));

    GridBagConstraints gbc_spinner_11 = new GridBagConstraints();
    gbc_spinner_11.insets = new Insets(0, 0, 5, 5);
    gbc_spinner_11.gridx = 2;
    gbc_spinner_11.gridy = 7;
    panel_1.add(spinner_11, gbc_spinner_11);

    textField_1 = new JTextField("% V");
    // textField_1.setText();
    GridBagConstraints gbc_textField_1 = new GridBagConstraints();
    gbc_textField_1.insets = new Insets(0, 0, 5, 5);
    gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_1.gridx = 3;
    gbc_textField_1.gridy = 7;
    panel_1.add(textField_1, gbc_textField_1);
    textField_1.setColumns(10);

    textField_2 = new JTextField("# W");
    // textField_2.setText(tempTorq[1]);
    textField_2.setColumns(10);
    GridBagConstraints gbc_textField_2 = new GridBagConstraints();
    gbc_textField_2.insets = new Insets(0, 0, 5, 5);
    gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_2.gridx = 3;
    gbc_textField_2.gridy = 8;
    panel_1.add(textField_2, gbc_textField_2);

    JLabel lblTorqTransducerCal = new JLabel("Torq Transducer Cal");
    lblTorqTransducerCal.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblTorqTransducerCal = new GridBagConstraints();
    gbc_lblTorqTransducerCal.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqTransducerCal.gridx = 0;
    gbc_lblTorqTransducerCal.gridy = 9;
    panel_1.add(lblTorqTransducerCal, gbc_lblTorqTransducerCal);

    JLabel lblStates = new JLabel("States");
    lblStates.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblStates = new GridBagConstraints();
    gbc_lblStates.insets = new Insets(0, 0, 5, 5);
    gbc_lblStates.gridx = 3;
    gbc_lblStates.gridy = 9;
    panel_1.add(lblStates, gbc_lblStates);

    JLabel lblCalSignalAe = new JLabel("CAL Signal AE (Nm)");
    lblCalSignalAe.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblCalSignalAe = new GridBagConstraints();
    gbc_lblCalSignalAe.anchor = GridBagConstraints.EAST;
    gbc_lblCalSignalAe.insets = new Insets(0, 0, 5, 5);
    gbc_lblCalSignalAe.gridx = 0;
    gbc_lblCalSignalAe.gridy = 10;
    panel_1.add(lblCalSignalAe, gbc_lblCalSignalAe);

    textField_6 = new JTextField();
    textField_6.setText(tempTorq[0]);
    textField_6.setColumns(10);
    GridBagConstraints gbc_textField_6 = new GridBagConstraints();
    gbc_textField_6.insets = new Insets(0, 0, 5, 5);
    gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_6.gridx = 1;
    gbc_textField_6.gridy = 10;
    panel_1.add(textField_6, gbc_textField_6);

    JLabel lblConverter = new JLabel("Converter");
    lblConverter.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblConverter = new GridBagConstraints();
    gbc_lblConverter.insets = new Insets(0, 0, 5, 5);
    gbc_lblConverter.anchor = GridBagConstraints.EAST;
    gbc_lblConverter.gridx = 2;
    gbc_lblConverter.gridy = 10;
    panel_1.add(lblConverter, gbc_lblConverter);

    if (checkload) {
      txtConverter = new JTextField(tempstates[0]);

    } else {
      txtConverter = new JTextField("");
    }

    txtConverter.setColumns(10);
    GridBagConstraints gbc_txtConverter = new GridBagConstraints();
    gbc_txtConverter.insets = new Insets(0, 0, 5, 5);
    gbc_txtConverter.fill = GridBagConstraints.HORIZONTAL;
    gbc_txtConverter.gridx = 3;
    gbc_txtConverter.gridy = 10;
    panel_1.add(txtConverter, gbc_txtConverter);

    JLabel lblTorqFbAenm = new JLabel("Torq F/B AE(Nm)");
    lblTorqFbAenm.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblTorqFbAenm = new GridBagConstraints();
    gbc_lblTorqFbAenm.anchor = GridBagConstraints.EAST;
    gbc_lblTorqFbAenm.insets = new Insets(0, 0, 5, 5);
    gbc_lblTorqFbAenm.gridx = 0;
    gbc_lblTorqFbAenm.gridy = 11;
    panel_1.add(lblTorqFbAenm, gbc_lblTorqFbAenm);

    textField_7 = new JTextField();
    textField_7.setText(tempTorq[1]);
    textField_7.setColumns(10);
    GridBagConstraints gbc_textField_7 = new GridBagConstraints();
    gbc_textField_7.insets = new Insets(0, 0, 5, 5);
    gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_7.gridx = 1;
    gbc_textField_7.gridy = 11;
    panel_1.add(textField_7, gbc_textField_7);

    JLabel lblInverter = new JLabel("Inverter");
    lblInverter.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblInverter = new GridBagConstraints();
    gbc_lblInverter.insets = new Insets(0, 0, 5, 5);
    gbc_lblInverter.anchor = GridBagConstraints.EAST;
    gbc_lblInverter.gridx = 2;
    gbc_lblInverter.gridy = 11;
    panel_1.add(lblInverter, gbc_lblInverter);


    textField_4 = new JTextField();
    // textField_4 = new JTextField();}
    textField_4.setColumns(10);
    textField_4.setText(tempstates[1]);

    GridBagConstraints gbc_textField_4 = new GridBagConstraints();
    gbc_textField_4.insets = new Insets(0, 0, 5, 5);
    gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_4.gridx = 3;
    gbc_textField_4.gridy = 11;
    panel_1.add(textField_4, gbc_textField_4);

    JLabel lblHostcontr = new JLabel("HostContr");
    lblHostcontr.setFont(new Font("Times New Roman", Font.BOLD, 17));
    GridBagConstraints gbc_lblHostcontr = new GridBagConstraints();
    gbc_lblHostcontr.insets = new Insets(0, 0, 0, 5);
    gbc_lblHostcontr.anchor = GridBagConstraints.EAST;
    gbc_lblHostcontr.gridx = 2;
    gbc_lblHostcontr.gridy = 12;
    panel_1.add(lblHostcontr, gbc_lblHostcontr);

    if (checkload) {
      textField_5 = new JTextField(tempstates[2]);

    } else {
      textField_5 = new JTextField();
    }
    textField_5.setColumns(10);
    GridBagConstraints gbc_textField_5 = new GridBagConstraints();
    gbc_textField_5.insets = new Insets(0, 0, 0, 5);
    gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
    gbc_textField_5.gridx = 3;
    gbc_textField_5.gridy = 12;
    panel_1.add(textField_5, gbc_textField_5);



   

    // Table
    String data[][] = {{"Name", "Set", "Min", "Max"}, {"Min Speed (rpm) ", tempLimit [0], "0", "10000"},
        {"Def Speed (rpm) ", tempLimit [1], "0", "10000"}, {"Max Speed (rpm) ", tempLimit [2], "0", "1000"},
        {"Min Torque(Nm) ", tempLimit [3], "0", "10000"}, {"Def Torque (Nm) ", tempLimit [4], "0", "10000"},
        {"Max Torque (Nm) ", tempLimit [5], "0", "1000"},
        {"Min Acceleration Limit (rpm/s)", tempLimit [6], "0", "10000"},
        {"Def Acceleration Limit (rpm/s)", tempLimit [7], "0", "10000"},
        {"Max Acceleration Limit (rpm/s)", tempLimit [8], "0", "70"},
        {"Minium Inertia (kgm2)", tempLimit [9], "0", "70"}, {"Default Inertia (kgm2)", tempLimit [10], "0", "700"},
        {"Max Inertia (kgm2)", tempLimit [11], "0", "70"}};
    String column[] = {"ID", "NAME", "SALARY", "set"};

    gbl_panel_2.columnWidths = new int[] {600, 0};
    gbl_panel_2.rowHeights = new int[] {800, 0};
    gbl_panel_2.columnWeights = new double[] {0.0, Double.MIN_VALUE};
    gbl_panel_2.rowWeights = new double[] {10.0, Double.MIN_VALUE};
    panel_2.setLayout(gbl_panel_2);

    // = new GridBagLayout();
    JTable table = new JTable(data, column) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return column == 1 ? true : false;
      }
    };
    table.setFont(new Font("Times New Roman", Font.BOLD, 17));
    table.setRowHeight(50);
    table.setColumnSelectionAllowed(true);
    table.getColumnModel().getColumn(0).setPreferredWidth(330);
    table.getColumnModel().getColumn(1).setPreferredWidth(120);
    table.getColumnModel().getColumn(3).setPreferredWidth(120);

    GridBagConstraints gbc_table = new GridBagConstraints();
    gbc_table.fill = GridBagConstraints.BOTH;
    gbc_table.gridx = 0;

    gbc_table.gridy = 0;
    panel_2.add(table, gbc_table);


  }
  
  

  /**
   * @param textField the textField to set
   */
  public void setTextField(JTextField textField) {
    this.textField = textField;
  }



  @Override
  public void stateChanged(ChangeEvent arg0) {
    // TODO Auto-generated method stub

  }


}
