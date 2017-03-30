package code;

public class Stack<E> {
	private LinkedList<E> list;
	
	public Stack(){
		list = new LinkedList();
	}
	
	public void push(E e){
		list.addToBack(e);
	}
	
	public E pop(){
		
		//E key = (E) list.removeFromEnd();
		return list.removeFromEnd();
		
	}//end of pop
	
}//End of Stack
