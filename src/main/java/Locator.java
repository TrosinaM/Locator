
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Админ on 10.04.2016.
 */
public class Locator extends TestCase{
    private  static WebDriver driver ;

    @BeforeClass
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        this.driver.get("https://en.wikipedia.org/wiki/Main_Page");

    }

    @Test
    public void test() throws Exception {
        WebElement element = driver.findElement(By.name("search"));//find element by name
        element.sendKeys("Apple");
        element.submit();
        assertEquals(driver.getTitle(),"Apple - Wikipedia, the free encyclopedia");

    }

    @Test public void test1() throws Exception {
        WebElement element = driver.findElement(By.xpath("//div[@id='simpleSearch']/input[1]"));//find element by
        element.sendKeys("Banana");
        element.submit();
        //assertEquals(driver.findElement(By.id("");


    }
    @Test public void test2() throws Exception {
        WebElement element = driver.findElement(By.id("searchInput") );//find element by id
        element.sendKeys("Pineapple");
        element.submit();

    }

       @AfterClass
    public  void tearDown() throws Exception {
        this.driver.quit();
    }
}