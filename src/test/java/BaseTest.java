import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {
    static WebDriverWait wait;
    static WebDriver driver;
    static ExpectedCondition<Boolean> documentReady = driver -> {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    };

    static {
        if (driver == null)
            baglantikur();
    }

    @Before
    public static void baglantikur() {
        if (driver != null)
            return;
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver ();

        driver.get("https://www.gittigidiyor.com/");
        wait = new WebDriverWait(driver, 5);
    }

    @After
    public static void baglntiyiKes() {
       driver.quit();
    }


    public void setId(String id, String value) {
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public void clickId(String id) {
        driver.findElement(By.id(id)).click();
    }

    public void clickSelector(String id) {
        driver.findElement(By.cssSelector(id)).click ();
    }

    public void getURL(String URL){
        driver.get(URL);
    }

}
