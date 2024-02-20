package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JQuery_GetText extends BaseTest 
{
	public void jQuery_getText_DragMeToMyTarget()
	{
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
	By	jQueryFrameProperty=By.className("demo-frame");
	WebElement jQueryFrame=driver.findElement(jQueryFrameProperty);
	
	driver.switchTo().frame(jQueryFrame);
	//<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
	//<p>Drag me to my target</p>
By dragMeToMyTargetProperty=By.id("draggable");
WebElement dragmetomytarget=driver.findElement(dragMeToMyTargetProperty);

String dragmetomytarget_Text=dragmetomytarget.getText();
System.out.println("The text of the webelement is :-"+dragmetomytarget_Text);}
	
	public static void main(String[] args) {
		JQuery_GetText jQuery=new JQuery_GetText();
		jQuery.applicationLaunch();
		jQuery.jQuery_getText_DragMeToMyTarget();
		jQuery.applicationClose();
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


