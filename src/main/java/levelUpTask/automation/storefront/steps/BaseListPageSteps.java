package levelUpTask.automation.storefront.steps;

import levelUpTask.automation.storefront.pages.BaseListPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseListPageSteps {

    @Autowired
    private BaseListPage baseListPage;

    public boolean isBreadcrumbActive(String item) {
        return baseListPage.isBreadcrumbActive(item);
    }

}
