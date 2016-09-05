/**
 * Created by user on 15.08.2016.
 */
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Tests {

    @Test
    public void testExample(){
        System.setProperty("selenide.browser", "chrome");
        Configuration.browserSize = "100%";
        //Configuration.startMaximized = true;
        open("https://www.google.ru/");
        $(By.id("lst-ib")).setValue("selenium").pressEnter();
        $$(By.cssSelector(".rc")).shouldHaveSize(11);
        
    }

    @Test
    public void downloadTest() throws IOException {
        open("https://the-internet.herokuapp.com/download");
        File someFile = $$(By.cssSelector(".example a")).get(1).download();
    }

    @Test
    public void uploadTest(){
        Configuration.holdBrowserOpen = true;
        open("https://the-internet.herokuapp.com/upload");
        $(By.id("file-upload")).uploadFile(new File("test.txt"));
        $(By.id("file-submit")).click();
        $(By.id("uploaded-files")).shouldHave(text("test.txt"));
    }
}
