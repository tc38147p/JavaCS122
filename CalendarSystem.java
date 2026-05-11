import java.util.Scanner;

public class CalendarSystem {
  WeatherPredictor weather = new WeatherPredictor();
  RecommendationEngine rec = new RecommendationEngine();
  HolidayManager holidayManager = new HolidayManager();

// Calendar Printing (No highlights)

  public void printMonthWithHighlights(int month, User user) {
    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
  
    int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  
    System.out.println("\n    " + monthNames[month - 1] + " 2027");
    System.out.println("Su Mo Tu We Th Fr Sa");
  
    int startDay = (month * 2 + 3) % 7;
  
    for (int i = 0; i < startDay; i++) {
      System.out.print("   ");
    }
  
    for (int day = 1; day <= daysInMonth[month - 1]; day++) {
      boolean hasEvent = false;
      boolean isHoliday = false;
  
      if (user!= null) {
        for (int i = 0; i < user.eventCount; i++) {
          Event e = user.events[i];
          if (e.month == month && e.day == day) {
            hasEvent = true;
            break;
  
          }
        }
      }

      String holidayName = holidayManager.getHoliday(month, day);
      if (holidayName != null) {
        isHoliday = true;
    }

      if (isHoliday) {
        if (day <10) System.out.print("{" + day + "}");
          else System.out.print("{" + day + "}");
      }
      else if (hasEvent) {
        if (day < 10) System.out.print("[" + day + "]");
        else System.out.print("[" + day + "]");
      } else {
          if (day < 10) System.out.print(" " + day + " ");
          else System.out.print(day + " ");
      }
  
      if ((day + startDay) % 7 == 0) {
        System.out.println();
  
      }
    }
    System.out.println("\n");
  
  }
  
  // Scheduling events
  
  public void scheduleEvent(Scanner sc, User user) {
    int month = 0, day = 0;
  
    while (true) {
      System.out.print("Enter month (1-12): ");
      String m = sc.nextLine();
      if (m.matches("\\d+")) {
        month = Integer.parseInt(m);
        if (month >=1 && month <=12) break;
  
      }
      System.out.println("Invalid month");
    }
  
    // Show calendar before choosing a day
    printMonthWithHighlights(month, user);
  
    //printMonth(month);
  
    while (true) {
      System.out.print("Enter a day (1-30(1)): ");
      String d = sc.nextLine();
      if (d.matches("\\d+")) {
        day = Integer.parseInt(d);
        if (day >= 1 && day<= 31) break;
      }
      System.out.println("Invalid day");
    }
  
    String predictedWeather = weather.predict(month, day);
    String recommendation = rec.recommend(month, day);
  
    System.out.println("Weather prediction: " + predictedWeather);
    System.out.println("Recommendation: " + recommendation);
  
    System.out.print("Choose an activity the day: ");
    String activity = sc.nextLine();
  
    Event e = new Event(month, day, activity);
    user.addEvent(e);
  
    System.out.println("Event saved");
  }
  
  public void deleteEvent(Scanner sc, User user) {
    if (user.eventCount == 0) {
        System.out.println("No events to remove.");
  
        return;
    }

    // List all events with an ID
    System.out.println("\n--- Your Events ---");
    for (int i = 0; i < user.eventCount; i++) {
        System.out.println((i + 1) + ". " + user.events[i].getDescription());
    }

    System.out.print("Enter the number of the event to remove: ");
    String input = sc.nextLine();
    
    if (input.matches("\\d+")) {
        int choice = Integer.parseInt(input) - 1;
        if (choice >= 0 && choice < user.eventCount) {
            user.deleteEvent(choice);
            System.out.println("Event removed successfully.");
        } else {
            System.out.println("Invalid selection.");
        }
    } else {
        System.out.println("Please enter a valid number.");
    }
}
private int getNumber(Scanner sc, String message, int min, int max) {
  System.out.print(message);
  String input = sc.nextLine();

  while (!input.matches("\\d+") || Integer.parseInt(input) < min || Integer.parseInt(input) > max) {
    System.out.println("Invalid input dude, try again...");
    System.out.print(message);
    input = sc.nextLine();
  }
  return Integer.parseInt(input);
}

    // Viewing events (highlighted days)
  
    public void viewEvents(User user) {
      if (user.eventCount == 0) {
        System.out.println("You have no events");
        return;
    }
  
  
    Scanner sc = new Scanner(System.in);
   
    int month = getNumber(sc, "Enter a month to view (1-12): ", 1, 12);
      
  
    printMonthWithHighlights(month, user);
  
    System.out.println("Your events:");
  
    for (int i = 0; i < user.eventCount; i++) {
      Event e = user.events[i];
      if (e.month == month) {
        System.out.println(e.getDescription());
      }
    }
    sc.close();
  }
}
  













  
