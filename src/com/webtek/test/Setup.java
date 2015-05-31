package com.webtek.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Setup {

public WebDriver driver;
		
		@BeforeTest
		public void setup()
		{
		driver = new FirefoxDriver();
	    }
		
		    
		 @Test  
		public void openURL() throws InterruptedException{
			 driver.get("http://automationpractice.com/index.php");
			 Thread.sleep(2000);
			 driver.manage().window().maximize();
			 System.out.println(driver.getTitle());
		 }
			
		 
		@AfterTest
		 public void teardown()
		 {
			  driver.close();
			  driver.quit();
		  }
		  


	}
