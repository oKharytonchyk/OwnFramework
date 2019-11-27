package levelUpTask.automation.storefront.pages.navigation;

import levelUpTask.automation.framework.enums.Category;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
@Profile("mobile")
public class NavigationFlowMobileImpl extends AbstractNavigationFlow {

    @Override
    public void navigateToCategoryViaHeader(Category category) {
        openMainMenu();
        super.navigateToCategoryViaHeader(category);
    }

    @Override
    public void navigateToLoginPage() {
        openMainMenu();
        super.navigateToLoginPage();
    }

    private void openMainMenu() {
        $("div.mobile__nav__row span.glyphicon-align-justify").shouldBe(visible).click();
    }

}
