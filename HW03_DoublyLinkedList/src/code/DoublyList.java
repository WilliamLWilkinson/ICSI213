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
	
	public Node getHead(){return _head;}
	
	//Method to insert node
	public void insertNodeAlphabetically(String s){
		
	}//end of insertNode
	
	//Method isEmpty returns true if the list is empty
	public boolean isEmpty(){
		return _size==0;
	}//end of isEmpty()
	
	//Prints the list start from the head
	public void printForward(){
		Node temp =_head;
		while(temp!=null){
			System.out.println(temp.getDate());
			temp = temp.getNext();
		}
	}//end of print forward
	
	//Prints the list starting from the back
	public void printBackwards(){
		Node temp = _tail;
		while(temp!=null){
			System.out.println(temp.getDate());
			temp = temp.getPrev();
		}
	}// end of print backwards
	
	//Deletes the list
	public void deleteList(){
		//Sets everthing to its initial value
		_head =null;
		_tail = null;
		_size=0;
	}//end of deleteList()
}
