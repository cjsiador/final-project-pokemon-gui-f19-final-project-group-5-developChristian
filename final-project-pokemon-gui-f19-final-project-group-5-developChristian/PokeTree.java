/**
* PokeTree Class.
* @author Jinglei Tong
* @since 11/21/19
*/
public class PokeTree {
  /** Root node instance variable. */
   private PokeNode root = null;

  /** No parameter constructor. */
   public PokeTree() {
      // root already initialized
   }

  /**
   * Adds an p to the tree.
   * Non-recursive wrapper method
   * 
   * @param p The object to be added
   */
   public void add(Pokemon p) {
   // calls a recursive, private method
   // cannot get direct access to the root outside the class
      root = add(root, p);
   }
  
  /**
   * Recusively adds an p to the tree.
   * 
   * @param node The root of the tree/subtree
   * @param p The object to be added
   * @return The current node
   */
   private PokeNode add(PokeNode node, Pokemon p) {
   // base case: empty tree or end of a leaf
      if (node == null) {
         return new PokeNode(p, 1, null, null);
      } else if (p.getNumber() == node.getKey()) {   
         node.inNumCaught();
         return node;
      
      } else if (p.getNumber() < node.getKey()) {
         node.setLeftChild(this.add(node.getlChild(), p));
         return node;
      
      } else {
         node.setRightChild(this.add(node.getrChild(), p));
         return node;
      }
   }

  /**
   * called automatically by println/print method.
   * 
   * @return an inorder String of the tree
   */
   public String toString() {
      return this.inOrder(root);
   }

  /**
   * inOrder display of nodes, with newline between each node.
   * 
   * @param node The root of the tree/subtree
   * @return an inorder String of the tree
   */
   private String inOrder(PokeNode node) {
      String displayNodes = "";
      if (node != null) {
         displayNodes = displayNodes 
            + this.inOrder(node.getlChild());
         displayNodes = displayNodes + node.toString() + "\n";
         displayNodes = displayNodes 
            + this.inOrder(node.getrChild());
      }
      return displayNodes;
   }

  /**
   * gets an item from the tree with the same search key.
   * 
   * @param searchKey An object containing the search key
   * @return the data item in the tree with matching key.
   */
   public Pokemon get(Pokemon searchKey) {
   // cannot get direct access to the root outside the class
      return this.get(root, searchKey);
   }

  /**
   * Recursive methog to get an item from the tree.
   * 
   * @param node The root of the tree/subtree
   * @param searchKey An object storing the key to get.
   * @return the data item in tree with matching key.
   * @throws TreeException if item not found
   */
   private Pokemon get(PokeNode node, Pokemon searchKey) {
   // if not found, throw exception
      if (node == null) {
         throw new TreeException("Item not found!");
      } 
      else {
      // if the search key matches, return the item's address
         if (node.getKey() == searchKey.getNumber()) {
            return node.getPokemon();
         }
         // if the search key of the searchKey is less than the node,
         // then search the left subtree
         else if (node.getKey() > searchKey.getNumber()) {
            return this.get(node.getlChild(), searchKey);
         }
         // if the search key of the searchKey is greater than the node,
         // then search the right subtree
         else {
            return this.get(node.getrChild(), searchKey);
         }
      }
   }
  /**
   *print pokeTree(public).
   */
   public void printPokeTree() {
      this.printPokeTree(root);
   }
  /**
   * print pokeTree(private.
   * @param node to be printed
   */
   private void printPokeTree(PokeNode node) {
      if (node != null) {
         System.out.println(node.getPokemon().toString() 
                            + "\nCaught:" + node.getNumCaught());
         printPokeTree(node.getlChild());
         printPokeTree(node.getrChild());
      }    
   }


  /**
   * Removes an item from the tree.
   * 
   * @param p An object storing the key to remove.
   */
   public void remove(Pokemon p) {
      root = this.remove(root, p);
   }

  /**
   * Recursively removes an item from the tree.   
   * 
   * @param node The root of the tree/subtree
   * @param p An object storing only the key to remove.
   * @return root of current subtree.
   * @throws TreeException if item not found in tree.
   */
   private PokeNode remove(PokeNode node, Pokemon p) {
   // if item not found, throw exception
      if (node == null) {
         throw new TreeException("Item not found!");
      }
      // if search key is less than node's search key,
      // continue to left subtree
      else if (node.getKey() > p.getNumber()) {
         node.setLeftChild(this.remove(node.getlChild(), p));
         return node;
      }
      // if search key is greater than node's search key,
      // continue to right subtree
      else if (node.getKey() < p.getNumber()) {
         node.setRightChild(this.remove(node.getrChild(), p));
         return node;
      }
      // found node containing object with same search key,
      // so delete it
      else {
      // call private method remove
         if (node.getNumCaught() <= 1) {
            node = this.remove(node);
         } else {
            node.deNumCaught();
         }
         return node;
      }
   } //remove

  /**
   * Helper method that takes a node out of tree.
   * 
   * @param node The node to remove
   * @return The node that replaces removed node or null.
   */
   private PokeNode remove(PokeNode node) {
   // if node is a leaf,return null
      if (node.getlChild() == null && node.getrChild() == null) {
         return null;
      }
      // if node has a single right child node,
      // then return a reference to the right child node
      else if (node.getlChild() == null) {
         return node.getrChild();
      }
      // if node has a single left child node,
      // then return a reference to the left child node
      else if (node.getrChild() == null) {
         return node.getlChild();
      }
      // if the node has two child nodes
      else {
      // get next Smaller Item, which is Largest Item in Left Subtree
      // The next Smaller Item is stored at the rightmost node in the left
      // subtree.
         PokeNode largestItemInLeftSubtree = this.getItemWithLargestSearchKey(
                                             node.getlChild());
      // replace the node's item with this item
         node = this.replace(node, largestItemInLeftSubtree);      
      // delete the rightmost node in the left subtree
         node.setLeftChild(this.removeNodeWithLargestSearchKey(node
                        .getlChild()));
         return node;
      }
   }

  /**
   * Returns the item with the largest search key in the (sub)tree.
   * Helper method for removing interior nodes.
   * @param node The root of the tree/subtree
   * @return The data item with largest key
   */
   private PokeNode getItemWithLargestSearchKey(PokeNode node) {
   // if no right child, then this node contains the largest item
      if (node.getrChild() == null) {
         return node;
      }
      // if not, keep looking on the right
      else {
         return this.getItemWithLargestSearchKey(node.getrChild());
      }
   }

  /**
   * Removes the node with the largest search key.
   * Helper method for removing interior nodes.
   * Remove the node formerly occupied by item with largest search key.
   * To be called after item is moved to new node location.
   * 
   * @param node The root of the tree/subtree
   * @return root of (sub)tree with node removed.
   */
   private PokeNode removeNodeWithLargestSearchKey(PokeNode node) {
   // if no right child, then this node contains the largest item
   // so replace it with its left child
      if (node.getrChild() == null) {
         return node.getlChild();
      }
      // if not, keep looking on the right
      else {
         node.setRightChild(this.removeNodeWithLargestSearchKey(node
             .getrChild()));
         return node;
      } //close else
   } //close search tree
   
   /**
    * replace method.
    * @param node that will be replaced
    * @param newNode who's children will be  
    *  replaced by the old node's children
    *  but other information no change.
    * @return newNode
    */
   private PokeNode replace(PokeNode node, PokeNode newNode) {
      newNode.setLeftChild(node.getlChild());
      newNode.setRightChild(node.getrChild());
      return newNode;
   }
} //close class   


