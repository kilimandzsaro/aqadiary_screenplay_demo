package adminTasks.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import adminTasks.locators.PageLocators;
import adminTasks.models.Selection;
import helpers.GenerateTestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ManageUsers implements Task{
  
  private static String userName;
  private static String password;
  private static String firstName;
  private static String lastName;

  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(PageLocators.USER_MANAGEMENT),
        Enter.theValue(firstName).into(PageLocators.FIRSTNAMEFIELD),
        Enter.theValue(lastName).into(PageLocators.LASTNAMEFIELD),
        Enter.theValue(userName).into(PageLocators.USERNAMEFIELD),
        Enter.theValue(password).into(PageLocators.PASSWORDFIELD)
        );
    
  }

  public static ManageUsers createNewUser() {
    GenerateTestData userData = new GenerateTestData("new");
    userName  = userData.getUserName();
    password  = userData.getPassword();
    firstName = userData.getFirstName();
    lastName  = userData.getLastName();
    return null;
  }
  
  public static ManageUsers to(Selection selection) {
    return instrumented(ManageUsers.class, selection);
  }

}
