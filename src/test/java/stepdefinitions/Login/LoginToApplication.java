package stepdefinitions.Login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import pages.Login.LoginPage;


public class LoginToApplication extends PageObject {
    @Steps
    LoginPage loginPage;
    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage.open();
    }
    @When("User enters valid email {string} and password {string}")
    public void user_enters_valid_email_and_password(String email, String password) {
        loginPage.enterCredetials( email, password );
        loginPage.clickLoginBtn();
    }
    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        loginPage.verifyLogin();
    }

}
