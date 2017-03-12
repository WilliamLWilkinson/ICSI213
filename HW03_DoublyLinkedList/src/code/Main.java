package code;

public class Main {
	 public static void main(String[] args) {
		 	/*
			//Test doubly list class constructor
		 	DoublyList listOne = new DoublyList();	// didn't crash good
		 	//Tests isEmpty
		 	if(listOne.isEmpty()){
		 		System.out.println("The list is empty"); //<----Printed so it works
		 	}
		 	else{
		 		System.out.println("The list is not empty");//<---Didn't print, good
		 	}// end of else
		 	//Tests add method
		 	listOne.insertNodeAlphabetically("Billy");//Doesn't crash
		 	//Tests printforward
		 	listOne.printForward();//Works so far
		 	//Tests printBackward
		 	listOne.printBackwards();
		 	//Tests find method
		 	String strOne = "Billy"; //should be found
		 	String strTwo = "Bobby"; //Shouldn't be found
		 	//Should be found, should print out statement in if 
		 	if(listOne.findNode(strOne)==true){
		 		System.out.println("The string was found");
		 	}
		 	else{
		 		System.out.println("The string was not found");
		 	}
		 	//Shouldn't be found, so it should go to else
		 	if(listOne.findNode(strTwo)==true){
		 		System.out.println("The string was found");
		 	}
		 	else{
		 		System.out.println("The string was not found");
		 	}
		 	/*
		 	 Terminal so far:
		 	 	The list is empty			//isEmpty method
				Billy						//printForward method
				Billy						//printBackwards method
				The string was found		//findNode method(found)
				The string was not found	//findNode method(not found)
		 	 
		 	 */
		 	//Tests add method
		 	DoublyList listTwo = new DoublyList();
		 	listTwo.insertNodeAlphabetically("Billy");
		 	//listTwo.insertNodeAlphabetically("Bobby");
		 	listTwo.insertNodeAlphabetically("Aaron");
		 	//listTwo.insertNodeAlphabetically("Tim");
		 	listTwo.printForward();
		 	System.out.println();
		 	listTwo.printBackwards();
		 	System.out.println(listTwo.getSize());
		 	
		 	
		}// end of main
}// end of main class
