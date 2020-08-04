package practivetestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day5 {
	WebDriver driver;
	
	
	@BeforeTest
	@Parameters({"key"})
	public void firsttest(String key)
	{
		System.out.println(key);
		//System.out.println(val);
	}
	
	
	@BeforeTest
	@Parameters({"val"})
	public void sectest(String value)
	{
		
		System.out.println(value);
		System.out.println("rahman");
	}
	
	@BeforeTest
	@Parameters({"url"})
	public void urlf(String url1)
	{
		System.out.println(url1);
		
	
	}
	
	@Test
	@Parameters({"url","key","val"})
		public void init(String url, String key, String val) {
		
		System.setProperty(key, val);
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
	
		
	}
	
	

		
	}
	


