package helpers;

public class GenerateTestData {
  
  private GenerateUserCredentials generateUser;
  private String userName;
  private String password;
  private String firstName;
  private String lastName;
  
  public GenerateTestData(String user) {
    generateUser = new GenerateUserCredentials();
    if (user.matches("new")) { 
      generateNewUser();
    }
  }
  
  public void generateNewUser() {
    userName = generateUser.userName();
    password = generateUser.password();
    firstName = generateUser.firstName();
    lastName = generateUser.lastName();
  }
  
  public String getUserName() {
    return userName;
  }
  
  public String getPassword() {
    return password;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
}
