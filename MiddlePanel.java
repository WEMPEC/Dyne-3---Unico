import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiddlePanel extends JPanel implements ActionListener {

  // creating two buttons
  private JButton startPiu;
  private JButton startDrive;
  private StringListener textListener;


  public MiddlePanel() {
    setBorder(BorderFactory.createBevelBorder(ABORT, getForeground(), getBackground()));
    JPanel pane = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

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
    //c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 0;
    c.insets = new Insets(22, 0, 0, 0);
    pane.add(startPiu, c);



    c.fill = GridBagConstraints.HORIZONTAL;
    // c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 1;
    c.insets = new Insets(15, 0, 0, 0);
    pane.add(startDrive, c);



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
