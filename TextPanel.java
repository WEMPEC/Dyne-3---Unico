import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

  private JTextArea textArea;
  
  public TextPanel() {
    
    textArea = new JTextArea();
    //set the layout on the JPanel
    setLayout(new BorderLayout());
    //add the text simply take all the space.
    add (textArea, BorderLayout.CENTER);
    //add the text with scroll bar.
    //wrapping the text area into jscroll pane.
    add (new JScrollPane (textArea), BorderLayout.CENTER);

    
  }
  //append again the text area.
  public void appendText(String text) {
    textArea.append(text);
    
    
  }
  
}
