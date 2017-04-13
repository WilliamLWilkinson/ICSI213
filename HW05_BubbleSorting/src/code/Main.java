package code;

import java.util.Random;

public class Main {
	public static void main(String[] args) {	
		int _sizeOfList = 10;
		int arrayOne[] = new int[_sizeOfList];
		
		
	}//end of main method
	
	//Method fillArray takes in an array of integers and 
	//fills it with integers
	public static void fillArray(int a[]){
		
		for(int i =0;i<a.length;i++){
			Random rand = new Random();
			
			int ranNum = rand.nextInt(0-100 +1)+0;
			a[i]= ranNum;
		}
	}//end of fillArray
	
	public static void printArrray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println(Integer.toString(a[i]));
		}
	}
}//end of main class
