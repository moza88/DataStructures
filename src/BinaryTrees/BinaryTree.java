package BinaryTrees;
/*Tree Structure
 * 
 *                      _______The Shinning_________
 *                     |                            |
 *               The Office                       Shrek
 *               |          |                       |
 *     American Psycho   Harold and Maude      Kung Fu Hustle
 *                  
 */            

public class BinaryTree {
	
	//Root is an instance of a node
	Node root;

	// Future parent for our new Node
	Node parent;
	
	/*Instructions on adding in a node
	 * 
	 */
	public void addNode(int key, String name, String genre) {

		// Create a new Node and initialize it
		
		

		Node newNode = new Node(key, name, genre);

		// If there is no root this becomes root

		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			Node focusNode = root;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node

				if (key < focusNode.key) {

					// Switch focus to the left child

					focusNode = focusNode.leftChild;

					// If the left child has no children

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.leftChild = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.rightChild;

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.rightChild = newNode;
						return; // All Done

					}

				}

			}
		}

	}



//Defining what is in a node, a key and a name
public static class Node {

    int key;
	String name;
	String genre;

	Node leftChild;
	Node rightChild;
	
	Node parent;
	
	Node(int key, String name, String genre) {

		this.key = key;
		this.name = name;
		this.genre = genre;

	}

	public String toString() {

		 return "the " + genre + ", " + name+ " has the key " + key;
				 
		//"\nLeft Child: " + leftChild +
	   //"\nRight Child: " + rightChild + "\n";
		 

	}

}
}