package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrandSearch {
	public WebDriver driver;
	
	By id = By.id("brand");
	By text = By.id("search_button");
	By textValidate =By.xpath("//div[@class='title']");

	public BrandSearch(WebDriver driver){
		this.driver=driver;
	}
	public void searchText() {
		Select select  = new Select (driver.findElement(id));
		select.selectByVisibleText("ALDO");
		
	}
	public void searchClick() {
		driver.findElement(text).click();
	}
	public String  textGet() {
		 String shoeText = driver.findElement(textValidate).getText();
		return shoeText;
	}
}
