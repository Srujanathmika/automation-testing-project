package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",          //  Path to .feature files
        glue = {"stepdefinitions", "hooks"},               //  Include hooks package
        plugin = {
                "pretty",                                 //  Console-readable logs
                "html:target/cucumber-reports.html",      //  HTML report
                "json:target/cucumber-report.json",       //  JSON report (optional but useful)
                "junit:target/cucumber-report.xml"        //  JUnit XML report (for CI tools)
        },
        tags = "",                                         //  You can use @tag to run specific tests
        monochrome = true                                  //  Cleaner console output
)
public class TestRunner {
}


