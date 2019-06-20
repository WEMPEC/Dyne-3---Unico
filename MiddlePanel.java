import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiddlePanel extends JPanel implements ActionListener {

  // creating two buttons
  private JButton FastStop;
  private JButton byeB;
  private StringListener textListener;
  private JLabel startHr, runHr;
  private JTextField startHrtxt, runHrtxt;

  public MiddlePanel() {
    setBorder(BorderFactory.createBevelBorder(ABORT, getForeground(), getBackground()));
    JPanel pane = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();


    byeB = new JButton("BYE");
    add(pane);
   
    // textPanel2 = new TextPanel();

    // reference to the actionPerformed method.
   // FastStop.addActionListener(this);
    byeB.addActionListener(this);
    // flow layout allows to add a group of components.
    setLayout(new FlowLayout(FlowLayout.LEFT));
    FastStop = new JButton("FastStop");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 0;
    pane.add(FastStop, c);

    startHr = new JLabel("Start Hr: ");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 2;
    c.gridy = 0;
    pane.add(startHr, c);
    
    startHrtxt =  new JTextField(5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 3;
    c.gridy = 0;
    pane.add(startHrtxt, c);
    
  
    
    runHr = new JLabel("Run Hr: ");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 4;
    c.gridy = 0;
    pane.add(runHr, c);
    
    
    runHrtxt =  new JTextField(5);
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 5;
    c.gridy = 0;
    pane.add(runHrtxt, c);
    
   



  }

  public void setStringListener(StringListener stringListner) {

    this.textListener = stringListner;
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    System.out.print("is clicked");
    JButton whichButton = (JButton) e.getSource();
    if (whichButton == FastStop) {
      if (textListener != null) {
        textListener.textEmitted("Hello\n");
      }
      // textPanel2.appendText("HELLO\n");
    } else if (whichButton == byeB) {
      if (textListener != null) {
        textListener.textEmitted("BYE\n");
      }
      // textPanel2.appendText("BYE\n");
    }
  }


}
