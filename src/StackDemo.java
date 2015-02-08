import java.util.Stack;


public class StackDemo{
	
	public void Empty(Stack st) {
		if (st.isEmpty() == true) {
			System.out.println("Stack is Empty");
		}   
		else {
			System.out.println("Stack is Not Empty");
		}
	}
	
	public void showPush(Stack st, int a) {
		for(int i=0; i < a; i++) {
			st.push(new Integer(i));
			System.out.println("Push() Adding items to the stack: " + st);
			}	
	}
	
	public void searcher(Stack st, int a) {
		System.out.println("Mid Point of the Stack is " + (a/2) + " and it's index " + st.search(a-(a/2)));
	}
	public void showPop(Stack st, int a) {
		st.pop();
		System.out.println("Pop() Removing last item Example: " + st);
	}
	
	public void showPeek(Stack st, int a) {
		st.peek();
		System.out.println("Peek() Showing last item without deletion Example: " + st);
	}
	public static void main(String[] args) {
		Stack mabel = new Stack();
		int a = 10;
		StackDemo stackOnStack = new StackDemo();
			stackOnStack.Empty(mabel);
			stackOnStack.showPush(mabel, a);
			stackOnStack.Empty(mabel);
			stackOnStack.showPop(mabel, a);
			stackOnStack.showPeek(mabel, a);
			stackOnStack.searcher(mabel, a);
}
}
