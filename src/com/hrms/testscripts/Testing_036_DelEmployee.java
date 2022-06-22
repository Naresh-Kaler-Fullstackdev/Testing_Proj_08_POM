//15-April-2022

package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.BaseClass;
import com.hrms.pages.DelEmpPage;
import com.hrms.pages.EnterFrame;
import com.hrms.pages.ExitFrame;
import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.pages.Verifypage;

public class Testing_036_DelEmployee extends BaseClass 
{
	@Test
	public static void delemp()
	{
		//Test steps
		DOMConfigurator.configure("log4j.xml");
		BaseClass.openApplication();
		Loginpage.login("nareshit", "nareshit");
		EnterFrame.enterframe();
		Verifypage.verifyTitle("Delete Employee");
		DelEmpPage.delemp();
		ExitFrame.exitframe();
		Logoutpage.logout();
		BaseClass.closeApplication();
	}
}
