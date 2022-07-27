package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailaddressPage {
	
	public WebDriver driver;
	public EmailaddressPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
By email = By.xpath("//input[@placeholder='Email Address']");
By submit = By.cssSelector("#remind_email_submit");
By text = By.xpath("//div[@class='flash flash_success']");

public WebElement emailId() {
return	driver.findElement(email);
}
public void getSubmit() {
	driver.findElement(submit);
}
public String getText1() {
	String text1= driver.findElement(text).getText();
	return text1;
}

}
