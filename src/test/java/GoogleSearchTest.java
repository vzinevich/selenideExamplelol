import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by user on 15.08.2016.
 */
public class GoogleSearchTest {
    @Test
    public void searchTest(){
        SearchPage searchPage = open("https://www.google.ru/", SearchPage.class);
        searchPage.searchFor("selenium").
                getElements();
    }
}
