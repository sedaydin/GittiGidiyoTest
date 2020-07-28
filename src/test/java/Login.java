import org.junit.Test;

public class Login extends BaseTest {

    @Test
    public void doTest() throws InterruptedException {
        getURL ("https://www.gittigidiyor.com/uye-girisi");
        setId ("L-UserNameField", "seda.aydin@testinium.com");
        setId ("L-PasswordField", "1234567.S");
        clickId ("gg-login-enter");
        Thread.sleep(1000);
        wait.until(documentReady);
    }
}
