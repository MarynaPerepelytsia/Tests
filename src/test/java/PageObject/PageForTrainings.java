package PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by mperep on 04.05.2016.
 */
public class PageForTrainings {
    private WebDriver driver;
    private String baseURL = "http://skillsup.ua/";
    private By training = By.xpath("//a[@href='http://skillsup.ua/training.aspx']");
    private By cources = By.xpath("//a[@href='http://skillsup.ua/training/courses.aspx']");
    private By titlecources = By.cssSelector("div.title>a");
    private By headerofCource = By.className("greenHeader");
    private By teacherName = By.xpath("//div[@class='name']");
    private By buttonSubmit = By.xpath("//a[contains(.,' Оставить заявку')]");
    private String cource;

    public PageForTrainings (WebDriver driver){
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this );
    }

    public void goToCourcesTab (){
        driver.navigate().to(baseURL);
        WebElement educationTab = driver.findElement(training);
        WebElement courcesTab = driver.findElement(cources);
        Actions goToAllCourcesTab = new Actions(driver);
        goToAllCourcesTab.moveToElement(educationTab).perform();
        goToAllCourcesTab.moveToElement(courcesTab).click().perform();
    }


    public void openInfoCources(String cource){
        List<WebElement> listcource = driver.findElements(titlecources);
        for (WebElement i: listcource) {
            if (i.getText().contains(cource)) {
                i.click();
                break;
            }
        }
    }

    public String nameOfCources(){
        System.out.println(driver.findElement(headerofCource).getText());
        return driver.findElement(headerofCource).getText();
    }

    public String nameOfTeacher (){
        System.out.println(driver.findElement(teacherName).getText());
        return driver.findElement(teacherName).getText();
    }

    public void pressSubmitYourApplicationButton(){
        WebElement submitYouAppButton = driver.findElement(buttonSubmit);
        Actions submitbutton = new Actions(driver);
        submitbutton.moveToElement(submitYouAppButton).click().perform();
    }

    public void goToPopUp(){
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        // perform operations on popup

        //driver.switchTo().window(parentWindowHandler);
    }



   // public void getSwitchToAlert(){
        //return driver.switchTo().alert().accept();
    //}
}
