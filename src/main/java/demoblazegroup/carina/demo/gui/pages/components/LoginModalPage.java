package demoblazegroup.carina.demo.gui.pages.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import demoblazegroup.carina.demo.gui.pages.common.LoginModalPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginModalPage extends LoginModalPageBase {

    @FindBy(xpath = "//*[@id=\"logInModalLabel\"]")
    private ExtendedWebElement loginLabel;

    @FindBy(xpath = "//*[@id=\"loginusername\"]")
    private ExtendedWebElement userLoginFieldText;

    @FindBy(xpath = "//*[@id=\"loginpassword\"]")
    private ExtendedWebElement passLoginFieldText;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    private ExtendedWebElement loginButton;

    public LoginModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened(){
        return loginLabel.isElementPresent();
    }

    @Override
    public void clickLoginButton() {
        loginButton.click();
    }

    @Override
    public void enterUsername(String username) {
        userLoginFieldText.type(username);
    }

    @Override
    public void enterPassword(String password) {
        passLoginFieldText.type(password);
    }


}
