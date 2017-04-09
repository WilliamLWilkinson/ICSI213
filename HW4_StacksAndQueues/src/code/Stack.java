package code;

//Stack using a linked list
public class Stack<E> {
	private LinkedList<E> list;
	
	//Default constructor using 
	public Stack(){
		list = new LinkedList();
	}
	
	//Adds an item to the stack at the front of the list
	public void push(E e){
		list.addToFront(e);
	}
	
	//returns and removes an item from the stack 
	public E pop(){
		return list.removeFromFront();
	}//end of pop
	
	//returns the item at the top of the stack without removal
	public E peek(){
		//If the stack is empty print empty message and return null
		if(list.getHead()==null){
			System.out.println("The Stack is empty!!!!");
			return null;
		}
		return list.getHead();
	}
	
	//Prints contents of the stack
	public void print(){
		list.print();
	}
	
	//Tests to see if the stack is empty
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
}//End of Stack
