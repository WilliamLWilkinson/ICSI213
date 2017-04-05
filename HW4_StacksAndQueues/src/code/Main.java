package code;

public class Main {

	 public static void main(String[] args) {	
		 				
		Queue qOne = new Queue();
		qOne.enqueue(1);
		qOne.enqueue(2);
		qOne.enqueue(3);
		qOne.enqueue(4);
		qOne.enqueue(5);
		//qOne.print();
		//System.out.println();
		//System.out.println(qOne.peek());
		System.out.println();
		Stack sOne = new Stack();
		sOne.push(1);
		sOne.push(2);
		sOne.push(3);
		sOne.push(4);
		sOne.push(5);
		sOne.print();
		System.out.println();
		System.out.println(sOne.pop());
		
	 }
}
