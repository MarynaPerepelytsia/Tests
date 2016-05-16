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
    private By training = By.xpath("//a[@href='http://skillsup.ua/training.aspx']");
    private By cources = By.xpath("//a[@href='http://skillsup.ua/training/courses.aspx']");
    private By titlecources = By.cssSelector("div.title>a");
    private By headerofCource = By.className("greenHeader");
    private By teacherName = By.xpath("//div[@class='name']");
    private By buttonSubmit = By.xpath("//a[contains(.,' Оставить заявку')]");
    private By fieldsOnPopUp = By.className("header");
    private By popUp = By.id("u11508");
    private String cource;

    public PageForTrainings (WebDriver driver){ // constructor which get base URL and go to main page SkillsUp
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this );
    }

    public void goToCourcesTab (){ // method move to page "Курсы"
        driver.navigate().to(baseURL);
        WebElement educationTab = driver.findElement(training);
        WebElement courcesTab = driver.findElement(cources);
        Actions goToAllCourcesTab = new Actions(driver);
        goToAllCourcesTab.moveToElement(educationTab).perform();
        goToAllCourcesTab.moveToElement(courcesTab).click().perform();
    }


    public void openInfoCources(String cource){ // method select list of cources and choose one of them
        List<WebElement> listcource = driver.findElements(titlecources);
        for (WebElement i: listcource) {
            if (i.getText().contains(cource)) {
                i.click();
                break;
            }
        }
    }

    public String nameOfCources(){ // method find and get cource`s name
        System.out.println(driver.findElement(headerofCource).getText());
        return driver.findElement(headerofCource).getText();
    }

    public String nameOfTeacher (){ //method find and get teacher`s name
        System.out.println(driver.findElement(teacherName).getText());
        return driver.findElement(teacherName).getText();
    }

    public void pressSubmitYourApplicationButton(){ //method press to button "Оставить заявку"
        WebElement submitYouAppButton = driver.findElement(buttonSubmit);
        Actions submitbutton = new Actions(driver);
        submitbutton.moveToElement(submitYouAppButton).click().perform();
    }

    public void goToPopUp(){ // method go to pop up which appears after clicking button "Оставить заявку"
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window

        }
    public Boolean popUpIsPresent(){ //method find that pop up is displayed exactly
        return driver.findElement(popUp).isDisplayed();
    }
        //driver.switchTo().window(parentWindowHandler);

    public List<String> findNmaeforFields (){ // method find all field`s name which is displayed on pop up
        List<WebElement> nameOfFields = driver.findElements(fieldsOnPopUp);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i: nameOfFields){
            stringsNames.add (i.getText());
        }
        return stringsNames;
    }

   /* public String findNameforFields (String name){
        WebElement nameOfFields = driver.findElement(fieldsOnPopUp);
        Map<WebElement, String> Map = new HashMap<WebElement, String>();
        Map.put(nameOfFields, "Имя");
        Map.put(nameOfFields,"Фамилия");
        Map.put(nameOfFields, "Электронная почта");
        Map.put(nameOfFields,"Телефон");
        for (WebElement key : Map.keySet()){
            return Map.get(name);
        }
        return Map.get(name);*/
    }



