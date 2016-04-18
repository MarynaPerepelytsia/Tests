package Practice3;

import Practice3.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.testng.mustache.StringChunk;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by mperep on 16.04.2016.
 */
public class SkillsUpTeachers extends BaseClass {
    private WebElement weblement;


    @Test
    public void testFoundTeacherGalkovskii() throws Exception {
        weblement = driver.findElement(By.linkText("Наша команда"));
        weblement.click();
        weblement = driver.findElement(By.xpath("//img[@src='/media/22116/Alexander-Galkovskiy_P.jpg']"));
        weblement.click();
        System.out.println("Teacher - Aleksandr Galkovskiy");
        weblement = driver.findElement(By.xpath("//img[@src='/media/39908/Alexander-Galkovskiy_F.jpg']"));
        assertTrue(weblement.isDisplayed());
    }
    @Test
    public void testFoundTeacherChokan() throws Exception {
        weblement = driver.findElement(By.linkText("Наша команда"));
        weblement.click();
        weblement = driver.findElement(By.xpath("//a[@href=\"http://skillsup.ua/about/our-team/michael-chokan.aspx\"]"));
        weblement.click();
        System.out.println("Teacher - Mihail Chokan");
        //assertEquals(ourTeam, weblement.getAttribute("src"));
    }
    @Test
    public void testFoundTeacherKarpov() throws NoSuchElementException {
        weblement = driver.findElement(By.linkText("Наша команда"));
        weblement.click();
        try {
           weblement = driver.findElement(By.cssSelector("img[src*='Karpov']"));
        } catch (NoSuchElementException e) {
            System.out.println("It is ok if Karpov was not found");
        }
    }
}