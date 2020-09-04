import java.awt.*;
import javax.swing.*;

/**
* Panel example for layout and sub panel.
* @author Lisa J Miller
* @since 4/19/2018
*/
public class PanelLayoutDemo extends JPanel {
   /** a button. */
   private Button b1 = new Button("Button 1");
   /** a button. */
   private Button b2 = new Button("Button 2");
   /** a button. */
   private Button b3 = new Button("Button 3");
   /** a button. */
   private Button b4 = new Button("Button 4");
   private Button b5 = new Button("Button 4");
   
  /** panel constructor. */
   public PanelLayoutDemo() {   
      BorderLayout bl = new BorderLayout();
      
      JButton btest = new JButton(new ImageIcon("images/bag.png"));
      
      btest.setOpaque(false);
      btest.setBorderPainted(false);
      btest.setContentAreaFilled(false);
            
      //make sub=panel with grid layout
      GridLayout gl = new GridLayout(10, 2, 8 , 10);
      JPanel subPanel = new JPanel();
      subPanel.setLayout(gl);
      subPanel.add(b1);
      subPanel.add(b2);
      subPanel.add(b3);
      subPanel.add(b4);
      subPanel.add(b5);
      subPanel.add(new Button("6"));
      subPanel.add(new Button("6"));
      subPanel.add(new Button("6"));
      subPanel.add(new Button("6"));
      subPanel.add(new Button("6"));
      
      subPanel.add(btest);
      subPanel.add(new JButton("6"));
      subPanel.add(new JButton("6"));
      subPanel.add(new JButton("6"));
      //set main panel layout
      setLayout(bl);
      
      
      //add anonymous label, won't change
      add(subPanel, "Center");
      
      
      

    
   } //close constructor
 
} //close panel class