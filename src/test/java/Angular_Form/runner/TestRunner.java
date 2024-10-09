package Angular_Form.runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Angular_Form/features",
        glue = {"Angular_Form/stepdefinitions", "Angular_Form/hook"},
        publish = true,
        plugin = {"pretty", "html:target/CucumberReports/CucumberReport.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
