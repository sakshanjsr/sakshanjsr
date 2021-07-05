package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public WebDriver driver;
	public Properties obj;


	public WebDriver initializeDriver() throws IOException {

		
		obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\global.properties");
		obj.load(objfile);

		
		
		String browserName = obj.getProperty("browser");
		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		
		
		//Implicite Wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		return driver;
		
		
	}

}


