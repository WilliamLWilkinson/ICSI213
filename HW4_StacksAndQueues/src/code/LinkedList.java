package code;

public class LinkedList<E> {
	
	//Node class
	private static class Node<E> {
		public E item;
		public Node<E> prev;
		public Node<E> next;
		public Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.prev = prev;
			this.next = next;
		}
	}//end of node class

	private Node<E> _head;
	private Node<E> _tail;
	private int _size;
	
	public LinkedList(){
		_head = null;
		_tail = null;
		_size = 0;
	}
	
	//Returns the size of the list
	public int getSize(){
		return _size;
	}
	
	//Method that returns true if empty
	public boolean isEmpty(){
		return _size ==0;
	}//end of isEmpty
	
	
	public void addToFront(E e){
		
		Node<E> newNode = new Node<E>(null, e,null);
		if(_size ==0){
			_head = newNode;
			_tail = newNode;
		}
		else{
			Node<E> temp = _head;
			newNode.next = temp;
			temp.prev = newNode;
			_head = newNode;
		}
		//increments size
		_size++;
	}//end of addToFront
	
	public void addToBack(E e){
		Node<E> newNode = new Node<E>(null, e,null);
		
		if(_size ==0){
			_head = newNode;
			_tail = newNode;
		}
		else{
			Node<E> temp = _tail;
			newNode.prev = temp;
			temp.next = newNode;
			_tail = newNode;
		}
		//increments size
		_size++;
	}//end of addToBack
	
	public Node<E> removeFromFront(){
		Node<E> removed = _head;
		if(_size ==0){
			System.out.println("You can't remove from an empty list!!!!");
			return null;
		}
		else{
			_head = _head.next;
			_head.prev = null;
		}
		return removed;
	}//end of removeFromFront 
	
	public Node<E> removeFromEnd(){
		Node<E> removed = _tail;
		if(_size ==0){
			System.out.println("You can't remove from an empty list!!!!");
			return null;
		}
		else{
			_tail = _tail.prev;
			_head.next = null;
		}
		return removed;
	}
	
	public void print(){
		Node<E> temp = _head;
		
		for(int i =0; i<_size;i++){
			System.out.println(temp.item);
			temp = temp.next;
		}
		
	}//end of print
}
