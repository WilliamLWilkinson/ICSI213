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
		Node newNode = new Node(s);
		//Points to the current node
		Node currPoint=_head;
		Node prevPoint=_tail;
		int pos =_size;
		//If the list is empty set the tail and head to the argument string 
		if(isEmpty()){
			_head = newNode;
			_tail =newNode;
		}//end of if
		//Else if the list is not empty
		else{
			for(int i=0;i<_size;i++){
				if()
			}
		}//end of else
		_size++;
		
	}//end of insertNode
	
	//Method isEmpty returns true if the list is empty
	public boolean isEmpty(){
		return _size==0;
	}//end of isEmpty()
	
	//Prints the list start from the head
	public void printForward(){
		//sets temp to head
		Node temp =_head;
		//While temp is not null
		while(temp!=null){
			//Print
			System.out.println(temp.getDate());
			//Get next node
			temp = temp.getNext();
		}//end of while
	}//end of print forward
	
	//Prints the list starting from the back
	public void printBackwards(){
		//Sets temp to _tail
		Node temp = _tail;
		//While temp is not null
		while(temp!=null){
			System.out.println(temp.getDate());
			//Gets previous node
			temp = temp.getPrev();
		}//end of while
	}// end of print backwards
	
	//Deletes the list
	public void deleteList(){
		//Sets everthing to its initial value
		_head =null;
		_tail = null;
		_size=0;
	}//end of deleteList()
	
	//Traverses the list and tells the user if the input string was found
	//and at which location
	public boolean findNode(String target){
		Node temp = _head;
		//While not at the end of the list
		while(temp!=null){
			//If the item was found return true
			if(temp.getDate().compareTo(target)==0){
			return true;
			}
			else{
				//The string was not found yet
				temp = temp.getNext();
			}
		}//end of while
		//At this point the string was not found so it returns false
		return false;
	}//end of find node
}
