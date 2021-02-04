package StepsDefinations;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class DegreeDetails {
	public WebDriver driver; 
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell dasXpath,circleXpath;
	File src=new File("D:\\automation testing\\DegreeAttestData.xlsx");

}
