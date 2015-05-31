package com.webtek.test;

import com.webtek.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddProductToCart extends Setup{
	
	public void AddtoCart() throws InterruptedException{
		
		HomePage hp=new HomePage(driver);
		hp.Register();
		
		SignInPage sp=new SignInPage(driver);
		sp.LoginToMyAccount();
			
	 /*Selecting a product category*/
	  
    System.out.println("I am clicking on T-shirts ");
	  driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a")).click();
	  Thread.sleep(1000);
	  
	  /*Sorting products based on a sorting criteria*/
	  Select sort=new Select(driver.findElement(By.id("selectProductSort")));
	  sort.selectByValue("quantity:desc");
	  
	  /*Add an item to shopping cart*/
	  Actions hover=new Actions(driver);
	  hover.moveToElement(driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]"))).build().perform();
	  Thread.sleep(1000);
	  WebElement addcart=driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span"));
	 addcart.click();
	 
	 /*Proceed to checkout*/
	 Thread.sleep(10000);
	 Actions hover1=new Actions(driver);
	 hover1.moveToElement(driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]"))).build().perform();
	 WebElement chkout=driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
	 chkout.click();
	  if(!(driver.getTitle().contains("Order")))
	  {
		  Thread.sleep(500);
	  }
	 
	driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
	WebElement chkaddress=driver.findElement(By.xpath(".//*[@id='addressesAreEquals']"));
	if (!chkaddress.isSelected()){
		chkaddress.click();
	}
	 driver.findElement(By.xpath(".//*[@id='ordermsg']/textarea")).sendKeys("hAPPY bIRTHDAY GIFT");
	 driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button")).click();
	 Thread.sleep(10000);
	 driver.findElement(By.xpath(".//*[@id='cgv']")).click();
	 driver.findElement(By.xpath(".//*[@id='form']/p/button")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
	 String orderprice=driver.findElement(By.xpath(".//*[@id='center_column']/form/div/p[2]")).getText();
	 System.out.println(orderprice);
	 driver.findElement(By.xpath(".//*[@id='cart_navigation']/button")).click();
	 String ordersummary=driver.findElement(By.xpath(".//*[@id='center_column']/div")).getText();
	 System.out.println(ordersummary);
	 
	 driver.findElement(By.className("logout")).click();
	 
	 
}

}
