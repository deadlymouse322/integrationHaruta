package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {


    public void inputLogin(String arg0) {
        $(By.name("login")).setValue(arg0);
    }

    public void inputPassword(String arg0) {
        $(By.name("password")).setValue(arg0);
    }

    public void inputPasswordConfirmation(String arg0) {
        $(By.name("conformation")).setValue(arg0);
    }
}
