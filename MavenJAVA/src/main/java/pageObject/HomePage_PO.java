package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PO {
	
	WebDriver driver;
	
	public HomePage_PO(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
	}
	
	


	@FindBy(xpath = "//span[@class='menu-item-txt text-truncate ui-icon-text' and contains(text(),'Live')]")
	WebElement Live;
	
	@FindBy(xpath = "(//a[@class='ng-star-inserted'])[1]")
	WebElement Overview;
	
	
	
	public WebElement clickButton() {
		return Live;
	}
	
	public WebElement overview() {
		return Overview;
	}

}
