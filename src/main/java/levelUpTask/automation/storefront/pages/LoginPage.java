package levelUpTask.automation.storefront.pages;

import com.codeborne.selenide.SelenideElement;
import levelUpTask.automation.storefront.pages.common.BasePage;

public interface LoginPage extends BasePage {

    SelenideElement getLogin();

    SelenideElement getPassword();

    SelenideElement getLoginButton();

    SelenideElement getLoginErrorMessage();

}
