package Tests;

import PageObject.SkillsUpMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mperep on 18.04.2016.
 */
public class SearchSkillsUpTeachers extends BaseClass{

    SkillsUpMainPage skillsUpMainPage;

    @Test
    public void testFoundTeacherGalkovskii() throws Exception{
        skillsUpMainPage = new SkillsUpMainPage(driver);
        skillsUpMainPage.goToCoachPage();
        System.out.println("Teacher - Aleksandr Galkovskiy");
        assertTrue("It is not Galkovskiy", skillsUpMainPage.findCoachNmae().contains("Александр Галковский"));
    }

    @Test
    public void testFoundTeacherChokan() throws Exception{
        skillsUpMainPage = new SkillsUpMainPage(driver);
        skillsUpMainPage.goToCoachPage();
        System.out.println("Teacher - Mihail Chokan");
        assertTrue("It is not Chokan", skillsUpMainPage.findCoachNmae().contains("Михаил Чокан"));
    }

    @Test
    public void testFoundTeacherKarpov() throws NoSuchElementException {
        skillsUpMainPage = new SkillsUpMainPage(driver);
        skillsUpMainPage.goToCoachPage();
        assertFalse("Karpov should not be present in coach team", skillsUpMainPage.findCoachNmae().contains("Артем Карпов"));

    }
}
