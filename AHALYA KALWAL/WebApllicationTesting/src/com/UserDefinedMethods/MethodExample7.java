package com.UserDefinedMethods;

public class MethodExample7 {

	int var1= 50;
	public void addition()
	{
		int var1=20;
		int var2=40;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable after addition is:"+var3);
		
	}
	public void addition(int var1,int var2)//method with parameter / method with signature
	
	{
		int var3 = var1+var2;
		
		System.out.println("The value of the variable after addition is:"+var3);
	}
	
	
	public void addition(int var1,double var2,double var3)//whenever the methods names is similar but 
	                                           //parameters are different then it is called method overloading 
	
	
	{
		var3=var1+var2+var3;
		System.out.println("The value of the variable var3 after addition is:"+var3);
	}
	
	public static void main(String[] args) 
	{
		MethodExample7 m7=new MethodExample7();
		m7.addition();
		m7.addition(30, 10);
		m7.addition(40, 30);
		m7.addition(10, 20, 30);
		m7.addition(10,10.12, 10.1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
