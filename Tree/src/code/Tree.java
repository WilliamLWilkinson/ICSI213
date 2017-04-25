package code;

public class Tree {
	private TreeNode _root;
	
	public Tree(){
		_root= null;
	}//end of constructor
	
	public void printTree(){
		printTree(_root);
	}//end of print method
	
	public void printTree(TreeNode root){
		
	}
	
	public void insert(String s){
		insert(_root, s);
	}
	
	public void insert(TreeNode node, String s){
		//if the list is empty
		if(isEmpty()){
			TreeNode temp = new TreeNode(s);
		}
		
	}//end of insert
	
	public void deleteNode(){
		
	}//end of deleteNode
	
	public TreeNode find(){
		TreeNode temp = new TreeNode();
		return temp;
	}//end of find
	
	public boolean isEmpty(){
		return _root ==null;
	}//end of isEmpty

}
