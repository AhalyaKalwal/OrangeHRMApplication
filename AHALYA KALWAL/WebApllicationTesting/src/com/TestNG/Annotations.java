package com.TestNG;

import org.testng.annotations.Test;

public class Annotations {
	@Test(priority=2)
	public void loginTest()
	{
	System.out.println(" Gmail login functionality test succesful");
	
	}
	@Test(priority=1)
   public void applicationlaunch()
   {
	   System.out.println("Gmail Application launch successful");
   }
	@Test(priority=4)
 public void ComposeMailTest()
{
	System.out.println("Compose mail functionality test successful");
}
	@Test(priority=3)
public void inBoxTest() {
	System.out.println("Gmail InBox functionality test successful");
}
	@Test(enabled=false)
public void draftsTest() {
	System.out.println("Gmail Drafts Functionality Test Successful");
}
	@Test(priority=6)
public void sentMail()
{
	System.out.println("Gmail sentMail functionality Test Successful");
}
	@Test(priority=7)
public void applicationClose() {
	System.out.println("Gmail application close");
}
}
