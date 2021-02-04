package StepsDefinations;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonVariable.Variables;
import cucumber.api.java.en.When;

public class DegreeDetailsSD extends Variables{

	XSSFSheet sheet;
	XSSFCell dasXpath,circleXpath;

	@When("^user click degree details$")
	public void  user_click_degree_details() throws Throwable {
		Thread.sleep(4000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement nextclick = new WebDriverWait(driver,8).until(ExpectedConditions.presenceOfElementLocated(By.xpath(sheet.getRow(0).getCell(3).getStringCellValue())));
		nextclick.click();
	}
	@When("^user select qualification level$")
	public void user_select_qualification_level() throws Throwable {
		Thread.sleep(2000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement quaArrow=	driver.findElement(By.xpath(sheet.getRow(1).getCell(3).getStringCellValue()));
		quaArrow.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(3).getCell(3).getStringCellValue())).click();
	}
	@When("^user select check box$")
	public void user_select_check_box() throws Throwable {
		Thread.sleep(2000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement checkBox=	driver.findElement(By.xpath(sheet.getRow(6).getCell(3).getStringCellValue()));
		checkBox.click();

	}
	@When("^user select start date$")
	public void user_select_start_date() throws Throwable {
		Thread.sleep(2000);	
		WebElement dat1=	driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[2]/kt-education/div/kt-material-preview/kt-portlet/div/kt-portlet-body/div/kt-education-form/form/div/div/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div/div[3]/hec-input/div/mat-form-field/div/div[1]/div[3]/input"));
		dat1.clear();
		dat1.sendKeys("1/1/2020");
	}
	@When("^user select end date$")
	public void user_select_end_date() throws Throwable {
		Thread.sleep(2000);	
		WebElement dat2=	driver.findElement(By.xpath("/html/body/kt-base/div[1]/div/div/div/div/kt-das/div/kt-portlet/div/div/kt-portlet-body/div/div[3]/form/div[2]/kt-education/div/kt-material-preview/kt-portlet/div/kt-portlet-body/div/kt-education-form/form/div/div/fieldset/mat-accordion/mat-expansion-panel[1]/div/div/div/div[4]/hec-input/div/mat-form-field/div/div[1]/div[3]/input"));
		dat2.clear();
		dat2.sendKeys("2/9/2020");
	}
	@When("^user enter degree name$")
	public void user_degree_name() throws Throwable {
		Thread.sleep(2000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement adress=driver.findElement(By.xpath(sheet.getRow(4).getCell(3).getStringCellValue()));
		adress.clear();
		adress.clear();
		Thread.sleep(2000);
		adress.sendKeys(sheet.getRow(0).getCell(1).getStringCellValue());

	}
	@When("^user click nexttabbtn$")
	public void  user_click_nexttabbtn() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(5).getCell(3).getStringCellValue())).click();
	}
	@When("^user select countrydegree$")
	public void user_select_countrydegree() throws Throwable {                                             
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement countryArrow1=	driver.findElement(By.xpath(sheet.getRow(7).getCell(3).getStringCellValue()));
		countryArrow1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(8).getCell(3).getStringCellValue())).sendKeys("Pakistan");
		Thread.sleep(2000);
		WebElement countryselect2 = driver.findElement(By.cssSelector(sheet.getRow(9).getCell(3).getStringCellValue()));
		countryselect2.click();
		

	}
	@When("^user select awarding$")
	public void user_select_awarding() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement awarding1=	driver.findElement(By.xpath(sheet.getRow(10).getCell(3).getStringCellValue()));
		awarding1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(11).getCell(3).getStringCellValue())).sendKeys("charter");
		Thread.sleep(2000);
		List<WebElement> awar = driver.findElements(By.xpath(sheet.getRow(12).getCell(3).getStringCellValue()));
		awar.get(0).click();
	}
	@When("^user select program$")
	public void user_select_program() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(13).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(14).getCell(3).getStringCellValue())).sendKeys("M.B.B.S");
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(15).getCell(3).getStringCellValue())).click();
	}
	@When("^user select university$")
	public void user_select_university() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(16).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(17).getCell(3).getStringCellValue())).sendKeys("chartered");
		Thread.sleep(1000);
		List<WebElement> uni = driver.findElements(By.xpath(sheet.getRow(18).getCell(3).getStringCellValue()));
		uni.get(0).click();
	}
	@When("^user select compus$")
	public void user_select_compus() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(19).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(20).getCell(3).getStringCellValue())).sendKeys("ICAP campus");
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(21).getCell(3).getStringCellValue())).click();
	}
	@When("^user select dpartment$")
	public void user_select_dpartment() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(22).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(23).getCell(3).getStringCellValue())).sendKeys("ICAP Dept");
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(24).getCell(3).getStringCellValue())).click();
	}
	@When("^user select degree$")
	public void user_select_degree() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(25).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(26).getCell(3).getStringCellValue())).sendKeys("Distance Learning");
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(27).getCell(3).getStringCellValue())).click();
	}
	@When("^user select session$")
	public void user_select_session() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(28).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(sheet.getRow(29).getCell(3).getStringCellValue())).sendKeys("Afternoon");
		Thread.sleep(2000);
		driver.findElement(By.xpath(sheet.getRow(30).getCell(3).getStringCellValue())).click();
	}
	@When("^user enter research$")
	public void  user_click_research() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(31).getCell(3).getStringCellValue())).sendKeys("It");
	}
	@When("^user enter rollno$")
	public void  user_click_rollno() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 	
		driver.findElement(By.xpath(sheet.getRow(32).getCell(3).getStringCellValue())).sendKeys("77");;
	}
	@When("^user add education btn$")
	public void  user_click_education_btn() throws Throwable {
		Thread.sleep(8000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(33).getCell(3).getStringCellValue())).click();
	}
	@When("^user select tick mark$")
	public void  user_select_tick_mark() throws Throwable {
		Thread.sleep(6000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(34).getCell(3).getStringCellValue())).click();
	}
	@When("^user click nextaddedubtn$")
	public void  user_click_nextaddedubtn() throws Throwable {
		Thread.sleep(8000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(35).getCell(3).getStringCellValue())).click();
	}

	@When("^user select yes1$")
	public void  user_select_yes1() throws Throwable {
		Thread.sleep(6000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(36).getCell(3).getStringCellValue())).click();
	}
	@When("^user select next1$")
	public void  user_select_next1() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(37).getCell(3).getStringCellValue())).click();
	}
	@When("^user select yes2$")
	public void  user_select_yes2() throws Throwable {
		Thread.sleep(3000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(38).getCell(3).getStringCellValue())).click();
	}
	@When("^user select next2$")
	public void  user_select_next2() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(39).getCell(3).getStringCellValue())).click();
	}
	@When("^user select yes3$")
	public void  user_select_yes3() throws Throwable {
		Thread.sleep(3000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(40).getCell(3).getStringCellValue())).click();
	}
	@When("^user select next3$")
	public void  user_select_next3() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(41).getCell(3).getStringCellValue())).click();
	}
	@When("^user select yes4$")
	public void  user_select_yes4() throws Throwable {
		Thread.sleep(3000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(42).getCell(3).getStringCellValue())).click();
	}
	@When("^user select next4$")
	public void  user_select_next4() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(43).getCell(3).getStringCellValue())).click();
	}
	@When("^user select yes5$")
	public void  user_select_yes5() throws Throwable {
		Thread.sleep(3000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(44).getCell(3).getStringCellValue())).click();
	}
	@When("^user select next5$")
	public void  user_select_next5() throws Throwable {
		Thread.sleep(1000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(45).getCell(3).getStringCellValue())).click();
	}
	@When("^user select mode of attestation$")
	public void  user_select_mode_of_attestation() throws Throwable {
		Thread.sleep(4000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement mode=	driver.findElement(By.xpath(sheet.getRow(47).getCell(3).getStringCellValue()));
		mode.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(sheet.getRow(48).getCell(3).getStringCellValue())).click();
	}
	@When("^user select where$")
	public void  user_select_where() throws Throwable {
		Thread.sleep(3000);
		excel();
		sheet= workbook.getSheetAt(3); 
		WebElement program1=	driver.findElement(By.xpath(sheet.getRow(49).getCell(3).getStringCellValue()));
		program1.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(sheet.getRow(50).getCell(3).getStringCellValue())).click();
	}
//	@When("^user select number$")
//	public void  user_select_number() throws Throwable {
//		Thread.sleep(3000);
//		excel();
//		sheet= workbook.getSheetAt(3); 
//		driver.findElement(By.xpath(sheet.getRow(51).getCell(3).getStringCellValue())).click();
//	}
	
	@When("^user click nextattestation$")
	public void  user_click_nextattestation() throws Throwable {
		Thread.sleep(8000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(52).getCell(3).getStringCellValue())).click();
	}
	
	@When("^user click nextdocument$")
	public void  user_click_nextdocument() throws Throwable {
		Thread.sleep(20000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(53).getCell(3).getStringCellValue())).click();
	}
	
	@When("^user select tickdocumentop$")
	public void  user_select_tickdocumentop() throws Throwable {
		Thread.sleep(10000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(54).getCell(3).getStringCellValue())).click();
	}
	@When("^user submit application$")
	public void  user_submit_application() throws Throwable {
		Thread.sleep(10000);
		excel();
		sheet= workbook.getSheetAt(3); 
		driver.findElement(By.xpath(sheet.getRow(55).getCell(3).getStringCellValue())).click();
	}
	
}
