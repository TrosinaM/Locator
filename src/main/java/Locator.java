
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Created by Админ on 10.04.2016.
 */
public class Locator extends BaseTest {


    @Ignore
    @Test
    public void test() throws Exception {
        WebElement element = driver.findElement(By.name("search"));//find element by name
        element.sendKeys("Apple");
        element.submit();
        assertEquals(driver.getTitle(), "Apple - Wikipedia, the free encyclopedia");

    }

    @Test
    public void test1() throws Exception {
        try {

            WebElement element = driver.findElement(By.xpath("//div[@id='simpleSearch']/input[1]"));//find element by Xpatch
            element.sendKeys("Banana");
            element.submit();
            assertEquals(driver.getCurrentUrl(), "https://en.wikipedia.org/wiki/Banana");
        } catch (NoSuchElementException e) {
            System.out.println("Элемент url of page не найден!");
        }

    }

    @Test
    public void test2() throws Exception {
        try {

            WebElement element = driver.findElement(By.id("searchInput"));//find element by id
            element.sendKeys("Pineapple");
            element.submit();
            assertNotNull(driver.findElement(By.linkText("multiple fruit test")));
            //assertNotNull(driver.findElement(By.xpath("//div[@id='simpleSearch']/input[1]")));
        } catch (NoSuchElementException e) {
            System.out.println("Элемент не найден!");
        }
    }
}



