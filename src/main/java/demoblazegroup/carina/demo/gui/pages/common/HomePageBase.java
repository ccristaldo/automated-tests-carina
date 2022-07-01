package demoblazegroup.carina.demo.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import demoblazegroup.carina.demo.gui.pages.components.ContactFormPage;
import demoblazegroup.carina.demo.gui.pages.components.LoginModalPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOpened();

    public abstract LoginModalPage clickLoginButton();

    public abstract ContactFormPage clickContactButton();
}
