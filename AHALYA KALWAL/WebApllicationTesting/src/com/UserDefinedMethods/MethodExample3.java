package com.UserDefinedMethods;

public class MethodExample3 {

	private void multiplication()// it can be only accessed in the same class
	{
		int var1=10;
		int var2=20;
		int var3;
		var3=var1*var2;
		System.out.println("the value of the variable var3 after multiplication is:"+var3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample3 m3=new MethodExample3();
		m3.multiplication();
		
		m3.multiplication();
		
		MethodExample2 hi =new MethodExample2();
		hi.addition();
        hi.subtraction();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
