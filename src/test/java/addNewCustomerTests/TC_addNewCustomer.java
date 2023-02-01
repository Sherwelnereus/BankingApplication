package addNewCustomerTests;

import base.baseTest;
import org.junit.Test;
import pages.homePage;
import pages.loginPage;
import pages.newCustomerPage;
import utilities.readConfig;

public class TC_addNewCustomer extends baseTest {

    @Test
    public void addNewCustomerTest() throws InterruptedException {
        readConfig readConfig = new readConfig();

        loginPage loginPage = new loginPage(driver);
        loginPage.enterUsername(readConfig.getUsername());
        loginPage.enterPassword(readConfig.getPassword());
        homePage homepage = loginPage.clickOnTheLoginButton();
        homepage.getTile();
        newCustomerPage newCustomerPage = homepage.navigateNewCustomer();
        Thread.sleep(2000);
        newCustomerPage.enterCustomerName("John");
        newCustomerPage.selectMaleGender();
        newCustomerPage.enterDOB("05", "12", "1111");
        newCustomerPage.enterAddress("test address");
        newCustomerPage.enterCity("Colombo");
        newCustomerPage.enterState("Western");
        newCustomerPage.enterPin("123456");
        newCustomerPage.enterMobileNumber("123456");
        newCustomerPage.enterEmailAddress("johndoeeee@gmail.com");
        newCustomerPage.enterPassword("123");
        Thread.sleep(2000);
        newCustomerPage.clickOnSubmitButton();
        Thread.sleep(3000);
        newCustomerPage.successfullyAddedCustomerMessage();
        Thread.sleep(3000);

    }
}
