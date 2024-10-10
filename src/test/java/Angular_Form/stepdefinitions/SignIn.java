package Angular_Form.stepdefinitions;

import Angular_Form.driverfactory.DriverFactory;
import Angular_Form.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;



public class SignIn {
    WebDriver driver;
    SignInPage signInPage = new SignInPage(DriverFactory.getDriver());


    @Given("user clicks on accept cookies button")
    public void userClicksOnAcceptCookiesButton() {signInPage.AcceptCookies();
    }

    @Given("User Clicks on the schedule demo button")
    public void userClicksOnTheScheduleDemoButton() throws InterruptedException {signInPage.scheduledemobutton();
    }

    @Given("User Enters the First Name")
    public void userEntersTheFirstName() {signInPage.Firstname();
    }

    @Given("User Clicks on the schedule demo button with out filling all the details")
    public void userClicksOnTheScheduleDemoButtonWithOutFillingAllTheDetails() throws InterruptedException {signInPage.SCHEDULEDEMO();

    }


    @Then("user scroll to bottom of the page")
    public void userScrollToBottomOfThePage(){signInPage.scrolltobottom();
    }

    @Then("user gets error massage validate firstname")
    public void userGetsErrorMassageValidateFirstname() {signInPage.validatefirstname();
    }

    @Given("User clicks on sign in button")
    public void userClicksOnSignInButton() { signInPage.signinbutton();
    }

    @Then("Then User Clicks On the Property Manager login")
    public void thenUserClicksOnThePropertyManagerLogin(){signInPage.pmlogin();
    }

    @Then("the user enters username")
    public void theUserEntersUsername() {signInPage.username();
    }

    @Then("the user enters password")
    public void theUserEntersPassword() {signInPage.password();
    }

    @Then("the user clicks on log in button")
    public void theUserClicksOnLogInButton() {signInPage.signinbuttonPM();
    }

    @Then("User clicks on the Watch Demo button")
    public void userClicksOnTheWatchDemoButton() {signInPage.watchdemobutton();
    }

    @Then("User Clicks on the watch demo button with out filling all the details")
    public void userClicksOnTheWatchDemoButtonWithOutFillingAllTheDetails() {signInPage.watchdemo();
    }

    @Then("user scroll to top of the page")
    public void userScrollToTopOfThePage() throws InterruptedException {signInPage.scrolltoup();
    }

    @Then("user should able to see {string} message")
    public void userShouldAbleToSeeMessage(String errormessage) {signInPage.validateErrorMessage(errormessage);
    }

    @Then("the user gets {string} invalid credentials")
    public void theUserGetsInvalidCredentials(String errormsg) {signInPage.validatesigninerrormsg(errormsg);
    }
}
