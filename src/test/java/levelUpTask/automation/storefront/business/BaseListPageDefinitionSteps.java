package levelUpTask.automation.storefront.business;

import cucumber.api.java.en.Then;
import levelUpTask.automation.framework.enums.Category;
import levelUpTask.automation.storefront.business.common.CucumberStepDefinitions;
import levelUpTask.automation.storefront.steps.BaseListPageSteps;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseListPageDefinitionSteps extends CucumberStepDefinitions {

    @Autowired
    private BaseListPageSteps baseListPageSteps;

    @Then("^(\\w+) breadcrumb is active on PLP$")
    public void verifyBreadcrumbCategoryIsActive(Category category) {
        assertThat(baseListPageSteps.isBreadcrumbActive(category.name()))
                .withFailMessage(category.name() + " category is not opened").isTrue();
    }

}
