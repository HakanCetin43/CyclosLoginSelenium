package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage {

   public static WebElement element=null;

    public static WebDriver navigate(WebDriver driver) {
       driver.navigate().to("https://demo.cyclos.org/");
       driver.manage().window().maximize();
       return driver;
    }

    public static void signInButton(WebDriverWait wait){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Sign in')]")));
       element.click();
    }



}
