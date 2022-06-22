//15-April-2022

package com.hrms.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.devtools.idealized.log.Log;

public class LogClass
{
	//Initialize log4j logs
	private static Logger lg = Logger.getLogger(Log.class.getName());
	//Need to create these methods so that they can be called
	public static void info(String message)
	{
		lg.info(message);
	}
}
