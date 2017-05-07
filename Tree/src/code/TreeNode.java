package code;

public class TreeNode {
	private int _numRep;		//number of times word is repeated
	private String _word;		//first instance of a word
	private TreeNode _leftNode;	//pointer to left node 
	private TreeNode _rightNode;//point to right node
	private TreeNode _parent;

	//Default constructor 
	public TreeNode(){
		_numRep = 0;		//set the number of repeated words to zero
		_word = "";			//The first instance of a word, initially set to ""
		_leftNode = null;	//left node of tree set to null
		_rightNode = null;	//right node set to null
		_parent = null;
	}//end of constructor 
	
	//sets the the word and number of times a word is repeated
	public TreeNode(String s){
		_word = s;
		incrementNumRep();
	}//end of constructor
	
	//method increments the number of times a word is used
	public void incrementNumRep(){
		_numRep = _numRep + 1; 
	}//end of incrementNumRep
	
	//sets the left node of a root
	public void setLeftNode(TreeNode lN){
		_leftNode = lN;
	}//end of setLeftNode
	
	//returns the left node of a root
	public TreeNode getLeftNode(){
		return _leftNode;
	}//end of getLeftNode
	
	//sets the right node of a root
	public void setRightNode(TreeNode rN){
		_rightNode = rN;
	}//end of setRightNode
	
	//return the right node of a root
	public TreeNode getRightNode(){
		return _rightNode;
	}
	
	//returns the word of a node
	public String getWord(){
		return _word;
	}
	//set the word of a node
	public void setWord(String s){
		_word = s;
		incrementNumRep();
	}
	
	//returns the number of times a word is used
	public int getNumRep(){
		return _numRep;
	}
	
	//sets the number of times a word is used
	public void setNumRep(int i){
		_numRep =i;
	}
	
	//returns the parent node of a child
	public TreeNode getParent(){
		return _parent;
	}
	
	//sets the parent of a child
	public void setParent(TreeNode p){
		_parent = p;
	}
}//end of TreeNode
