package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver ;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By link = By.xpath("//ul[@class='nav navbar-nav']//li[1]");
	//By textJanuary = By.xpath("//div[@class='title']/h2");
	By textFeb = By.xpath("//ul[@class='nav navbar-nav']/li[2]");
	By textMarch = By.xpath("//ul[@class='nav navbar-nav']/li[3]");
	By textApr = By.xpath("//ul[@class='nav navbar-nav']/li[4]");
	By textMAy = By.xpath("//ul[@class='nav navbar-nav']/li[5]");
	By textDec = By.xpath("//ul[@class='nav navbar-nav']/li[12]");
	By hDec    = By.xpath("//div[@class ='title']/h2");
	By hJan =   By.xpath("//div[@class ='title']");
	By hFeb =   By.xpath("//div[@class ='title']");
	By hMar =   By.xpath("//div[@class ='title']");
	By hApr =   By.xpath("//div[@class ='title']");
	
	
	
	public void  getJanclick() {
		driver.findElement(link).click();
		}
	public String getJanText() {
			String janText=driver.findElement(hJan).getText();
			return janText;
		}
		
		
public void  gefebclick() {
	driver.findElement(textFeb).click();
	}public String getFebText() {
		String febText=driver.findElement(hFeb).getText();
		return febText;
	}
	
	
	public void  gemarclick() {
		driver.findElement(textMarch).click();
		}public String getMarchText() {
			String marText=driver.findElement(hMar).getText();
			return marText;
		}
		
		
		
		public void  getAprclick() {
			driver.findElement(textMarch).click();
			}
		public String getAprText() {
				String aprText=driver.findElement(hApr).getText();
				return aprText;
			}
/*public String  getTextMay() {
	driver.findElement(textMAy).click();
	 String text= driver.findElement(textMAy).getText();
	 return text;
}
public void getClick() {
	driver.findElement(textDec).click();
	 
}*/
public void  getDecclick() {
driver.findElement(textDec).click();

}public String getDecText() {
	String dectext=driver.findElement(hDec).getText();
	return dectext;
}



}
