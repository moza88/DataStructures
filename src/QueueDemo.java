import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Queue collection implements First-In First-Out behavior on items
 */
public class QueueDemo {
	static String newLine = System.getProperty("line.separator");
	  public static void main(String[] args) {
	  
	    System.out.println(newLine + "Queue in Java" + newLine);
	    System.out.println("-----------------------" + newLine);
	    System.out.println("Adding items to the Queue" + newLine);
	    
	    //Creating queue would require you to create an instance of 
	    //LinkedList and assign it to the Queue object
	    // You cannot create an instance of Queue as it is abstract
	    Queue queue = new LinkedList();
	    
	    //Adding elements to the Queue
	    queue.add("Shinning");
	    queue.add("Twilight Zone");
	    queue.add("American Psycho");
	    	    
	    //Looking at what is in the queue
	    System.out.println(newLine + "Items in the queue..." + queue + newLine);
	   
	    //.peek() just returns the current element in the queue, null if empty
	    System.out.println(newLine + "On Top of the queue: " + queue.peek());
	    
	    //Remove element from the queue using .remove method
	    //This removes the first element added to the queue
	    System.out.println("remove element: " + queue.remove());
	    
	    //Looking at what is in the queue now
	    System.out.println(newLine + "Items in the queue..." + queue + newLine);
	    
	    //.element() returns the current element in the queue
	    System.out.println("retrieve element: " + queue.element() + newLine);
	    
	    //.poll() method retrieves and removes the head of this queue
	    //Returns null if the queue is empty
	    System.out.println("removes and retrieves element, null if empty: " + queue.poll() + newLine);
	    
	  //Looking at what is in the queue now
	    System.out.println(newLine + "Items in the queue..." + queue + newLine);
	    
	  }
}