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
	
	public String getWord(){
		return _word;
	}
	public void setWord(String s){
		_word = s;
		incrementNumRep();
	}
	
	public int getNumRep(){
		return _numRep;
	}
	
	public void setNumRep(int i){
		_numRep =i;
	}
	
	public TreeNode getParent(){
		return _parent;
	}
	
	public void setParent(TreeNode p){
		_parent = p;
	}
}//end of TreeNode
