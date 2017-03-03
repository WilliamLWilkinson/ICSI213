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
	
	
	
	

}
