package com.OHRMAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRMHeaderLink_PIM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		
		   System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get(applicationUrlAddress);
		   
		   
String expected_OrangeHRMApplicationLoginpageTitle = "OrangeHRM";
System.out.println("The expected title of the OrangeHRM Application LoginPage title is:-"+expected_OrangeHRMApplicationLoginpageTitle);
	
      String actual_OrangeHRMApplicationloginpageTitle=driver.getTitle();
	System.out.println("The actual title of the OrangeHRM Application Loginpage title is:-"+actual_OrangeHRMApplicationloginpageTitle);
	
	if(actual_OrangeHRMApplicationloginpageTitle.equals(expected_OrangeHRMApplicationLoginpageTitle))
	{
	System.out.println("Successfully navigated to login page title:- PASS");
	}
	else
	{
		System.out.println("Failed to navigate to login page title:- FAIL");
	}
	//<input name="txtUsername" id="txtUsername" type="text">
	          String userNameTestData ="Ahalya";
	          By userNameProperty=By.name("txtUsername");
	          WebElement userName=driver.findElement(userNameProperty);
	          userName.sendKeys(userNameTestData);
	          
	         // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	          
	         String passwordTestData = "Ahalya@123";
	         By passwordProperty=By.id("txtPassword");
	         WebElement password=driver.findElement(passwordProperty);
	         password.sendKeys(passwordTestData);
	       
	         //<div id="divLoginButton">
	           // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	                   // </div>
	         
	         By loginButtonProperty=By.className("button");
	         WebElement loginButton=driver.findElement(loginButtonProperty);
	         loginButton.click();
	
	        // <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	         
	      By  pimProperty=By.id("menu_pim_viewPimModule");
	      WebElement pim=driver.findElement(pimProperty);
	      
	      Actions mouseHoverOperation=new Actions(driver);
	      mouseHoverOperation.moveToElement(pim).build().perform(); 
	      By  addEmployeeProperty= By.linkText("Add Employee");
		    WebElement addEmployee=driver.findElement(addEmployeeProperty);
		    addEmployee.click();
		    
	    //  <label class="hasTopFieldHelp">Full Name</label>
	      String Expected_OrangeHRMPersonalDetailsText = "Full Name";
			System.out.println(" The Expected Text of the OrangeHRM Application PersonalDetails Page is :- "
					+ Expected_OrangeHRMPersonalDetailsText);
			         By  fullnameProperty= By.className("hasTopFieldHelp");
			WebElement PersonalheadingElement = driver.findElement(fullnameProperty);
			String actual_OrangeHRMPersonalDetailsText = PersonalheadingElement.getText();
			System.out.println(" The Actual Text of the OrangeHRM Application PersonalDetailsPage is :- "
					+ actual_OrangeHRMPersonalDetailsText);

			if (actual_OrangeHRMPersonalDetailsText.equals(Expected_OrangeHRMPersonalDetailsText)) {
				System.out.println(
						" Text Found - Successfully Navigated to OrangeHRM Application PersonalDetails Page - PASS ");
	      
	         
	  //    <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	     
	    
	   // <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	    
	    String expected_firstNameTestData ="Ahalya";
        By firstNameProperty=By.name("firstName");
        WebElement firstName=driver.findElement(firstNameProperty);
        firstName.sendKeys(expected_firstNameTestData);
        
      //  <input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
        String expected_middleNameTestData ="Ram";
        By middleNameProperty=By.id("middleName");
        WebElement middleName=driver.findElement(middleNameProperty);
        middleName.sendKeys(expected_middleNameTestData);
        
      //  <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
        String expected_lastNameTestData ="Kalwal";
        By lastNameProperty=By.name("lastName");
        WebElement lastName=driver.findElement(lastNameProperty);
        lastName.sendKeys(expected_lastNameTestData);
	      
      //  <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0002" id="employeeId"> 
	
        By employeeIdProperty = By.name("employeeId");
        WebElement employeeId = driver.findElement(employeeIdProperty);

        String employeeIdText = employeeId.getAttribute("value");
        System.out.println("The text of the webelement employee id is: " + employeeIdText);

		
		
	//	<input type="button" class="" id="btnSave" value="Save">
		
		By saveButtonProperty=By.id("btnSave");
        WebElement saveButton=driver.findElement(saveButtonProperty);
        saveButton.click();
		
     //   <input value="Ahalya" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
     //  Thread.sleep(5000);
        
       /* By firstNameProperty1 = By.id("personal_txtEmpFirstName");
        WebElement firstNameElement = driver.findElement(firstNameProperty1);

        String firstNameValue = firstNameElement.getAttribute("value");
        System.out.println("The value of the first name is: " + firstNameValue);

      */ 
       
       
       By firstname1Property=By.id("personal_txtEmpFirstName");
		WebElement firstname1 =driver.findElement(firstname1Property);
	    String actual_FirstnameText =firstname1.getAttribute("value");
		System.out.println(actual_FirstnameText);
		if(actual_FirstnameText.equals(expected_firstNameTestData ))
		{
			System.out.println("The firstname text is successfully passed:-PASS");
		}
		else
		{
			System.out.println("The firstname text is failed:-FAIL");
		}
		//<input value="Ram" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		
		 By middlename1Property=By.id("personal_txtEmpMiddleName");
			WebElement middlename1 =driver.findElement(middlename1Property);
		    String actual_middlenameText =middlename1.getAttribute("value");
			System.out.println(actual_middlenameText);
			
			if(actual_middlenameText.equals(expected_middleNameTestData ))
			{
				System.out.println("The middlename text is successfully passed:-PASS");
			}
			else
			{
				System.out.println("The middlename text is failed:-FAIL");
			}
			
			//<input value="Kalwal" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
			 By lastname1Property=By.id("personal_txtEmpLastName");
				WebElement lastname1 =driver.findElement(lastname1Property);
			    String actual_lastnameText =lastname1.getAttribute("value");
				System.out.println(actual_lastnameText);
				if(actual_lastnameText.equals( expected_lastNameTestData))
				{
					System.out.println("The lastname text is successfully passed:-PASS");
				}
				else
				{
					System.out.println("The lastname text is failed:-FAIL");
				}
				
			//	<input value="0039" type="text" name="personal[txtEmployeeId]"
				//	maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">			
		
			//	<input value="0029" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
				//By actual_employeeid1Property=By.name("personal[txtEmployeeId]");
				//WebElement employeeid1 =driver.findElement(actual_employeeid1Property);
			    //String actual_employeeiddata =firstname1.getAttribute("value");
			    //System.out.println("The text of the webelement employee id is:-"+actual_employeeiddata);
				
				 By employeeIdProperty2 = By.name("personal[txtEmployeeId]");
			       WebElement employeeId2 = driver.findElement(employeeIdProperty2);

			        String employeeIdText1 = employeeId2.getAttribute("value");
			        System.out.println("The text of the webelement employee id is: " + employeeIdText1);
	
				
				if(employeeIdText.equals( employeeIdText1))
				{
					System.out.println("The employee id data is successfully passed:-PASS");
				}
				else
				{
					System.out.println("The employee id data is failed:-FAIL");
				}
		
				
				By welcomeadminProperty=By.id("welcome");
				WebElement welcomeadmin=driver.findElement(welcomeadminProperty);
				
				
				String expected_OrangeHRMApplicationHomePageText="Welcome";
				System.out.println("The expected orangeHRM Application home page text is :-"+expected_OrangeHRMApplicationHomePageText);
				
				String actual_OrangeHRMApplicationHomePageText=welcomeadmin.getText();
				System.out.println("The actual orangeHRM Application home page text is :-"+actual_OrangeHRMApplicationHomePageText);
				
				if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
				{
					System.out.println("succesfully navigated to home page Text-PASS");
				}
				else
				{
					System.out.println("Failed to navigate to home page Text-FAIL");
				}
				
				welcomeadmin.click();
				
				Thread.sleep(20000);
				
				By logoutProperty=By.linkText("Logout");
				WebElement logout=driver.findElement(logoutProperty);
				logout.click();
				
				System.out.println("close the application");
				driver.close();
				
				
	}

	}}	
		
		
	
	
	
	
	
	


	


