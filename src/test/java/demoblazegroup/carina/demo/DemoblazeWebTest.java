package demoblazegroup.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import demoblazegroup.carina.demo.gui.pages.DemoblazeHomePage;
import demoblazegroup.carina.demo.gui.pages.common.LoginModalPageBase;
import demoblazegroup.carina.demo.gui.pages.components.AlertPopup;
import demoblazegroup.carina.demo.gui.pages.components.LoginModalPage;
import org.openqa.selenium.Alert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class DemoblazeWebTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    @MethodOwner(owner = "Carlos Cristaldo")
    private void openHomePageTest(){

        //DemoblazeHomePage homePage = initPage(getDriver(), HomePageBase.class);
        DemoblazeHomePage homePage = new DemoblazeHomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isOpened(), "Home Page is not opened");

    }

    @Test
    @MethodOwner(owner = "Carlos Cristaldo")
    private void userLoginTest(){
        //Negative test for wrong password

        final String user = "User";
        final String pass = "PASSWORD";
        final String EXPECTED = "Wrong password.";
        DemoblazeHomePage homePage = new DemoblazeHomePage(getDriver());
        homePage.open();
        LoginModalPage loginModal = homePage.clickLoginButton();
        Assert.assertTrue(loginModal.isOpened(), "Modal Frame is not opened");

        loginModal.enterUsername(user);
        loginModal.enterPassword(pass);
        loginModal.clickLoginButton();

        Alert alert = getDriver().switchTo().alert();

        String textAlert = alert.getText();

        LOGGER.info(textAlert);//for information

        alert.accept();

        Assert.assertEquals(textAlert, EXPECTED);

    }
}
