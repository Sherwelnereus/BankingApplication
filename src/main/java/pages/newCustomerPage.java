package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newCustomerPage {

    WebDriver driver;

    public newCustomerPage(WebDriver driver){
        this.driver = driver;
    }

    By customerName = By.cssSelector("input[name='name']");
    By genderMale   = By.cssSelector("input[value='m']");
    By DOB          = By.cssSelector("#dob");
    By address      = By.cssSelector("textarea[name='addr']");
    By city         = By.cssSelector("input[name='city']");
    By state        = By.cssSelector("input[name='state']");
    By pin          = By.cssSelector("input[name='pinno']");
    By mobileNumber = By.cssSelector("input[name='telephoneno']");
    By emailAddress = By.cssSelector("input[name='emailid']");
    By password     = By.cssSelector("input[name='password']");
    By submitButton = By.cssSelector("input[value='Submit']");

    By resetButton  = By.cssSelector("input[value='Reset']");

    By successfullyAddedCustomerMessage = By.cssSelector(".heading3");

    public void enterCustomerName(String cName){
        driver.findElement(customerName).sendKeys(cName);
    }

    public void selectMaleGender(){
        driver.findElement(genderMale).click();
    }

    public void enterDOB(String mm, String dd, String yy){
        driver.findElement(DOB).sendKeys(mm,dd,yy);
    }

    public void enterAddress(String Address){
        driver.findElement(address).sendKeys(Address);
    }

    public void enterCity(String City){
        driver.findElement(city).sendKeys(City);
    }

    public void enterState(String State){
        driver.findElement(state).sendKeys(State);
    }
    public void enterPin(String Pin){
        driver.findElement(pin).sendKeys(Pin);
    }

    public void enterMobileNumber(String MobileNumber){
        driver.findElement(mobileNumber).sendKeys(MobileNumber);
    }

    public void enterEmailAddress(String Email){
        driver.findElement(emailAddress).sendKeys(Email);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void successfullyAddedCustomerMessage(){
        String message = driver.findElement(successfullyAddedCustomerMessage).getText();
        if (message.equals("Customer Registered Successfully!!!")){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }









}
