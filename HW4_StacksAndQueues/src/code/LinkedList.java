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
	
	//
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
		_size++;
	}//end of addToFront
	
	public void print(){
		Node<E> temp = _head;
		
		for(int i =0; i<_size;i++){
			System.out.println(temp.item);
			temp = temp.next;
		}
		
	}//end of print
}
