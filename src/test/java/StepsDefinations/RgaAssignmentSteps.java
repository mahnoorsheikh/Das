package StepsDefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RgaAssignmentSteps {
	
	public WebDriver driver; 
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell menu,assgihmentclick,selectAssignment,selectAssignmentdrop,selectvaluesassign,selectGrant,selectvaluesGrant,assignclick;
	File src=new File("D:\\automation testing\\TestData.xlsx");
	
	@Given("^User navigates to assignment$")
	public void user_navigates_to_assignment() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(1); 
		menu= sheet.getRow(0).getCell(2);
		assgihmentclick= sheet.getRow(1).getCell(2);
		selectAssignment= sheet.getRow(2).getCell(2);
		selectAssignmentdrop= sheet.getRow(3).getCell(2);
		selectvaluesassign= sheet.getRow(4).getCell(2);
		selectGrant= sheet.getRow(5).getCell(2);
		selectvaluesGrant= sheet.getRow(6).getCell(2);
		assignclick= sheet.getRow(7).getCell(2);
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(menu.getStringCellValue()));
		action.moveToElement(we).build().perform();
		Thread.sleep(3000);
		WebElement assgn =	driver.findElement(By.xpath(assgihmentclick.getStringCellValue()));
		assgn.click();		
		Thread.sleep(5000);
		WebElement selectAssignment1 = driver.findElement(By.xpath(selectAssignment.getStringCellValue()));
		selectAssignment1.click();
//		Thread.sleep(3000);
//		WebElement selectAssignmentdrop = driver.findElement(By.xpath("//*[@id='mat-select-2']/div/div[2]/div"));
//		selectAssignmentdrop.click();		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Batch 2019-2020 ')]")).click();
//		Thread.sleep(3000);
//		WebElement selectGrant = driver.findElement(By.xpath("//*[@id='mat-select-3']/div/div[2]"));
//		selectGrant.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[contains(text(),'Grand Challenge Fund (GCF) ')]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[contains(text(),'Assign')]")).click();
//		

	}
//
//	@When("^user select panel and panel member$")
//	public void user_select_panel_and_panel_member() throws Throwable {
//
//	}
//
//	@When("^user click assign button$")
//	public void user_click_assign_button() throws Throwable {
//
//	}


}
