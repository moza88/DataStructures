import java.util.LinkedList;

public class LinkedListDemo {

   public static void main(String args[]) {
	   
	   
	   LinkedList movies = new LinkedList();
	   movies.add("Shinning");
	   movies.add("Psycho");
	   movies.add("To Kill a Mocking Bird");
	   
	   //Original List
	   System.out.println("Original List");
	   for (int i=0; i < movies.size(); i++) {
		   	System.out.println("Movies: " + movies.get(i));
	   }
	   System.out.println("\n");

	   //Add
	   movies.addLast("Chucky");
	   movies.addFirst("American Psycho");
	  //List after first and last insertions
	   System.out.println("List after first and last insertions");
	   for (int i=0; i < movies.size(); i++) {
		   	System.out.println("Movies: " + movies.get(i));
	   }
	   System.out.println("\n");
	   
	   movies.remove(3);
	   movies.removeFirst();
	   movies.set(2, "Donnie Darko");
	   
	   //Final List
	   System.out.println("List after removing the 3rd and 1st element, and modifying the 2nd element");
	   for (int i=0; i < movies.size(); i++) {
		   	System.out.println("Movies: " + movies.get(i));
	   }
   }
}