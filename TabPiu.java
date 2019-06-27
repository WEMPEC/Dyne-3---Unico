import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TabPiu extends JPanel {
  
private JPanel panel3, panel4;
private GroupLayout gl_Detail, gl_Detail1 ;
private JTextField textField_9, textField_10,textField_11, textField_3, textField_8,textField ;
private JButton button_1, button;
private JLabel lblNewLabel_2, lblNewLabel, lblNewLabel_1, lblLimAct;
  public TabPiu(JPanel panel, GroupLayout gl_panel, JPanel panel1,  GroupLayout gl_panel1) {
    // TODO Auto-generated constructor stub
    this.gl_Detail = gl_panel;
    this.panel3 = panel;
    this.panel4 = panel1;
    gl_Detail1 = gl_panel1;
    
 JToggleButton tglbtnNewToggleButton = new JToggleButton("Volt Mode");
    
    JLabel label = new JLabel("Vslew Cmd");
    
    JSeparator separator = new JSeparator();
    separator.setBackground(new Color(0, 0, 0));
    
    textField_9 = new JTextField();
    textField_9.setEnabled(false);
    textField_9.setColumns(10);
    
    textField_10 = new JTextField();
    textField_10.setEnabled(false);
    textField_10.setColumns(10);
    
    textField_11 = new JTextField();
    textField_11.setEnabled(false);
    textField_11.setColumns(10);
    
    JLabel label_1 = new JLabel("Vslew Cmd");
    
    JLabel label_2 = new JLabel("Vslew Cmd");
   
    gl_Detail.setHorizontalGroup(
      gl_Detail.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_Detail.createSequentialGroup()
          .addGap(32)
          .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_Detail.createSequentialGroup()
              .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING, false)
                .addComponent(lblLimAct, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING, false)
                .addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
            .addGroup(gl_Detail.createSequentialGroup()
              .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addComponent(label, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(ComponentPlacement.RELATED)
              .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                .addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_Detail.createSequentialGroup()
                    .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(42)
                    .addComponent(tglbtnNewToggleButton, 0, 0, Short.MAX_VALUE))
                  .addGroup(gl_Detail.createSequentialGroup()
                    .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED, 220, Short.MAX_VALUE))))))
          .addGap(73))
        .addGroup(gl_Detail.createSequentialGroup()
          .addContainerGap()
          .addComponent(separator, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
          .addContainerGap(79, Short.MAX_VALUE))
    );
    gl_Detail.setVerticalGroup(
      gl_Detail.createParallelGroup(Alignment.LEADING)
        .addGroup(gl_Detail.createSequentialGroup()
          .addContainerGap()
          .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
            .addComponent(button_1)
            .addComponent(lblNewLabel_2)
            .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
            .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
              .addComponent(button)
              .addComponent(lblNewLabel_1))
            .addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
            .addComponent(lblLimAct)
            .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
          .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_Detail.createSequentialGroup()
              .addGap(21)
              .addComponent(label))
            .addGroup(gl_Detail.createSequentialGroup()
              .addPreferredGap(ComponentPlacement.RELATED)
              .addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(gl_Detail.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_Detail.createParallelGroup(Alignment.TRAILING)
              .addComponent(tglbtnNewToggleButton)
              .addComponent(label_1))
            .addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(ComponentPlacement.RELATED)
          .addGroup(gl_Detail.createParallelGroup(Alignment.BASELINE)
            .addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(label_2))
          .addContainerGap(170, Short.MAX_VALUE))
    );
    
    
    
  }

}
