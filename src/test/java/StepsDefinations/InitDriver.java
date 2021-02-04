package StepsDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import CommonVariable.Variables;

public class InitDriver extends Variables {
	String driverPath = "D:\\Softwares\\selinium\\chromedriver\\chromedriver.exe";
	
	
	public void init() throws Throwable {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();

	}
}
