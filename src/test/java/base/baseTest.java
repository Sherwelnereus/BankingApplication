package base;

import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.readConfig;
import java.util.logging.Logger;

public class baseTest {
    public static WebDriver driver;
    public static Logger logger;


  @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/v3/index.php");
        driver.manage().window().maximize();

    }

   @AfterClass
    public static void killSession(){
        driver.quit();
    }


}
