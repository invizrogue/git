package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    private final SelenideElement fieldSearch = $("form[role='search'] input[name='q']");
    private final ElementsCollection resultLinks = $$("div.g a cite");

    public GooglePage(String url) {
        open(url);
    }

    public void fillFieldSearch(String searchString) {
        fieldSearch.setValue(searchString);
        fieldSearch.sendKeys(Keys.ENTER);
    }

    public void checkFirstLinkMustMatch(String matchString) {
        resultLinks.first().shouldHave(Condition.matchText(matchString));
    }
}
