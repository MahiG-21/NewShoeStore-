
package shoeStore.com.shoe;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageFactory.EmailaddressPage;


public class EmailAddress extends Base {
	 
	@Test
	
	public void emailText() throws IOException {
	driver = initilizrDriver();
	SoftAssert softAssertion= new SoftAssert();

	EmailaddressPage emp= new EmailaddressPage(driver);
	 emp.emailId().sendKeys("abc.gmail.com");
	emp.getSubmit();
	String textValidate=emp.getText1();
	String text2="Thanks! We will notify you of our new shoes at this email: abc@gamil.com";
	softAssertion.assertEquals(textValidate, text2);
	}
	 
	
}
