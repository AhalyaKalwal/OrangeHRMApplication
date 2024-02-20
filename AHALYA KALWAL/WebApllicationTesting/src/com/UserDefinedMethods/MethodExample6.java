package com.UserDefinedMethods;

public class MethodExample6 {

	//global variables/instance variable-which is declared outside the userdefined class
	int var1=50;
	public void addition()
	{
		//local variables
		int var1=20;
		int var2=40;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable after addition is:"+var3);
	}
	
	
	public void subtraction()
	{
		int var2=10;
		int var3 ;
		var3=var1-var2;
		System.out.println("The value of the variable after subtraction is:"+var3);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodExample6 m6=new MethodExample6();
		m6.addition();
		m6.subtraction();
	}

}
