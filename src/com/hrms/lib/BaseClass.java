//15-April-2022

package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import com.hrms.utility.LogClass;

public class BaseClass 
{
	//driver
	public static WebDriver driver;
	//openApp
	public static void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Naresh_Dell Laptop\\Projects\\Project_14_Full Stack Java Developer\\Naresh IT\\Notes\\08_Testing\\Drivers\\chromedriver_win32_102\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Browser opened");
		LogClass.info("Browser opened");
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application opened");
		LogClass.info("Application opened");
	}
	//closeApp
	public static void closeApplication()
	{
		driver.close();
		Reporter.log("Application closed");
		LogClass.info("Browser closed");
	}
}
