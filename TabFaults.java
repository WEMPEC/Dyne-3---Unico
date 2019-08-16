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
  private ParseXml loaddata;
  private Boolean ifLoad;
  private String[] faultlist;

  public TabFaults(JPanel panel, GridBagLayout gl_panel, Boolean checkupload, ParseXml loadinfo) {
    // TODO Auto-generated constructor stub
    panel_4 = panel;
    gbl_panel_4 = gl_panel;
    loaddata = loadinfo;
    ifLoad = checkupload;

    if (ifLoad & loadinfo != null) {
      faultlist = loadinfo.getFaultlistarray();
      // absVDD = loadinfo.getAbsVDDList();
    } else {
      faultlist = new String[40];
      for (int i = 0; i < faultlist.length; ++i) {
        faultlist[i] = "/";
      }
    }


    gbl_panel_4.columnWidths = new int[] {30, 30, 105, 40, 30, 40, 105};
    gbl_panel_4.rowHeights = new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47};
    gbl_panel_4.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel_4.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        0.0, 0.0, Double.MIN_VALUE};
    panel_4.setLayout(gbl_panel_4);

    String column[] = {"Converter Fault M632", "BoardSel0/1 M 622", "PwmSwap M623",
        "No Run Bit Drive M635", "PwmSwap M623", "No Run Bit Conv M633", "GateDrive 5678 M624",
        "Igbt Temp M634", "Gbl 5010/5003 M625", "Enc Quad Loss M636", "Overcurrent 1/2 M626",
        "12T M637", "Estop M627", "Overspeed M638", "Loss of Hbeat (H) M628", "CsGblMtr M639",
        "Output Contact M629", "ExtTrip M640", "HostTripped M630", "Invalidvar M642",
        "CoolSystRun M642", "Spare M643"};
    for (int i = 0; i < column.length; ++i) {
      JLabel ok = new JLabel(faultlist[i]);
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

    a.setFont((new Font("Times New Roman", Font.BOLD, 16)));

  }

  private void setthecolor(JLabel b) {
    System.out.print(b.toString());
    if (b.getText().toString().equalsIgnoreCase("ok")) {
      b.setForeground(Color.GREEN);
    } else if (b.getText().toString().equalsIgnoreCase("fault")) {
      b.setForeground(Color.RED);
    } else {
      b.setForeground(Color.ORANGE);
    }
  }

  public String getFaultsinfo() {
    String info = "\r\n" + 
        "<FAULTS>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Converter Fault M632</name>\r\n" + 
        "    <value>"+faultlist[0]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>BoardSel0/1 M 622</name>\r\n" + 
        "    <value>"+faultlist[1]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>PwmSwap M623</name>\r\n" + 
        "    <value>"+faultlist[2]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>No Run Bit Drive M635</name>\r\n" + 
        "    <value>"+faultlist[3]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>PwmSwap M623</name>\r\n" + 
        "    <value>"+faultlist[4]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "\r\n" + 
        "<faults>\r\n" + 
        "    <name> No Run Bit Conv M633 </name>\r\n" + 
        "    <value>"+faultlist[5]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>GateDrive 5678 M624</name>\r\n" + 
        "    <value>"+faultlist[6]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Igbt Temp M634</name>\r\n" + 
        "    <value>"+faultlist[7]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Gbl 5010/5003 M625</name>\r\n" + 
        "    <value>"+faultlist[8]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Enc Quad Loss M636</name>\r\n" + 
        "    <value>"+faultlist[9]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Overcurrent 1/2 M626</name>\r\n" + 
        "    <value>"+faultlist[10]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Estop M627</name>\r\n" + 
        "    <value>"+faultlist[11]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>12T M637</name>\r\n" + 
        "    <value>"+faultlist[12]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Overspeed M638</name>\r\n" + 
        "    <value>"+faultlist[13]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Loss of Hbeat (H) M628</name>\r\n" + 
        "    <value>"+faultlist[14]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>CsGblMtr M639</name>\r\n" + 
        "    <value>"+faultlist[15]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Output Contact M629</name>\r\n" + 
        "    <value>"+faultlist[16]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>ExtTrip M640</name>\r\n" + 
        "    <value>"+faultlist[17]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>HostTripped M630</name>\r\n" + 
        "    <value>"+faultlist[18]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Invalidvar M642</name>\r\n" + 
        "    <value>"+faultlist[19]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>CoolSystRun M642</name>\r\n" + 
        "    <value>"+faultlist[20]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "<faults>\r\n" + 
        "    <name>Spare M643</name>\r\n" + 
        "    <value>"+faultlist[21]+"</value>\r\n" + 
        "</faults>\r\n" + 
        "\r\n" + 
        "\r\n" + 
        "</FAULTS>\r\n" + 
        "</Content>";

    return info;


  }
}
