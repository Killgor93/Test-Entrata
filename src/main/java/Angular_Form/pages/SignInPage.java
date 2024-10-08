package Angular_Form.pages;

import Angular_Form.utils.ElementUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sun.security.util.Password;


public class SignInPage  {
    private WebDriver driver ;
    private final ElementUtils elementUtils;



    @FindBy(xpath = "//*[contains(@id,'cookie-accept')]")
    private WebElement AcceptCookies;

    @FindBy(xpath = "//*[contains(text(),'Schedule Your Demo')]")
    private WebElement scheduledemobutton;

    @FindBy(xpath = "(//*[contains(@id,'FirstName')])[2]")
    private WebElement Firstname;

    @FindBy(xpath = "(//*[contains(text(),'SCHEDULE DEMO')])[1]")
    private WebElement SCHEDULEDEMO;
    @FindBy(xpath = "(//*[contains(text(),'This field is required.')])[1]")
    private WebElement Errorpopup;
    @FindBy(xpath = "//*[@class='signin-button mb-full']")
    private WebElement signinbutton;
    @FindBy(xpath = "//*[@class='button hover_black new-button w-inline-block']")
    private WebElement PropManlogin;
    @FindBy(xpath ="//*[contains(@id,'entrata-username')]" )
    private WebElement USERNAME;
    @FindBy(xpath = "//*[contains(@id,'entrata-password')]")
    private WebElement PASSWORD;
    @FindBy(xpath = "//*[@class='white-button mb-full w-inline-block']")
    private WebElement Watchdemobutton;
    @FindBy(xpath = "(//button[normalize-space()='WATCH DEMO'])[1]")
    private WebElement watchdemo;
    @FindBy(xpath = "//*[contains(@id, 'ValidMsgFirstName')]")
    private WebElement errormsg;
    @FindBy(xpath = "//*[@class='outline-btn reversed js-submit-form']")
    private WebElement PMSignbutton;

  @FindBy(xpath = "//*[contains(@id, 'statusMessage')]")
  private WebElement Signerrormgs;


    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    public void AcceptCookies(){
        elementUtils.clickElement(AcceptCookies);
    }
    public void scheduledemobutton() throws InterruptedException {
        Thread.sleep(2000);
        elementUtils.clickElement(scheduledemobutton);
    }
    public void Firstname(){
        elementUtils.clickElement(Firstname);


    }
    public void SCHEDULEDEMO() throws InterruptedException {
        elementUtils.clickElement(SCHEDULEDEMO);


    }


    public void scrolltobottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(9000, document.body.scrollHeight)");


    }
    public void scrolltoup() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(-1000, document.body.scrollHeight)");
        Thread.sleep(2000);


    }

    public void validatefirstname() {
        elementUtils.getElementText(Errorpopup);
    }

    public void signinbutton() {
        elementUtils.clickElement(signinbutton);
    }

    public void pmlogin() {

        elementUtils.clickElement(PropManlogin);

    }

    public void username() {
        elementUtils.clearAndSendKeys(USERNAME, "Akshay");
    }

    public void password() {
        elementUtils.clearAndSendKeys(PASSWORD,"Admin123");
    }

    public void watchdemobutton() {
        elementUtils.clickElement(Watchdemobutton);
    }

    public void watchdemo() {
        elementUtils.clickElement(watchdemo);
    }


    public void validateErrorMessage(String errormessage) {
        String getErrorMessage=elementUtils.getElementText(errormsg);
       boolean result = errormessage.equals(getErrorMessage);
       Assert.assertTrue(result);
    }

    public void validatesigninerrormsg(String errormsg) {
        String getErrorMassage=elementUtils.getElementText(Signerrormgs);
        boolean result = errormsg.equals(getErrorMassage);
        Assert.assertTrue(result);
    }

    public void signinbuttonPM() {
        elementUtils.clickElement(PMSignbutton);
    }
}
