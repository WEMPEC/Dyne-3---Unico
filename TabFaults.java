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

   // JPanel panel_4 = new JPanel();
  
   // GridBagLayout gbl_panel_4 = new GridBagLayout();
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
    lblOk.setForeground(new Color(0, 211, 0));
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
    label_22. setForeground(new Color(0, 211, 0));
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
    label_11.setForeground(new Color(0, 211, 0));
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
    label_23.setForeground(new Color(0, 211, 0));
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
    label_12.setForeground(new Color(0, 211, 0));
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
    label_24.setForeground(new Color(0, 211, 0));
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
    label_13.setForeground(new Color(0, 211, 0));
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
    label_25. setForeground(new Color(0, 211, 0));
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
    label_14.setForeground(new Color(0, 211, 0));
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
    label_26. setForeground(new Color(0, 211, 0));
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
    label_15. setForeground(new Color(0, 211, 0));
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
    label_27. setForeground(new Color(0, 211, 0));
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
    label_16.setForeground(new Color(0, 211, 0));
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
    label_28.setForeground(new Color(0, 211, 0));
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
    label_17. setForeground(new Color(0, 211, 0));
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
    label_29 .setForeground(new Color(0, 211, 0));
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
    label_18 .setForeground(new Color(0, 211, 0));
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
    label_30. setForeground(new Color(0, 211, 0));
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
    label_19.setForeground(new Color(0, 211, 0));
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
    label_31.setForeground(new Color(0, 211, 0));
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
    label_20.setForeground(new Color(0, 211, 0));
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
    label_32. setForeground(new Color(0, 211, 0));
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
    label_21.setForeground(new Color(0, 211, 0));
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
    label_33.setForeground(new Color(0, 211, 0));
    GridBagConstraints gbc_label_33 = new GridBagConstraints();
    gbc_label_33.anchor = GridBagConstraints.WEST;
    gbc_label_33.insets = new Insets(0, 0, 5, 0);
    gbc_label_33.gridx = 5;
    gbc_label_33.gridy = 11;
    panel_4.add(label_33, gbc_label_33);

   
//    GridBagConstraints gbc_lblSpareM = new GridBagConstraints();
//    gbc_lblSpareM.fill = GridBagConstraints.BOTH;
//    gbc_lblSpareM.gridx = 2;
//    gbc_lblSpareM.gridy = 11;
//    panel_4.add(lblSpareM, gbc_lblSpareM);

  }

}
