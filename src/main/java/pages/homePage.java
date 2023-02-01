package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

public class homePage {

    private WebDriver driver;

    By homePageTitle = By.cssSelector(".barone");
    By newCustomer   = By.xpath("//a[normalize-space()='New Customer']");

    public homePage(WebDriver driver){
        this.driver = driver;
    }

    public void getTile(){
        String title = driver.findElement(homePageTitle).getText();
        if (title.equals("Guru99 Bank")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
    }

    public newCustomerPage navigateNewCustomer(){
        driver.findElement(newCustomer).click();
        return new newCustomerPage(driver);
    }
}
