package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// This annotation is applied to the entire class hence this is outside the class. Here
// we are using the Cucumber functionality to execute the normal java class.
@RunWith(Cucumber.class)
@CucumberOptions(

        // CucumberOptions will try to read where are your feature files,
        // and your stepDefinition files are available.
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions","CommonActions"},
        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/"

        },tags = "@RegistrationTest"


)
public class JunitTestRunner {



}
