package code;

public class DoublyList {
	private int _size;
	private Node _head;
	private Node _tail;
	
	//Default constructor
	public DoublyList(){
		_size =0;
		_head =null;
		_tail = null;
	}
	
	//Non-default constructor 
	public DoublyList(Node newNode){
		_head = newNode;
		_tail = newNode;
		_size = 1;
	}

	
}
