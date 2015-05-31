package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
private WebDriver driver;
	
	public SignInPage(WebDriver _driver){
		this.driver=_driver;
	}
	
	public void LoginToMyAccount() throws InterruptedException{
		  driver.findElement(By.className("login")).click();
		  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("gargi9.mukherjee@gmail.com");
		  driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("abcd999");
		  driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		  System.out.println("Successful Login to my Account");
		  
		  if(!(driver.getTitle().equals("My account-My Store")))
		  {
			  Thread.sleep(500);
		  }

}
	
}
