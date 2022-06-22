//15-April-2022

package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class EditEmpPage extends BaseClass
{
	//Objects
	static By searchoption = By.name("loc_code");
	static String searchoptionvalue = "2";
	static By searchname = By.name("loc_name");
	static String ln = "Fullstackdev";
	static By searchbtn = By.xpath("//input[@value='Search']");
	static By currentfullname = By.linkText("Naresh Kaler Fullstackdev");
	static By btn_edit = By.id("btnEditPers");
	static By txt_ln = By.name("txtEmpLastName");
	static String nln = "Fullstackjavadev";
	static By btn_edit_save = By.name("EditMain");
	
	//Functions
	public static void editemp()
	{
		Select st = new Select (driver.findElement(searchoption));
		st.selectByValue(searchoptionvalue);
		driver.findElement(searchname).sendKeys(ln);
		driver.findElement(searchbtn).click();
		driver.findElement(currentfullname).click();
		driver.findElement(btn_edit).click();
		driver.findElement(txt_ln).clear();
		driver.findElement(txt_ln).sendKeys(nln);
		driver.findElement(btn_edit_save).click();
		Reporter.log("Edited employee successfully");
		LogClass.info("Edited employee successfully");
	}
}
