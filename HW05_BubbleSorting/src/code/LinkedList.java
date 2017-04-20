package code;



public class LinkedList<E> {

	private Node<E> _head;	//Node at the start of the linked list
	private Node<E> _tail;	//Node at the end of the linked list
	private int _size;		// Number of nodes in the list
	
	private static class Node<E> {
		public E item;
		public Node<E> prev;	//Points to a node preceding 
		public Node<E> next;	//Points to the next node
		
		//Node constructor 
		public Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;//Object the node holds
			this.prev = prev;   //set the previous node 
			this.next = next;	//set the next node
		}
	}//end of node class

	
	//Constructor for the doubly linked list class
	public LinkedList(){
		_head = null;		//Sets the head node to null
		_tail = null;		//Sets the tail of the list to node
		_size = 0;			//sets the size of the list to zero
	}
	
	//Returns the head of the linked list if it's null return null
	public E getHead(){
		//Tests to see if the list is empty
		if(_head==null){
			//returns null if empty
			return null;
		}
		return _head.item;
	}
	
	//Returns the tail of the list, if the list is empty returns null else return tail
	public E getTail(){
		//Tests to see if list is empty
		if(_tail==null){
			//returns null if empty
			return null;
		}
		return _tail.item;
	}
	
	//Returns the size of the list
	public int getSize(){
		return _size;
	}
	
	//Method that returns true if empty
	public boolean isEmpty(){
		return _size ==0;
	}//end of isEmpty
	
	
	//Adds a node to the back of the linked list
	public void addToBack(E e){
		//Creates a node of the new item to add to the list
		Node<E> newNode = new Node<E>(null, e,null);
		
		//If the list is empty sets both head and tail to the new node
		if(_size ==0){
			_head = newNode;
			_tail = newNode;
		}
		else{
			//set the old tails next node so it points to the new node
			//and then resets the tail to the new node 
			Node<E> temp = _tail;
			newNode.prev = temp;
			temp.next = newNode;
			_tail = newNode;
		}
		//increments size
		_size++;
	}//end of addToBack
	
	//Prints the contents of the linked list
	public void print(){
		Node<E> temp = _head;
		//If the list is empty print empty list message
		if(_size==0){
			System.out.println("The container is empty!");
		}
		else{
			//else go through the list and print each item
			while(temp !=null){
				System.out.println(temp.item);
				temp = temp.next;
			}
		}
	}//end of print
	
	public void bubbleSortList(){
		
	}
	
}// end of LinkedList class

