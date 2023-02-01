package loginTests;

import base.baseTest;
import org.junit.Test;
import pages.homePage;
import pages.loginPage;
import utilities.readConfig;

public class TC_LoginTest_001 extends baseTest {

   @Test
    public void loginTest() throws InterruptedException {

       readConfig readConfig = new readConfig();

        logger.info("URL is executed");
        loginPage login = new loginPage(driver);
        login.enterUsername(readConfig.getUsername());
        logger.info("Username is entered");
        login.enterPassword(readConfig.getPassword());
        logger.info("Password is entered");
        homePage homePage = login.clickOnTheLoginButton();
        homePage.getTile();
        logger.info("Login test passed");
    }

}
