package code;

public class TreeNode {
	private int _numRep;		//number of times word is repeated
	private String _word;		//first instance of a word
	private TreeNode _leftNode;	//pointer to left node 
	private TreeNode _rightNode;//point to right node

	//Default constructor 
	public TreeNode(){
		_numRep = 0;		//set the number of repeated words to zero
		_word = "";			//The first instance of a word, initially set to ""
		_leftNode = null;	//left node of tree set to null
		_rightNode = null;	//right node set to null
	}//end of constructor 
	
	//sets the the word and number of times a word is repeated
	public TreeNode(String s){
		_word = s;
	}//end of constructor
	
	public void incrementNumRep(){
		_numRep = _numRep + 1; 
	}//end of incrementNumRep
	
	public void setLeftNode(TreeNode lN){
		_leftNode = lN;
	}//end of setLeftNode
	
	public TreeNode getLeftNode(){
		return _leftNode;
	}//end of getLeftNode
	
	public void setRightNode(TreeNode rN){
		_rightNode = rN;
	}//end of setRightNode
	
	public TreeNode getRightNode(){
		return _rightNode;
	}
	
}//end of TreeNode
