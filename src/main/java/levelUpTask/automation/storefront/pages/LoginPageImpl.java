package levelUpTask.automation.storefront.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
public class LoginPageImpl implements LoginPage {

    @Override
    public SelenideElement getLogin() {
        return $("input#j_username");
    }

    @Override
    public SelenideElement getPassword() {
        return $("input#j_password");
    }

    @Override
    public SelenideElement getLoginButton() {
        return $("button.btn-primary.btn-block");
    }

    @Override
    public SelenideElement getLoginErrorMessage() {
        return $("div.alert-danger").shouldBe(visible);
    }

}
