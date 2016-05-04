package Tests;

import PageObject.PageForTrainings;
import org.testng.annotations.Test;

/**
 * Created by mperep on 04.05.2016.
 */
public class TabTraining extends BaseClass {
    PageForTrainings pageForTrainings;

    @Test
    public void testNameOfCource() throws Exception{
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        //pageForTrainings.waitListCourcesIsloaded();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Web Design Fundamentals (Основы веб-дизайна)", pageForTrainings.nameOfCources());
    }

}
