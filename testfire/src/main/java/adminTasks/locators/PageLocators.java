package adminTasks.locators;

import net.serenitybdd.screenplay.targets.Target;

public class PageLocators {
  
  // Login locators
  public static Target LOGIN_LINK = Target.the("Login link").locatedBy("#_ctl0__ctl0_LoginLink");
  public static Target USERNAME = Target.the("Username field").locatedBy("#uid");
  public static Target PASSWORD = Target.the("Password field").locatedBy("#passw");
  public static Target LOGIN_SUBMIT = Target.the("Login button").locatedBy("//input[@value='login']");
  
  // User management locators
  public static Target PASSWORDFIELD = null;
  public static Target USERNAMEFIELD = null;
  public static Target LASTNAMEFIELD = null;
  public static Target USER_MANAGEMENT = null;
  public static Target FIRSTNAMEFIELD = null;
}
