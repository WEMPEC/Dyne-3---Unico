import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

  // two components.
  // a region of text editor.
  private TextPanel textPanel;
  private Toolbar toolbar;
  private JButton btn;
  private FormPanel formPanel;

  // setJMenuBar(menubar());

  public MainFrame() {

    super("Run Dyne");
    BorderLayout ab = new BorderLayout();
    setLayout(ab);

    formPanel = new FormPanel();
    toolbar = new Toolbar();
    textPanel = new TextPanel();



    formPanel.setFormListener(new FormListener() {


      @Override
      public void formEventOccured(FormEvent e) {
        // TODO Auto-generated method stub
        String name = e.getName();
        String job = e.getJob();
        int id = e.getAge();
        String employ = e.getEmploy();
        String taxID = e.getTaxID();
        Boolean citizen = e.isCitizen();
        String gender = e.getGender();
        textPanel.appendText(name + " : " + job + " : " + id + " : " + employ + " : " + citizen
            + " : " + taxID + " : " + gender + "\n");

      }
    });


    btn = new JButton("CLICK ME ");
    // action listener interface
    btn.addActionListener(new ActionListener() {
      // perform action of an anonymous class
      @Override
      public void actionPerformed(ActionEvent arg0) {

        if (btn.getText().equals("CLICK ME ")) {
          btn.setText("DON'T CLICK ME");
        }

        else if (btn.getText().equals("DON'T CLICK ME")) {
          btn.setText("CLICK ME ");
        }

      }

    }

    );



    // pass in the controller.

    add(formPanel, ab.WEST);
    add((menubar()), ab.NORTH);
    add(Box.createRigidArea(new Dimension(10, 0)));
    add(textPanel);
    add(toolbar);
    add(btn, ab.SOUTH);


    // add(Box.createRigidArea(new Dimension(10,50)));
    add(textPanel, ab.CENTER);
    // add(new JSeparator(SwingConstants.VERTICAL));
    add(btn, ab.SOUTH);

    setSize(900, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

  private JMenuBar menubar() {

    JMenuBar menubar = new JMenuBar();
    JMenu File = new JMenu("File");
    JMenu View = new JMenu("View");
    JMenu Window = new JMenu("Window");
    JMenu Tools = new JMenu("Tools");
    JMenu Help = new JMenu("Help");

    // initialize each components
    JMenuItem OpenFile = new JMenuItem("OpenFile");
    JMenuItem NewFile = new JMenuItem("NewFile");
    JMenuItem CloseFile = new JMenuItem("CloseFile");

    // Add items to menu bar.
    menubar.add(File);
    menubar.add(View);
    menubar.add(Window);
    menubar.add(Tools);
    menubar.add(Help);

    File.add(NewFile);
    File.add(OpenFile);
    File.add(CloseFile);
    this.setVisible(true);
    // (menubar);
    // textPanel2 = new TextPanel();

    // reference to the actionPerformed method.
    return menubar;
  }


}
