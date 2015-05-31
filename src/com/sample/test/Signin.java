package com.sample.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Signin {
	public WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException
	{
		   driver = new FirefoxDriver();
		   driver.get("http://automationpractice.com/index.php");
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
		   System.out.println(driver.getTitle());
		   
	}
	
	    
	  @Test  
	/*public void register() throws InterruptedException
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
	
	
	}*/

	  
	  public void AddtoCart() throws InterruptedException{
		  driver.findElement(By.className("login")).click();
		  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("gargi9.mukherjee@gmail.com");
		  driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("abcd999");
		  driver.findElement(By.xpath(".//*[@id='SubmitLogin']")).click();
		  System.out.println("I am in the page");
		  
		  if(!(driver.getTitle().equals("My account-My Store")))
		  {
			  Thread.sleep(500);
		  }
		  
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
	  
		  
	/*@AfterTest
	 public void teardown()
	 {
		  driver.close();
		  driver.quit();
	  }*/
	  


}
