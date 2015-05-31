package com.sample.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample {

	
WebDriver d = new FirefoxDriver();
String appURL = "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1";
String userid="gargi9.sinha@gmail.com";
String password="intelligent9";
String var;

	@Test
	public void OpenGmail() throws InterruptedException {
		d.get(appURL);
		d.manage().window().maximize();
		Thread.sleep(1000);
		String title = d.getTitle();
		String exptitle = "Gmail";//"Sign in - Google Accounts";
		System.out.println("actual title is "+title); 
		if (exptitle.equals(title)) {
			System.out.println("Success");
			Compose(userid,password);
		} 
		else {
			System.out.println("Failure");
		}
		//d.quit();
	}


public void Compose(String uid,String pwd) throws InterruptedException
{
//d.findElement(By.id("gmail-sign-in")).click();
//Thread.sleep(10000);
d.findElement(By.id("Email")).clear();
d.findElement(By.id("Email")).sendKeys(uid);
d.findElement(By.id("Passwd")).clear();
d.findElement(By.id("Passwd")).sendKeys(pwd);
d.findElement(By.id("signIn")).click();
Thread.sleep(20000);
//System.out.println(d.getTitle());
if (d.getTitle().contains("Inbox"))
{
d.findElement(By.xpath(".//*[@id=':ak']/div/div")).click();
d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//d.manage().window().maximize();
System.out.println(d.getTitle());
d.findElement(By.xpath("//textarea[contains(@aria-label,'To')]")).sendKeys("avijit.sez@gmail.com");
d.findElement(By.xpath("//input[contains(@name,'subject')]")).sendKeys("welcome");
d.findElement(By.xpath("//div[contains(@class,'Am Al editable')]")).sendKeys("hey");
d.findElement(By.xpath("//div[contains(@aria-label,'Ctrl-Enter')]")).click();

//System.out.println(var);
//d.findElement(By.xpath(".//*[@id=':fx']")).sendKeys("avijit.sez@gmail.com");
//d.findElement(By.xpath(".//*[@id=':fi']")).sendKeys("hate you");
//d.findElement(By.xpath(".//*[@id=':gk']")).sendKeys("hate you 1234");
}

}

}
