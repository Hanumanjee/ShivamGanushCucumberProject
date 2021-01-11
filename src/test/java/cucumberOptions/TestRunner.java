package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features/search.feature", glue = "stepDefinitions",
       monochrome=true, tags="@RegressionTest",
        plugin= {"pretty","html:target/cucumber/index.html","json:target/cucumber/cucumber.json","junit:target/cucumber/cukes.xml"}
)
public class TestRunner {

}
