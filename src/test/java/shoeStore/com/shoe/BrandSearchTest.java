package shoeStore.com.shoe;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.BrandSearch;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class BrandSearchTest extends Base {

	
	 {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void search() throws IOException, InterruptedException {
		driver= initilizrDriver();
		driver.get("https://rb-shoe-store.herokuapp.com/");
		SoftAssert softAssertion= new SoftAssert();
		BrandSearch bs = new BrandSearch(driver);
		bs.searchText();
		bs.searchClick();
		String text = bs.textGet();
		Thread.sleep(2000);
		softAssertion.assertEquals("ALDO's Shoes", text);
		softAssertion.assertAll();
		
	}
}
