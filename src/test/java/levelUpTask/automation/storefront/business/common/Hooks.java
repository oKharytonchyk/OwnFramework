package levelUpTask.automation.storefront.business.common;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import levelUpTask.automation.core.context.TestDataContext;
import levelUpTask.automation.core.testdata.TestDataSteps;
import levelUpTask.automation.core.utils.ProfileUtils;
import levelUpTask.automation.framework.spring.AppConfig;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

import static com.codeborne.selenide.WebDriverRunner.getSelenideDriver;

@ContextConfiguration(classes = AppConfig.class)
public final class Hooks {

    @Value("${webdriver.base.url}")
    private String baseUrl;

    @Value("${webdriver.timeout}")
    private long timeout;

    @Value("${webdriver.pollingInterval}")
    private long pollingInterval;

    @Value("${webdriver.browser}")
    private String browser;

    @Value("${mobile.browser.size}")
    private String mobileBrowserSize;

    @Autowired
    private ProfileUtils profileUtils;

    @Autowired
    private TestDataContext dataContext;

    @Autowired
    private TestDataSteps testDataSteps;

    @Before(order = 1)
    public void setBrowser() {
        Configuration.browser = browser;
    }

    @Before(order = 2)
    public void setupTimeout() {
        Configuration.pollingInterval = pollingInterval;
        Configuration.timeout = timeout;
    }

    @Before(order = 3)
    public void setupBaseURL() {
        Configuration.baseUrl = baseUrl;
    }

    @Before(order = 4)
    public void resizeBrowser() {
        if (profileUtils.isMobile()) {
            Configuration.browserSize = mobileBrowserSize;
        } else {
            Configuration.startMaximized = true;
        }
    }

    @Before(order = 4)
    public void generatePersonalDetails() {
        dataContext.setPersonalDetails(testDataSteps.createPersonalDetails());
    }

    @After(order = 1)
    public void clearBrowser() {
        clearBrowserCache();
    }

    private void clearBrowserCache() {
        JavascriptExecutor jsExecutor = ((JavascriptExecutor) WebDriverRunner.getWebDriver());
        jsExecutor.executeScript("localStorage.clear();");
        jsExecutor.executeScript("sessionStorage.clear();");
        getSelenideDriver().getWebDriver().manage().getCookies()
                .forEach(cookie -> getSelenideDriver().getWebDriver().manage().deleteCookieNamed(cookie.getName()));
    }

}
