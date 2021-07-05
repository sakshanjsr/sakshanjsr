package automationMaven.MavenJAVA;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage_PO;
import resource.base;

public class HomePage extends base {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();    //driver
		driver.manage().window().maximize();
		driver.get("https://sports.dc.betmgm.com/en/sports");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
	}

	@Test
	public void Live() {
		HomePage_PO homePage = new HomePage_PO(driver);
		WebElement dragElm = driver.findElement(By.xpath("//span[@class='slider-handle']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(dragElm, 20, 0).perform();
		//homePage.clickButton().click();
	
		
	}

	@Test(enabled = false)
	public void Overview() throws IOException {
		HomePage_PO homePage = new HomePage_PO(driver);
		String text = homePage.overview().getText();
		Assert.assertEquals(text, "Overvieww");
	}

	@AfterTest(enabled = false)
	public void close() {
		driver.close();
	}
	
}






