import org.junit.Test;

public class Main {

    @Test
    public void main() throws InterruptedException {
        try {
            new Login().doTest();
            new Search().doTest();
            new Product().doTest();

            Thread.sleep(1000);
        }  finally {
            BaseTest.baglntiyiKes ();
        }
    }
}
