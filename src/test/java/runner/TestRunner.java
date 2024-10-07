package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/HomeWork.feature" ,
        glue = "stepdefinitions",
        plugin = {"pretty" , "html:target/primetech-report.html",
                "json:target/primetech-report.json"}




)
public class TestRunner {

}


