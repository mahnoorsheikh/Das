package StepsDefinations;

import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonVariable.Variables;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginSD  extends Variables{
	public String baseUrl = "http://192.168.128.154:85/#/auth/login";
	String driverPath = "D:\\Softwares\\selinium\\chromedriver\\chromedriver.exe";
	XSSFSheet sheet;
	XSSFCell userName,userNameXpath;


	@Given("^user enters url for loginin page$")
	public void user_enters_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();
		driver.get(baseUrl);

	}
	@When("^user enters userName for login page$")
	public void user_enters_fisrtName() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(1); 
		userName= sheet.getRow(0).getCell(1);
		userName.setCellType(CellType.STRING);
		userNameXpath=sheet.getRow(0).getCell(4);
		driver.findElement(By.xpath(userNameXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(userNameXpath.getStringCellValue())).sendKeys(userName.getStringCellValue());
		driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']")).click();
	}

	@When("^user enters password for login page$")
	public void user_enters_lastName() throws Throwable {
		Thread.sleep(1000);
        excel();
		sheet= workbook.getSheetAt(1); 
		driver.findElement(By.xpath(sheet.getRow(1).getCell(4).getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(1).getCell(4).getStringCellValue())).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
	}

	@And("^user click signIn button$")
	public void user_click_submit_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']")).click();	

	}
	@And("^user click skip button$")
	public void user_click_skip_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mat-dialog-0']/kt-welcome/div/div/div[1]/div/button")).click();
		Thread.sleep(1000);
	}


	
}