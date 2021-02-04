package StepsDefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonVariable.DasElemets;
import CommonVariable.Variables;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Das extends Variables{
	public WebDriver driver; 
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell dasXpath,circleXpath;
	File src=new File("D:\\automation testing\\DegreeAttestData.xlsx");
	
	
//	@Given("^user click das$")
//	public void user_click_das() throws Throwable {
//	Thread.sleep(6000);
//	FileInputStream fis = new FileInputStream(src);
//	workbook = new XSSFWorkbook(fis); 
//	sheet= workbook.getSheetAt(2); 
//	dasXpath= sheet.getRow(0).getCell(3);
//    driver.findElement(By.xpath(dasXpath.getStringCellValue())).click();
//
//	}
//	@When("^user click circle button in instruction$")
//	public void user_click_circle_button_in_instruction() throws Throwable {
//		Thread.sleep(3000);
//		FileInputStream fis = new FileInputStream(src);
//		workbook = new XSSFWorkbook(fis); 
//		sheet= workbook.getSheetAt(2); 
//		dasXpath= sheet.getRow(1).getCell(3);		
//		driver.findElement(By.xpath(dasXpath.getStringCellValue())).click();
//
//	}
//	@When("^user click procced button in instruction$")
//	public void user_click_procced_button_in_instruction() throws Throwable {
//		Thread.sleep(3000);
//		FileInputStream fis = new FileInputStream(src);
//		workbook = new XSSFWorkbook(fis); 
//		sheet= workbook.getSheetAt(2); 
//		circleXpath= sheet.getRow(1).getCell(3);		
//		driver.findElement(By.xpath(circleXpath.getStringCellValue())).click();
//
//	}

}
