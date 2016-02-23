package Task10;

import java.util.ArrayList;

public class GenericStack<T> {

	private ArrayList<T> stack;
	private int top;
	
	public GenericStack() {
		stack = new ArrayList<>();
		top = 0;
	}
	
	public boolean isEmpty() {
		if (top == 0) {
			return true;
		}
		return false;
	}
	
	public T pop() throws Exception {
		if (!stack.isEmpty()) {
			top--;
			return stack.remove(top);
		}
		else 
			throw new Exception("no");
	}
	
	public void push(T object) throws Exception {
		if (object != null) {
			stack.add(object);
			top++;
		}
		else
			throw new Exception("no");
	}
	
	public int length() {
		return top;
	}
	
	public void clear() {
		while(!stack.isEmpty()) {
			top--;
			stack.remove(top);
		}
	}
}
