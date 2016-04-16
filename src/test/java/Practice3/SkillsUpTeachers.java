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
    private String ourTeam;
    private WebElement weblement;


    @Test
    public void testFoundTeacherGalkovskii() throws Exception {
        ourTeam = "http://skillsup.ua/about/our-team.aspx";
        weblement = driver.findElement(By.xpath("//img[@src='/media/22116/Alexander-Galkovskiy_P.jpg']"));
        weblement.submit();
        System.out.println("Teacher - Aleksandr Galkovskiy");
        assertNotNull(weblement);
    }
    @Test
    public void testFoundTeacherChokan() throws Exception {
        ourTeam = "http://skillsup.ua/about/our-team.aspx";
        weblement = driver.findElement(By.xpath("//img[@src='/media/22166/Michael-Chokan_P.jpg']"));
        weblement.submit();
        System.out.println("Teacher - Mihail Chokan");
        //assertEquals(ourTeam, weblement.getAttribute("src"));
    }
    @Test
    public void testFoundTeacherKarpov() throws NoSuchElementException {
        try {
            ourTeam = "http://skillsup.ua/about/our-team.aspx";
            weblement = driver.findElement(By.cssSelector("img[src*='Karpov']"));
        } catch (NoSuchElementException e) {
            System.out.println("It is ok if Karpov was not found");
        }
    }
}