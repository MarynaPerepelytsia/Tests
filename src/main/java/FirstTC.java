import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;

/**
 * Created by mperep on 11.04.2016.
 */
public class FirstTC extends TestCase {
    private static FirefoxDriver driver;
    WebElement chrome;


    @BeforeClass
    public void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
    }
// Это то что мы делаем перед тестами
    @Test
    public void test_case(){
        chrome = driver.findElement(By.id ("searchInput"));
        chrome.sendKeys("Apple");
        chrome.submit();
        try{
            chrome = driver.findElement(By.id("searchInput"));
        }catch (Exception e){

        }
        Assert.assertNotNull(chrome);
        System.out.println("Ending test1"+ new Object(){}.getClass().getEnclosingClass().getName());
    }
// нашли яблоко в википедии

    @Test
    public void test_case2() {
        chrome = driver.findElement(By.id("searchInput"));
        chrome.sendKeys("iPhone");
        chrome.submit();
        try {
            chrome = driver.findElement(By.id("searchInput"));
        } catch (Exception e) {
        }
        Assert.assertNotNull(chrome);
        System.out.println("Ending test2" + driver.getTitle());
    }
    //Нашли iPhone не выходя на главную страницу

    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}

//закрыли браузер