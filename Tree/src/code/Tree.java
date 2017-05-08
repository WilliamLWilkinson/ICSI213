package code;

public class Tree {
	private TreeNode _root;
	
	public Tree(){
		_root= null;
	}//end of constructor
	
	//returns root
	public TreeNode getRoot(){
		return _root;
	}
	
	//Makes print tree recursive
	public void printTree(){
		printTree(_root);
	}//end of print method
	
	//Prints the contents of a tree
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
	
	//Makes insertion recursive
	public void insert(String s){
		insert(_root,_root, s);
	}
	
	//inserts a string into a tree, to the left if the string is less than the root
	// to the right if it is larger
	public void insert(TreeNode p, TreeNode node, String s){
		//if the list is empty
		if(isEmpty()){
			TreeNode temp = new TreeNode(s);
			temp.setParent(temp);
			_root = temp;
			
		}
		else{
			//if the string is equal to a word in the string icrement counter
			if(node.getWord().compareTo(s)==0){
				node.incrementNumRep();
			}
			//if the string is larger than root
			else if(node.getWord().compareTo(s)<0){
				//if the child is empty insert
				if(node.getRightNode()==null){
					TreeNode temp = new TreeNode();
					temp.setWord(s);
					temp.setParent(node);
					node.setRightNode(temp);
				}
				//if the root already has a child go deeper
				else{
					insert(node, node.getRightNode(),s);
				}
				
			}//end of if
			//if the string is less than the root
			else if(node.getWord().compareTo(s)>0){
				//if the child is null create new node and insert
				if(node.getLeftNode()==null){
					TreeNode temp = new TreeNode();
					temp.setWord(s);
					temp.setParent(node);
					node.setLeftNode(temp);
				}
				//if the root already has a left child go deeper
				else{
					insert(node ,node.getLeftNode(),s);
				}
			}//end of if else
			
		}//end of else
		
	}//end of insert
	
	/*
	public void deleteNode(String s){
		deleteNode(_root, s);
	}
	 */
	
	public void deleteNode( String s){
		TreeNode search = _root;
		boolean found = false;
		//while the node is not found
		while(found==false &&search!=null){
			//node is found exit the loop
			if(search.getWord().compareTo(s)==0){
				//if the node has no children
				if(search.getLeftNode()==null&&search.getRightNode()==null){
					//if the right node is the one being deleted
					if(search.getParent().getRightNode().getWord().compareTo(s)==0){
						search.getParent().setRightNode(search.getLeftNode());
					}
					else{
						//if the left node is being deleted
						search.getParent().setLeftNode(search.getLeftNode());
					}
					search.setParent(null);
					
				}
				//if the node being deleted has one child to the right
				else if(search.getLeftNode()==null&&search.getRightNode()!=null){
					//if the node being deleted is to the right of the root
					if(search.getParent().getRightNode().getWord().compareTo(search.getWord())==0){
						
						search.getParent().setRightNode(search.getRightNode());
						//points node to the parent 
						search.getRightNode().setParent(search.getParent());
						
					}
					else{
						//if the node being deleted is to the right of the parent
						search.getParent().setLeftNode(search.getRightNode());
						search.getRightNode().setParent(search.getParent());
					}
					
					
				}
				//if the node being deleted has one child to the left
				else if(search.getLeftNode()!=null&&search.getRightNode()==null){
					//if the node being deleted is to the right of the parent
					if(search.getParent().getRightNode().getWord().compareTo(search.getWord())==0){
						search.getParent().setRightNode(search.getLeftNode());
						search.getLeftNode().setParent(search.getParent());
						
					}
					else{
						//if the node being delted is to the left of the parent
						search.getParent().setLeftNode(search.getLeftNode());
						search.getLeftNode().setParent(search.getParent());
					}
				}
				//if the node being deleted has both left and right children
				else{
					//find left most node to the right
					TreeNode smallest = search.getRightNode();
					while(smallest.getLeftNode()!=null){
						smallest = smallest.getLeftNode();
					}
					//if the left most node has a right child
					if(smallest.getRightNode()!=null){
						smallest.getParent().setLeftNode(smallest.getRightNode());
						smallest.getRightNode().setParent(smallest.getParent());
						search.setWord(smallest.getWord());
						search.setNumRep(smallest.getNumRep());
					}
					else{
						//if the left most node doesn't have a child swap leftmost with search 
						//make parent of leftmost point to null
						smallest.getParent().setRightNode(null);
						smallest.setParent(null);
						search.setWord(smallest.getWord());
						search.setNumRep(smallest.getNumRep());
					}
				}
				
				found =true;
			}
			//node being searched is greater than root
			else if(search.getWord().compareTo(s)<0){
				search = search.getRightNode();
				
			}
			//node being searched for is less than the root
			else if(search.getWord().compareTo(s)>0){
				search = search.getLeftNode();
			}
			//else node being searched for is not in the tree
			else{
				
				found =true;
			}
		}//end of while
		
	    
	}//end of deleteNode
	
	//finds a node in the list
	public TreeNode find(String s){
		
		TreeNode search = _root;
		boolean found = false;
		//while the node is not found
		while(found==false &&search!=null){
			//node is found exit the loop
			if(search.getWord().compareTo(s)==0){
				
				found =true;
			}
			//node being searched is greater than root
			else if(search.getWord().compareTo(s)<0){
				search = search.getRightNode();
				
			}
			//node being searched for is less than the root
			else if(search.getWord().compareTo(s)>0){
				search = search.getLeftNode();
			}
			//else node being searched for is not in the tree
			else{
				found =true;
			}
		}//end of while
		
		//tells the user if the node was not found
		if(search==null){
			System.out.println("Node was not found");
			
		}
			return search;
		
	}//end of find
	
	//method that returns true if the list is empty
	public boolean isEmpty(){
		return _root ==null;
	}//end of isEmpty

}
