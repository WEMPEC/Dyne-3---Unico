import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class TabFaults extends JPanel {
  private GridBagLayout gbl_panel_4;
  private JPanel panel_4;
  private JScrollPane scrollPane;

  public TabFaults(JPanel panel, GridBagLayout gl_panel) {
    // TODO Auto-generated constructor stub
    panel_4 = panel;
    gbl_panel_4 = gl_panel;
    // scrollPane = scrollPane1;

    gbl_panel_4.columnWidths = new int[] {30, 30, 105, 140, 68, 57, 105};
    gbl_panel_4.rowHeights = new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47};
    gbl_panel_4.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_4.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, Double.MIN_VALUE};
    panel_4.setLayout(gbl_panel_4);

    String column[] = {"Converter Fault M632", "BoardSel0/1 M 622", "PwmSwap M623",
        "No Run Bit Drive M635", "PwmSwap M623", "No Run Bit Drive M635", "GateDrive 5678 M624",
        "Igbt Temp M634", "Gbl 5010/5003 M625", "Enc Quad Loss M636", "Overcurrent 1/2 M626",
        "12T M637", "Estop M627", "Overspeed M638", "Loss of Hbeat (H) M628", "CsGblMtr M639",
        "Output Contact M629", "ExtTrip M640", "HostTripped M630", "Invalidvar M642",
        "CoolSystRun M642", "Spare M643"};
    for (int i = 0; i < column.length; ++i) {
      JLabel ok = new JLabel("OK");
      setthefont(ok);
      setthecolor(ok);
      GridBagConstraints c2 = new GridBagConstraints();
      c2.anchor = GridBagConstraints.EAST;

      if (column.length / 2 <= i) {
        c2.gridx = 4;
        c2.gridy = i - column.length / 2;
      } else {
        c2.gridx = 0;
        c2.gridy = i;
      }
      panel_4.add(ok, c2);

      String temp = Integer.toString(i) + ".  ";
      JLabel num = new JLabel(temp);
      setthefont(num);
      GridBagConstraints c1 = new GridBagConstraints();
      c1.anchor = GridBagConstraints.EAST;
      if (column.length / 2 <= i) {
        c1.gridx = 5;
        c1.gridy = i - column.length / 2;
      } else {
        c1.gridx = 1;
        c1.gridy = i;
      }
      panel_4.add(num, c1);

      JLabel a = new JLabel(column[i]);
      setthefont(a);
      GridBagConstraints b = new GridBagConstraints();
      b.anchor = GridBagConstraints.WEST;
      b.insets = new Insets(0, 0, 5, 5);
      if (column.length / 2 <= i) {
        b.gridx = 6;
        b.gridy = i - column.length / 2;
      } else {
        b.gridx = 2;
        b.gridy = i;
      }
      panel_4.add(a, b);


    }

  }

  private void setthefont(JLabel a) {

    a.setFont((new Font("Times New Roman", Font.BOLD, 17)));

  }

  private void setthecolor(JLabel b) {
    System.out.print(b.toString());
    if (b.getText().toString().equalsIgnoreCase("ok")) {
      b.setForeground(Color.GREEN);
    } else {
      b.setForeground(Color.RED);
    }
  }
}
