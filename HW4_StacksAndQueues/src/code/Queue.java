package code;



public class Queue<E> {
	private LinkedList<E> list;
	
	//Default constructor
	public Queue(){
		list = new LinkedList();
	}
	
	//adds an item to the back of the linked list
	public void enqueue(E e){
		list.addToBack(e);
	}
	
	//removes an item from the fron of the list
	public E dequeue(){
		return list.removeFromFront(); 
	}
	
	//returnd the item from the top of the list without removal
	public E peek(){
		//if the null, it meand the list is empty
		if(list.getHead()==null){
			System.out.println("The Queue is empty!!!!");
			return null;
		}
		//else return value
		return list.getHead();
	}
	
	//prints the items in the Queue
	public void print(){
		list.print();
	}
	
	//test to see if the Queue is empty
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
}//End of Queue
