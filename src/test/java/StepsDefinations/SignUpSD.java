package StepsDefinations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SignUpSD {
	public String baseUrl = "http://192.168.128.154:85/#/auth/register";
	String driverPath = "D:\\Softwares\\selinium\\chromedriver\\chromedriver.exe";
	public WebDriver driver; 
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell fisrtName,firstNameXpath,lastName,lastNameXpath,nationArrow,nation,cnic,cnicXpath,pass,pasXpath,confpas,confpasxpath,cell,cellXpath,email,emailXpath,submitXpath;
	File src=new File("D:\\automation testing\\DegreeAttestData.xlsx");



	@Given("^user enters url$")
	public void user_enters_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();
		driver.get(baseUrl);

	}
	@When("^user enters fisrtName$")
	public void user_enters_fisrtName() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		fisrtName= sheet.getRow(0).getCell(1);
		firstNameXpath=sheet.getRow(0).getCell(3);
		driver.findElement(By.xpath(firstNameXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(firstNameXpath.getStringCellValue())).sendKeys(fisrtName.getStringCellValue());
	}

	@When("^user enters lastName$")
	public void user_enters_lastName() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		lastName= sheet.getRow(1).getCell(1);
		lastNameXpath=sheet.getRow(1).getCell(3);
		driver.findElement(By.xpath(lastNameXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(lastNameXpath.getStringCellValue())).sendKeys(lastName.getStringCellValue());
	}

	@When("^user select nationality$")
	public void user_select_nationality() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		nationArrow= sheet.getRow(2).getCell(3);
		nation=sheet.getRow(3).getCell(3);
		driver.findElement(By.xpath(nationArrow.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(nation.getStringCellValue())).click();;
	}

	@When("^user enters cnic$")
	public void user_enters_cnic() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		cnic= sheet.getRow(4).getCell(1);
		cnic.setCellType(CellType.STRING);
		cnicXpath=sheet.getRow(4).getCell(3);
		driver.findElement(By.xpath(cnicXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(cnicXpath.getStringCellValue())).sendKeys(cnic.getStringCellValue());

	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		pass= sheet.getRow(5).getCell(1);
		pasXpath=sheet.getRow(5).getCell(3);
		driver.findElement(By.xpath(pasXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pasXpath.getStringCellValue())).sendKeys(pass.getStringCellValue());

	}

	@When("^user enters confirm password$")
	public void user_enters_confirm_password() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		confpas= sheet.getRow(6).getCell(1);
		confpasxpath=sheet.getRow(6).getCell(3);
		driver.findElement(By.xpath(confpasxpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(confpasxpath.getStringCellValue())).sendKeys(confpas.getStringCellValue());

	}


	@When("^user enters mobile number$")
	public void user_enters_mobile_number() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		cell= sheet.getRow(7).getCell(1);
		cell.setCellType(CellType.STRING);
		cellXpath=sheet.getRow(7).getCell(3);
		driver.findElement(By.xpath(cellXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(cellXpath.getStringCellValue())).sendKeys(cell.getStringCellValue());

	}

	@When("^user enters email$")
	public void user_enters_email() throws Throwable {
		Thread.sleep(3000);
		FileInputStream fis = new FileInputStream(src);
		workbook = new XSSFWorkbook(fis); 
		sheet= workbook.getSheetAt(0); 
		email= sheet.getRow(8).getCell(1);
		emailXpath=sheet.getRow(8).getCell(3);
		driver.findElement(By.xpath(emailXpath.getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(emailXpath.getStringCellValue())).sendKeys(email.getStringCellValue());

	}

	@And("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']")).click();


	}


}
