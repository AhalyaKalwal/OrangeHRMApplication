package com.UserDefinedMethods;

public class MethodExample4 {

	void division()
	{
		int var1=30;
		int var2=10;
		int var3;
		var3=var1/var2;
		System.out.println("The value of the var3 after division is:"+var3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	MethodExample4 m4=new MethodExample4();
	m4.division();
	MethodExample2 hello=new MethodExample2();
	hello.addition();
hello.subtraction();
	}

}
