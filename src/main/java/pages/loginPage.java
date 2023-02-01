package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    private WebDriver driver;

    By username = By.cssSelector("input[name='uid']");
    By password = By.cssSelector("input[name='password']");
    By loginButton = By.xpath("//input[@name='btnLogin']");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String Username){
        driver.findElement(username).sendKeys(Username);
    }

    public void enterPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }

    public homePage clickOnTheLoginButton() throws InterruptedException {
        driver.findElement(loginButton).click();
        return new homePage(driver);
    }


}
