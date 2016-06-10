package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

/**
 * Created by skillsup on 07.06.16.
 */
public class PageSemantic {
    private WebDriver driver;
    private String baseURL = "http://semantic-ui.com/elements/input.html";
    private By chakout = By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[2]/div[22]/div/input");

    public void getTextFromFirstField(){
        WebElement inputfield = driver.findElement(chakout);
        String value = inputfield.getAttribute("value");
        System.out.println(value);
    }

    public void refresh (){
        Actions refreshSite = new Actions(driver);
        refreshSite.sendKeys("F5");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(chakout));

    }

    public PageSemantic(WebDriver driver){
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this);
    }
}
