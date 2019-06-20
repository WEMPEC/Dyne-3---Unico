import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener{

  // creating two buttons
  private JButton helloB;
  private JButton byeB;
  private StringListener textListener;

  public Toolbar() {
    setBorder(BorderFactory.createBevelBorder(ABORT, getForeground(), getBackground()));
    
    helloB = new JButton("HELLO");
    byeB = new JButton("BYE");
    //textPanel2 = new TextPanel();

    // reference to the actionPerformed method.
    helloB.addActionListener(this);
    byeB.addActionListener(this);
    // flow layout allows to add a group of components.
    setLayout(new FlowLayout(FlowLayout.LEFT));
   
    add(helloB);
    add(byeB);
    
    

   
  }

  public void setStringListener(StringListener stringListner) {
    
    this.textListener = stringListner;
  }
  
  
  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    System.out.print("is clicked");
    JButton whichButton = (JButton) e.getSource();
    if (whichButton == helloB) {
      if(textListener != null) {
        textListener.textEmitted("Hello\n");
      }
      //textPanel2.appendText("HELLO\n");
    }
    else if (whichButton == byeB) {
      if(textListener != null) {
        textListener.textEmitted("BYE\n");
      }
     // textPanel2.appendText("BYE\n");
    }
  }


}
