import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.util.concurrent.TimeUnit;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;

/**
 * Created by mperep on 11.04.2016.
 */
public class FirstTC extends TestCase {
    private static WebDriver driver = new FirefoxDriver();
    private By wwikisearch = By.id("searchInput");
    private By image_apple = By.xpath("//img[@height='120']");
    private By image_iPhone = By.xpath("//img[@alt='IPhone6 silver frontface.png']");


    @BeforeClass
    public void openBrowser(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
    }
// Это то что мы делаем перед тестами
    @Test
    public void serachapple() throws Exception{
        WebElement serachinput = driver.findElement(wwikisearch);
        serachinput.sendKeys("Apple");
        serachinput.submit();
        try{
            WebElement apple = driver.findElement(image_apple);
        } catch (NoSuchElementException e){
            System.out.println("Image was not found");
        }
        System.out.println("Ending test1"+ driver.getCurrentUrl());
    }
// нашли яблоко в википедии

    @Test
    public void serachiPhone() throws Exception{
        WebElement searchinput = driver.findElement(wwikisearch);
        searchinput.sendKeys("iPhone");
        searchinput.submit();
        System.out.println("Ending test2" + driver.getTitle());
        WebElement iPhone = driver.findElement(image_iPhone);
        assertTrue(iPhone.isDisplayed());
    }
    //Нашли iPhone не выходя на главную страницу

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}

//закрыли браузер