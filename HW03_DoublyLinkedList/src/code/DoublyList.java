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
		Node prevPoint=_head;
		//int pos =_size;
		//If the list is empty set the tail and head to the argument string 
		if(isEmpty()){
			_head = newNode;
			_tail =newNode;
		}//end of if
		//Else if the list is not empty
		else{
			for(int i=0;i<_size;i++){
				//if the you're inserting at the front of the list
				if(currPoint.getPrev()==null&&currPoint.getData().compareTo(s)>0){
					newNode.setNext(currPoint);
					currPoint.setPrev(newNode);
					_head = newNode;
					//Condition to exit the loop
					i=_size;
				}//end of if
				//Compares newNode to current position, if it comes before current node insert between
				else if(currPoint.getData().compareTo(s)>0){
					newNode.setNext(currPoint);
					newNode.setPrev(prevPoint);
					prevPoint.setNext(newNode);
					currPoint.setPrev(newNode);
					//Condition to exit the loop
					i=_size;
				}//end of if else
				// if the new node needs to be added to the tail
				else if(currPoint.getNext()==null&&currPoint.getData().compareTo(s)<0){
					currPoint.setNext(newNode);
					newNode.setPrev(currPoint);
					_tail = newNode;
					//Condition to exit the loop
					i=_size;
				}//end of if else
				else{
				//if the new node comes after the current node, next compare
				prevPoint = currPoint;
				currPoint = currPoint.getNext();
				}//end of else
				
			}//end of for
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
		//If the list is empty
		if(_size==0){
			System.out.println("The list is empty!!");
		}
		else{
			//While there are nodes to print
			//While temp is not null
			while(temp!=null){
				//Print
				System.out.println(temp.getData());
				//Get next node
				temp = temp.getNext();
			}//end of while
		}//end of else
	}//end of print forward
	
	//Prints the list starting from the back
	public void printBackwards(){
		//Sets temp to _tail
		Node temp = _tail;
		//While temp is not null
		//if the list is empty
		if(_size==0){
			System.out.println("The list is empty!!");
		}
		else{
			//If there are nodes in the list
			while(temp!=null){
				System.out.println(temp.getData());
				//Gets previous node
				temp = temp.getPrev();
			}//end of while
		}
	}// end of print backwards
	
	//Deletes the list
	public void deleteList(){
		//Sets everthing to its initial value
		_head =null;
		_tail = null;
		_size=0;
		System.out.println("Your list was deleted!");
		
	}//end of deleteList()
	
	//Traverses the list and tells the user if the input string was found
	//and at which location
	public boolean findNode(String target){
		Node temp = _head;
		//While not at the end of the list
		while(temp!=null){
			//If the item was found return true
			if(temp.getData().compareTo(target)==0){
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

	
	
	public boolean deleteNode(String s){
		Node currPoint=_head;
		Node prevPoint=_head;
		boolean itemDeleted = false;
		for(int i=0;i<_size;i++){
			if(currPoint.getData().compareTo(s)==0){
				//If you're deleting the head
				if(currPoint.getPrev()==null){
					_head = currPoint.getNext();
					currPoint.getNext().setPrev(null);
				}
				//if you're deleting the tail
				else if(currPoint.getNext()==null){
					_tail = prevPoint;
					prevPoint.setNext(null);
				}
				else{
				// If you're deleting the node from the middle of the list
				// Resets the nodes before and after the node you're deleting to connect them
				Node temp = currPoint.getNext();
				prevPoint.setNext(temp);
				temp.setPrev(prevPoint);
				currPoint.setNext(null);
				currPoint.setPrev(null);
				}
				//reduces size
				_size--;
				//Returns true if the item was deleted
				itemDeleted = true;
				//Exit for loop condition
				i=_size;
			}
			else{
				//If the node isn't found get next node to compare
				prevPoint = currPoint;
				currPoint = currPoint.getNext();
			}
		}
		//Returns false if the item wasn't in the list, can't be deleted 
		return itemDeleted;
	}//end of 
}
