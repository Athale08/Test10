package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public WebDriver driver;

    //tagName[@attributeName='attributevalue']

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
// here we used the local and instance variable to share the driver across pages.This is setting up your constructor.
// now we will locate the elements by using 'By' class. But as we dont want it to be used outside this class we will make it private.
    private By textEmailAddress = By.xpath("//input[@data-qa = 'login-email']");
    private By textPassword = By.xpath("//input[@data-qa = 'login-password']");
    private By buttonLogin = By.xpath("//button[@data-qa = 'login-button']");

    // now we will create a method to open the login page and give two parameters.
    public void loginToApp(String email,String password){

        //driver.findElement(textEmailAddress).sendKeys(email);
        inputInfo(textEmailAddress, email);
        //driver.findElement(textPassword).sendKeys(password);
        inputInfo(textPassword, password);
        clickElement(buttonLogin);
    }




}
