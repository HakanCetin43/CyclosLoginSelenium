package page.classes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WelcomePage {

    public static WebElement element=null;

    public static WebElement viewText(WebDriverWait wait){
       element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Welcome to the Cyclos4 Demo']")));
       return element;

    }
    public static void getText (WebDriverWait wait){
       boolean element = viewText(wait).isDisplayed();
        Assert.assertEquals(true, element);

    }
}
