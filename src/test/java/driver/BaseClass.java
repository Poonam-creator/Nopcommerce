package driver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @Before
    public void setup(){

      // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagda\\Downloads\\chromedriver_win32 (85.0)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(2000,  TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().deleteAllCookies();

    }

}
