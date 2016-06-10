package Tests;

import PageObject.PageCoachName;
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
    PageCoachName pageCoachName;

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
        assertTrue("Karpov should not be present in coach team", skillsUpMainPage.findCoachNmae().contains("Артем Карпов"));
    }

    @Test
    public void testCheckCoachNameForGalkovskiy() throws Exception{
        String nameCoach = "Александр Галковский";
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.openPersonalInfoPage(nameCoach);
        assertTrue("Name does not matche with Galkovskiy", pageCoachName.searchPersonalPage(nameCoach));
    }

    @Test
    public void testCheckCoachCourcesForGalkovskiy() throws Exception{
        String nameCoach = "Александр Галковский";
        String coachCources = "Diving into Java";
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.openPersonalInfoPage(nameCoach);
        assertTrue("This cource is not Diving into Java", pageCoachName.searchCourcesOfCoach(coachCources));
    }

    @Test
    public void testCheckCoachNameForChokan() throws Exception{
        String nameCoach = "Михаил Чокан";
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.openPersonalInfoPage(nameCoach);
        assertTrue("Name does not matche with Chokan", pageCoachName.searchPersonalPage(nameCoach));
    }

    @Test
    public void testCheckCoachCourcesForChokan() throws Exception{
        String nameCoach = "Михаил Чокан";
        String coachCources = "Руководитель учебного курса в компании SkillsUp";
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.openPersonalInfoPage(nameCoach);
        assertTrue("This cource is not Координатор учебного курса", pageCoachName.searchCourcesOfCoach(coachCources));
    }
    
    @Test
    public void await () throws Exception{
      skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.waitNameIsLoaded();
    }
    
    @Test
       public void awaitUntilAlertIsPresent () throws Exception {
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.waitAlertIsPresent();
    }
    
    @Test
    public void callJavascriptAlert() throws Exception {
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        assertEquals("Ольга Симчак", pageCoachName.callJavascriptAlert());
    }
    
    @Test
    public void alertAccept () throws Exception {
        skillsUpMainPage = new SkillsUpMainPage(driver);
        pageCoachName = new PageCoachName(driver);
        skillsUpMainPage.goToCoachPage();
        pageCoachName.callJavascript();
        assertEquals("hello world", pageCoachName.getTextFromAlert());
        pageCoachName.pressOkButtonOnAlert();
    }
}
