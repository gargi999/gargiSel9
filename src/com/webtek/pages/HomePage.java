package com.webtek.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class HomePage{

	private WebDriver driver;
	
	public HomePage(WebDriver _driver){
		this.driver=_driver;
	}

	public void Register() throws InterruptedException
	{
		   
           driver.findElement(By.className("login")).click();
		   //Thread.sleep(1000);
		   driver.findElement(By.cssSelector("#email_create")).sendKeys("gargi9.mukherjee@gmail.com");
		   driver.findElement(By.cssSelector("#SubmitCreate")).click();
		   while(driver.getTitle().equals("Login-My Store"))
		   {
			   Thread.sleep(1000);
				   }
		 Thread.sleep(2000);
	  
	List<WebElement> radiogender=driver.findElements(By.name("id_gender"));
	radiogender.get(0).click();
			
		   
	driver.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys("Gargi");
	driver.findElement(By.xpath(".//*[@id='customer_lastname']")).sendKeys("Mukherjee");
	//String str=(driver.findElement(By.xpath(".//*[@id='email']")).getText());
	//System.out.println(str);
	driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("abcd999");

	Select dd = new Select(driver.findElement(By.id("days")));	 
	dd.selectByIndex(24);;
	
	Select mm = new Select(driver.findElement(By.id("months")));	 
	mm.selectByIndex(6);
	
	Select yyyy = new Select(driver.findElement(By.id("years")));	 
	yyyy.selectByValue("1984");
	
	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	driver.findElement(By.xpath("//input[@id='optin']")).click();
	//driver.findElement(By.cssSelector("#firstname")).sendKeys("Gargi");
	//driver.findElement(By.cssSelector("#lastname")).sendKeys("Mukherjee");
	driver.findElement(By.cssSelector("#company")).sendKeys("CMC");
	driver.findElement(By.cssSelector("#address1")).sendKeys("17/2 Naskar Para lane");
	driver.findElement(By.cssSelector("#address2")).sendKeys("Shibpur Mandirtala,Howrah");
	driver.findElement(By.cssSelector("#city")).sendKeys("Kolkata");
	
	Select state = new Select(driver.findElement(By.id("id_state")));	 
	state.selectByVisibleText("Georgia");
	
	driver.findElement(By.cssSelector("#postcode")).sendKeys("66676");
	
	Select country = new Select(driver.findElement(By.id("id_country")));	 
	country.selectByVisibleText("United States");
	
	driver.findElement(By.cssSelector("#other")).sendKeys("Delivery before 12/05/2015");
	driver.findElement(By.cssSelector("#phone")).sendKeys("68768768999");
	driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("9051754417");
	driver.findElement(By.cssSelector("#alias")).clear();
	driver.findElement(By.cssSelector("#alias")).sendKeys("HIG PHASE III,Hudco,DURGAPUR-12");
	
	driver.findElement(By.cssSelector("#submitAccount")).click();
	
	
	}

}
