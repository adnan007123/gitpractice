package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day21 {

	@Test(groups = {"smoke"})

	public void ploan() {
		System.out.println("good");

		}
	
	@Parameters({"URL"})
	@BeforeTest
	public void prequiste(String abc) {
		System.out.println("execute first i will");
		System.out.println(abc);
	}
	
	
	}


