package levelUpTask.automation.storefront.pages;

import com.codeborne.selenide.ElementsCollection;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
public class BaseListPageImpl implements BaseListPage {

    public boolean isBreadcrumbActive(String item) {
        return getBreadcrumbItems().stream().anyMatch(breadcrumb ->
                breadcrumb.attr("class").contains("active") && breadcrumb.text().equalsIgnoreCase(item));
    }

    private ElementsCollection getBreadcrumbItems() {
        return $("div.breadcrumb-section").shouldBe(visible).$$("li");
    }

}
