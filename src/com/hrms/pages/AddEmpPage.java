//15-April-2022

package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class AddEmpPage extends BaseClass
{
	//Objects
	static By btnadd = By.xpath("//input[@Value='Add']");
	static By txt_fn = By.name("txtEmpFirstName");
	static By txt_mn = By.name("txtEmpMiddleName");
	static By txt_ln = By.name("txtEmpLastName");
	static By btn_save = By.id("btnEdit");

	static String fn = "Naresh";
	static String mn = "Kaler";
	static String ln = "Fullstackdev";
	
	//Functions
	public static void addemp()
	{
		driver.findElement(btnadd).click();
		driver.findElement(txt_fn).sendKeys(fn);
		driver.findElement(txt_mn).sendKeys(mn);
		driver.findElement(txt_ln).sendKeys(ln);
		driver.findElement(btn_save).click();
		
		Reporter.log("New employee added successfully");
		LogClass.info("New employee added successfully");
	}
}
