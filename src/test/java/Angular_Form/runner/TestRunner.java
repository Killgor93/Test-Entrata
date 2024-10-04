package Angular_Form.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Angular_Form/features",
        glue = {"Angular_Form/stepdefinitions", "Angular_Form/hook"},
        publish = true,
        plugin = {"pretty", "html:target/CucumberReports/CucumberReport.html"})
public class TestRunner {


}
