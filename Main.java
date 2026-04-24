import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AccountManager manager = new AccountManager();
    CalendarSystem calendar = new CalendarSystem();

    System.out.println("----Welcome to the Calendar---");

    User user = null;

    while (user == null) {
      System.out.println("1. Login");
      System.out.println("2. Create Account");
      System.out.println("Choose: ");
      String choice = sc.nextLine();

      if (choice.equals("1")) {
        user = manager.login(sc);
      } else if (choice.equals("2")); {
        user = manager.createAccount(sc);
      } else {
        System.out.println("Invalid choice.");
      }
    }

    System.out.println("\nWelcome, " + user.username);

  while (true) {
    System.out.println("\n--Calendar Menu--");
    System.out.println("1. Schedule an event");
    System.out.println("2. View your events");
    System.out.println("3. Exit");
    String choice = sc.nextLine();

    if (choice.equals("1")) {
      calendar.scheduleEvent(sc, user);
    } else if { (choice.equals("2") {
      calendar.viewEvents(user);
    } else if { (choice.equals("3") {
      System.out.println("See ya");
      break;
    } else {
      System.out.println("Invalid choice man");
    }
  }

  sc.close();
        }
  }

  
