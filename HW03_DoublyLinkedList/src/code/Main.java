package code;

public class Main {
	 public static void main(String[] args) {
		 	
			//Tests to see if strings are added Alphabetical
		 	DoublyList listOne = new DoublyList();
		 	listOne.printForward();
		 	System.out.println();
		 	listOne.printBackwards();
		 	System.out.println();
		 	//Both say list is empty, WORKS!!!
		 	//Adds strings to the node
		 	listOne.insertNodeAlphabetically("Billy");
		 	listOne.insertNodeAlphabetically("Ted");
		 	listOne.insertNodeAlphabetically("Aaron");
		 	listOne.insertNodeAlphabetically("Matt");
		 	listOne.insertNodeAlphabetically("Zebra");
		 	listOne.insertNodeAlphabetically("Zoo");
		 	listOne.insertNodeAlphabetically("Nick");
		 	System.out.println("Printing list without deletion:");
		 	System.out.println("Forwards:");
			listOne.printForward();
		 	System.out.println();
		 	System.out.println("Backwards:");
		 	listOne.printBackwards();
		 	System.out.println();
		 	//Both print forwards and backwards
		 	//Delete node at front
		 	listOne.deleteNode("Aaron");
		 	System.out.println("Deleting Aaron:");
		 	System.out.println("Forwards:");
		 	listOne.printForward();
		 	System.out.println();
		 	System.out.println("Backwards:");
		 	listOne.printBackwards();
		 	System.out.println();
		 	//Delete node at end
		 	listOne.deleteNode("Zoo");
		 	System.out.println("Deleting Zoo:");
		 	System.out.println("Forwards:");
		 	listOne.printForward();
		 	System.out.println();
		 	System.out.println("Backwards:");
		 	listOne.printBackwards();
		 	System.out.println();
		 	//Delete node in the middle
		 	listOne.deleteNode("Nick");
		 	System.out.println("Forwards:");
		 	System.out.println("Deleting Nick:");
		 	listOne.printForward();
		 	System.out.println();
		 	System.out.println("Backwards:");
		 	listOne.printBackwards();
		 	System.out.println();
		 	//Find node
		 	System.out.println("Finding Billy:");
		 	if(listOne.findNode("Billy")){
		 		
		 		System.out.println("The node was found!");
		 	}
		 	else{
		 		System.out.println();
		 		System.out.println("The node was not found!");
		 	}
		 	
		 	//Delete entire List
		 	System.out.println();
		 	listOne.deleteList();
		 	System.out.println();
		 	listOne.printForward();
		 	System.out.println();
		 	listOne.printBackwards();
		 	
		}// end of main
}// end of main class
