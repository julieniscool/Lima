package com.symbio.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mytest0 {
	
	@Test
	public void test() throws InterruptedException{
		
		WebDriver driver =  new FirefoxDriver();
		String url = "http://www.amazon.ca";
		driver.get(url);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("xbox one");
		driver.findElement(By.cssSelector(".nav-input")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#result_0 a")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#nav-cart")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#dropdown1_1")).click();
	}
 }