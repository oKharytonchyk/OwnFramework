package levelUpTask.automation.storefront.pages.common;

import com.codeborne.selenide.WebDriverRunner;

public interface BasePage {

    static boolean isPageOpened(String exactPage) {
        return WebDriverRunner.url().contains(exactPage);
    }

}
