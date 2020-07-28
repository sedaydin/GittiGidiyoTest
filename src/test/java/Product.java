import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Product extends Base{

    @Test
    public void doTest() throws InterruptedException {
       ürün();
        sepeteEkle();
    }

    private void ürün() throws InterruptedException {
        int r = new Random().nextInt(28);
        WebElement productElement = driver.findElement(By.cssSelector(".products-container > li:nth-child(" + r + ")"));

        // Navigate to details
        productElement.findElement(By.cssSelector("a")).click();

        // Wait until page load
        Thread.sleep(4000);
        wait.until(documentReady);
    }

    private void sepeteEkle() throws InterruptedException {
        WebElement element = driver.findElement(By.id("add-to-basket"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element);

        Thread.sleep(1000);

        // Click to "add to cart"

        clickId ("add-to-basket");

        Thread.sleep(1000);
    }
}