package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class BasicPage {

    public void openPage(String arg0) {
        open(arg0);
    }

    public void pressButtonA(String arg0) {
        $(By.xpath("//a[contains(string(), \"" + arg0 + "\")]")).click();
    }

    public void pageWasChangedTo(String arg0) {
        webdriver().shouldHave(url(arg0));
    }

    public void pressButton(String arg0) {
        $(By.xpath("//button[text()='" + arg0 + "']")).click();
    }
}
