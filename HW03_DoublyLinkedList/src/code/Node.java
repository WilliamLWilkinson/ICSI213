package code;

public class Node {
	private String _data;
	private Node _prev;
	private Node _next;
	
	//Default constructor
	public Node(){
		_data = "";
		_prev = null;
		_next = null;
	}
	
	//Non-Default constructor
	public Node(String newData){
		_data = newData;
	}
	
	//Gets and sets for next node
	public void setNext(Node newNode){_next = newNode;}
	
	public Node getNext(){return _next;}
	
	//Gets and sets for previous node
	public void setPrev(Node newNode){_prev=newNode;}
	
	public Node getPrev(){return _prev;}
	
	//Gets and sets for data
	public void setData(String newData){_data = newData;}
	
	public String getDate(){return _data;}

}
