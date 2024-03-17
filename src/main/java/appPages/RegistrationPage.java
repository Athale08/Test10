package appPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

    public WebDriver driver; // create a constructor and webdriver

    public RegistrationPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    // locate the elements
    private By textUsername = By.xpath("//input[@data-qa='signup-name']");
    private By textEmailAddress = By.xpath("//input[@data-qa='signup-email']");
    private By buttonSignup = By.xpath("//button[@data-qa='signup-button']");
    private By labelMr = By.xpath("//label[@for='id_gender1']");
    private By labelMrs = By.xpath("//label[@for='id_gender2']");
    private By textPassword = By.xpath("//input[@data-qa='password']");
    private By dropDownDay = By.id("days");
    private By dropDownMonth = By.id("months");
    private By dropDownYear = By.id("years");
    private By textFirstName = By.xpath("//input[@data-qa='first_name']");
    private By textLastName = By.xpath("//input[@data-qa='last_name']");
    private By textAddress = By.xpath("//input[@data-qa='address']");
    private By textAddress2 = By.xpath("//input[@data-qa='address2']");
    private By dropDownCountry = By.id("country");
    private By textState = By.xpath("//input[@data-qa='state']");
    private By textCity = By.xpath("//input[@data-qa='city']");
    private By textZipCode = By.xpath("//input[@data-qa='zipcode']");
    private By textMobileNumber = By.xpath("//input[@data-qa='mobile_number']");
    private By buttonCreateAccount = By.xpath("//button[@data-qa='create-account']");

    // create a method to perform the actions
    public void enterSignUpDetails(String username, String emailID){


        Faker faker = new Faker();



       // driver.findElement(textUsername).sendKeys(username + faker.name().name());
        inputInfo(textUsername, username + faker.name().name() );
      //  driver.findElement(textEmailAddress).sendKeys(emailID+faker.name().firstName()+"kishoretraining@gmail.com");
        inputInfo(textEmailAddress, emailID+faker.name().firstName()+"kishoretraining@gmail.com");
        clickElement(buttonSignup);
    }


    public void enterInitialInfo(String title, String password,String day, String month, String year){

        if(title.equalsIgnoreCase("Mr")){
            clickElement(labelMr);
        }
        else{
            clickElement(labelMrs);
        }

      //  driver.findElement(textPassword).sendKeys(password);
        inputInfo(textPassword, password);

       // Select days = new Select(driver.findElement(dropDownDay));
       // days.selectByVisibleText(day);
        dropDownElement(dropDownDay, day);

      //  Select months = new Select(driver.findElement(dropDownMonth));
       // months.selectByVisibleText(month);
        dropDownElement(dropDownMonth, month);

       // Select years = new Select(driver.findElement(dropDownYear));
     //   years.selectByVisibleText(year);
        dropDownElement(dropDownYear, year);
    }
    public void enterAddressInfo(String firstname, String lastname, String address1, String address2) {
        Faker faker1 = new Faker();
       // driver.findElement(textFirstName).sendKeys(firstname +faker1.funnyName().name());
        inputInfo(textFirstName, firstname +faker1.funnyName().name() );
       // driver.findElement(textLastName).sendKeys(lastname + faker1.funnyName().name());
        inputInfo(textLastName, lastname + faker1.funnyName().name());
       // driver.findElement(textAddress).sendKeys(address1);
        inputInfo(textAddress, address1);
       // driver.findElement(textAddress2).sendKeys(address2);
        inputInfo(textAddress2, address2);

    }
    public void enterAddressInfoCntd(String country, String state, String city, String zipcode, String mobilenumber){

        Faker faker2 = new Faker();

        Select countrys = new Select(driver.findElement(dropDownCountry));
        countrys.selectByVisibleText(country);

       // driver.findElement(textState).sendKeys(state);
        inputInfo(textState, state);
       // driver.findElement(textCity).sendKeys(city);
        inputInfo(textCity,city);
       // driver.findElement(textZipCode).sendKeys(zipcode);
        inputInfo(textZipCode,zipcode);
       // driver.findElement(textMobileNumber).sendKeys(mobilenumber + faker2.phoneNumber().cellPhone());
        inputInfo(textMobileNumber, mobilenumber + faker2.phoneNumber().cellPhone());

    }
    public void ClickButton(){

     //clickElement(buttonCreateAccount);
//The above method gives a 'clickElementInterception exception'. To avoid this we will use the JavaScriptExecutor method//
// This method is used when the click element is not in direct view so without scrolling, the click can be done.
        clickElementUsingJs(buttonCreateAccount);
    }



}
