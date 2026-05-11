import java.util.Scanner;

public class AccountManager {

  User[] users = new User[10];
  int userCount = 0;

  public AccountManager() {
    // These are the test accounts (Pre-made accounts)


    User u1 = new User("JohnCena", "Youcantseeme123!");
    User u2 = new User("Tyler", "Password123!@#$");
    User u3 = new User("Brian", "Password2123!@#$");
    
    users[userCount++] = u1;
    users[userCount++] = u2;
    users[userCount++] = u3;

    u1.addEvent(new Event(2, 4, "Fighting Dwayne"));
    u1.addEvent(new Event(10, 29, "Halloween shopping"));
    u1.addEvent(new Event(6, 3, "Becoming invisible and scaring people"));

    u2.addEvent(new Event( 6, 25, "Birthday "));
    u2.addEvent(new Event( 5, 2, "Meeting up with friends"));
    u2.addEvent(new Event( 12, 15, "Dinner with family"));

    u3.addEvent(new Event(1, 4, "Scuba diving"));
    u3.addEvent(new Event(5, 9, "Volcano tour"));
    u3.addEvent(new Event(12, 24, "Meeting Gojo"));
  }

  public User login(Scanner sc) {
    System.out.print("Username: ");
    String u = sc.nextLine();
    System.out.print("Password: ");
    String p = sc.nextLine();


    for (int i = 0; i < userCount; i++) {
      if (users[i].username.equals(u) && users[i].password.equals(p)) {
        return users[i];
      }
    }
    
    System.out.println("______________________________");
    System.out.println("Invalid login");
    System.out.println("______________________________");
    return null;
  }

  public User createAccount(Scanner sc) {
    System.out.print("Choose a username: ");
    String u = sc.nextLine();

    String p = "";
      while (true) {
        System.out.print("Choose a password: ");
        p = sc.nextLine();


        if (validatePassword(p)) {
          break;
        } else {
          System.out.println("Password must have:");
          System.out.println(" 10+ characters");
          System.out.println(" At least one Uppercase letter");
          System.out.println(" At least one Lowercase letter");
          System.out.println(" At least one number");
          System.out.println(" At least one special character !@#$%^&*()-=[]{}|;:,./<>?");
        }
    }

    User newUser = new User(u, p);
    users[userCount++] = newUser;
    return newUser;
  }

  private boolean validatePassword(String p) {
    if (p.length() < 10) return false;

    boolean lower = false, upper = false, num = false, special = false;
    String specialz = "!@#$%^&*()-=[]{}|;:,./<>?";

    for (int i = 0; i < p.length(); i++) {
      char c = p.charAt(i);

      if (Character.isLowerCase(c)) lower = true;
      if (Character.isUpperCase(c)) upper = true;
      if (Character.isDigit(c)) num = true;
      if (specialz.indexOf(c) >= 0) special = true;
    }
    return lower && upper && num && special;
  }
}


