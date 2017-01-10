package adminTasks.locators;

import net.serenitybdd.screenplay.targets.Target;

public class PageLocators {
  public static Target LOGIN_LINK = Target.the("Login link").locatedBy("#_ctl0__ctl0_LoginLink");
  public static Target USERNAME = Target.the("Username field").locatedBy("#uid");
  public static Target PASSWORD = Target.the("Password field").locatedBy("#passw");
  public static Target LOGIN_SUBMIT = Target.the("Login button").locatedBy("//input[@value='login']");
}
