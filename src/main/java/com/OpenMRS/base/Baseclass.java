package com.OpenMRS.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Baseclass {
	public static WebDriver driver;
	protected static void pageNavigate(String Url)
	{
	try {
		driver.navigate().to(Url);
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	}


}
