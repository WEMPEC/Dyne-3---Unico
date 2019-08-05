import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

  // two components.
  // a region of text editor.

  private MiddlePanel Middle;
  // private TabPanel tab;
  private JButton btn;
  private FormPanel formPanel;
  // private GraphPanel graphPanel;



  public MainFrame() throws IOException {

    super("Run Dyne");
    BorderLayout ab = new BorderLayout();
    setLayout(ab);
    // tab = new TabPanel();
    formPanel = new FormPanel();
    Middle = new MiddlePanel();
    // textPanel = new TextPanel();



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

    // tab.setPreferredSize(new Dimension(300, 100));
    add((menubar()), ab.NORTH);

    add(Middle, ab.CENTER);

    add(btn, ab.SOUTH);

    setSize(1500, 1030);
    formPanel.setPreferredSize(new Dimension(600, 200));
    // formPanel.setBackground(Color.ORANGE);
    // gui.add(panel2, BorderLayout.CENTER);
    // add(Box.createRigidArea(new Dimension(10,50)));
    add(formPanel, ab.WEST);
    // add(tab);
    // add(new JSeparator(SwingConstants.VERTICAL));
    add(btn, ab.SOUTH);

    // change the entire window size.
    // setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

  private JMenuBar menubar() {

    JMenuBar menubar = new JMenuBar();
    JMenu File = new JMenu("File");
    JMenu View = new JMenu("View");
    // JMenu Window = new JMenu("Window");
    JMenu Tools = new JMenu("Tools");
    JMenu Help = new JMenu("Help");
    File.setFont(new Font("Times New Roman", Font.BOLD, 20));
    View.setFont(new Font("Times New Roman", Font.BOLD, 20));
    Tools.setFont(new Font("Times New Roman", Font.BOLD, 20));
    Help.setFont(new Font("Times New Roman", Font.BOLD, 20));

    // initialize each components
    JMenuItem OpenFile = new JMenuItem("Load File");
    OpenFile.setFont(new Font("Times New Roman", Font.BOLD, 17));
    OpenFile.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        formPanel.getActionLoadListener();

      }

    });
    //////////Save Function.
    JMenuItem NewFile = new JMenuItem("Save File");
    NewFile.setFont(new Font("Times New Roman", Font.BOLD, 17));
    NewFile.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        formPanel.getActionSaveListener();

      }

    });
    JMenuItem CloseFile = new JMenuItem("Exit");
    CloseFile.setFont(new Font("Times New Roman", Font.BOLD, 17));

    // Add items to menu bar.
    menubar.add(File);
    menubar.add(View);

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
