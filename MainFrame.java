import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.ParserConfigurationException;

public class MainFrame extends JFrame {

  // two components.
  // a region of text editor.

  private MiddlePanel Middle;
  // private TabPanel tab;
  private FormPanel formPanel;
  private ParseXml temp;
  // private GraphPanel graphPanel;
  private BorderLayout ab;
  private Boolean loadfileCheck;

  public MainFrame() throws IOException {

    super("Run Dyne");
    ab = new BorderLayout();
    setLayout(ab);
    // tab = new TabPanel();
    Middle = new MiddlePanel(null);
    formPanel = new FormPanel();
    loadfileCheck = false;

    // pass in the controller.
    add((menubar()), BorderLayout.NORTH);

    add(Middle, BorderLayout.CENTER);
    setSize(1500, 1030);
    formPanel.setPreferredSize(new Dimension(600, 200));
    add(formPanel, BorderLayout.WEST);


    // change the entire window size.

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
    // reset function

    // initialize each components
    JMenuItem OpenFile = new JMenuItem("Load");
    OpenFile.setFont(new Font("Times New Roman", Font.BOLD, 17));

    //// load function
    OpenFile.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        // Middle.removeAll();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML file", "xml");
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setPreferredSize(new Dimension(800, 600));
        j.setFont((new Font("Times New Roman", Font.BOLD, 26)));
        j.setFileFilter(filter);

        Middle = formPanel.getActionLoadListener(j);
        loadfileCheck = true;
        add(Middle, BorderLayout.CENTER);
      }
    });
    ////////// Save Function.
    JMenuItem NewFile = new JMenuItem("Save ");
    NewFile.setFont(new Font("Times New Roman", Font.BOLD, 17));
    NewFile.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        SaveFileWriter obj = Middle.getinfo();
        String sliderinfo = obj.getXMLinfo();
        formPanel.getActionSaveListener(sliderinfo, loadfileCheck);
      }
    });
    //// save as function
    JMenuItem saveAsFile = new JMenuItem("Save As");
    saveAsFile.setFont(new Font("Times New Roman", Font.BOLD, 17));
    saveAsFile.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        SaveFileWriter obj = Middle.getinfo();
        String sliderinfo = obj.getXMLinfo();

        formPanel.getActionSaveListener(sliderinfo, !loadfileCheck);
      }
    });

    JMenuItem CloseFile = new JMenuItem("Exit");
    CloseFile.setFont(new Font("Times New Roman", Font.BOLD, 17));
    CloseFile.setMnemonic(KeyEvent.VK_C);
    CloseFile.setToolTipText("Exit application");
    CloseFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
    CloseFile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.exit(0);
      }
    });
    // Add items to menu bar.
    menubar.add(File);
    menubar.add(View);
    menubar.add(Tools);
    menubar.add(Help);

    File.add(OpenFile);
    File.add(NewFile);// save
    File.add(saveAsFile);// save as
    File.add(CloseFile);
    this.setVisible(true);
    return menubar;
  }

  public void getMiddle(MiddlePanel Middle) {
    add(Middle, BorderLayout.CENTER);
  }
}


