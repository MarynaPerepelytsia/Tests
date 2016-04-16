package Practice3;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by mperep on 16.04.2016.
 */
public class BaseClass extends TestCase{
    protected static WebDriver driver = new FirefoxDriver();


    @Before
    public void setUp() throws Exception{
        driver.get("http://skillsup.ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}