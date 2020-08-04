package testng;



	import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class day41 {
@Parameters({"URL"})
		@Test

		public void webloginhomeloan(String urlname) {
			System.out.println("webloginhome");
			System.out.println(urlname);

			}

		@Test(dependsOnMethods = { "webloginhomeloan"})
		public void mobileloginhomeloan(){
			System.out.println("mobileloginhome");
		}

		
		@Test(groups = {"smoke"})
		public void loginapihomeloan(){
			System.out.println("apiloginhome");
		}
		}




