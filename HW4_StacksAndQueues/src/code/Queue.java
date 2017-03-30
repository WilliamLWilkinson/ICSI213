package code;



public class Queue<E> {
	private LinkedList list;
	
	//Default constructor
	public Queue(){
		list = new LinkedList();
	}
	
	public void enqueue(E e){
		list.addToBack(e);
	}
	
	
}//End of Queue
