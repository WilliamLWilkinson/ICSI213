package code;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 
	       Tree tOne = new Tree();
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
	       //tOne.insert("Harry");
	       //test print trees
	       //tOne.printTree();
	       /*
	       TreeNode nodeOne = tOne.find("Billy");
	       System.out.println();
	       System.out.println("Found node");
	       System.out.println(nodeOne.getWord());
	       //TreeNode nodeTwo = tOne.find("Ted");
	       */
	       //deletion
	       //when the node has no children
	       tOne.deleteNode(tOne.getRoot(),"Albert");
	       //tOne.printTree();
	       //String filename = "data.txt";
	       //Tree tTwo = new Tree();
	       //scanFile(filename, tTwo);
	       //tTwo.printTree();
	       
	 }//end of main method
	 
	 public static void scanFile(String s, Tree t){
		  try
	       {
	         Scanner scanner = new Scanner(new FileReader(s));
	         //while there is a line to be scanned
	         while (scanner.hasNext())
	         {
	           //System.out.println(scanner.nextInt());
	        	 //Break down sentence 
	        	 String line = scanner.nextLine();
	        	 //break down line and removes any charachter that isn't a letter
	        	 String[] arr = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

	        	 for ( String ss : arr) {

	        	      t.insert(ss);
	        		 //System.out.println(ss);
	        	  }
	             
	         }
	         scanner.close();
	       }
	       catch (Exception e)
	       {
	         System.err.format("Exception occurred trying to read '%s'.", s);
	         e.printStackTrace();
	       }
	 }//end of scanFile
	 
}//end of main class
