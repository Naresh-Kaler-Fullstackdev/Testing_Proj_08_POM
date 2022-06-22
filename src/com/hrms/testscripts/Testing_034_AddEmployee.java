//15-April-2022

package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.BaseClass;
import com.hrms.pages.AddEmpPage;
import com.hrms.pages.EnterFrame;
import com.hrms.pages.ExitFrame;
import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.pages.Verifypage;

public class Testing_034_AddEmployee
{
	@Test
	public static void addemp()
	{
		//Test steps
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		Loginpage.login("nareshit", "nareshit");
		EnterFrame.enterframe();
		Verifypage.verifyTitle("Add Employee");
		AddEmpPage.addemp();
		ExitFrame.exitframe();
		Logoutpage.logout();
		BaseClass.closeApplication();
	}
}
