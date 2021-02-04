package StepsDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonVariable.DasElemets;
import CommonVariable.Variables;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DasSD extends Variables{

	XSSFSheet sheet;
	XSSFCell dasXpath,circleXpath;
	
	@Given("^user click das$")
	public void user_click_das() throws Throwable {
		Thread.sleep(6000);
	    excel();
		sheet= workbook.getSheetAt(2); 
		driver.findElement(By.xpath(sheet.getRow(0).getCell(3).getStringCellValue())).click();


	}
	@When("^user click circle button in instruction$")
	public void user_click_circle_button_in_instruction() throws Throwable {
		Thread.sleep(8000);
		excel();
		sheet= workbook.getSheetAt(2); 	
		WebElement element = driver.findElement(By.xpath(sheet.getRow(1).getCell(3).getStringCellValue()));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();

	}
	@When("^user click procced button in instruction$")
	public void user_click_procced_button_in_instruction() throws Throwable {
		Thread.sleep(4000);
		excel();
		sheet= workbook.getSheetAt(2); 		
		WebElement proceed=	driver.findElement(By.xpath(sheet.getRow(2).getCell(3).getStringCellValue()));
		proceed.click();
	}
	@When("^user select title$")
	public void user_select_title() throws Throwable {
		Thread.sleep(4000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement titleArrow1=	driver.findElement(By.xpath(sheet.getRow(3).getCell(3).getStringCellValue()));
		titleArrow1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(4).getCell(3).getStringCellValue())).sendKeys("Dr.");
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(5).getCell(3).getStringCellValue())).click();

	}
	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement firstName=driver.findElement(By.xpath(sheet.getRow(6).getCell(3).getStringCellValue()));
		firstName.clear();
		Thread.sleep(1000);
		firstName.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());

	}
	@When("^user enter midlename$")
	public void user_enter_midlename() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement midleName=driver.findElement(By.xpath(sheet.getRow(7).getCell(3).getStringCellValue()));
		midleName.clear();
		Thread.sleep(1000);
		midleName.sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());

	}
	@When("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement lastName=driver.findElement(By.xpath(sheet.getRow(8).getCell(3).getStringCellValue()));
		lastName.clear();
		Thread.sleep(1000);
		lastName.sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());

	}
	@When("^user select marital status$")
	public void user_select_marital_status() throws Throwable {
		Thread.sleep(1000);
		excel(); 
		sheet= workbook.getSheetAt(2); 	
		WebElement status1=	driver.findElement(By.xpath(sheet.getRow(9).getCell(3).getStringCellValue()));
		status1.click();
	}
	@When("^user select gender$")
	public void user_select_gender() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 		
		WebElement gen=	driver.findElement(By.xpath(sheet.getRow(10).getCell(3).getStringCellValue()));
		gen.click();
		
	}
	@When("^user select date$")
	public void user_select_date() throws Throwable {
		Thread.sleep(1000);	
		WebElement dat=	driver.findElement(By.xpath("//*[@id='mat-input-15']"));
		dat.clear();
		dat.sendKeys("2/3/1997");
	}
	@When("^user enter father$")
	public void user_enter_father() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement father=driver.findElement(By.xpath(sheet.getRow(11).getCell(3).getStringCellValue()));
		father.clear();
		Thread.sleep(1000);
		father.sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());

	}
	@When("^user enter mailing address$")
	public void user_mailing_address() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement adress=driver.findElement(By.xpath(sheet.getRow(12).getCell(3).getStringCellValue()));
		adress.clear();
		Thread.sleep(2000);
		adress.sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());

	}
	@When("^user select country$")
	public void user_select_country() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement countryArrow=	driver.findElement(By.xpath(sheet.getRow(13).getCell(3).getStringCellValue()));
		countryArrow.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(14).getCell(3).getStringCellValue())).sendKeys("Pakistan");
		Thread.sleep(1000);
		List<WebElement> lstDrp = driver.findElements(By.xpath(sheet.getRow(15).getCell(3).getStringCellValue()));
		lstDrp.get(1).click();
	}
	@When("^user select city$")
	public void user_select_city() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement countryArrow=	driver.findElement(By.xpath(sheet.getRow(16).getCell(3).getStringCellValue()));
		countryArrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(17).getCell(3).getStringCellValue())).sendKeys("Karachi");
		Thread.sleep(1000);
		List<WebElement> lstDrp1 = driver.findElements(By.xpath(sheet.getRow(18).getCell(3).getStringCellValue()));
		lstDrp1.get(1).click();
	}
	@When("^user select district$")
	public void user_select_district() throws Throwable {
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement countryArrow=	driver.findElement(By.xpath(sheet.getRow(19).getCell(3).getStringCellValue()));
		countryArrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(20).getCell(3).getStringCellValue())).sendKeys("Karachi East");
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(21).getCell(3).getStringCellValue())).click();
	}
	@When("^user select postalcode$")
	public void user_select_postalcode() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement countryArrow=	driver.findElement(By.xpath(sheet.getRow(22).getCell(3).getStringCellValue()));
		countryArrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(23).getCell(3).getStringCellValue())).sendKeys("66040");
		Thread.sleep(1000);
		List<WebElement> postal = driver.findElements(By.xpath(sheet.getRow(24).getCell(3).getStringCellValue()));
		postal.get(1).click();
	}
	@When("^user click next button$")
	public void  user_click_next_button() throws Throwable {
		Thread.sleep(5000);
		excel();
		sheet= workbook.getSheetAt(2); 
		driver.findElement(By.xpath(sheet.getRow(25).getCell(3).getStringCellValue())).click();
	}

}
