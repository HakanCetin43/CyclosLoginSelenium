package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public static WebElement element=null;

    public static void loginNameButton(WebDriverWait wait){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("principal")));
        element.sendKeys("demo");
    }


    public static void loginPasswordButton(WebDriverWait wait){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        element.sendKeys("1234");

    }
    public static void signInClickButton(WebDriverWait wait){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='actionButtonText']")));
        element.click();
    }



}

