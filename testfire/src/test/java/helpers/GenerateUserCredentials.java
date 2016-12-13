package helpers;

import java.util.Random;

public class GenerateUserCredentials {
  
  private String[] firstNames = {"John", "Jack", "Jamie", "Jinnie", "Jane",
      "Joanah", "Jeanniene", "Johny", "Janos", "Jolan", "Jeromos", "Jakob",
      "Jeff", "Jensen", "Joe"};
  private String[] lastNames = {"Ackles", "Apple", "Arma", "Ambrus", "Alf",
      "Afrodisiak", "Amphiteatrum", "Anecdote", "Amaranthe", "Atlas","Antal",
      "Annihilator", "Amorphis", "Anthrax", "Arch", "Anita", "Assam"};
  private Random rng;
  
  public GenerateUserCredentials() {
    rng = new Random();
  }
  
  public String userName() {
    return generate(8);
  }
  
  public String password() {
    return generate(8);
  }
  
  public String firstName() {
    return firstNames[rng.nextInt(firstNames.length)];
  }
  
  public String lastName() {
    return lastNames[rng.nextInt(lastNames.length)];
  }
  
  private String generate(int length) {
    String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
    char[] text = new char[length];
    for (int i = 0; i < length; i++) {
      text[i] = characters.charAt(rng.nextInt(characters.length()));
    }
    return new String(text);
  }
}
