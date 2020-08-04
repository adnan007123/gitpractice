package com.seleniumproject.Testcases;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.seleniumproject.Testbase.testbase;

public class testcase1 extends testbase {

	 @BeforeClass
	  public void beforeTest() {
		 
		 
		 System.setProperty(key,path);
		driver = new ChromeDriver();
		 
	  }
	
	 @Test
	 public void setup() {
		 driver.get("url"); 
		 driver.getTitle();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	 
	 @AfterClass
	 
	 public void aftertest()
	 {
		 driver.close();
	 }
}
