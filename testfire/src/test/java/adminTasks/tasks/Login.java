package adminTasks.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import adminTasks.actions.LoginAction;
import adminTasks.locators.PageLocators;
import adminTasks.models.Constants;
import helpers.GenerateUserCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {
  
  private String user = "";
  private String pw = "";
  
  public Login with(String user) {
    GenerateUserCredentials generateUser = new GenerateUserCredentials();
    
    if (user.matches("new")) {
      Constants.NEW_USER = generateUser.userName();
      user = Constants.NEW_USER;
      Constants.NEW_USER_PASSWORD = generateUser.password();
      pw = Constants.NEW_USER_PASSWORD;
      Constants.FIRST_NAME = generateUser.firstName();
      Constants.LAST_NAME = generateUser.lastName();
    }
    else if (user.matches("admin")) {
      user = Constants.ADMIN_USER;
      user = Constants.ADMIN_PASSWORD;
    }
    
    return this;
  }
  
  @Step("Login as {0} with #user")
  public <T extends Actor> void performAs(T actor) {
    actor.wasAbleTo(
        Click.on(PageLocators.LOGIN_LINK),
        Enter.theValue(user).into(PageLocators.USERNAME),
        Enter.theValue(pw).into(PageLocators.PASSWORD),
        Click.on(PageLocators.LOGIN_SUBMIT)
      );
  }
  
  /** This method (the instrumented part) put our sentences into Serenity
   * report in a proper way. The sentences are defined after @Step annotations
   * @return
   */
  public static Login theUser() {
    return instrumented(Login.class);
  }

}
