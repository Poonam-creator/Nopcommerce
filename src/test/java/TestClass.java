import driver.BaseClass;
import org.junit.Test;
import pages.LoginPage;

public class TestClass extends BaseClass {
    LoginPage loginPage = new LoginPage();
@Test
    public void verifyLogin(){
        loginPage.login("admin@yourstore.com", "admin");
    }

}
