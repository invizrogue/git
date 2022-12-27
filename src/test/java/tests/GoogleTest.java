package tests;

import base.BaseTest;
import pages.GooglePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    @Parameters({"BASE_URL", "SEARCH_STRING", "EXPECTED_RESULT"})
    void shouldBeSelenideAtResultsPage(String BASE_URL, String SEARCH_STRING, String EXPECTED_RESULT) {
        // открываем google.com
        GooglePage googlePage = new GooglePage(BASE_URL);
        // вводим в поле строку поиска
        googlePage.fillFieldSearch(SEARCH_STRING);
        // сравниваем ожидаемый и фактический результат
        googlePage.checkFirstLinkMustMatch(EXPECTED_RESULT);
        int i = 0; // точка останова для дебага
    }
}
