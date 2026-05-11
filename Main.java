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
      System.out.println("3. Exit");
      System.out.println("Choose: ");
      String choice = sc.nextLine();


      switch (choice) {
        case "1":
          user = manager.login(sc);
          break;
        case "2":
          user = manager.createAccount(sc);
          break;
        case "3":
          System.out.println("Have a nice day!");
          return;
        default:
          System.out.println("Invalid choice, try again man...");
      }
    }

    System.out.println("\nWelcome, " + user.username);

  while (true) {
    System.out.println("\n--Calendar Menu--");
    System.out.println("1. Schedule an event");
    System.out.println("2. View your events");
    System.out.println("3. Delete an Event");
    System.out.println("4. Exit");
    String choice = sc.nextLine();


    switch (choice) {
      case "1":
        calendar.scheduleEvent(sc, user);
        break;
      case "2":
        calendar.viewEvents(user);
        break;
      case "3":
        calendar.deleteEvent(sc, user);
        break;
      case "4":
        System.out.println("See ya!");
        System.out.println("\n--- Your events ---");
        for (int i = 0; i < user.eventCount; i++) {
          System.out.println((i + 1) + ". " + user.events[i].getDescription());
        }
        return;

      default:
        System.out.println("Invalid choice dude......");
    }
  }
  }
}

  
