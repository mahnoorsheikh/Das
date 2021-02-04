package CommonVariable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Variables {
	public WebDriver driver;
	public XSSFWorkbook workbook;
	//XSSFSheet sheet;
//	File src=new File("D:\\automation testing\\DegreeAttestData.xlsx");

public void excel() throws IOException{
	File src=new File("D:\\automation testing\\DegreeAttestData.xlsx");
	FileInputStream fis = new FileInputStream(src);
	workbook = new XSSFWorkbook(fis);
	
}
public void excel2() throws IOException{
	File src=new File("D:\\automation testing\\DegreeAttestData2.xlsx");
	FileInputStream fis = new FileInputStream(src);
	workbook = new XSSFWorkbook(fis);
	
}

}
