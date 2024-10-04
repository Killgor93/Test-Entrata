package Angular_Form.driverfactory;

import Angular_Form.utils.CommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class DriverFactory {

    public static WebDriver driver;
    private static Logger logger = LogManager.getLogger(DriverFactory.class);

    public static void initializeBrowser(String browserName) {

        if (browserName.equals("chrome")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
//            driver = WebDriverManager.chromedriver().capabilities(options).create();
            driver = WebDriverManager.chromedriver().create();
            logger.info("chrome driver initialized");
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("firefox  driver initialized");

        } else if (browserName.equals("edge")) {
            driver = new EdgeDriver();
            logger.info("Edge driver initialized");

        } else if (browserName.equals("safari")) {
            driver = new SafariDriver();
            logger.info("safari driver initialized");
        }

        driver.manage().deleteAllCookies();
        //	driver.manage().window().maximize();
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
    }

    public static WebDriver getDriver() {
        return driver;

    }


}