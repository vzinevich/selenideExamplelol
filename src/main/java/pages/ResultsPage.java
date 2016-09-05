package pages;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

/**
 * Created by user on 15.08.2016.
 */
public class ResultsPage {

    public SelenideElement getElement(int index){
        return $$(By.cssSelector(".rc")).get(index);
    }

    public ElementsCollection getElements(){
        return $$(By.cssSelector(".rc"));
    }
}
