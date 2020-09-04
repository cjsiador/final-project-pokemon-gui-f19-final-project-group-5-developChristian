import java.util.Scanner;
/** 
*Pokedex Driver.
*@author    Jinglei Tong
*@since     11/29/2019
*/
public class Pokedex {

	//========== Scanner method ==============    
    /**
    * Gets input from user to make a specific Pokemon.
    * This method takes no parameters. 
    */     
   private static Scanner userIn = new Scanner(System.in);
	   /** A String to hold the user's input. */
   private static String inString = new String("");
   
   //========== Main method ==============    
    /**
    * Gets input from user to make a specific Pokemon.
    * @param args not used
    */  
   public static void main(String[] args) {
      boolean endLoop = false; 
      boolean endLoop2 = true;
      PokeNode root;
      PokeTree tree = new PokeTree();
      while (!endLoop) {
      	   //menu text
         System.out.println("Please enter the number of your choice:");
         System.out.println("1. Catch Pokemon");
         System.out.println("2. Trade Pokemon");
         System.out.println("3. Print Pokedex");
         System.out.println("0. Exit the program");
         System.out.println("What would you like to do? ");
                
                //read in from user as a String -- much less errors can happen!
         inString = userIn.nextLine();
                
                //take off any spaces on the string
         inString = inString.trim();
                
         switch(inString) {
            case "0":
               endLoop = true;  
               break;       
            case "1":         
               System.out.println("\n**A new pokemon" 
                                  + " added to the Pokedex**\n");
               tree.add(makePokemon());
               break;     
            case "2":
               System.out.println("\n**A pokemon" 
                                  + " removed from the Pokedex**\n");
               tree.remove(getPokemon());
               break;
                  
            case "3": //print out all the Pokedex
               tree.printPokeTree();
               break;
                  
            default: //not a valid menu entry
               System.out.println("\n****Invalid menu choice.****");
               System.out.println("Please enter a 0, 1, 2 or 3\n");
               break;  
         
         } //close switch
      } //end whileloop
   } //close main	
   //========== makePokemon method ==============//
    /**
    * Gets input from user to add a specific Pokemon.
    * This method takes no parameters.
    * @return p 
    */ 
   public static Pokemon makePokemon() {
      Pokemon p = new Bulbasaur();
      String input = new String("");
      String specieschoosed = new String("");
      boolean endLoopName = false;
      boolean endLoopPokemon = false;
      String name = "";
     
      while (!endLoopName) {
         System.out.println("Does the Pokemon have a name Y/N?");
         input = userIn.nextLine();
         switch(input.toUpperCase()) {
            case "Y" :
               endLoopName = true;
               System.out.println("What is the Pokemon's name?");
               name = userIn.nextLine();
               break;
            case "N" :
               endLoopName = true;
               break;
            default :
               System.out.println("Please enter Y or N");
               break;
         } //close switch
      } //close while
   
      while (!endLoopPokemon) {
         System.out.println("Choose a Pokemon to add:");
         System.out.println("1. Bulbasaur");
         System.out.println("2. vysaur");
         System.out.println("3. Venusaur");
         System.out.println("4. Charmander");
         System.out.println("5. Charmeleon");
         System.out.println("6. Charizard");
         System.out.println("7. Squirtle");
         System.out.println("8. Wartortle");
         System.out.println("9. Blastoise");
         System.out.println("10.Eevee");
         System.out.println("11.Vaporeon");
         System.out.println("12.Jolten");
         System.out.println("13.Flareon");
      
      
         specieschoosed = userIn.nextLine();
      
         switch(specieschoosed) {
            case "1":
               if (name.length() > 0) {
                  p = new Bulbasaur(name);
               } else {
                  p = new Bulbasaur();
               }
               endLoopPokemon = true;
            
               break;
            case "2":
               if (name.length() > 0) {
                  p = new Ivysaur(name);
               } else {
                  p = new Ivysaur();
               } 
               endLoopPokemon = true;         
               break;
            case "3":
               if (name.length() > 0) {
                  p = new Venusaur(name);
               } else {
                  p = new Venusaur();
               }
               endLoopPokemon = true;          
               break;
            case "4":
               if (name.length() > 0) {
                  p = new Charmander(name);
               } else {
                  p = new Charmander();
               }
               endLoopPokemon = true;
               
               break;
            case "5":
               if (name.length() > 0) {
                  p = new Charmeleon(name);
               } else {
                  p = new Charmeleon();
               }
               endLoopPokemon = true;
               break;
            case "6":
               if (name.length() > 0) {
                  p = new Charizard(name);
               } else {
                  p = new Charizard();
               }
               endLoopPokemon = true;
               break;          
            case "7":
               if (name.length() > 0) {
                  p = new Squirtle(name);
               } else {
                  p = new Squirtle();
               }
               endLoopPokemon = true;
               break;
            case "8":
               if (name.length() > 0) {
                  p = new Wartortle(name);
               } else {
                  p = new Wartortle();
               }
               endLoopPokemon = true;
               break;
            case "9":
               if (name.length() > 0) {
                  p = new Blastoise(name);
               } else {
                  p = new Blastoise();
               }
               endLoopPokemon = true;
               break;
            case "10":
               if (name.length() > 0) {
                  p = new Eevee(name);
               } else {
                  p = new Eevee();
               }
               endLoopPokemon = true;
               break;
           //  case "11":
//                if (name.length() > 0) {
//                   p = new Vaporeon(name);
//                } else {
//                   p = new Vaporeon();
//                }
//                endLoopPokemon = true;
//                break;
//             case "12":
//                if (name.length() > 0) {
//                   p = new Jolten(name);
//                } else {
//                   p = new Jolten();
//                }
//                endLoopPokemon = true;
//                break;
//             case "13":
//                if (name.length() > 0) {
//                   p = new Flareon(name);
//                } else {
//                   p = new Flareon();
//                }
//                endLoopPokemon = true;
//                break;
         
            default :
               System.out.println("Please enter an integer from 1 to 13");
               break;
         }
      }
     
         
      return p;
   
   } //close makePokemon  

   //========== getPokemon method ==============//   
    /**
    * Gets input from user to remove a specific Pokemon.
    * This method takes no parameters.
    * @return null 
    */  
   public static Pokemon getPokemon() {
      System.out.println("Choose a Pokemon to remove:");
      System.out.println("1.Bulbasaur");
      System.out.println("2.Ivysaur");
      System.out.println("3.Venusaur");
      System.out.println("4.Charmander");
      System.out.println("5.Charmeleon");
      System.out.println("6.Charizard");
      System.out.println("7.Squirtle");
      System.out.println("8.Wartortle");
      System.out.println("9.Blastoise");
      System.out.println("10.Eevee");
     
         
      inString = userIn.nextLine();
      inString = inString.trim();
         
      switch(inString) {
      
         case "1":    
            return  new Bulbasaur();
      
         case "2": 
            return new Ivysaur();
      
         case "3": 
            return new Venusaur();
      
         case "4": 
            return new Charmander();
      
         case "5":
            return new Charmeleon();
      
         case "6": 
            return new Charizard();  
      
         case "7": 
            return new Squirtle();
      
         case "8": 
            return new Wartortle();
            
         case "9": 
            return new Blastoise(); 
         
         case "10": 
            return new Eevee(); 
         
         // case "11": 
//             return new Vaporeon(); 
//          
//          case "12": 
//             return new Jolten(); 
//          
//          case "13": 
//             return new Flareon();    
      
         default: //not a valid menu entry
            System.out.println("\n****Invalid menu choice.****");
            System.out.println("Please select from 1-13");
            getPokemon();
            break;  
      } //close switch
      return null;
   } //close get pokemon method
} //close class