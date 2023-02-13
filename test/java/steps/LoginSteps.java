package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to Gmail application")
    public void user_is_navigated_to_gmail_application() {

    }
    @When("user enters {string}")
    public void user_enters(String email) {
        sendText(login.emailOrPhoneTextField, email);
        click(login.nextEmailPageButton);
    }
    @And("clicks next to then enter invalid {string}")
    public void clicks_next_to_then_enter_invalid(String password) {
        sendText(login.passwordTextField, password);
        click(login.nextPasswordPageButton);

    }
    @Then("user will be met with an {string}")
    public void user_will_be_met_with_an(String error) {
        String errorActual=login.errorMessage.getText();
        Assert.assertEquals(error, errorActual);
    }


}
