/**
* PokeNode Class.
* @author Jinglei Tong
* @since 11/30/19
*/

public class PokeNode {
 // data fields
   /** Data held in Node. */
   private Pokemon data;
   /** Link to left child Node. */
   private PokeNode left;
   /** Link to right child Node. */
   private PokeNode right;
   /** The number to be caughted. */
   private int numCaught = 1;

 /**
  * Constructor.
  * 
  * @param p The address of the object that is stored by the node
  * @param lChild The address of the left child
  * @param rChild The address of the right child
  * @param numCaught the number of pokemon caught
  * @throws NodeException if caught number less than 1 throw exception.
  */
   public PokeNode(Pokemon p, int numCaught, PokeNode lChild, 
                   PokeNode rChild) throws NodeException {
      data = p;
      left = lChild;
      right = rChild;
      if (numCaught < 1) {
         throw new NodeException("the caught" 
                                    + " number cannot be less than 1!"); 
      } else {
         this.numCaught = numCaught;
      }
   } //close PokeNode
//==================Accessor method===================================//
 /**
  * Accessor method.
  * 
  * @return the Pokemon in node
  */
   public Pokemon getPokemon() {
      return this.data;
   }
   /**
  * Accessor method.
  * 
  * @return the Pokemon's number been caught
  */
   public int getNumCaught() {
      return this.numCaught;
   }
   /**
  * Accessor method.
  * 
  * @return the item's address
  */
   public int getKey() {
      return this.data.getNumber();
   } 
   /**
    * Accessor method.
    * 
    * @return the left child's address
    */
   
   public PokeNode getlChild() {
      return this.left;
   } 
   /**
    * Accessor method.
    * 
    * @return the right child's address
    */
   public PokeNode getrChild() {
      return this.right;   
   }
   
   
   /**
    * increase the caught number.
    */
   public void inNumCaught() {
      this.numCaught++;
   }   
   /**
    * decrease the caught number.
    * @throws NodeException if caught number less than 1 throw exception.
    */
   public void deNumCaught() throws NodeException {
      
      if (this.numCaught >= 1) {
         this.numCaught--;
      } //close if
      else {
         throw new NodeException("this number of caught is less than 1!");
      } //close else
   }

//========================Mutator Method==================================//   
 /**
  * Mutator method.
  * 
  * @param newlChild
  * is the left child's address
  */
   public void setLeftChild(PokeNode newlChild) {
      left = newlChild;
   }
 /**
  * Mutator method.
  * 
  * @param newrChild
  * is the right child's address
  */
   public void setRightChild(PokeNode newrChild) {
      right = newrChild;
   }
} //close class