package shoeStore.com.shoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.HomePage;

public class HomePageTest extends Base {
	
	public HomePage hp;
	SoftAssert softAssertion;
	public WebDriver driver;
	
	@BeforeMethod
	public void driverInitilize() throws IOException {
		driver=initilizrDriver();
		driver.get(prop.getProperty("url"));
		 softAssertion= new SoftAssert();
	}
	@Test(priority =1)
	public void janResult() throws IOException {
		
		hp= new HomePage(driver);
		hp.getJanclick();
	String actual=hp.getJanText();
	System.out.print(actual);
	String expected ="January's Shoes";
	softAssertion.assertEquals(actual, expected);
	softAssertion.assertAll();
		}
	@Test(priority =2)
	public void febResult () {

		hp= new HomePage(driver);
		hp.gefebclick();
	String actual=hp.getFebText();
	System.out.print(actual);
	String expected ="February's Shoes";
	softAssertion.assertEquals(actual, expected);
	softAssertion.assertAll();		
	}	
	@Test(priority =3)
	public void marchresult () {
		hp= new HomePage(driver);
		hp.gemarclick();
	String actual=hp.getMarchText();
	System.out.print(actual);
	String expected ="March's Shoes";
	softAssertion.assertEquals(actual, expected);
	softAssertion.assertAll();		
		
	}	
	
	@Test(priority =4)
	public void Aprresult () {
		hp= new HomePage(driver);
		hp.getAprclick();
			String actualApr =hp.getAprText();
		String ExpectedApr = "April's Shoes"; //Validating text after clicking March link 
		softAssertion.assertEquals(actualApr,ExpectedApr);
		System.out.println("Apr is shoiwng ");
		softAssertion.assertAll();
		
	}	
	
	/*//@Test(priority =5)
	public void mayResult () {
		hp= new HomePage(driver);
		hp.gemarclick();;
	//String actual=hp.get;
	System.out.print(actual);
	String expected ="February's Shoes";
	softAssertion.assertEquals(actual, expected);
	softAssertion.assertAll();		
		
	}	*/
	@Test(priority =6)
	public void DecResult () {
		
		hp= new HomePage(driver);
		hp.getDecclick();
	String actual=hp.getDecText();
	System.out.print(actual);
	String expected ="December's Shoes";
	softAssertion.assertEquals(actual, expected);
	softAssertion.assertAll();
		
	}	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		
		
	}

}
