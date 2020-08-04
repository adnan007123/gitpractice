package practivetestng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Parameters({"URL"})
	@Test
public void demo(String urlname) {
	System.out.println("hello");
	System.out.println(urlname);
	}

@Test
public void secondtest(){
	System.out.println("bye");
}
@Test
public void thirdtest(){
	System.out.println("byesecond test");
}
@Test
public void foourth(){
	System.out.println("byethird test");
}
}
