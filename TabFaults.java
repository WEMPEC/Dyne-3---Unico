import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TabFaults extends JPanel {
  private GridBagLayout gbl_panel_4;
  private JPanel panel_4;

  public TabFaults(JPanel panel, GridBagLayout gl_panel) {
    // TODO Auto-generated constructor stub
    panel_4 = panel;
    gbl_panel_4 = gl_panel;

    // GridBagLayout gbl_panel_4 = new GridBagLayout();
    gbl_panel_4.columnWidths = new int[] {231, 40, 249, 0};
    gbl_panel_4.rowHeights = new int[] {47, 47, 47, 55, 51, 51, 51, 51, 51, 51, 56, 45, 0};
    gbl_panel_4.columnWeights = new double[] {0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_4.rowWeights =
        new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    panel_4.setLayout(gbl_panel_4);

    JLabel label_9 = new JLabel("5V or 15 V M620");
    label_9.setBorder(BorderFactory.createLineBorder(Color.black));
    label_9.setFont(new Font("Times New Roman", Font.BOLD, 23));
    label_9.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_label_9 = new GridBagConstraints();
    gbc_label_9.fill = GridBagConstraints.BOTH;
    gbc_label_9.insets = new Insets(0, 0, 5, 5);
    gbc_label_9.gridx = 0;
    gbc_label_9.gridy = 0;
    panel_4.add(label_9, gbc_label_9);

    JLabel lblTorqTransducetM = new JLabel("Torq Transducer M631");
    lblTorqTransducetM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblTorqTransducetM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblTorqTransducetM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblTorqTransducetM = new GridBagConstraints();
    gbc_lblTorqTransducetM.fill = GridBagConstraints.BOTH;
    gbc_lblTorqTransducetM.insets = new Insets(0, 0, 0, 0);
    gbc_lblTorqTransducetM.gridx = 2;
    gbc_lblTorqTransducetM.gridy = 0;
    panel_4.add(lblTorqTransducetM, gbc_lblTorqTransducetM);

    JLabel lblJajbM = new JLabel("J1A_J1B M621");
    lblJajbM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblJajbM.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblJajbM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblJajbM = new GridBagConstraints();
    gbc_lblJajbM.fill = GridBagConstraints.BOTH;
    gbc_lblJajbM.insets = new Insets(0, 0, 5, 5);
    gbc_lblJajbM.gridx = 0;
    gbc_lblJajbM.gridy = 1;
    panel_4.add(lblJajbM, gbc_lblJajbM);

    JLabel lblConverterFaultM = new JLabel("Converter Fault M632");
    lblConverterFaultM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblConverterFaultM.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblConverterFaultM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblConverterFaultM = new GridBagConstraints();
    gbc_lblConverterFaultM.fill = GridBagConstraints.BOTH;
    gbc_lblConverterFaultM.insets = new Insets(0, 0, 5, 0);
    gbc_lblConverterFaultM.gridx = 2;
    gbc_lblConverterFaultM.gridy = 1;
    panel_4.add(lblConverterFaultM, gbc_lblConverterFaultM);

    JLabel lblBoardselM = new JLabel("BoardSel0/1 M 622");
    lblBoardselM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblBoardselM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblBoardselM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblBoardselM = new GridBagConstraints();
    gbc_lblBoardselM.fill = GridBagConstraints.BOTH;
    gbc_lblBoardselM.insets = new Insets(0, 0, 5, 5);
    gbc_lblBoardselM.gridx = 0;
    gbc_lblBoardselM.gridy = 2;
    panel_4.add(lblBoardselM, gbc_lblBoardselM);

    JLabel label_10 = new JLabel("No Run Bit Conv M633");
    label_10.setBorder(BorderFactory.createLineBorder(Color.black));
    label_10.setFont(new Font("Times New Roman", Font.BOLD, 23));
    label_10.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_label_10 = new GridBagConstraints();
    gbc_label_10.fill = GridBagConstraints.BOTH;
    gbc_label_10.insets = new Insets(0, 0, 5, 0);
    gbc_label_10.gridx = 2;
    gbc_label_10.gridy = 2;
    panel_4.add(label_10, gbc_label_10);

    JLabel lblPwmswapM = new JLabel("PwmSwap M623");
    lblPwmswapM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblPwmswapM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblPwmswapM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblPwmswapM = new GridBagConstraints();
    gbc_lblPwmswapM.fill = GridBagConstraints.BOTH;
    gbc_lblPwmswapM.insets = new Insets(0, 0, 5, 5);
    gbc_lblPwmswapM.gridx = 0;
    gbc_lblPwmswapM.gridy = 3;
    panel_4.add(lblPwmswapM, gbc_lblPwmswapM);

    JLabel lblNoRunBit = new JLabel("No Run Bit Drive M635");
    lblNoRunBit.setBorder(BorderFactory.createLineBorder(Color.black));
    lblNoRunBit.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblNoRunBit.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblNoRunBit = new GridBagConstraints();
    gbc_lblNoRunBit.fill = GridBagConstraints.BOTH;
    gbc_lblNoRunBit.insets = new Insets(0, 0, 5, 0);
    gbc_lblNoRunBit.gridx = 2;
    gbc_lblNoRunBit.gridy = 3;
    panel_4.add(lblNoRunBit, gbc_lblNoRunBit);

    JLabel lblGatedriveM = new JLabel("GateDrive 5678 M624");
    lblGatedriveM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblGatedriveM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblGatedriveM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblGatedriveM = new GridBagConstraints();
    gbc_lblGatedriveM.fill = GridBagConstraints.BOTH;
    gbc_lblGatedriveM.insets = new Insets(0, 0, 5, 5);
    gbc_lblGatedriveM.gridx = 0;
    gbc_lblGatedriveM.gridy = 4;
    panel_4.add(lblGatedriveM, gbc_lblGatedriveM);

    JLabel lblIgbtTempM = new JLabel("Igbt Temp M634");
    lblIgbtTempM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblIgbtTempM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblIgbtTempM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblIgbtTempM = new GridBagConstraints();
    gbc_lblIgbtTempM.fill = GridBagConstraints.BOTH;
    gbc_lblIgbtTempM.insets = new Insets(0, 0, 5, 0);
    gbc_lblIgbtTempM.gridx = 2;
    gbc_lblIgbtTempM.gridy = 4;
    panel_4.add(lblIgbtTempM, gbc_lblIgbtTempM);

    JLabel lblGblM = new JLabel("Gbl 5010/5003 M625");
    lblGblM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblGblM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblGblM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblGblM = new GridBagConstraints();
    gbc_lblGblM.fill = GridBagConstraints.BOTH;
    gbc_lblGblM.insets = new Insets(0, 0, 5, 5);
    gbc_lblGblM.gridx = 0;
    gbc_lblGblM.gridy = 5;
    panel_4.add(lblGblM, gbc_lblGblM);

    JLabel lblEncQuadLoss = new JLabel("Enc Quad Loss M636");
    lblEncQuadLoss.setBorder(BorderFactory.createLineBorder(Color.black));
    lblEncQuadLoss.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblEncQuadLoss.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblEncQuadLoss = new GridBagConstraints();
    gbc_lblEncQuadLoss.fill = GridBagConstraints.BOTH;
    gbc_lblEncQuadLoss.insets = new Insets(0, 0, 5, 0);
    gbc_lblEncQuadLoss.gridx = 2;
    gbc_lblEncQuadLoss.gridy = 5;
    panel_4.add(lblEncQuadLoss, gbc_lblEncQuadLoss);

    JLabel lblOvercurrentM = new JLabel("Overcurrent 1/2 M626");
    lblOvercurrentM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblOvercurrentM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblOvercurrentM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblOvercurrentM = new GridBagConstraints();
    gbc_lblOvercurrentM.fill = GridBagConstraints.BOTH;
    gbc_lblOvercurrentM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOvercurrentM.gridx = 0;
    gbc_lblOvercurrentM.gridy = 6;
    panel_4.add(lblOvercurrentM, gbc_lblOvercurrentM);

    JLabel lbltM = new JLabel("12T M637");
    lbltM.setBorder(BorderFactory.createLineBorder(Color.black));
    lbltM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lbltM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lbltM = new GridBagConstraints();
    gbc_lbltM.fill = GridBagConstraints.BOTH;
    gbc_lbltM.insets = new Insets(0, 0, 5, 0);
    gbc_lbltM.gridx = 2;
    gbc_lbltM.gridy = 6;
    panel_4.add(lbltM, gbc_lbltM);

    JLabel lblEstopM = new JLabel("Estop M627");
    lblEstopM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblEstopM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblEstopM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblEstopM = new GridBagConstraints();
    gbc_lblEstopM.fill = GridBagConstraints.BOTH;
    gbc_lblEstopM.insets = new Insets(0, 0, 5, 5);
    gbc_lblEstopM.gridx = 0;
    gbc_lblEstopM.gridy = 7;
    panel_4.add(lblEstopM, gbc_lblEstopM);

    JLabel lblOverspeedM = new JLabel("Overspeed M638");
    lblOverspeedM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblOverspeedM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblOverspeedM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblOverspeedM = new GridBagConstraints();
    gbc_lblOverspeedM.fill = GridBagConstraints.BOTH;
    gbc_lblOverspeedM.insets = new Insets(0, 0, 5, 0);
    gbc_lblOverspeedM.gridx = 2;
    gbc_lblOverspeedM.gridy = 7;
    panel_4.add(lblOverspeedM, gbc_lblOverspeedM);

    JLabel lblLossOfHbeat = new JLabel("Loss of Hbeat (H) M628");
    lblLossOfHbeat.setBorder(BorderFactory.createLineBorder(Color.black));
    lblLossOfHbeat.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblLossOfHbeat.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblLossOfHbeat = new GridBagConstraints();
    gbc_lblLossOfHbeat.fill = GridBagConstraints.BOTH;
    gbc_lblLossOfHbeat.insets = new Insets(0, 0, 5, 5);
    gbc_lblLossOfHbeat.gridx = 0;
    gbc_lblLossOfHbeat.gridy = 8;
    panel_4.add(lblLossOfHbeat, gbc_lblLossOfHbeat);

    JLabel lblCsgblmtrM = new JLabel("CsGblMtr M639");
    lblCsgblmtrM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblCsgblmtrM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblCsgblmtrM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblCsgblmtrM = new GridBagConstraints();
    gbc_lblCsgblmtrM.fill = GridBagConstraints.BOTH;
    gbc_lblCsgblmtrM.insets = new Insets(0, 0, 5, 0);
    gbc_lblCsgblmtrM.gridx = 2;
    gbc_lblCsgblmtrM.gridy = 8;
    panel_4.add(lblCsgblmtrM, gbc_lblCsgblmtrM);

    JLabel lblOutputContactM = new JLabel("Output Contact M629");
    lblOutputContactM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblOutputContactM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblOutputContactM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblOutputContactM = new GridBagConstraints();
    gbc_lblOutputContactM.fill = GridBagConstraints.BOTH;
    gbc_lblOutputContactM.insets = new Insets(0, 0, 5, 5);
    gbc_lblOutputContactM.gridx = 0;
    gbc_lblOutputContactM.gridy = 9;
    panel_4.add(lblOutputContactM, gbc_lblOutputContactM);

    JLabel lblExttripM = new JLabel("ExtTrip M640");
    lblExttripM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblExttripM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblExttripM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblExttripM = new GridBagConstraints();
    gbc_lblExttripM.fill = GridBagConstraints.BOTH;
    gbc_lblExttripM.insets = new Insets(0, 0, 5, 0);
    gbc_lblExttripM.gridx = 2;
    gbc_lblExttripM.gridy = 9;
    panel_4.add(lblExttripM, gbc_lblExttripM);

    JLabel lblHosttrippedM = new JLabel("HostTripped M630");
    lblHosttrippedM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblHosttrippedM.setFont(new Font("Times New Roman", Font.BOLD, 25));
    lblHosttrippedM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblHosttrippedM = new GridBagConstraints();
    gbc_lblHosttrippedM.insets = new Insets(0, 0, 5, 5);
    gbc_lblHosttrippedM.fill = GridBagConstraints.BOTH;
    gbc_lblHosttrippedM.gridx = 0;
    gbc_lblHosttrippedM.gridy = 10;
    panel_4.add(lblHosttrippedM, gbc_lblHosttrippedM);

    JLabel lblInvalidvarM = new JLabel("Invalidvar M642");
    lblInvalidvarM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblInvalidvarM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblInvalidvarM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblInvalidvarM = new GridBagConstraints();
    gbc_lblInvalidvarM.insets = new Insets(0, 0, 5, 0);
    gbc_lblInvalidvarM.fill = GridBagConstraints.BOTH;
    gbc_lblInvalidvarM.gridx = 2;
    gbc_lblInvalidvarM.gridy = 10;
    panel_4.add(lblInvalidvarM, gbc_lblInvalidvarM);

    JLabel lblCoolsystrunM = new JLabel("CoolSystRun M642");
    lblCoolsystrunM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblCoolsystrunM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblCoolsystrunM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblCoolsystrunM = new GridBagConstraints();
    gbc_lblCoolsystrunM.fill = GridBagConstraints.BOTH;
    gbc_lblCoolsystrunM.insets = new Insets(0, 0, 0, 5);
    gbc_lblCoolsystrunM.gridx = 0;
    gbc_lblCoolsystrunM.gridy = 11;
    panel_4.add(lblCoolsystrunM, gbc_lblCoolsystrunM);

    JLabel lblSpareM = new JLabel("Spare M643");
    lblSpareM.setBorder(BorderFactory.createLineBorder(Color.black));
    lblSpareM.setFont(new Font("Times New Roman", Font.BOLD, 23));
    lblSpareM.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_lblSpareM = new GridBagConstraints();
    gbc_lblSpareM.fill = GridBagConstraints.BOTH;
    gbc_lblSpareM.gridx = 2;
    gbc_lblSpareM.gridy = 11;
    panel_4.add(lblSpareM, gbc_lblSpareM);

  }

}
