//15-April-2022

package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class Loginpage extends BaseClass
{
	//Objects
	static By txt_loginname = By.name("txtUserName");
	static By txt_password = By.name("txtPassword");
	static By btn_login = By.name("Submit");
	//Functions
	public static void login(String un, String pw)
	{
		driver.findElement(txt_loginname).sendKeys(un);
		driver.findElement(txt_password).sendKeys(pw);
		driver.findElement(btn_login).click();
		Reporter.log("Login successful");
		LogClass.info("Login successful");
	}
}
