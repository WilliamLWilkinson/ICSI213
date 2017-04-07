package code;

public class Main {

	 public static void main(String[] args) {	
		
		 /*
		 //Tests linked list class
		LinkedList lOne = new LinkedList();
		
		lOne.addToBack(1);
		lOne.addToBack(2);
		lOne.addToBack(3);
		lOne.addToBack(4);
		lOne.addToBack(5);
		//lOne.print();
		lOne.addToFront(0);
		lOne.addToFront(-1);
		lOne.addToFront(-2);
		//lOne.print();
		lOne.removeFromFront();
		lOne.removeFromEnd();
		lOne.print();
		*/
		 
		 /*
		 Stack sOne = new Stack();
		 sOne.push(1);
		 sOne.push(2);
		 sOne.push(3);
		 sOne.push(4);
		 sOne.push(5);
		 sOne.pop();
		 System.out.println();
		 sOne.print();
		 System.out.println(sOne.peek());
		 */
		 
		 //Puts Queue in a stack keeping the order
		 Stack sOne = new Stack();
		 sOne.print();
		 sOne.peek();
		 Stack sTemp = new Stack();
		 Queue qOne = new Queue();
		 qOne.enqueue(1);
		 qOne.enqueue(2);
		 qOne.enqueue(3);
		 qOne.enqueue(4);
		 qOne.enqueue(5);
		 //qOne.print();
		 
		 //Queue to stack
		 Stack sTwo = new Stack();
		 System.out.println("Queue Start:");
		 qOne.print();
		 queueToStack(qOne,sTwo);
		 System.out.println("Copied stack:");
		 sTwo.print();
		 //Stack to stack
		 Stack stackOne = new Stack();
		 stackOne.push(5);
		 stackOne.push(4);
		 stackOne.push(3);
		 stackOne.push(2);
		 stackOne.push(1);
		 
		 //Stack to Queue
		 
	 }//end of main method
	 
	 public static void stackToStack(Stack sToEmpty, Stack sToFill){
		 Stack temp = new Stack();
		 
		 //Empties stack into temporary stack
		 while(!sToEmpty.isEmpty()){
			 temp.push(sToEmpty.pop());
		 }
		 
		 //Fills stack
		 while(!temp.isEmpty()){
			 sToFill.push(temp.pop());
		 }
		 
	 }
	 
	 public static void stackToQueue(Stack s, Queue q){
		 while(!s.isEmpty()){
			 q.enqueue(s.pop());
		 }
	 }
	 
	 public static void queueToStack(Queue q, Stack s){
		 Stack temp = new Stack();
		 
		 //fills the temporary stack
		 while(!q.isEmpty()){
			 temp.push(q.dequeue());
		 }//end of while
		 
		 //fills new stack
		 while(!temp.isEmpty()){
			 s.push(temp.pop());
		 }//end of while
	 }
	 	
}//end of Main class






