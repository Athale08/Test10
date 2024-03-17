package appPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactUsPage extends BasePage {

    public WebDriver driver; // create a constructor and webdriver

    public ContactUsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
// locate the elements
    private By contactUsLink = By.xpath("//a[@href='/contact_us']");
    private By textName = By.xpath("//input[@data-qa='name']");
    private By textEmail = By.xpath("//input[@data-qa='email']");
    private By textSubject = By.xpath("//input[@data-qa='subject']");
    private By textMessage = By.id("message");
    private By submitButton = By.xpath("//input[@data-qa='submit-button']");

    public void enterGetInTouchDetails(String name, String email, String subject, String message) {


        Faker faker = new Faker();
        clickElement(contactUsLink);
       // driver.findElement(textName).sendKeys(name + faker.name().name());
        inputInfo(textName, name + faker.name().name());
       // driver.findElement(textEmail).sendKeys(email + faker.name().firstName() + "kishoretraining123@gmail.com");
        inputInfo(textEmail, email + faker.name().firstName() + "kishoretraining123@gmail.com");
       // driver.findElement(textSubject).sendKeys(subject);
        inputInfo(textSubject, subject);
        //driver.findElement(textMessage).sendKeys(message + faker.letterify("HelloWorld"));
        inputInfo(textMessage, message + faker.letterify("HelloWorld") );


    }
    public void clickOnSubmitButton(){
        clickElement(submitButton);
    }



}
