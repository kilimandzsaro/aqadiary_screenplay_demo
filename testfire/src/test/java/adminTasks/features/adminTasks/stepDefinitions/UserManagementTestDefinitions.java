package adminTasks.features.adminTasks.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class UserManagementTestDefinitions {

  Actor anna = Actor.named("Anna");
  
  @Managed private WebDriver herBrowser;
  
  @After
  public void logout() {
    // TODO implement the logout task
  }
  
  @Given("(.*) user logged in to testfire page")
  public void user_log_in_to_testfire_page(String user) {
    // TODO implement the login task
  }
  
  @Given("(?:s|)he creates a new user")
  public void admin_creates_a_new_user() {
    // TODO implement the "create new user" task
  }
  
  @Given("the (.*) user can log in with the (.*) credentials")
  public void user_can_log_in(String user){
    // TODO implement the login task and the check to users
  }
  
  @When("(.*) changes the password of the (.*) user")
  public void admin_changes_the_password(String admin, String user) {
    // TODO implement the password change task
  }
  
  @When("(.*) chages the account type of the (.*) user")
  public void admin_changes_the_account_type(String admin, String user) {
    // TODO implement the account change task
  }
  
  @Then("the (.*) user has the new account type")
  public void user_has_the_account_type() {
    // TODO implement account type check task
  }
}
