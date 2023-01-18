package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SignUpPage;

public class SignUpSteps {

    SignUpPage page = new SignUpPage();
    @Then("input login {string}")
    public void inputLogin(String arg0) {
        page.inputLogin(arg0);
    }

    @And("input password {string}")
    public void inputPassword(String arg0) {
        page.inputPassword(arg0);
    }

    @And("input password confirmation {string}")
    public void inputPasswordConfirmation(String arg0) {
        page.inputPasswordConfirmation(arg0);
    }
}
