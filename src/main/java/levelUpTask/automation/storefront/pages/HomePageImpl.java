package levelUpTask.automation.storefront.pages;

import com.codeborne.selenide.ElementsCollection;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$$;

@Component
public class HomePageImpl implements HomePage {

    @Override
    public ElementsCollection getSuggestedProducts() {
        return $$("div.main__inner-wrapper>div.yCmsContentSlot.no-margin  div.simple-banner");
    }

}
