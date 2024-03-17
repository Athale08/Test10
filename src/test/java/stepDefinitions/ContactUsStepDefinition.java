package stepDefinitions;

import appPages.ContactUsPage;
import appPages.HomePage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ContactUsStepDefinition {

    HomePage homePage1 = new HomePage(DriverFactory.getDriver());
    ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());

    @And("user click on contactus button")
    public void user_click_on_contactus_button() {
        homePage1.navigateToLoginPage();

    }
    @And("user enters the {string} and {string} and {string} and {string}")
    public void userEntersTheAndAndAnd(String name, String email, String subject, String message) {
    contactUsPage.enterGetInTouchDetails(name,email,subject,message);
    }
    @And("user click on the submit button")
    public void userClickOnTheSubmitButton() {
        contactUsPage.clickOnSubmitButton();
    }

    @Then("user should be able to view contact us form confirmation")
    public void user_should_be_able_to_view_contact_us_form_confirmation() {

    }


}
