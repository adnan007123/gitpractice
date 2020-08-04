package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day11 {
// if 100 testcase defined out 0f 100 there are 30 mobile testcases
	@Parameters({"URL"})
	@Test

public void demo(String rname) {
	System.out.println("hello");
	System.out.println( rname);
	}


@Test(dependsOnMethods = { "demo"})
public void secondtest(){
	System.out.println("bye");
}

}
