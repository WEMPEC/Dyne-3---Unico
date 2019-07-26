
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TabPanel extends JPanel {

  // private TabCool coolTab;
  private TabAbs AbsTab;
  private TabPiu tabPiu;
  private TabFaults faultsTab;
  private int tabHeight;
  private int tabWidth;
  private ParseXml loadinfo;
  private Boolean checkupload;

  public TabPanel(ParseXml loadinfo) {
    tabHeight = 700;
    tabWidth = 550;
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    ImageIcon icon = createImageIcon("");
    this.loadinfo = loadinfo;
    checkupload =false;
    if (loadinfo != null) {
      checkupload = true;
    }
     // pass the load file info to the abs tab
    // if (checkupload) {
    // loadinfo.
    // }

    // abs//////////////////////////
    System.out.println("tab panel if load " + checkupload  );
    if (loadinfo != null) {
      
      System.out.println( "value [2]" + loadinfo.getSentVal() [2] );  }
    
  
    JTabbedPane Abs = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.addTab("Abs", null, Abs, null);
    JPanel panel_1 = new JPanel();
    GridBagLayout gbl_panel_1 = new GridBagLayout();
    GridBagLayout gbl_panel_2 = new GridBagLayout();
    Abs.addTab("Values", null, panel_1, null);
    JPanel panel_2 = new JPanel();
    Abs.addTab("Limits & SetPoints", null, panel_2, null);

    AbsTab = new TabAbs(panel_1, gbl_panel_1, panel_2, gbl_panel_2, checkupload, loadinfo);
    panel_1.setLayout(gbl_panel_1);
    panel_1.setPreferredSize(new Dimension(tabWidth, tabHeight));
    panel_2.setLayout(gbl_panel_2);
    panel_2.setPreferredSize(new Dimension(tabWidth, tabHeight));


    // Piu

    JTabbedPane Piu = new JTabbedPane(JTabbedPane.TOP);
    JPanel panel_3 = new JPanel();
    tabbedPane.addTab("Piu", null, Piu, null);
    Piu.addTab("Values", null, panel_3, null);
    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

    // JPanel panel_4 = new JPanel();
    GridBagLayout gbl_panel_3 = new GridBagLayout();
    // GroupLayout gbl_panel_4 = new GroupLayout(panel_4);
    JPanel panel_4 = new JPanel();
    Piu.addTab("Limits & SetPoints", null, panel_4, null);

    GridBagLayout gbl4 = new GridBagLayout();

    tabPiu = new TabPiu(panel_3, gbl_panel_3, panel_4, gbl4);
    // panel_3.setLayout(gbl_panel_3);
    panel_3.setLayout(gbl_panel_3);
    panel_3.setPreferredSize(new Dimension(tabWidth, tabHeight));
    panel_4.setLayout(gbl4);
    panel_4.setPreferredSize(new Dimension(tabWidth, tabHeight));


    //// Faults
    JTabbedPane Faults = new JTabbedPane(JTabbedPane.TOP);

    tabbedPane.addTab("Faults", null, Faults, null);

    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
    JPanel panel_6 = new JPanel();
    GridBagLayout gbl_panel_5 = new GridBagLayout();
    Faults.addTab("Values", null, panel_6, null);
    faultsTab = new TabFaults(panel_6, gbl_panel_5);
    panel_6.setLayout(gbl_panel_5);
    panel_6.setPreferredSize(new Dimension(tabWidth, tabHeight));

    JComponent panel3 = makeTextPanel("Panel #3");
    tabbedPane.addTab("Tab 3", icon, panel3, "Still does nothing");
    tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

    JComponent panel4 = makeTextPanel("Panel #4 (has a preferred size of 410 x 50).");
    panel4.setPreferredSize(new Dimension(tabWidth, tabHeight));
    tabbedPane.addTab("Tab 4", icon, panel4, "Does nothing at all");
    tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

    // Add the tabbed pane to this panel.
    add(tabbedPane);

    // The following line enables to use scrolling tabs.
    tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
  }



  protected JComponent makeTextPanel(String text) {
    JPanel panel = new JPanel(false);
    JLabel filler = new JLabel(text);
    filler.setHorizontalAlignment(JLabel.CENTER);
    panel.setLayout(new GridLayout(1, 1));
    panel.add(filler);
    return panel;
  }

  /** Returns an ImageIcon, or null if the path was invalid. */
  protected static ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = TabPanel.class.getResource(path);
    if (imgURL != null) {
      return new ImageIcon(imgURL);
    } else {
      System.err.println("Couldn't find file: " + path);
      return null;
    }
  }

  private JLabel createJLabel(String text, Color textColor, Color backgroundColor) {
    JLabel labeltemp = new JLabel(text);
    // set align
    labeltemp.setHorizontalAlignment(JLabel.CENTER);
    // set color
    labeltemp.setForeground(textColor);
    // set background color
    labeltemp.setOpaque(true);
    labeltemp.setBackground(backgroundColor);

    return labeltemp;
  }

  public TabAbs setAbsTab() {
    // TODO Auto-generated method stub
    return AbsTab;
  }


}
