package Tests;

import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by mperep on 16.04.2016.
 */
public class BaseClass extends TestCase{
    protected static WebDriver driver;


    @BeforeClass
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterClass
    public void tearDown() throws Exception{
        driver.quit();
    }

}