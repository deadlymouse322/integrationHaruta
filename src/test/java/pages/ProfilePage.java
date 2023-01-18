package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public void messageIsVisible(String arg0) {
        $(By.xpath("//div[contains(string(), \"" + arg0 + "\")]")).shouldBe(Condition.visible);
    }

    public void buttonIsVisible(String arg0) {
        $(By.xpath("//a[contains(string(), \"" + arg0 + "\")]")).shouldBe(Condition.visible);
    }

    public void inputWebPassword(String arg0) {
        $(By.name("web-password")).setValue(arg0);
    }

    public void inputWebPasswordConfirmation(String arg0) {
        $(By.id("web-password-c")).setValue(arg0);
    }
}
