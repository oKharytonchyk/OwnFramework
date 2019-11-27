package levelUpTask.automation.storefront.steps;

import levelUpTask.automation.framework.enums.Category;
import levelUpTask.automation.storefront.pages.navigation.NavigationFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NavigationSteps {

    @Autowired
    private NavigationFlow navigationFlow;

    public void navigateToCategoryViaHeader(Category category) {
        navigationFlow.navigateToCategoryViaHeader(category);
    }

    public void navigateToLoginPage() {
        navigationFlow.navigateToLoginPage();
    }

}
