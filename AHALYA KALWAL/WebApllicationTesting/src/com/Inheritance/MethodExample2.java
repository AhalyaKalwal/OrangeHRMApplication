package com.Inheritance;

public class MethodExample2 extends MethodExample1 
{

	private void subtraction()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1-var2;
		System.out.println("The value of the variable var3 after subtraction is:"+var3);
		
	}
	
	
	public static void main(String[] args) {
		MethodExample2 m2=new MethodExample2();
		m2.subtraction();
		m2.addition();
		
	}
}






