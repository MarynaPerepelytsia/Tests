package Tests;

import PageObject.PageForTrainings;
import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;
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
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Web Design Fundamentals (Основы веб-дизайна)", pageForTrainings.nameOfCources());
    }

    @Test
    public void testNameOfTeacherforFirstCource() throws Exception {
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right teacher", "Наталья Абраменко",pageForTrainings.nameOfTeacher());
    }

    @Test
    public void testRequestForFirstCource() throws Exception {
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        //assertTrue("Alert is not present", );
    }


    @Test
    public void testNameofSecondCource() throws Exception{
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Effective Leader (Эффективный лидер)", pageForTrainings.nameOfCources());
    }

    @Test
    public void testNameOfTeacherforSecondCource() throws Exception {
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right teacher", "Марина Мельник",pageForTrainings.nameOfTeacher());
    }

    @Test
    public void testNameofThirdCource() throws Exception{
        String cource = "Погружение в разработку под Android";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Diving into Android Development (Погружение в разработку под Android)", pageForTrainings.nameOfCources());
    }

    @Test
    public void testNameOfTeacherforThirdCource() throws Exception {
        String cource = "Погружение в разработку под Android";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right teacher", "Дмитрий Ильченко",pageForTrainings.nameOfTeacher());
    }



}
