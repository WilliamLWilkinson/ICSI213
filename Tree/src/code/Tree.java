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
		if(root!=null){
			//get left branches
			printTree(root.getLeftNode());
			//print
			System.out.print("Word: " + root.getWord() + 
							 ", repeated: " + root.getNumRep() + " ");
			//get right branches
			printTree(root.getRightNode());
		}
	}//end of printTree
	
	public void insert(String s){
		insert(_root, s);
	}
	
	public void insert(TreeNode node, String s){
		//if the list is empty
		if(isEmpty()){
			TreeNode temp = new TreeNode(s);
		}
		else{
			if(node.getWord().compareTo(s)==0){
				node.incrementNumRep();
			}
			else if(node.getWord().compareTo(s)<0){
				if(node.getRightNode()==null){
					TreeNode temp = new TreeNode();
					temp
				}
				else{
					insert(node.getRightNode(),s);
				}
				
			}//end of if
			else if(node.getWord().compareTo(s)>0){
				
			}//end of if else
			
		}//end of else
		
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
