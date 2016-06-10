package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.*;

/**
 * Created by mperep on 04.05.2016.
 */
public class PageForTrainings {
    private WebDriver driver;
    private String baseURL = "http://skillsup.ua/";
    private By training = By.xpath(".//*[@id='mi1']");
    private By cources = By.cssSelector("#menu1078>ul>li>a");
    private By titlecources = By.cssSelector(".title>a");
    private By headerofCource = By.className("greenHeader");
    private By teacherName = By.xpath("//div[@class='name']");
    private By buttonSubmit = By.xpath("//a[contains(.,' Оставить заявку')]");
    private By popUp = By.id("u11508");
    private By text = By.cssSelector(".cell.left.padTopBottom");
    private String cource;

    public PageForTrainings(WebDriver driver) { // constructor which get base URL and go to main page SkillsUp
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this);
    }

    public void goToCourcesTab() { // method move to page "Курсы"
        driver.navigate().to(baseURL);
        WebElement educationTab = driver.findElement(training);
        WebElement courcesTab = driver.findElement(cources);
        Actions goToAllCourcesTab = new Actions(driver);
        goToAllCourcesTab.moveToElement(educationTab).perform();
        goToAllCourcesTab.moveToElement(courcesTab).click().perform();
    }


    public void openInfoCources(String cource) { // method select list of cources and choose one of them
        List<WebElement> listcource = driver.findElements(titlecources);
        for (WebElement i : listcource) {
            if (i.getText().contains(cource)) {
                i.click();
                break;
            }
        }
    }

    public String nameOfCources() { // method find and get cource`s name
        System.out.println(driver.findElement(headerofCource).getText());
        return driver.findElement(headerofCource).getText();
    }

    public String nameOfTeacher() { //method find and get teacher`s name
        System.out.println(driver.findElement(teacherName).getText());
        return driver.findElement(teacherName).getText();
    }

    public void pressSubmitYourApplicationButton() { //method press to button "Оставить заявку"
        WebElement submitYouAppButton = driver.findElement(buttonSubmit);
        Actions submitbutton = new Actions(driver);
        submitbutton.moveToElement(submitYouAppButton).click().perform();
    }

    public boolean costOfCource(String cost){
        WebElement costCource = driver.findElement(text);
        return costCource.getText().contains(cost);
    }

    public boolean sizeOfCource(String fullsize){
        WebElement sizeCource = driver.findElement(text);
        return sizeCource.getText().contains(fullsize);
    }


    public void goToPopUp() {
        for (String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
    }

    public Boolean popUpIsPresent() { //method find that pop up is displayed exactly
        return driver.findElement(popUp).isDisplayed();
    }

}





