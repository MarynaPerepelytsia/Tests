package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by mperep on 08.06.2016.
 */
public class PageDemoqa {
    private WebDriver driver;
    private String baseURL = "http://demoqa.com/registration/";
    private By dropdown = By.id("mm_date_8");

    public void selectDropdown (String text){
        WebElement findDropdown = driver.findElement(dropdown);
        Select selectValueFronDropdown = new Select(findDropdown);
        selectValueFronDropdown.selectByVisibleText(text);
    }


    public PageDemoqa(WebDriver driver){
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this);
    }
}


