package BinaryTrees;

public class BinaryTreeMain {
public static void main(String[] args) {
		
		//Creating a new instance of the binary tree
		BinaryTree theTree = new BinaryTree();
		BinaryRemove remove = new BinaryRemove();
		
		//Using the addNode constructor to add data to the binary tree
		theTree.addNode(50, "The Shinning", "Horror");

		theTree.addNode(25, "The Office", "Comedy");

		theTree.addNode(15, "American Psycho", "Horror");

		theTree.addNode(30, "Harold and Maude", "Comedy");

		theTree.addNode(75, "Shrek", "Cartoon");

		theTree.addNode(85, "Kung Fu Hustle", "Action");
		
		// Different ways to traverse binary trees

		// theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75
		BinaryTreeTraverse traverse= new BinaryTreeTraverse();
		
		traverse.inOrderTraverseTree(theTree.root);
		
	    System.out.println(System.getProperty("line.separator"));
	    
		traverse.postOrderTraverseTree(theTree.root);
		
	    System.out.println(System.getProperty("line.separator"));

	    traverse.preorderTraverseTree(theTree.root);
	    
	    System.out.println(System.getProperty("line.separator"));
	    
	    //remove.remove(25);
	    
	    traverse.preorderTraverseTree(theTree.root);
	    
		//System.out.println("\nNode with the key 75: " + traverse.findNode(30));

		}
}


