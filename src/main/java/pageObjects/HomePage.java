package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonSteps;

public class HomePage extends CommonSteps {
	
	//CommonSteps cs = new CommonSteps(); 
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	//FindBy locators
	
	@FindBy(xpath = "//h1[contains(text(),'Here is what happened while you were away.')]")
	private WebElement DashboardText;
	
	//Constructor
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	

}
