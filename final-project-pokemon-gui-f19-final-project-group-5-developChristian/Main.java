import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//from   w  ww.ja va  2s .  c o m
class Main extends JFrame {
   public  Main {

    JFrame f = new JFrame();
    JButton button;

    JPanel p = new JPanel();
    button = new JButton("Button");
    p.setLayout(null);
    button.setBounds(100, 100, 100, 60);
    p.add(button);

    f.add(p);
    // setLayout(null);
    f.setDefaultCloseOperation(3);
    f.setSize(400, 400);
    f.setVisible(true);
  }
}