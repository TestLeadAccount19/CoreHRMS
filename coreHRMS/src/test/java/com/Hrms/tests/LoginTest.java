package com.Hrms.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	WebElement findElement(By by)
	{
		WebElement element=null;
		
		try {
			
			 element = driver.findElement(By.xpath("//h1[text()='Welcome to Hanumanth']"));
		
		}catch(Exception e)
		{
		  System.out.println(e.getMessage());	
		}
		return element;
	}
	@Test
	void testOne()
	{
		 driver =new FirefoxDriver();
		driver.get("file:///C:/Hanumanth%20docs/Browser%20Elements/text%20element.html");
		
		WebElement text_element = findElement(By.xpath("//h1[text()='Welcome to Hanumanth']"));
	
	   if(text_element.isDisplayed())
	   {
		 String text =  text_element.getText(); //
		 
		 System.out.println(text);
		 
		 Assert.assertEquals(text, "Welcome to Hanumanth");
	   }else
	   {
		   System.out.println("Unable locate the Welcome to Hanumanth text ");
	   }
	
	}
	
}
