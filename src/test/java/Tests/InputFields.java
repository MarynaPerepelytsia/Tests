package Tests;

import PageObject.Page3wscool;
import org.junit.Test;

/**
 * Created by skillsup on 07.06.16.
 */
public class InputFields extends BaseClass {
    Page3wscool page3wscool;

    public void testTextFromInputField(){
        page3wscool = new Page3wscool(driver);
        //String value = "Mickey";
        page3wscool.getTextFromFirstField();
    }

    public void testRefreshSite(){
        page3wscool = new Page3wscool(driver);
        page3wscool.refresh();
    }

    public void testDropdown(){
        page3wscool = new Page3wscool(driver);
        page3wscool.selectElement();
    }
}
