package Angular_Form.hook;


import Angular_Form.driverfactory.DriverFactory;
import Angular_Form.utils.CommonUtils;
import Angular_Form.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;


public class MyHooks extends DriverFactory {

    private static Logger logger = LogManager.getLogger(MyHooks.class);
    WebDriver driver;

    @Before
    public void setup() {

        Properties prop = new ConfigReader().intializeProperties();
        DriverFactory.initializeBrowser(prop.getProperty("browser"));
        driver = DriverFactory.getDriver();
        try {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            driver.get(prop.getProperty("url"));
        } catch (TimeoutException timeoutException) {
            System.out.println("WebElement wasn't found");
        }

        logger.info("url loaded in browser " + prop.getProperty("url"));

    }

    @After
    public void tearDown(Scenario scenario) {

        String scenarioName = scenario.getName().replaceAll(" ", "_");

        if (scenario.isFailed()) {

            byte[] srcScreenshot = CommonUtils.takeScreenShot(scenario, driver, scenarioName);
            scenario.attach(srcScreenshot, "image/png", scenarioName);
            logger.info("scenario failed");
        }

        driver.quit();
        logger.info("driver  quit");

    }

}
