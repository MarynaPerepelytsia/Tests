package Tests;

import PageObject.PageForTrainings;
import PageObject.PagePopUp;
import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;
import org.testng.annotations.Test;

/**
 * Created by mperep on 04.05.2016.
 */
public class TabTraining extends BaseClass {
    PageForTrainings pageForTrainings;
    PagePopUp pagePopUp;


    // Tests for first cource "Основы веб-дизайна"

    public void testNameOfCourceWebDesignFundamentals() throws Exception{ //Test verifies that name of cource is "Основы веб-дизайна"
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Web Design Fundamentals (Основы веб-дизайна)", pageForTrainings.nameOfCources());
    }

    public void testCoatCource() throws Exception{
        String cost = "250 грн/занятие";
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertTrue("Cost is not right", pageForTrainings.costOfCource(cost));
    }

    public void testNameOfTeacherForCourceWebDesignFundamentals() throws Exception { // Test verifies that teacher`s name is "Наталья Абраменко" for cource "Основы веб-дизайна"
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("Teacher is not Наталья Абраменко", "Наталья Абраменко",pageForTrainings.nameOfTeacher());
    }

    public void testRequestForCourceWebDesignFundamentals() throws Exception { //Test verifies that pop up is present after clicking 'Оставить заявку' button for cource "Основы веб-дизайна"
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        assertTrue("Alert is not present.", pageForTrainings.popUpIsPresent());
    }

    public void testNameOfFieldsOnPopUpForCourceWebDesignFundamentals() throws Exception{ //Test verifies that all field is present on pop up for cource "Основы веб-дизайна"
        String cource = "Основы веб-дизайна";
        pageForTrainings = new PageForTrainings(driver);
        pagePopUp = new PagePopUp(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        assertEquals("Name of fileds is not Имя", "Имя", pagePopUp.findFieldName("Имя"));
        assertEquals("Name of fileds is not Фамилия", "Фамилия", pagePopUp.findFieldName("Фамилия"));
        assertEquals("Name of fileds is not Электронная почта", "Электронная почта", pagePopUp.findFieldName("Электронная почта"));
        assertEquals("Name of fileds is not Телефон", "Телефон", pagePopUp.findFieldName("Телефон"));
    }

    //Tests for second cource "Эффективный лидер"

    public void testNameCourceEffectiveLeader() throws Exception{ //Test verifies that name of cource is "Эффективный лидер"
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Effective Leader (Эффективный лидер)", pageForTrainings.nameOfCources());
    }

    public void testNameOfTeacherforCourceEffectiveLeader() throws Exception { // Test verifies that teacher`s name is "Марина Мельник" for cource "Эффективный лидер"
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right teacher", "Марина Мельник",pageForTrainings.nameOfTeacher());
    }

    public void testRequestForCourceEffectiveLeader() throws Exception { //Test verifies that pop up is present after clicking 'Оставить заявку' button for cource "Эффективный лидер"
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        assertTrue("Alert is not present.", pageForTrainings.popUpIsPresent());
    }

    public void testNameOfFieldsOnPopUpForCourceEffectiveLeader() throws Exception{ //Test verifies that all field is present on pop up for cource "Основы веб-дизайна"
        String cource = "Эффективный лидер";
        pageForTrainings = new PageForTrainings(driver);
        pagePopUp = new PagePopUp(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        assertEquals("Name of fileds is not Имя", "Имя", pagePopUp.findFieldName("Имя"));
        assertEquals("Name of fileds is not Фамилия", "Фамилия", pagePopUp.findFieldName("Фамилия"));
        assertEquals("Name of fileds is not Электронная почта", "Электронная почта", pagePopUp.findFieldName("Электронная почта"));
        assertEquals("Name of fileds is not Телефон", "Телефон", pagePopUp.findFieldName("Телефон"));
    }

    //Tests for third cource "Погружение в разработку под Android"

    public void testNameCourceDivingIntoAndroidDevelopment() throws Exception{ //Test verifies that name of cource is "Погружение в разработку под Android"
        String cource = "Погружение в разработку под Android";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right cource", "Diving into Android Development (Погружение в разработку под Android)", pageForTrainings.nameOfCources());
    }

    public void testNameOfTeacherforCourceDivingIntoAndroidDevelopment() throws Exception { // Test verifies that teacher`s name is "Дмитрий Ильченко" for cource "Погружение в разработку под Android"
        String cource = "Погружение в разработку под Android";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        assertEquals("It is not right teacher", "Дмитрий Ильченко",pageForTrainings.nameOfTeacher());
    }

    public void testRequestForCourceDivingIntoAndroidDevelopment() throws Exception { //Test verifies that pop up is present after clicking 'Оставить заявку' button for cource "Погружение в разработку под Android"
        String cource = "Погружение в разработку под Android";
        pageForTrainings = new PageForTrainings(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        assertTrue("Alert is not present.", pageForTrainings.popUpIsPresent());
    }

    public void testNameOfFieldsOnPopUpForCourceDivingIntoAndroidDevelopment() throws Exception{ //Test verifies that all field is present on pop up for cource "Погружение в разработку под Android"
        String cource = "Погружение в разработку под Android";
        pageForTrainings = new PageForTrainings(driver);
        pagePopUp = new PagePopUp(driver);
        pageForTrainings.goToCourcesTab();
        pageForTrainings.openInfoCources(cource);
        pageForTrainings.pressSubmitYourApplicationButton();
        pageForTrainings.goToPopUp();
        assertEquals("Name of fileds is not Имя", "Имя", pagePopUp.findFieldName("Имя"));
        assertEquals("Name of fileds is not Фамилия", "Фамилия", pagePopUp.findFieldName("Фамилия"));
        assertEquals("Name of fileds is not Электронная почта", "Электронная почта", pagePopUp.findFieldName("Электронная почта"));
        assertEquals("Name of fileds is not Телефон", "Телефон", pagePopUp.findFieldName("Телефон"));
    }

}
