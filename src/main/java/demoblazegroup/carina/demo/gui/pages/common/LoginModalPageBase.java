package demoblazegroup.carina.demo.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginModalPageBase extends AbstractPage {
    public LoginModalPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOpened();

    public abstract void clickLoginButton();

    public abstract void enterUsername(String q);

    public abstract void enterPassword(String p);

}
