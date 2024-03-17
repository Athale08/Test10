package appPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    public WebDriver driver;

    public BasePage( WebDriver driver){
        this.driver = driver;
    }

    public void clickElement( By by){
        driver.findElement(by).click();
    }

    public void clickElementUsingJs(By by){
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
    public void inputInfo(By by, String input){
        driver.findElement(by).sendKeys(input);
    }

    public void dropDownElement(By by, String value){
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByVisibleText(value);
    }
    public void handleAlert(String decision){
        Alert alert = driver.switchTo().alert();
        if(decision.equals("accept")) {
            alert.accept();
        }
        else{
            alert.dismiss();
        }
    }


}
