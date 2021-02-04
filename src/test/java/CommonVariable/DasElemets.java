package CommonVariable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DasElemets {
	
	public DasElemets(WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Apply For Degree Attestation Service']")
	public WebElement dasClick;
	
}
