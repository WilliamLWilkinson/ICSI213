package code;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 
	       Tree tOne = new Tree();
	       //tests insertion
	       //test insertion
	       tOne.insert("Billy");
	       //tOne.printTree();
	       tOne.insert("Albert");
	       //tOne.printTree();
	       tOne.insert("Albert");
	       tOne.insert("Nick");
	       tOne.insert("Nick");
	       tOne.insert("Nick");
	       tOne.insert("Tim");
	       tOne.insert("Jerry");
	       tOne.insert("Jerry");
	       tOne.insert("Rodger");
	       tOne.insert("Nancy");
	       tOne.insert("Harry");
	       //test print trees
	       tOne.printTree();
	       //Tests finding
	       System.out.println();
	       System.out.println("Finding string billy");
	       TreeNode nodeOne = tOne.find("Billy");
	       System.out.println(nodeOne.getWord());
	       TreeNode nodeTwo = tOne.find("Ted");
	      
	       //Testing file reading
	       System.out.println();
	       System.out.println("File reading");
	       String filename = "data.txt";
	       Tree tThree = new Tree();
	       scanFile(filename, tThree);
	       tThree.printTree();
	       
	 }//end of main method
	 
	 //Method scanFile scans the contents of a file and places them in a tree
	 public static void scanFile(String s, Tree t){
		  try
	       {
			  //scans the contents of a file
	         Scanner scanner = new Scanner(new FileReader(s));
	         //while there is a line to be scanned
	         while (scanner.hasNext())
	         {
	           //System.out.println(scanner.nextInt());
	        	 //Break down sentence 
	        	 String line = scanner.nextLine();
	        	 //break down line and removes any charachter that isn't a letter
	        	 String[] arr = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    
	        	 
	        	 //inserts strings from array of strings into the tree
	        	 for ( String ss : arr) {

	        	      t.insert(ss);
	        		 //System.out.println(ss);
	        	  }
	             
	         }
	         scanner.close();
	       }
	       catch (Exception e)
	       {
	    	   //if error 
	         System.err.format("Exception occurred trying to read '%s'.", s);
	         e.printStackTrace();
	       }
	 }//end of scanFile
	 
}//end of main class
