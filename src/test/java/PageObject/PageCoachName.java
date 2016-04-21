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
    private static String baseURL = "http://skillsup.ua/";
    private By cardGalkovskiy = By.xpath("//img[@src='/media/22116/Alexander-Galkovskiy_P.jpg']");
    private By cardChokan = By.xpath("//img[@src='/media/22166/Michael-Chokan_P.jpg']");
    private By infoAboutCoach = By.className("text");
    private By nameGalkovskiy = By.xpath("//div[@class='greenHeader']");
    private By nameChokan = By.xpath("//div[@class='greenHeader']");

    public void findInfoAboutCoachGalkovsckiy() {
        WebElement imageGalkovskiy = driver.findElement(cardGalkovskiy);
        Actions openInfoAboutCoachGalkovskiy = new Actions(driver);
        openInfoAboutCoachGalkovskiy.moveToElement(imageGalkovskiy).click().perform();
    }

    public void findCourseForGalkovskyi () {
        WebElement textaboutcoach = driver.findElement(infoAboutCoach);
        textaboutcoach.getAttribute("Погружение в Java");
    }
    public void findNameForGalkovskyi () {
        WebElement firstnameLastname = driver.findElement(nameGalkovskiy);
        firstnameLastname.getText();
        }

    public void findNameForChokan () {
        WebElement lastnameChokan = driver.findElement(nameChokan);
        lastnameChokan.getText();
    }

    public void findCourseForChokan () {
        WebElement textaboutcoachChocan = driver.findElement(infoAboutCoach);
        ????
    }

    public void findInfoAboutCoachChokan() {
        WebElement imageChokan = driver.findElement(cardChokan);
        Actions openInfoAboutCoachChokan = new Actions(driver);
        openInfoAboutCoachChokan.moveToElement(imageChokan).click().perform();
    }
    public PageCoachName(WebDriver driver){
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this );
    }

}
