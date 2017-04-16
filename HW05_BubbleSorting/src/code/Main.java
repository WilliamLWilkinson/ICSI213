package code;

import java.util.Random;

public class Main {
	public static void main(String[] args) {	
		int _sizeOfList = 10;
		int[] arrayOne = new int[_sizeOfList];
		//int[] arrayOne = {12,7,9,18};
		fillArray(arrayOne);
		//Prints the list before it is sorted
		printArray(arrayOne);
		bubbleSortArray(arrayOne);
		System.out.println("Post Sort");
		printArray(arrayOne);
	}//end of main method
	
	//Method fillArray takes in an array of integers and 
	//fills it with integers between 0 and 100
	public static void fillArray(int[] a){
		
		for(int i =0;i<a.length;i++){
			Random rand = new Random();
			
			int ranNum = rand.nextInt(100-0)+0;
			a[i]= ranNum;
		}
	}//end of fillArray
	
	//Prints the contents of an Array
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.println(Integer.toString(a[i]));
		}
	}//end of printArray
	
	//Sorts the contents of an Array using the bubble sort method
	public static void bubbleSortArray(int[] a){
		int sizeOfList = a.length;
		
		for(int i=0; i<sizeOfList;i++){
			for(int j = 1;j<sizeOfList-1 ;j++){
				if(a[j-1]>a[j]){
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}//end of inner loop
		}//end of outer loop
		
	}//end of bubbleSortArray
	
}//end of main class
