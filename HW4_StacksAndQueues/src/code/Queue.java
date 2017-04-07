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
		if(list.getHead()==null){
			System.out.println("The Queue is empty!!!!");
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
	
}//End of Queue
