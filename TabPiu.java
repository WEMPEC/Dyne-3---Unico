import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.util.Hashtable;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TabPiu extends JPanel {

  private JPanel panel3;
  private GridBagLayout gl_Detail;
  private JTextField textField_9, textField_10, textField_11, textField_3, textField_8, textField;
  private JButton button_1, button;
  private JLabel lblNewLabel_2, lblNewLabel, lblNewLabel_1, lblLimAct, label_1, label_2, label;
  private JCheckBox tglbtnNewToggleButton;
  private JTable table;
  private GridBagLayout gbl_panel_2;
  private JPanel panel_2;
  private String[] tempLimit;
  private Boolean checkload;
  private String data[][];

  public TabPiu(JPanel panel1, GridBagLayout gl_panel1, Boolean checkload, ParseXml loadinfo) {
    // TODO Auto-generated constructor stub
    panel_2 = panel1;
    gbl_panel_2 = gl_panel1;
    this.checkload = checkload;
    // elements
    if (checkload & loadinfo != null) {
      tempLimit = loadinfo.getLimitPiu();
      // absVDD = loadinfo.getAbsVDDList();
    } else {
      tempLimit = new String[15];
      for (int i = 0; i < tempLimit.length; ++i) {
        tempLimit[i] = "0";
      }
    }


    data = new String[][] {{"Name", "Set", "Min", "Max"},
        {"Min Speed (rpm) ", tempLimit[0], "0", "10000"},
        {"Def Speed (rpm) ", tempLimit[1], "0", "10000"},
        {"Max Speed (rpm) ", tempLimit[2], "0", "1000"},
        {"Min Torque(Nm) ", tempLimit[3], "0", "10000"},
        {"Def Torque (Nm) ", tempLimit[4], "0", "10000"},
        {"Max Torque (Nm) ", tempLimit[5], "0", "1000"},
        {"Min Acceleration Limit (rpm/s)", tempLimit[6], "0", "10000"},
        {"Def Acceleration Limit (rpm/s)", tempLimit[7], "0", "10000"},
        {"Max Acceleration Limit (rpm/s)", tempLimit[8], "0", "70"},
        {"Minium Inertia (kgm2)", tempLimit[9], "0", "70"},
        {"Default Inertia (kgm2)", tempLimit[10], "0", "700"},
        {"Max Inertia (kgm2)", tempLimit[11], "0", "70"}};
    String column[] = {"ID", "NAME", "SALARY", "set"};
    isCellEditable(4, 4);
    // = new GridBagLayout();
    gbl_panel_2.columnWidths = new int[] {600, 0};
    gbl_panel_2.rowHeights = new int[] {800, 0};
    gbl_panel_2.columnWeights = new double[] {0.0, Double.MIN_VALUE};
    gbl_panel_2.rowWeights = new double[] {10.0, Double.MIN_VALUE};
    panel_2.setLayout(gbl_panel_2);


    // = new GridBagLayout();
     table = new JTable(data, column) {
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



  private static class MySliderUI extends BasicSliderUI {

    private static float[] fracs = {0.0f, 0.4f, 0.8f, 1.0f};
    private LinearGradientPaint p;

    public MySliderUI(JSlider slider) {
      super(slider);
    }

    @Override
    public void paintTrack(Graphics g) {
      Graphics2D g2d = (Graphics2D) g;
      Rectangle t = trackRect;
      Point2D start = new Point2D.Float(t.x - t.width, t.y - t.height);
      Point2D end = new Point2D.Float(t.width, t.height);
      Color[] colors = {Color.red, Color.yellow, Color.green, Color.cyan,};
      p = new LinearGradientPaint(start, end, fracs, colors);
      g2d.setPaint(p);
      g2d.fillRect(t.x, t.y, t.width, t.height);

      // calculate how much of the progress bar to fill
      double percentage = (double) slider.getValue() / (double) slider.getMaximum();


      // PAINT THE FOREGROUND
      // create the gradient paint
      p = new LinearGradientPaint(start, end, fracs, colors);
      g2d.setPaint(p);
      g2d.fillRoundRect(t.x, t.y, t.width, (int) (t.height * percentage), 4, 4);
      // PAINT THE BACKGROUND
      // create a gradient paint for the background
      p = new LinearGradientPaint(start, end, new float[] {0.4f, 0.8f},
          new Color[] {Color.gray.brighter(), Color.gray.brighter().brighter()});
      g2d.setPaint(p);
      g2d.fillRoundRect(t.x, t.y, t.width, t.height - (int) (t.height * percentage), 4, 4);

      // fill the progress bar with a rectange of that size, (with curved corners of 4px diameter)

    }

    // @Override
    // public void paintThumb(Graphics g) {
    // Graphics2D g2d = (Graphics2D) g;
    // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    // Rectangle t = thumbRect;
    // g2d.setColor(Color.black);
    // int tw2 = t.width / 2;
    // g2d.drawLine(t.x, t.y, t.x + t.width - 1, t.y);
    // g2d.drawLine(t.x, t.y, t.x + tw2, t.y + t.height);
    // g2d.drawLine(t.x + t.width - 1, t.y, t.x + tw2, t.y + t.height);
    // }
  }

  public boolean isCellEditable(int row, int col) {
    return true;
  }

  private void setSlider(JSlider tempslide, String tempvalue) {
    tempslide.setValue(Integer.parseInt(tempvalue));

  }

  private void setSpinner(JSpinner tempspin, int tempvalue) {
    tempspin.setValue((Integer) tempvalue);

  }

  public String getsavePIU() {
    String[] listVal = new String[20];
    for (int i = 1; i < data.length; ++i) {
      listVal[i - 1] = table.getModel().getValueAt(i, 1).toString();

    }


    String piuinfo =
        "\n<PIU>\r\n" + "    <LimitsPiu>\r\n" + "        <name>Min Speed (rpm)</name>\r\n"
            + "        <value>" + listVal[0] + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n"
            + "    <LimitsPiu>\r\n" + "        <name>Def Speed (rpm)</name>\r\n" + "        <value>"
            + listVal[1] + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Max Speed (rpm)</name>\r\n" + "        <value>" + listVal[2]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Min Torque (Nm)</name>\r\n" + "        <value>" + listVal[3]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Def Torque (Nm)</name>\r\n" + "        <value>" + listVal[4]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Max Torque (Nm)</name>\r\n" + "        <value>" + listVal[5]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Min AccelLim (rpm/s)</name>\r\n" + "        <value>" + listVal[6]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Def AccelLim (rpm/s)</name>\r\n" + "        <value>" + listVal[7]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Max AccelLim (rpm/s)</name>\r\n" + "        <value>" + listVal[8]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Min Interia (kgm2)</name>\r\n" + "        <value>" + listVal[9]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Default Interia (kgm2)</name>\r\n" + "        <value>" + listVal[10]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "\r\n" + "    <LimitsPiu>\r\n"
            + "        <name>Max Interia (kgm2)</name>\r\n" + "        <value>" + listVal[11]
            + "</value>\r\n" + "    </LimitsPiu>\r\n" + "    \r\n";
    return piuinfo;
  }


}
