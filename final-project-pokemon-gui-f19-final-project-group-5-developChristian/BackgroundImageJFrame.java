import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PokemonGUI extends JFrame {
   JButton buttonBag;
   JButton buttonPokedex;
   JButton buttonHunt;
   JButton buttonCatch;

   public PokemonGUI() {   
    
      ImageIcon bag = new ImageIcon("bag.png");
      ImageIcon pokedex = new ImageIcon("Pokedex.png");
      ImageIcon hunt = new ImageIcon("hunt.png");
      ImageIcon Catch = new ImageIcon("catch.png");
        
      setTitle("Background Color for JFrame");
      setSize(400,400);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);

      
      setLayout(new BorderLayout());
      setContentPane(new JLabel(new ImageIcon("background.png")));
      setLayout(null);
      
      buttonBag = new JButton(bag);
      buttonPokedex = new JButton(pokedex);
      buttonHunt = new JButton(hunt);
      buttonCatch = new JButton(Catch);
      
      // button.setBounds(x, y, width, length);
      buttonBag.setBounds(25, 430, 150, 150);
      buttonPokedex.setBounds(215, 430, 150, 150);
      buttonHunt.setBounds(25, 230, 150, 150);
      buttonCatch.setBounds(215, 230, 150, 150);
      
      // make button transparent.
      buttonBag.setOpaque(false);
      buttonBag.setBorderPainted(true);
      buttonBag.setContentAreaFilled(false);
      
      add(buttonBag);
      
      buttonPokedex.setOpaque(false);
      buttonPokedex.setBorderPainted(true);
      buttonPokedex.setContentAreaFilled(false);
      
      add(buttonPokedex);
        
      buttonHunt.setOpaque(false);
      buttonHunt.setBorderPainted(true);
      buttonHunt.setContentAreaFilled(false);
      
      buttonHunt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            createFrame.createFrame();
            dispose();
         }
      });
      add(buttonHunt);
        
      buttonCatch.setOpaque(false);
      buttonCatch.setBorderPainted(true);
      buttonCatch.setContentAreaFilled(false);
        
      add(buttonCatch);
      // Just for refresh :) Not optional!
      setSize(399,399);
      setSize(400,400);
    
      pack();
      setVisible(true);
      setResizable(false);
    
      }

   public static void main(String args[])
   {
      new PokemonGUI();
   }
} 



/*
      One way
      -----------------
      setLayout(new BorderLayout());
      JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
      add(background);
      background.setLayout(new FlowLayout());
      l1=new JLabel("Here is a button");
      b1=new JButton("I am a button");
      background.add(l1);
      background.add(b1);
      */

      // Another way