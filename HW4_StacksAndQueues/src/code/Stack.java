package code;

public class Stack<E> {
	private LinkedList list;
	
	public Stack(){
		list = new LinkedList();
	}
	
	public void push(E e){
		list.addToBack(e);
	}
}
