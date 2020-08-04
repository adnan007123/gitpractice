package practivetestng;



	import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class day4 {
		@Test(dataProvider="getdata")
		
		
		public void webloginhomeloan(String username,String password) {
			System.out.println("webloginhome");
	System.out.println(username);
	System.out.println(password);
			}


@Test(groups = {"smoke"})
		public void mobileloginhomeloan(){
			System.out.println("mobileloginhome");
		}

		
		@Test
		public void loginapihomeloan(){
			System.out.println("apiloginhome");
		}
		
		
@DataProvider
public Object[][] getdata()
{
	Object[][] data= new Object[3][2];
	data[0][0] = "firstusername";
	data[0][1] = "firstpassword";
	data[1][0] = "secondusername";
	data[1][1] = "secondpassword";
	data[2][0] = "thirdusername";
	data[2][1] = "thirdpassword";
	return data;
}
		
		
		}




