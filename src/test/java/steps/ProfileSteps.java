package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProfilePage;

public class ProfileSteps {

    private ProfilePage page = new ProfilePage();
    @Then("message {string} is visible")
    public void messageIsVisible(String arg0) {
        page.messageIsVisible(arg0);
    }

    @Then("button {string} is visible")
    public void buttonIsVisible(String arg0) {
        page.buttonIsVisible(arg0);
    }

    @Then("input web password {string}")
    public void inputWebPassword(String arg0) {
        page.inputWebPassword(arg0);
    }

    @Then("input web password confirmation {string}")
    public void inputWebPasswordConfirmation(String arg0) {
        page.inputWebPasswordConfirmation(arg0);
    }
}
