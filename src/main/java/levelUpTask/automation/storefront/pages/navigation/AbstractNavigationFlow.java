package levelUpTask.automation.storefront.pages.navigation;

import com.codeborne.selenide.SelenideElement;
import levelUpTask.automation.framework.enums.Category;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

abstract public class AbstractNavigationFlow implements NavigationFlow {

    @Override
    public void navigateToCategoryViaHeader(Category category) {
        SelenideElement expectedCategory = $$("ul.js-offcanvas-links li.nav__links--primary span a").stream()
                .filter(categoryItem -> categoryItem.attr("href").contains(category.getId())).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("I didn`t found category with id:" + category.getId()));
        expectedCategory.shouldBe(visible).click();
    }

    @Override
    public void navigateToLoginPage() {
        $$("nav.navigation a[href*='login']").filterBy(visible).first().click();
    }

}
