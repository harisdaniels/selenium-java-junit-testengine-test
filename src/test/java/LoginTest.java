import hooks.SetUp;
import org.pages.LoginPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest extends SetUp {

    @Test
    @DisplayName("Run Login Test")
    public void loginTest() {
        try {
            LoginPage login = new LoginPage(driver);
            Thread.sleep(2000);
            login.fillUsername(login.getUsernameCredentials());
            Thread.sleep(2000);
            login.fillPassword(login.getPasswordCredentials());
            login.clickLoginButton();

            assertEquals("OrangeHRM", driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
