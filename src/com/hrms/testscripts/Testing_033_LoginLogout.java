//15-April-2022

package com.hrms.testscripts;

import org.testng.annotations.Test;
import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.pages.Verifypage;
import com.hrms.lib.BaseClass;
import org.apache.log4j.xml.DOMConfigurator;

public class Testing_033_LoginLogout 
{
	@Test
	public static void loginout()
	{
		//Test steps
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		Verifypage.verifyTitle("HRMS");
		Loginpage.login("nareshit", "nareshit");
		Verifypage.verifyTitle("OrangeHRM");
		Logoutpage.logout();
		BaseClass.closeApplication();
	}
}
