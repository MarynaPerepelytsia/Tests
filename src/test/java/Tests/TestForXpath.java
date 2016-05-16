package Tests;

import PageObject.WorkWithXpath;

/**
 * Created by mperep on 16.05.2016.
 */
public class TestForXpath extends BaseClass {
    WorkWithXpath workWithXpath;

    public void testToFindRow () throws Exception {
        workWithXpath = new WorkWithXpath(driver);
        System.out.println(workWithXpath.getTextFromRow());
    }

    public void testToFindPointInRow () throws Exception {
        workWithXpath = new WorkWithXpath(driver);
        System.out.println(workWithXpath.getPointFromRow());
    }

    public void testToFindRowByName () throws Exception{
        workWithXpath = new WorkWithXpath(driver);
        String name = "John";
        System.out.println(workWithXpath.findPersonByName(name));
    }

}
