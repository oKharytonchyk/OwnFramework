package levelUpTask.automation.storefront.business;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import levelUpTask.automation.storefront.business.common.CucumberStepDefinitions;
import levelUpTask.automation.storefront.steps.HomePageSteps;
import levelUpTask.automation.storefront.steps.LoginPageSteps;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageDefinitionSteps extends CucumberStepDefinitions {

    @Autowired
    private HomePageSteps homePageSteps;

    @Autowired
    private LoginPageSteps loginPageSteps;

    @Given("^Guest has navigated to Login Page$")
    public void guestHasNavigatedToLoginPage() {
        homePageSteps.navigateToLoginPageOnHomePage();
    }

    @When("^Guest tries log in on Login Page$")
    public void guestTriesLogInOnLoginPage() {
        loginPageSteps.tryToLogIn(dataContext.getPersonalDetails().getCredentials());
    }

    @Then("^global error message on Login Page is shown$")
    public void verifyLoginErrorMessageDisplayed() {
        assertThat(loginPageSteps.isLoginErrorMessageDisplayed())
                .withFailMessage("Login error message is not displayed").isTrue();
    }

}
