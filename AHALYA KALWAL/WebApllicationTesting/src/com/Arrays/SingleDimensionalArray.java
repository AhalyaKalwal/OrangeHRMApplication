package com.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		
		/*syntax
		 datatype arrayname[]=new datatype[size];
		 */
		
		
		int array1[]=new int[5];
		array1[0]=10;
		array1[1]=20;
		array1[2]='C';
		array1[3]=40;
		array1[4]=50;
		
		
		for(int index=0;index<=5;index++)
		{
			System.out.println(array1[index]);
		}
		

	}

}
