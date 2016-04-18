package Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by mperep on 18.04.2016.
 */
public class SearchSkillsUpTeachers extends BaseClass{
    private By linkourteam = By.linkText("Наша команда");
    private By imageGalkovskiy = By.xpath("//img[@src='/media/22116/Alexander-Galkovskiy_P.jpg']");
    private By photoGalkovskiy = By.xpath("//img[@src='/media/39908/Alexander-Galkovskiy_F.jpg']");
    private By imageChockan = By.xpath("//a[@href=\"http://skillsup.ua/about/our-team/michael-chokan.aspx\"]");
    private By nameMichail = By.xpath("//div[@class='greenHeader']");
    private By imageKarpov = By.cssSelector("img[src*='Karpov']");

    @Test
    public void testFoundTeacherGalkovskii() throws Exception{
        WebElement webElement = driver.findElement(linkourteam);
        webElement.click();
        WebElement webElement1 = driver.findElement(imageGalkovskiy);
        webElement1.click();
        System.out.println("Teacher - Aleksandr Galkovskiy");
        WebElement webElement2 = driver.findElement(photoGalkovskiy);
        assertTrue(webElement2.isDisplayed());
    }

    @Test
    public void testFoundTeacherChokan() throws Exception{
        WebElement webElement = driver.findElement(linkourteam);
        webElement.click();
        WebElement webElement1 = driver.findElement(imageChockan);
        webElement1.click();
        WebElement webElement2 = driver.findElement(nameMichail);
        System.out.println("Teacher - Mihail Chokan");
        assertEquals("Михаил Чокан",webElement2.getText() );
    }

    @Test
    public void testFoundTeacherKarpov() throws NoSuchElementException {
        WebElement webElement = driver.findElement(linkourteam);
        webElement.click();
        try {
            WebElement webElement1 = driver.findElement(imageKarpov);
        } catch (NoSuchElementException e){
            System.out.println("It is ok if Karpov was not found");
        }

    }
}
