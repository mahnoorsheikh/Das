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
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;


public class DasNegativeCases  extends Variables{
	public String baseUrl = "http://192.168.128.154:85/#/auth/login";
	String driverPath = "D:\\Softwares\\selinium\\chromedriver\\chromedriver.exe";
	//	public WebDriver driver; 
	//	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell userName,userNameXpath;


	@Given("^user click url$")
	public void user_click_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();
		driver.get(baseUrl);

	}
	@When("^user enter user name$")
	public void user_enter_user_name() throws Throwable {
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

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(1); 
		driver.findElement(By.xpath(sheet.getRow(1).getCell(4).getStringCellValue())).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(1).getCell(4).getStringCellValue())).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
	}

	@And("^user click login button$")
	public void user_click_login_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='kt_login_signin_submit']")).click();	

	}
	@And("^user select skip button$")
	public void user_select_skip_button() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mat-dialog-0']/kt-welcome/div/div/div[1]/div/button")).click();
		Thread.sleep(1000);
	}
	// Das feature

	@Given("^user click das option$")
	public void user_click_das_option() throws Throwable {
		Thread.sleep(3000);
		excel();
		sheet= workbook.getSheetAt(2); 
		driver.findElement(By.xpath(sheet.getRow(0).getCell(3).getStringCellValue())).click();


	}
	@When("^user click button in instruction$")
	public void user_click_button_in_instruction() throws Throwable {
		Thread.sleep(8000);
		excel();
		sheet= workbook.getSheetAt(2); 	
		WebElement element = driver.findElement(By.xpath(sheet.getRow(1).getCell(3).getStringCellValue()));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();

	}
	@When("^user click procced button$")
	public void user_click_procced_button() throws Throwable {
		Thread.sleep(6000);
		excel();
		sheet= workbook.getSheetAt(2); 		
		WebElement proceed=	driver.findElement(By.xpath(sheet.getRow(2).getCell(3).getStringCellValue()));
		proceed.click();
	}

	// Personal Details 

	@When("^clear data from firstname for validate$")
	public void clear_data_from_firstname_for_validate() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement firstName=driver.findElement(By.xpath(sheet.getRow(6).getCell(3).getStringCellValue()));
		firstName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		firstName.sendKeys(Keys.BACK_SPACE);
		firstName.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		String error="";
		String expected = "Required";
		WebElement localerror = driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[1]/kt-profile/form/fieldset/div[3]/div[2]/hec-input/div/mat-form-field/div/div[2]/div/mat-error/div"));
		error=localerror.getText();
		assertEquals(error,expected,"validation required does not appair");
		System.out.println(error);

		//		Thread.sleep(2000);
		//		firstName.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		//		firstName.clear();

	}
	@When("^clear data from midlename for validate$")
	public void clear_data_from_midlename_for_validate() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement midleName=driver.findElement(By.xpath(sheet.getRow(7).getCell(3).getStringCellValue()));
		midleName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		midleName.sendKeys(Keys.BACK_SPACE);
		midleName.sendKeys(Keys.TAB);
		//		Thread.sleep(2000);
		//		midleName.sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());

	}
	@When("^clear data from lastname  for validate$")
	public void clear_data_from_lastname_for_validate() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement lastName=driver.findElement(By.xpath(sheet.getRow(8).getCell(3).getStringCellValue()));
		lastName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		lastName.sendKeys(Keys.BACK_SPACE);
		lastName.sendKeys(Keys.TAB);
		//		String error1="";
		//		String expected1 = "Required";
		//		WebElement localerror = driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[1]/kt-profile/form/fieldset/div[3]/div[4]/hec-input/div/mat-form-field/div/div[2]/div/mat-error/div"));
		//		error1=localerror.getText();
		//		assertEquals(error1,expected1,"validation required does not appair");
		//		System.out.println(error1);
		//		Thread.sleep(2000);
		//		lastName.sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());

	}
	@When("^clear data from father  for validate$")
	public void clear_data_from_father_for_validate() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement father=driver.findElement(By.xpath(sheet.getRow(11).getCell(3).getStringCellValue()));
		father.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		father.sendKeys(Keys.BACK_SPACE);
		father.sendKeys(Keys.TAB);
		String error="";
		String expected = "Required";
		WebElement localerror = driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[1]/kt-profile/form/fieldset/div[3]/div[4]/hec-input/div/mat-form-field/div/div[2]/div/mat-error/div"));
		error=localerror.getText();
		assertEquals(error,expected,"validation required does not appair");
		System.out.println(error);
		//		Thread.sleep(2000);
		//		father.sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());

	}
	@When("^clear data from mailingaddress  for validate$")
	public void clear_data_from_mailingaddress_for_validate() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement adress=driver.findElement(By.xpath(sheet.getRow(12).getCell(3).getStringCellValue()));
		adress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		adress.sendKeys(Keys.BACK_SPACE);
		adress.sendKeys(Keys.TAB);
//		String error="";
//		String expected = "Required";
//		WebElement localerror = driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[1]/kt-profile/form/fieldset/div[6]/div[2]/div/div[1]/div/hec-input[3]/div/mat-form-field/div/div[2]/div/mat-error/div"));
//		error=localerror.getText();
//		assertEquals(error,expected,"validation required does not appair");
//		System.out.println(error);

		//		Thread.sleep(2000);
		//		adress.sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());

	}
	@When("^check validations for all fields$")
	public void  check_validations_for_all_fields() throws Throwable {
		Thread.sleep(5000);
		excel();
		sheet= workbook.getSheetAt(2); 
		driver.findElement(By.xpath(sheet.getRow(25).getCell(3).getStringCellValue())).click();
	}
	@When("^user enter firstnames$")
	public void user_enter_firstnames() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement firstName=driver.findElement(By.xpath(sheet.getRow(6).getCell(3).getStringCellValue()));
		firstName.sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());

	}
	@When("^user enter midlenames$")
	public void user_enter_midlenames() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement midleName=driver.findElement(By.xpath(sheet.getRow(7).getCell(3).getStringCellValue()));
		midleName.sendKeys(sheet.getRow(2).getCell(1).getStringCellValue());

	}
	@When("^user enter lastnames$")
	public void user_enter_lastname() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement lastName=driver.findElement(By.xpath(sheet.getRow(8).getCell(3).getStringCellValue()));
		lastName.clear();
		Thread.sleep(2000);
		lastName.sendKeys(sheet.getRow(4).getCell(1).getStringCellValue());
	}
	@When("^user enter fathers$")
	public void user_enter_fathers() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement father=driver.findElement(By.xpath(sheet.getRow(11).getCell(3).getStringCellValue()));
		father.sendKeys(sheet.getRow(5).getCell(1).getStringCellValue());

	}
	@When("^user enter mailing addresss$")
	public void user_mailing_addresss() throws Throwable {
		Thread.sleep(4000);
		excel();
		sheet= workbook.getSheetAt(2); 
		WebElement adress=driver.findElement(By.xpath(sheet.getRow(12).getCell(3).getStringCellValue()));
		adress.sendKeys(sheet.getRow(6).getCell(1).getStringCellValue());

	}
	@When("^check validations next btn$")
	public void  check_validations_next_btn() throws Throwable {
		Thread.sleep(8000);
		excel();
		sheet= workbook.getSheetAt(2); 
		driver.findElement(By.xpath(sheet.getRow(25).getCell(3).getStringCellValue())).click();
	}

	//degree details



	@When("^user click deg detail button$")
	public void  user_click_deg_detail_button() throws Throwable {
		Thread.sleep(4000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement nextclick = new WebDriverWait(driver,8).until(ExpectedConditions.presenceOfElementLocated(By.xpath(sheet.getRow(0).getCell(3).getStringCellValue())));
		nextclick.click();
	}
	@When("^user select qualification leveledu$")
	public void user_select_qualification_level() throws Throwable {
		Thread.sleep(2000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement quaArrow=	driver.findElement(By.xpath(sheet.getRow(1).getCell(3).getStringCellValue()));
		quaArrow.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(3).getCell(3).getStringCellValue())).click();
	}
	@When("^user click check box$")
	public void user_click_check_box() throws Throwable {
		Thread.sleep(2000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement checkBox=	driver.findElement(By.xpath(sheet.getRow(6).getCell(3).getStringCellValue()));
		checkBox.click();
	}
	@When("^startdate greater then dateofbirth$")
	public void startdate_greater_then_dateofbirth() throws Throwable {
		Thread.sleep(2000);	
		WebElement dat1=	driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[2]/kt-education/div/kt-material-preview/kt-portlet/div/kt-portlet-body/div/kt-education-form/form/div/div/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div/div[3]/hec-input/div/mat-form-field/div/div[1]/div[3]/input"));
		dat1.clear();
		dat1.sendKeys("1/27/2021");
	}
	@When("^enddate less then startdate$")
	public void enddate_less_then_startdate() throws Throwable {
		Thread.sleep(2000);	
		WebElement dat2=	driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[2]/kt-education/div/kt-material-preview/kt-portlet/div/kt-portlet-body/div/kt-education-form/form/div/div/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div/div[4]/hec-input/div/mat-form-field/div/div[1]/div[3]/input"));
		dat2.clear();
		dat2.sendKeys("1/27/2021");

	}
	@When("^correct start date$")
	public void correct_start_date() throws Throwable {
		Thread.sleep(2000);	
		WebElement dat1=	driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[2]/kt-education/div/kt-material-preview/kt-portlet/div/kt-portlet-body/div/kt-education-form/form/div/div/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div/div[3]/hec-input/div/mat-form-field/div/div[1]/div[3]/input"));
		dat1.clear();
		dat1.sendKeys("1/6/2020");
	}
	@When("^correct end date$")
	public void correct_end_date() throws Throwable {
		Thread.sleep(2000);	
		WebElement dat2=	driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[2]/kt-education/div/kt-material-preview/kt-portlet/div/kt-portlet-body/div/kt-education-form/form/div/div/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div/div[4]/hec-input/div/mat-form-field/div/div[1]/div[3]/input"));
		dat2.clear();
		dat2.sendKeys("1/19/2021");

	}
	@When("^user enter degree nameedu$")
	public void user_degree_nameedu() throws Throwable {
		Thread.sleep(2000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement adress=driver.findElement(By.xpath(sheet.getRow(4).getCell(3).getStringCellValue()));
		adress.clear();
		adress.clear();
		Thread.sleep(2000);
		adress.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());

	}
	@When("^user click nexttabbtnedu$")
	public void  user_click_nexttabbtnedu() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(5).getCell(3).getStringCellValue())).click();
	}
//	@When("^user select countrydegreeedu$")
//	public void user_select_countrydegreeedu() throws Throwable {                                             
//		Thread.sleep(3000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement countryArrow1=	driver.findElement(By.xpath(sheet.getRow(7).getCell(3).getStringCellValue()));
//		countryArrow1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(8).getCell(3).getStringCellValue())).sendKeys("Pakistan");
//		Thread.sleep(2000);
//		WebElement countryselect2 = driver.findElement(By.cssSelector(sheet.getRow(9).getCell(3).getStringCellValue()));
//		countryselect2.click();
//
//
//	}
//	@When("^user select awardingedu$")
//	public void user_select_awardingedu() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement awarding1=	driver.findElement(By.xpath(sheet.getRow(10).getCell(3).getStringCellValue()));
//		awarding1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(11).getCell(3).getStringCellValue())).sendKeys("charter");
//		Thread.sleep(2000);
//		List<WebElement> awar = driver.findElements(By.xpath(sheet.getRow(12).getCell(3).getStringCellValue()));
//		awar.get(0).click();
//	}
//	@When("^user select programedu$")
//	public void user_select_programedu() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(13).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(14).getCell(3).getStringCellValue())).sendKeys("M.B.B.S");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(sheet.getRow(15).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user select universityedu$")
//	public void user_select_universityedu() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(16).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(17).getCell(3).getStringCellValue())).sendKeys("chartered");
//		Thread.sleep(1000);
//		List<WebElement> uni = driver.findElements(By.xpath(sheet.getRow(18).getCell(3).getStringCellValue()));
//		uni.get(0).click();
//	}
//	@When("^user select compusedu$")
//	public void user_select_compusedu() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(19).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(20).getCell(3).getStringCellValue())).sendKeys("ICAP campus");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(sheet.getRow(21).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user select dpartmentedu$")
//	public void user_select_dpartmentedu() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(22).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(23).getCell(3).getStringCellValue())).sendKeys("ICAP Dept");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(24).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user select degreeedu$")
//	public void user_select_degreeedu() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(25).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(26).getCell(3).getStringCellValue())).sendKeys("Distance Learning");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(27).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user select sessionedu$")
//	public void user_select_sessionedu() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(28).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(sheet.getRow(29).getCell(3).getStringCellValue())).sendKeys("Afternoon");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(sheet.getRow(30).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user enter researchedu$")
//	public void  user_click_researchedu() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(31).getCell(3).getStringCellValue())).sendKeys("It");
//	}
//	@When("^user enter rollnoedu$")
//	public void  user_click_rollnoedu() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 	
//		driver.findElement(By.xpath(sheet.getRow(32).getCell(3).getStringCellValue())).sendKeys("77");;
//	}
//	@When("^user add education btnedu$")
//	public void  user_click_education_btnedu() throws Throwable {
//		Thread.sleep(8000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(33).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user select tick markedu$")
//	public void  user_select_tick_markedu() throws Throwable {
//		Thread.sleep(6000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(34).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click nextaddedubtnedu$")
//	public void  user_click_nextaddedubtnedu() throws Throwable {
//		Thread.sleep(8000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(35).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click yes1$")
//	public void  user_click_yes1() throws Throwable {
//		Thread.sleep(5000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(36).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click next1$")
//	public void  user_click_next1() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(37).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click yes2$")
//	public void  user_click_yes2() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(38).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click next2$")
//	public void  user_click_next2() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(39).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click yes3$")
//	public void  user_click_yes3() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(40).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click next3$")
//	public void  user_click_next3() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(41).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click yes4$")
//	public void  user_click_yes4() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(42).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click next4$")
//	public void  user_click_next4() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(43).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click yes5$")
//	public void  user_click_yes5() throws Throwable {
//		Thread.sleep(2000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(44).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click next5$")
//	public void  user_click_next5() throws Throwable {
//		Thread.sleep(1000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(45).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click mode of attestation$")
//	public void  user_click_mode_of_attestation() throws Throwable {
//		Thread.sleep(4000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement mode=	driver.findElement(By.xpath(sheet.getRow(47).getCell(3).getStringCellValue()));
//		mode.click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(sheet.getRow(48).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user click where$")
//	public void  user_click_where() throws Throwable {
//		Thread.sleep(3000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(49).getCell(3).getStringCellValue()));
//		program1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(sheet.getRow(50).getCell(3).getStringCellValue())).click();
//	}
//	@When("^user select count$")
//	public void  user_select_count() throws Throwable {
//		Thread.sleep(3000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		WebElement coun= driver.findElement(By.xpath("//input[@formcontrolname='originalPages']"));
//		coun.click();
//	}
//	@When("^user click after verify fields$")
//	public void  user_click_after_verify_fields() throws Throwable {
//		Thread.sleep(3000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(25).getCell(3).getStringCellValue())).click();
//	}
}
