import java.util.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PokemonGUI extends JFrame {
   
   private JButton buttonBag;
   private JButton buttonPokedex;
   private JButton buttonHunt;
   private JButton buttonCatch;
   
   private int i = 0;
   
   private int max = 20;
   private int min = 1;
   
   PokemonGUI() {   
    
      ImageIcon bag = new ImageIcon("bag.png");
      ImageIcon pokedex = new ImageIcon("Pokedex.png");
      ImageIcon hunt = new ImageIcon("hunt.png");
      ImageIcon Catch = new ImageIcon("catch.png");
        
      setTitle("Pokemon GO");
      setSize(400, 400);
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
      buttonBag.setBorderPainted(false);
      buttonBag.setContentAreaFilled(false);
      
      add(buttonBag);
      
      buttonPokedex.setOpaque(false);
      buttonPokedex.setBorderPainted(false);
      buttonPokedex.setContentAreaFilled(false);
      
      add(buttonPokedex);
        
      buttonHunt.setOpaque(false);
      buttonHunt.setBorderPainted(false);
      buttonHunt.setContentAreaFilled(false);
      
      //Pokemon Dummy
      Pokemon poke = new Charmander();
      Pokemon[] pmArray;
      pmArray = new Pokemon[1];
      PokeTree tree = new PokeTree();
      
      buttonHunt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            Random random = new Random();
            
            int rPm = 0;
            
            ImageIcon pokemonImage = new ImageIcon("image/charmander.png");
            
            rPm = random.nextInt(9 - 1) + 1;

            switch(rPm) {
               case 1:
                  Pokemon poke = new Bulbasaur();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/001.png");
                  break;
               case 2:
                  poke = new Ivysaur();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/002.png");
                  break;
               case 3:
                  poke = new Venusaur();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/003.png");
                  break;
               case 4:
                  poke = new Charmander();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/004.png");
                  break;
               case 5:
                  poke = new Charmeleon();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/005.png");
                  break;
               case 6:
                  poke = new Charizard();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/006.png");
                  break;
               case 7:
                  poke = new Squirtle();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/007.png");
                  break;
               case 8:
                  poke = new Wartortle();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/008.png");
                  break;
               case 9:
                  poke = new Blastoise();
                  pmArray[0] = poke;
                  pokemonImage = new ImageIcon("image/009.png");
                  break;
               default:
                  break;
            }
                    
            Object[] possibleValues = {"Catch", "Run"};
            Object selectedValue = JOptionPane.showInputDialog(null,
               pokemonImage, "Input",
               JOptionPane.INFORMATION_MESSAGE, null,
               possibleValues, possibleValues[0]);
            
            if (selectedValue == "Catch") {
               Random r = new Random();
               i = r.nextInt(max - min) + min;
               if (i <= 14) {
                  JOptionPane.showMessageDialog(null, "Caught:\n" + pmArray[0], 
                     "Wild Pokemon Caught!", JOptionPane.INFORMATION_MESSAGE, 
                     pokemonImage);
                  tree.add(pmArray[0]);
               } else {
                  JOptionPane.showMessageDialog(null, pmArray[0].getName() + " escaped!", 
                     (pmArray[0].getName()) + " escaped!", JOptionPane.INFORMATION_MESSAGE);
               }
            }  
            }
         });
      
      add(buttonHunt);
        
      buttonCatch.setOpaque(false);
      buttonCatch.setBorderPainted(true);
      buttonCatch.setContentAreaFilled(false);
        
      add(buttonCatch);

      setSize(399, 399);
      setSize(400, 400);
    
      pack();
      setVisible(true);
      setResizable(false);
    
   }

   public static void main(String args[]) {
      
      new PokemonGUI();
   }
} 
