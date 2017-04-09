package code;

public class Main {

	 public static void main(String[] args) {	
		
		 //Tests to see what is printed in an empty Stack and queue
		 Stack emptyStack = new Stack();
		 System.out.println("Empty Stack using Peek Method:");
		 emptyStack.peek();
		 System.out.println("Empty Stack using Print Method:");
		 emptyStack.print();
		 Queue emptyQueue = new Queue();
		 System.out.println("Empty Queue using Peek Method:");
		 emptyQueue.peek();
		 System.out.println("Empty Queue using Print Method:");
		 emptyQueue.print();
		 
		 //Puts Queue in a stack keeping the order
		 System.out.println("moves contents of a Queue to a new stack maintaing order:");
		 Stack sOne = new Stack();
		 
		 Stack sTemp = new Stack();
		 Queue qOne = new Queue();
		 qOne.enqueue(1);
		 qOne.enqueue(2);
		 qOne.enqueue(3);
		 qOne.enqueue(4);
		 qOne.enqueue(5);
		 System.out.println("Queue before it is emptied:");
		 qOne.print();		 
		 Stack sTwo = new Stack();
		 //Call to method moving queue to stack
		 queueToStack(qOne,sTwo);
		 System.out.println("Copied stack:");
		 sTwo.print();
		 
		 //Stack to stack
		 System.out.println("moves contents of a stack to a new stack maintaing order:");
		 Stack stackOne = new Stack();
		 stackOne.push(5);
		 stackOne.push(4);
		 stackOne.push(3);
		 stackOne.push(2);
		 stackOne.push(1);
		 System.out.println("Printing stack that will be emptied:");
		 stackOne.print();
		 Stack stackTwo = new Stack();
		 //Moves contents of stack to stack, method call
		 stackToStack(stackOne, stackTwo);
		 System.out.println("Stack that is filled");
		 stackTwo.print();
		 
		 //Stack to Queue
		 System.out.println("moves contents of a stack to a new Queue maintaing order:");
		 Stack toEmpty = new Stack();
		 toEmpty.push(1);
		 toEmpty.push(2);
		 toEmpty.push(3);
		 toEmpty.push(4);
		 toEmpty.push(5);
		 System.out.println("Stack: ");
		 toEmpty.print();
		 Queue toFill = new Queue();
		 //Moves contents of stack to queue, method call
		 stackToQueue(toEmpty, toFill);
		 System.out.println("Queue: ");
		 toFill.print();
		 
	 }//end of main method
	 
	 //Emptyies a stack into another stack maintaining order
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
	 
	 //method that moves the values from a stack into a queue
	 //maintaining order
	 public static void stackToQueue(Stack s, Queue q){
		 while(!s.isEmpty()){
			 q.enqueue(s.pop());
		 }
	 }
	 
	 //method that contains a queue and stack in the argument list
	 // fills stack from queue maintaining order
	 public static void queueToStack(Queue q, Stack s){
		 //temp stack to maintain the order from the queue
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






