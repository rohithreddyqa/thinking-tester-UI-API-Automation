package thinkingtesterUIAPIAutomation.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	 protected WebDriver driver;

	    public BasePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Common method to click an element
	    public void clickElement(WebElement element) {
	        element.click();
	    }

	    // Common method to send keys to an element
	    public void enterText(WebElement element, String text) {
	        element.sendKeys(text);
	    }

	    // Common method to get text from an element
	    public String getElementText(WebElement element) {
	        return element.getText();
	    }

}
