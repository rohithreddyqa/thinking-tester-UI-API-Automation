package thinkingtesterUIAPIAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import thinkingtesterUIAPIAutomation.BasePage.BasePage;
import thinkingtesterUIAPIAutomation.PageObjects.SecureAreaPage;

public class LoginPage extends BasePage {
	
	@FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//i[@class='fa fa-2x fa-sign-in']")
    WebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public SecureAreaPage clickLogin(String username, String password) {
        enterText(this.username, username);
        enterText(this.password, password);
        clickElement(login);
        return new SecureAreaPage(driver);
    }
	

}
