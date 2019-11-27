package levelUpTask.automation.storefront.steps;

import levelUpTask.automation.framework.enums.Category;
import levelUpTask.automation.storefront.pages.HomePage;
import levelUpTask.automation.storefront.pages.common.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static java.util.stream.Collectors.toList;

@Component
public class HomePageSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private NavigationSteps navigationSteps;

    public void navigateToCategoryViaHeader(Category category) {
        navigationSteps.navigateToCategoryViaHeader(category);
    }

    public void navigateToLoginPageOnHomePage() {
        open(baseUrl);
        navigationSteps.navigateToLoginPage();
    }

    public boolean isPageOpened(Category category) {
        return BasePage.isPageOpened(category.getId());
    }

    public List<String> getSuggestedProductsHref() {
        return homePage.getSuggestedProducts().stream()
                .map(item -> item.$("a").attr("href")).collect(toList());
    }

}
