package levelUpTask.automation.storefront.business;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import levelUpTask.automation.framework.enums.Category;
import levelUpTask.automation.storefront.steps.HomePageSteps;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class NavigationDefinitionSteps {

    @Autowired
    private HomePageSteps homePageSteps;

    @When("^Guest navigates to ([\\w\\s]+) Category Page$")
    public void navigateToCategoryPage(Category category) {
        open(baseUrl);
        homePageSteps.navigateToCategoryViaHeader(category);
    }

    @Then("^([\\w\\s]+) Category Page is opened$")
    public void verifyCategoryPageIsOpened(Category category) {
        assertThat(homePageSteps.isPageOpened(category))
                .withFailMessage(category.name() + " category is not opened").isTrue();
    }

}
