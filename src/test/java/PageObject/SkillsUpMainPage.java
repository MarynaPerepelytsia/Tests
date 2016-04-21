package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mperep on 21.04.2016.
 */
public class SkillsUpMainPage {
    private WebDriver driver;
    private static String baseURL = "http://skillsup.ua/";
    private By linkourteam = By.linkText("Наша команда");
    private By memberclass = By.className("name");

    public void goToCoachPage(){
        WebElement goToCoachPage = driver.findElement(linkourteam);
        goToCoachPage.click();
    }

    public List<String> findCoachNmae (){
        List<WebElement> listmembers = driver.findElements(memberclass);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i: listmembers){
            stringsNames.add (i.getText());
        }
        return stringsNames;
    }

    public SkillsUpMainPage(WebDriver driver){
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this );
    }
}
