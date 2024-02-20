package com.Inheritance;

public class MethodExample1 {

	public void addition()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable after var3 is:"+var3);
	}
	

	public static void main(String[] args) {
		MethodExample1 m1=new MethodExample1();
		m1.addition();
	}
}
