import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // static class called swing utilities, needs a class implements, the runnable interface.
    // create an anonymous interface.
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        // TODO Auto-generated method stub
        try {
          new MainFrame ();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      
      }});

  
  }

}
