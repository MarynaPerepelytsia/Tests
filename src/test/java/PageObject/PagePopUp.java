package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mperep on 18.05.2016.
 */
public class PagePopUp {
    private WebDriver driver;
    private By fieldsOnPopUp = By.className("header");
    //private By popUp = By.id("u11508");

    public PagePopUp (WebDriver driver) { // constructor pagePopUp
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<String> findNmaeforFields() { // method find all field`s name which is displayed on pop up
        List<WebElement> nameOfFields = driver.findElements(fieldsOnPopUp);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i : nameOfFields) {
            stringsNames.add(i.getText());
        }
        return stringsNames;
    }

    public List<String> expectedFields(){
        List<String> expectedNames = new ArrayList<String>();
        expectedNames.add("Имя");
        expectedNames.add("Фамилия");
        expectedNames.add("Электронная почта");
        expectedNames.add("Телефон");

        return expectedNames;
    }

    public String findFieldName(String name){
        Map <String, String> map = new HashMap<String, String>();
        for (int i=0; i<4; i++){
            map.put(expectedFields().get(i),findNmaeforFields().get(i));
        }
        for (String key : map.keySet()) {
            return map.get(name);
        }
        return map.get(name);
    }

}
