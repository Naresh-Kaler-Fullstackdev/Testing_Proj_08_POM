//15-April-2022

package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class DelEmpPage extends BaseClass
{
	//Objects
	static By searchoption = By.name("loc_code");
	static String searchoptionvalue = "2";
	static By searchname = By.name("loc_name");
	static String ln = "Fullstackjavadev";
	static By searchbtn = By.xpath("//input[@value='Search']");
	static By selectbtn = By.name("chkLocID[]");
	static By btn_del = By.xpath("//input[@value='Delete']");
	
	//Functions
	public static void delemp()
	{
		Select st = new Select (driver.findElement(searchoption));
		st.selectByValue(searchoptionvalue);
		driver.findElement(searchname).sendKeys(ln);
		driver.findElement(searchbtn).click();
		driver.findElement(selectbtn).click();
		driver.findElement(btn_del).click();
		Reporter.log("Deleted employee successfully");
		LogClass.info("Deleted employee successfully");
	}
}
