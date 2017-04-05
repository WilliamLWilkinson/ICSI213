package code;

public class Stack<E> {
	private LinkedList<E> list;
	
	public Stack(){
		list = new LinkedList();
	}
	
	public void push(E e){
		list.addToFront(e);
	}
	
	public E pop(){
		//E key = (E) list.removeFromEnd();
		return list.removeFromFront();
		
	}//end of pop
	
	public E peek(){
		return list.getTail();
	}
	
	public void print(){
		list.print();
	}
	
}//End of Stack
