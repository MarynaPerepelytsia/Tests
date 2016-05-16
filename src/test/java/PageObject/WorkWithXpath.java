package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mperep on 16.05.2016.
 */
public class WorkWithXpath {
    private WebDriver driver;
    private String baseURL = "http://www.w3schools.com/html/html_tables.asp";
    private By allrows = By.xpath(".//table[@class='w3-table-all']/tbody/tr[position()>1]");
    private By row2 = By.xpath(".//*[@id='main']/table[1]/tbody/tr[3]");
    private By points = By.xpath("td[4]");
    private By firsName = By.xpath("td[2]");


    public WorkWithXpath (WebDriver driver){ // constructor which get base URL and go to main page SkillsUp
        this.driver = driver;
        driver.get(baseURL);
        PageFactory.initElements(driver, this );
    }

    public String getTextFromRow (){
        return driver.findElement(row2).getText();
    }

    public String getPointFromRow(){
        WebElement row = driver.findElement(row2);
        return row.findElement(points).getText();
    }

     public String findPersonByName(String name) {
         List<WebElement> rows = driver.findElements(allrows);
         WebElement requiredRow=null;
         for (WebElement i : rows) {
             if (i.findElement(firsName).getText().contains(name)) {
                 requiredRow = i;
                 break;
             }
         }
         return requiredRow.getText();
     }

}
