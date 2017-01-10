package adminTasks.models;

public enum Selection {
  StartPage("http://testfire.net/"),
  SomethingElse("url");
  
  private final String url;
  
  Selection(String url) { this.url = url;}
  
  public String url() { return url; }

}
