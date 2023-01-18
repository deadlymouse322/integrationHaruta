package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BaseStep {

    private BasicPage page = new BasicPage();
    @Given("open {string} page")
    public void openPage(String arg0) {
        page.openPage(arg0);
    }

    @And("press button_a {string}")
    public void pressButtonA(String arg0) {
        page.pressButtonA(arg0);
    }

    @Then("page was changed to {string}")
    public void pageWasChangedTo(String arg0) {
        page.pageWasChangedTo(arg0);
    }

    @Then("press button {string}")
    public void pressButton(String arg0) {
        page.pressButton(arg0);
    }
}
