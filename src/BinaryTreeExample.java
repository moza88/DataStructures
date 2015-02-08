
public class BinaryTreeExample {
			
		//Establish the root node or top node
		Node root;
		
		public void addNode(int key, String name) {
			
			//Calling an instance of node and making it the new
			Node newNode = new Node( key, name);
			
			//If the root is null then let's add a new node
			if(root == null) {
				root = newNode;
				
			} else {
				//Set the root as the the focusNode the node we current care about
				Node focusNode = root;
				
				//Set the future node for parent
				Node parent;
				
				while(true) {
				
					parent = focusNode;
					
					//Check to see if we the new node can go on the left
					if( key > focusNode.key) {
						
						focusNode = focusNode.leftChild;
						
					} else {
						
					}
				}
				
				
		}
	}
	class Node{
		int key;
		String name;
		
		Node leftChild;
		Node rightChild;
		
		Node (int key, String name) {
			this.key = 0;
			this.name = null;
			
		}
	}
}