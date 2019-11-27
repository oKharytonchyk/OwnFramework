package levelUpTask.automation.storefront.business;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import levelUpTask.automation.core.testdata.service.FileService;
import levelUpTask.automation.storefront.business.common.CucumberStepDefinitions;
import levelUpTask.automation.storefront.steps.HomePageSteps;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePageDefinitionSteps extends CucumberStepDefinitions {

    @Autowired
    private HomePageSteps homePageSteps;

    @Autowired
    private FileService fileService;

    @Given("^Guest has navigated to Home Page$")
    public void navigateToHomePage() {
        open(baseUrl);
    }

    @When("^Guest saves suggested products to file$")
    public void saveSuggestedProductsToFile() {
        fileService.writeStringsToFile(homePageSteps.getSuggestedProductsHref());
    }

    @Then("^suggested products are saved to file$")
    public void suggestedProductsAreSavedToFile() {
        List<String> expectedHrefs = homePageSteps.getSuggestedProductsHref();
        assertThat(fileService.isFileContainsAllStrings(expectedHrefs))
                .withFailMessage("File does not contain all the strings").isTrue();

    }

}
