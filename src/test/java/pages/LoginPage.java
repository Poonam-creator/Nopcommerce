package pages;

import driver.BaseClass;
import org.openqa.selenium.By;


public class LoginPage extends BaseClass {

    public void login(String email, String password){
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(email); //admin@yourstore.com

        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys(password);

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input")).click();
    }

}
