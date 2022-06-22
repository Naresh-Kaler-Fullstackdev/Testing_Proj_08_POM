//15-April-2022

package com.hrms.pages;

import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class Verifypage extends BaseClass
{
	//Functions
	//Verify Title
	public static void verifyTitle(String title)
	{
		if (driver.getTitle().equals(title))
		{
			Reporter.log("Title matched");
			LogClass.info("Title matched");
		}
		else
		{
			Reporter.log("Title not matched");
			Reporter.log("Actual Title : "+driver.getTitle());
			LogClass.info("Title not matched");
			LogClass.info("Actual Title : "+driver.getTitle());
		}
	}
}
