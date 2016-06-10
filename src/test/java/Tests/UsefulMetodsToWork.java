package Tests;

import PageObject.PageDemoqa;
import PageObject.PageSemantic;

/**
 * Created by skillsup on 07.06.16.
 */
public class UsefulMetodsToWork extends BaseClass {
    PageSemantic pageSemantic;
    PageDemoqa pageDemoqa;

    public void testTextFromInputField(){
        pageSemantic = new PageSemantic(driver);
        pageSemantic.getTextFromFirstField();
    }

    public void testRefreshSite(){
        pageSemantic = new PageSemantic(driver);
        pageSemantic.refresh();
    }

    public void testDropdown (){
        String text = "12";
        pageDemoqa = new PageDemoqa(driver);
        pageDemoqa.selectDropdown(text);
    }

}
