import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class createFrame extends JFrame {
   public static void createFrame()
       {
           EventQueue.invokeLater(new Runnable()
           {
               @Override
               public void run()
               {
                   JFrame frame = new JFrame("Test");
                   frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   try 
                   {
                      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                   } catch (Exception e) {
                      e.printStackTrace();
                   }
                   JPanel panel = new JPanel();
                  
                   frame.setLayout(new BorderLayout());
                   frame.pack();
                   frame.setLocationByPlatform(true);
                   frame.setVisible(true);
                   frame.setResizable(true);
                   
               
                   frame.setLayout(new BorderLayout());
                   frame.setContentPane(new JLabel(new ImageIcon("background.png")));
                   frame.setLayout(null);
               
                   frame.setSize(399,399);
                   frame.setSize(400,400);
                   
                   frame.pack();
                   frame.setVisible(true);
                   frame.setResizable(false);
                   
                   
                   //////////////////////////////////////
                   
                   ImageIcon Catch = new ImageIcon("catch.png");
                   
                   JButton buttonCatch;
                   buttonCatch = new JButton(Catch);
                   
                   buttonCatch.setBounds(25, 230, 150, 150);
                   
                   
                   buttonCatch.setOpaque(false);
                   buttonCatch.setBorderPainted(true);
                   buttonCatch.setContentAreaFilled(false);
                   
                   buttonCatch.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     new PokemonGUI();
                     frame.dispose();
                     }
                  });
                  frame.add(buttonCatch);
                   
                   
               }
           });
       
       
       
       
       ////////////////////////////////////////////////////////////
       
       
       
       
       
       
       
       }
   }
