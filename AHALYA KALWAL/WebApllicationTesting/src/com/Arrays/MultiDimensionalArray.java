package com.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 /*syntax
		  datatype array[][]=new datatype[][];
		  */
		
String hello[][]=new String[2][2];

 hello[0][0]="ahalya";
 hello[0][1]="chinnu";
 hello[1][0]="alekhya";
 hello[1][1]="anurag";
 
// System.out.println(hello[1][0]);

  for(int rowIndex=0;rowIndex<=1;rowIndex++)
  {
	  for(int rowOfCell=0;rowOfCell<=1;rowOfCell++)
	  {
		 System.out.print(hello[rowIndex][rowOfCell]+"  "); 
		// System.out.println();
	  }
	  System.out.println();  
  }

	}

}
