package levelUpTask.automation.storefront.steps;

import levelUpTask.automation.core.context.taf.model.person.Credentials;
import levelUpTask.automation.storefront.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPageSteps {

    @Autowired
    private LoginPage loginPage;

    public void tryToLogIn(Credentials credentials) {
        loginPage.getLogin().sendKeys(credentials.getLogin());
        loginPage.getPassword().sendKeys(credentials.getPassword());
        loginPage.getLoginButton().click();
    }

    public boolean isLoginErrorMessageDisplayed() {
        return loginPage.getLoginErrorMessage().isDisplayed();
    }

}
