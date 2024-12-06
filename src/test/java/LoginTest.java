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
            login.fillUsername("Admin");
            login.fillPassword("admin123");
            login.clickLoginButton();

            assertEquals("OrangeHRM", driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
