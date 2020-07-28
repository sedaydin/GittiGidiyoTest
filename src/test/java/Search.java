import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Search extends BaseTest {

    @Test
    public void doTest() throws InterruptedException {
        arama();
        listele();
    }

    private void arama() throws InterruptedException {
        setId ("search_word", "kulaklık");
        clickId ("textSearch_ara");
        Thread.sleep(1000);
        wait.until(documentReady);
    }

    private void listele() {
        List<WebElement> ürün = driver.findElements(By.cssSelector(".products-container > li"));

        for (WebElement element : ürün) {
            String baslik = element.findElement(By.cssSelector(".product-title > span")).getText();
            System.out.printf (baslik);


        }
    }
}
