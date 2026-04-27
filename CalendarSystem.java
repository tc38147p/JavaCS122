import java.util.Scanner;

public class CalendarSystem {
  WeatherPredictor weather = new WeatherPredictor();
  RecommendationEngine rec = new RecommendationEngine();

// Calendar Printing (No highlights)

  public void printMonthWithHighlights(int month, User user) {
    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
  
    int[] daysInmonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  
    System.out.println("\n    " + monthNames[month - 1] + " 2027");
    System.out.println("Su Mo Tu We Th Fr Sa");
  
    int startDay = (month * 2 + 3) % 7;
  
    for (int i = 0; i < startDay; i++) {
      System.out.print("   ");
    }
  
    for (int day = 1; day <= daysInMonth[month - 1]; day++) {
      boolean hasEvent = false;
  
      if (user!= null) {
        for (int i = 0; i < user.eventCount; i++) {
          Event e = user.events[i];
          if (e.month == month && e.day == day) {
            hasEvent = true;
            break;
  
          }
        }
      }
  
      if (hasEvent) {
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
  
    printMonth(month);
  
    while (true) {
      System.out.print("Enter a day (1-30(1): ");
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
  
  
    // Viewing events (highlighted days)
  
    public void viewEvents(User user) {
      if (user.eventCount == 0) {
        System.out.println("You hae no event");
        return;
    }
  
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a month to view (1-12): ");
    int month = Integer.parseInt(sc.nextLine());
  
    printMonthWithHighlights(month, user);
  
    System.out.println("Your events:");
  
    for (int i = 0; i < user.eventCount; i++) {
      Event e = user.events[i];
      if (e.month == month) {
        System.out.println(e.getDescription());
      }
    }
  }
}
  













  
