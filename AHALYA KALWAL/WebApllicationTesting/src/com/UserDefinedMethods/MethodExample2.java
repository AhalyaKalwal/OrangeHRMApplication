package com.UserDefinedMethods;

public class MethodExample2 {
	protected void subtraction()
	{
		int var1=60;
		int var2=50;
		int var3;
		var3=var1-var2;
		System.out.println("the value of the variable var3 is:"+var3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample2 m2=new MethodExample2();
		m2.subtraction();
        m2.addition();
       
	}
	
	public void addition()
	{
		int var1=30;
		int var2=20;
		int var3 ;
		var3=var1+var2;
		System.out.println("the value of the variable var3 in addition is:"+var3);
	}
	
	
	
	
	

	
	
}
