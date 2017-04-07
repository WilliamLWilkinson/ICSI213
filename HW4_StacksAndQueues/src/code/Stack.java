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
		
		if(list.getHead()==null){
			System.out.println("The Stack is empty!!!!");
			return null;
		}
		return list.getHead();
	}
	
	public void print(){
		list.print();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
}//End of Stack
