package code;



public class LinkedList {

	private Node _head;	//Node at the start of the linked list
	private Node _tail;	//Node at the end of the linked list
	private int _size;		// Number of nodes in the list
	
	private static class Node {
		public int item;
		public Node prev;	//Points to a node preceding 
		public Node next;	//Points to the next node
		
		//Node constructor 
		public Node(Node prev, int element, Node next) {
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
	public int getHead(){
		//Tests to see if the list is empty
		if(_head==null){
			//returns null if empty
			System.out.println("The Node is empty");
		}
		return _head.item;
	}
	
	//Returns the tail of the list, if the list is empty returns null else return tail
	public int getTail(){
		//Tests to see if list is empty
		if(_tail==null){
			//returns null if empty
			System.out.println("The Node is empty");
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
	public void addToBack(int e){
		//Creates a node of the new item to add to the list
		Node newNode = new Node(null, e,null);
		
		//If the list is empty sets both head and tail to the new node
		if(_size ==0){
			_head = newNode;
			_tail = newNode;
		}
		else{
			//set the old tails next node so it points to the new node
			//and then resets the tail to the new node 
			Node temp = _tail;
			newNode.prev = temp;
			temp.next = newNode;
			_tail = newNode;
		}
		//increments size
		_size++;
	}//end of addToBack
	
	//Prints the contents of the linked list
	public void print(){
		Node temp = _head;
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
	
	//sorts a list using the bubble sort method
	public void bubbleSortList(){
		//if the list is emtpy tell user
		if(isEmpty()){
			System.out.println("The list is empty");
		}
		else{
			
			int interations =0;
			//Outer loop goes through the list, the size of the list
			while(interations <_size){
				Node pointerOne = _head;
				Node pointerTwo = _head.next;
				//inner loop makes comparisons through the list
				while(pointerTwo !=null){
					//if the item in pointer one is larger than the item in pointer two swap
					if(pointerOne.item>pointerTwo.item){
						int temp = pointerOne.item;
						pointerOne.item = pointerTwo.item;
						pointerTwo.item = temp;
					}//end of if
					//moves the pointers
					pointerOne = pointerTwo;
					pointerTwo = pointerTwo.next;
				}//end of inner while
				interations=interations+1;
			}//end of outer while
			
		}//end of else
	}//end of bubblesort
	
}// end of LinkedList class

