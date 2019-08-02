
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicSliderUI;


public class MiddlePanel extends JPanel implements ActionListener {

  // creating two buttons
  private JButton startPiu;
  private JButton startDrive;
  private StringListener textListener;


  public MiddlePanel() {

    setBorder(BorderFactory.createBevelBorder(ABORT, getForeground(), getBackground()));
    JPanel pane = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    GridBagLayout gl_Detail = new GridBagLayout();
    gl_Detail.columnWidths = new int[] {120, 90, 90, 120, 0, 0, 0, 0, 0, 0};
    gl_Detail.rowHeights = new int[] {30, 35, 26, 8, 22, 20, 0, 0, 0, 0, 514, 0};
    gl_Detail.columnWeights =
        new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gl_Detail.rowWeights =
        new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    pane.setLayout(gl_Detail);

    startPiu = new JButton("Start Piu");
    startPiu.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    startPiu.setBackground((new Color(0, 211, 0)));
    startPiu.setForeground(Color.WHITE);

    startDrive = new JButton("Start Drive");
    startDrive.setFont((new Font("Times New Roman", Font.BOLD, 17)));
    startDrive.setBackground(new Color(0, 211, 0));
    startDrive.setForeground(Color.WHITE);


    add(pane);


    startPiu.addActionListener(this);
    // flow layout allows to add a group of components.
    setLayout(new FlowLayout(FlowLayout.LEFT));

    c.fill = GridBagConstraints.HORIZONTAL;
    // c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 0;
    c.insets = new Insets(22, 0, 0, 0);
    pane.add(startPiu, c);



    c.fill = GridBagConstraints.HORIZONTAL;
    // c.weightx = 0.5;
    c.gridx = 0;
    c.gridy = 1;
    c.insets = new Insets(15, 0, 0, 0);
    pane.add(startDrive, c);

    JSlider slider_1 = new JSlider(SwingConstants.VERTICAL, 0, 250, 0);
    slider_1.setPaintTicks(true);
    slider_1.setPaintLabels(true);
    slider_1.setMinorTickSpacing(10);
    slider_1.setMajorTickSpacing(50);
    slider_1.setUI(new MySliderUI(slider_1));
    c.anchor = GridBagConstraints.EAST;
    c.fill = GridBagConstraints.VERTICAL;
    c.insets = new Insets(0, 0, 0, 35);
    c.gridx = 0;
    c.gridy = 10;
    pane.add(slider_1, c);

    JLabel label_4 = new JLabel("Volt Cmd (V)");
    label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
    GridBagConstraints gbc_label_4 = new GridBagConstraints();
    gbc_label_4.fill = GridBagConstraints.BOTH;
    gbc_label_4.anchor = GridBagConstraints.EAST;
    gbc_label_4.insets = new Insets(10, 5, 0, 0);
    gbc_label_4.gridx = 0;
    gbc_label_4.gridy = 4;
    pane.add(label_4, gbc_label_4);

    JSpinner spinner = new JSpinner();
    JComponent editor = spinner.getEditor();
    JFormattedTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();
    tf.setColumns(7);
    spinner.setPreferredSize(new Dimension(70, 50));
    spinner.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
    spinner.setEditor(new JSpinner.NumberEditor(spinner, "     "));
    GridBagConstraints gbc_s1 = new GridBagConstraints();
    gbc_s1.anchor = GridBagConstraints.EAST;
    gbc_s1.insets = new Insets(0, 0, 0, 45);
    gbc_s1.gridx = 0;
    gbc_s1.gridy = 5;
    pane.add(spinner, gbc_s1);



    JLabel label_8 = new JLabel("Curr Lim (A)");
    label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
    GridBagConstraints gbc_label_8 = new GridBagConstraints();
    gbc_label_8.fill = GridBagConstraints.BOTH;
    gbc_label_8.insets = new Insets(10, 25, 0, 0);
    gbc_label_8.gridx = 1;
    gbc_label_8.gridy = 4;
    pane.add(label_8, gbc_label_8);

    JSpinner spinner1 = new JSpinner();
    spinner1.setPreferredSize(new Dimension(70, 50));
    spinner1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner1.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
    spinner1.setEditor(new JSpinner.NumberEditor(spinner1, "     "));
    GridBagConstraints gbc_s2 = new GridBagConstraints();
    gbc_s2.insets = new Insets(0, 25, 0, 15);
    gbc_s2.gridx = 1;
    gbc_s2.gridy = 5;
    pane.add(spinner1, gbc_s2);

    JSlider slider_2 = new JSlider(SwingConstants.VERTICAL, 0, 150, 0);
    slider_2.setPaintTicks(true);
    slider_2.setPaintLabels(true);
    slider_2.setMinorTickSpacing(10);
    slider_2.setMajorTickSpacing(50);
    slider_2.setUI(new MySliderUI(slider_2));
    GridBagConstraints gbc_slider_2 = new GridBagConstraints();
    gbc_slider_2.anchor = GridBagConstraints.WEST;
    gbc_slider_2.fill = GridBagConstraints.VERTICAL;
    gbc_slider_2.insets = new Insets(0, 65, 0, 0);
    gbc_slider_2.gridx = 1;
    gbc_slider_2.gridy = 10;
    pane.add(slider_2, gbc_slider_2);



    JLabel label_5 = new JLabel("PowerLim (kw)");
    label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
    GridBagConstraints gbc_label_5 = new GridBagConstraints();
    gbc_label_5.fill = GridBagConstraints.BOTH;
    gbc_label_5.insets = new Insets(10, 40, 0, 0);
    gbc_label_5.gridx = 2;
    gbc_label_5.gridy = 4;
    pane.add(label_5, gbc_label_5);

    JSpinner spinner2 = new JSpinner();
    spinner2.setPreferredSize(new Dimension(70, 50));
    spinner2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner2.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
    spinner2.setEditor(new JSpinner.NumberEditor(spinner2, "     "));
    GridBagConstraints gbc_s3 = new GridBagConstraints();
    gbc_s3.insets = new Insets(0, 20, 0, 15);
    gbc_s3.gridx = 2;
    gbc_s3.gridy = 5;
    pane.add(spinner2, gbc_s3);


    JSlider slider = new JSlider(JSlider.VERTICAL, 0, 200, 0);
    // slider.setLabelTable(labelTable);
    slider.setPaintLabels(true);
    // Turn on labels at major tick marks.
    slider.setMajorTickSpacing(50);
    slider.setMinorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);
    slider.setUI(new MySliderUI(slider));

    GridBagConstraints gbc_slider = new GridBagConstraints();
    gbc_slider.fill = GridBagConstraints.VERTICAL;
    gbc_slider.insets = new Insets(0, 50, 0, 0);
    gbc_slider.gridx = 2;
    gbc_slider.gridy = 10;
    pane.add(slider, gbc_slider);


    JLabel label_6 = new JLabel("IntRes (mOhm)");
    label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
    GridBagConstraints gbc_label_6 = new GridBagConstraints();
    gbc_label_6.fill = GridBagConstraints.BOTH;
    gbc_label_6.insets = new Insets(10, 40, 0, 0);
    gbc_label_6.gridx = 3;
    gbc_label_6.gridy = 4;
    pane.add(label_6, gbc_label_6);

    JSpinner spinner3 = new JSpinner();
    spinner3.setPreferredSize(new Dimension(70, 50));
    spinner3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
    spinner3.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(1)));
    spinner3.setEditor(new JSpinner.NumberEditor(spinner3, "     "));
    GridBagConstraints gbc_s4 = new GridBagConstraints();
    gbc_s4.insets = new Insets(0, 30, 0, 15);
    gbc_s4.gridx = 3;
    gbc_s4.gridy = 5;
    spinner3.setEnabled(false);
    pane.add(spinner3, gbc_s4);

    JSlider slider_4 = new JSlider(SwingConstants.VERTICAL, 0, 30, 15);
    slider_4.setPaintTicks(true);
    slider_4.setPaintLabels(true);
    slider_4.setMinorTickSpacing(1);
    slider_4.setMajorTickSpacing(10);
    slider_4.setUI(new MySliderUI(slider_4));
    GridBagConstraints gbc_slider_4 = new GridBagConstraints();
    gbc_slider_4.anchor = GridBagConstraints.WEST;
    gbc_slider_4.fill = GridBagConstraints.VERTICAL;
    gbc_slider_4.insets = new Insets(0, 70, 0, 0);
    gbc_slider_4.gridx = 3;
    gbc_slider_4.gridy = 10;
    pane.add(slider_4, gbc_slider_4);

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
  }

  public void setStringListener(StringListener stringListner) {

    this.textListener = stringListner;
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    System.out.print("is clicked");
    JButton whichButton = (JButton) e.getSource();
    if (whichButton == startPiu) {
      if (textListener != null) {
        textListener.textEmitted("Hello\n");
      }
      // textPanel2.appendText("HELLO\n");
    } else if (whichButton == startDrive) {
      if (textListener != null) {
        textListener.textEmitted("BYE\n");
      }
      // textPanel2.appendText("BYE\n");
    }
  }


}
