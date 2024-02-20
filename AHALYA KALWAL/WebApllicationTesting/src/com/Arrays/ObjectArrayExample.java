package com.Arrays;

import java.util.EventObject;

public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object array1[]=new Object[5];
		array1[0]="Ahalya";
		array1[1]=10;
		array1[2]='B';
		
		//System.out.println(array1[1]);
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		System.out.println();
		//FOR EACH LOOP
		for(Object index:array1)
		{
			System.out.println(index);
		}
		
		
		
		
		
		
	}

}
