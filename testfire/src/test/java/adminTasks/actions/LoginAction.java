package adminTasks.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

// Action class became depricated since: v1.1.37-rc.9: Release of 1.1.37-rc.9
public class LoginAction implements Interaction{
  private String userName = "";
  private String password = "";
  
  public LoginAction withUserName(String userName) {
    this.userName = userName;
    return this;
  }
  
  public LoginAction withPassword(String password) {
    this.password = password;
    return this;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
        
  }

}
