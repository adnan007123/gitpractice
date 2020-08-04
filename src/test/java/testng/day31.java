package testng;

import org.testng.annotations.Test;

public class day31 {

	@Test

	public void weblogincarloan() {
		System.out.println("weblogincar");

		}


	@Test(groups = {"smoke"})
	public void mobilelogincarloan(){
		System.out.println("mobilelogincar");
	}

	@Test
	public void mobileloginsignin(){
		System.out.println("mobilelogincarsign");
	}	
	@Test
	public void mobileloginsgnout(){
		System.out.println("mobilelogincarout");
	}
	@Test
	public void loginapicarloan(){
		System.out.println("apilogincar");
	}
	}


