package thinkingtesterUIAPIAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import thinkingtesterUIAPIAutomation.BasePage.BasePage;
import thinkingtesterUIAPIAutomation.PageObjects.LoginPage;

public class SecureAreaPage extends BasePage {

    @FindBy(xpath = "//i[@class='icon-2x icon-signout']")
    WebElement logoutbutton;

    @FindBy(xpath = "//div[@id='flash']")
    WebElement errormessage;

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLogout() {
        clickElement(logoutbutton);
        return new LoginPage(driver);
    }

    public String getErrorMessage() throws InterruptedException {
        Thread.sleep(3000);
        return errormessage.getText();
    }
}
