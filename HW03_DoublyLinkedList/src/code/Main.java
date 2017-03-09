package code;

public class Main {
	 public static void main(String[] args) {
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
		 	
		 	
		}// end of main
}// end of main class
