//15-April-2022

package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class Logoutpage extends BaseClass 
{
	//Objects
	static By link_text = By.linkText("Logout");
	//Functions
	public static void logout()
	{
		driver.findElement(link_text).click();
		Reporter.log("Logout successful");
		LogClass.info("Logout successful");
	}
}
