//15-April-2022

package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class ExitFrame extends BaseClass
{
	//Objects
	//Functions
	public static void  exitframe()
	{
		driver.switchTo().defaultContent();
		Reporter.log("Exited from frame");
		LogClass.info("Exited from frame");
	}
}
