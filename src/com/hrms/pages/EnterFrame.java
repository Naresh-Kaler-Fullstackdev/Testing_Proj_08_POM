//15-April-2022

package com.hrms.pages;

import org.testng.Reporter;
import com.hrms.lib.BaseClass;
import com.hrms.utility.LogClass;

public class EnterFrame extends BaseClass
{
	//Objects
	static String frame_name = "rightMenu";
	//Functions
	public static void enterframe()
	{
		driver.switchTo().frame(frame_name);
		Reporter.log("Entered into frame");
		LogClass.info("Entered into frame");
	}
}
