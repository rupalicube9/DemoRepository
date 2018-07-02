package org.cc.listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners(org.cc.listeners.ListenersDemoExample.class)
public class FirstTestCase {

	WebDriver driver;
	//@Parameters({"url"})
	@Test
	@Parameters({"url"})
	public void loginFB(String url){
	       
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY\\Desktop\\Selenium\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get(url);
	        System.out.println(driver.getTitle());
	        //driver.manage().window().maximize();
	        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin@easybacchus.com");
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin@123");
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	    }
	
}
