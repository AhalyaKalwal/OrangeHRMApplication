package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object>arrayList1=new ArrayList<>();
		arrayList1.add(10);
		arrayList1.add(20.123f);
		arrayList1.add("ALEKHYA");
		arrayList1.add('C');
		
		//System.out.println(arrayList1.get(2));
		
		for(int index=0;index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
		

		System.out.println();
		
		//FOR EACH LOOP
		for(Object index:arrayList1)
		{
			System.out.println(index);
		}
	}

}
