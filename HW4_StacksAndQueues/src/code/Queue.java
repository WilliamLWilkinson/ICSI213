package code;



public class Queue<E> {
	private LinkedList<E> list;
	
	//Default constructor
	public Queue(){
		list = new LinkedList();
	}
	
	public void enqueue(E e){
		list.addToBack(e);
	}
	
	public E dequeue(){
		return list.removeFromFront(); 
	}
	
	public E peek(){
		return list.getHead();
	}
	
	public void print(){
		list.print();
	}
	
}//End of Queue
