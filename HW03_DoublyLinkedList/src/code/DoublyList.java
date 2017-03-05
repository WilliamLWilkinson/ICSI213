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

	//get for list size
	public int getSize(){return _size;}
	
	//Adds get and sets for head node
	public void setHead(Node newHead){_head = newHead;}
	
	public Node getHead(){return _head;}
	
	//Method to insert node
	public void insertNode(Node newNode){
		Node l =_tail;
		_tail = newNode;
		if(_head ==null && _tail ==null){
			_head=newNode;
			
		}
		else{
			//Adds to the end of the list if the list is empty
			l.setNext(newNode);
		}
		_size++;
	}//end of insertNode
}
