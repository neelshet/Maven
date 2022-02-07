package com.main;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;



@Listeners(com.main.MyListeners.class)
public class FirstClassInMaven {
	@Test
	public void testMethod1(){
		System.out.println("This is Method-1");
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//System.setProperty("WebDriver.chrome.ChromeDriver", "/SeleniumWebdriverTraining/Drivers/chromedriver");
		
		/*System.out.println(System.getProperty("env.Browser"));
	if(System.getProperty("env.Browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}
	else if (System.getProperty("env.BROWSER").equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
	}	
	driver.quit();*/
	}
	@Test
	public void testMethod2(){
		System.out.println("This is failure Method-2");
		Assert.fail();
		
	}
	@Test(dependsOnMethods="testMethod2")
	public void testMethod3(){
		System.out.println("This is a skipped Method-3");
	}
}


