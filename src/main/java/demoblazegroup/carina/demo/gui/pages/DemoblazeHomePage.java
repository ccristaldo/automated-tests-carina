package demoblazegroup.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import demoblazegroup.carina.demo.gui.pages.common.HomePageBase;
import demoblazegroup.carina.demo.gui.pages.components.ContactFormPage;
import demoblazegroup.carina.demo.gui.pages.components.LoginModalPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DemoblazeHomePage extends HomePageBase {

    @FindBy(xpath = "//*[@id=\"nava\"]")
    private ExtendedWebElement navaBarElement;

    @FindBy(xpath = "//*[@id=\"login2\"]")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = "/html/body/nav/div[1]/ul/li[2]/a")
    private ExtendedWebElement contactButton;

    public DemoblazeHomePage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isOpened(){
        return navaBarElement.isElementPresent();
    }
    @Override
    public LoginModalPage clickLoginButton(){
        loginButton.click();
        return new LoginModalPage(getDriver());
    }

    @Override
    public ContactFormPage clickContactButton() {
        contactButton.click();
        return initPage(ContactFormPage.class);
    }

}
