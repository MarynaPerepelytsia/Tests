package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by mperep on 21.04.2016.
 */
public class PageCoachName {
    private WebDriver driver;
    private By memberclass = By.className("name");
    private By infoAboutCoach = By.className("text");
    private By searchheader = By.xpath("//div[@class='greenHeader']");
    private String coach;

    public PageCoachName(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }

    public void openPersonalInfoPage(String name){
        List<WebElement> webElements = driver.findElements(memberclass);
        for (WebElement i : webElements){
            if (i.getText().contains(name)){
                i.click();
                break;
            }
        }
    }

    public Boolean searchPersonalPage(String person){
        openPersonalInfoPage(coach);
        System.out.println(driver.findElement(searchheader).getText());
        return driver.findElement(searchheader).getText().contains(person);
    }

    public Boolean searchCourcesOfCoach(String cources){
        openPersonalInfoPage(coach);
        System.out.println(driver.findElement(infoAboutCoach).getText());
        return driver.findElement(infoAboutCoach).getText().contains(cources);
    }



}
