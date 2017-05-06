package code;

public class Tree {
	private TreeNode _root;
	
	public Tree(){
		_root= null;
	}//end of constructor
	
	public TreeNode getRoot(){
		return _root;
	}
	
	public void printTree(){
		printTree(_root);
	}//end of print method
	
	public void printTree(TreeNode root){
		if(root!=null){
			//get left branches
			printTree(root.getLeftNode());
			
			//print
			System.out.println("Word: " + root.getWord() + 
							 ", instances: " + root.getNumRep()
							  + " Parent: " + root.getParent().getWord());
			//get right branches
			printTree(root.getRightNode());
		}
	}//end of printTree
	
	public void insert(String s){
		insert(_root,_root, s);
	}
	
	public void insert(TreeNode p, TreeNode node, String s){
		//if the list is empty
		if(isEmpty()){
			TreeNode temp = new TreeNode(s);
			temp.setParent(temp);
			_root = temp;
			
		}
		else{
			if(node.getWord().compareTo(s)==0){
				node.incrementNumRep();
			}
			else if(node.getWord().compareTo(s)<0){
				if(node.getRightNode()==null){
					TreeNode temp = new TreeNode();
					temp.setWord(s);
					temp.setParent(node);
					node.setRightNode(temp);
				}
				else{
					insert(node, node.getRightNode(),s);
				}
				
			}//end of if
			else if(node.getWord().compareTo(s)>0){
				if(node.getLeftNode()==null){
					TreeNode temp = new TreeNode();
					temp.setWord(s);
					temp.setParent(node);
					node.setLeftNode(temp);
				}
				else{
					insert(node ,node.getLeftNode(),s);
				}
			}//end of if else
			
		}//end of else
		
	}//end of insert
	
	public void deleteNode(TreeNode root, String s){
		
		
	}//end of deleteNode
	
	
	public TreeNode find(String s){
		TreeNode search = _root;
		boolean found = false;
		while(found==false ){
			if(search.getWord().compareTo(s)==0){
				
				found =true;
			}
			else if(search.getWord().compareTo(s)<0){
				search = search.getRightNode();
				
			}//end of if
			else if(search.getWord().compareTo(s)>0){
				search = search.getLeftNode();
			}
			else{
				found =true;
			}
		}//end of while
		
		if(search==null){
			System.out.println("Node was not found");
		}
			return search;
	}//end of find
	
	public boolean isEmpty(){
		return _root ==null;
	}//end of isEmpty

}
