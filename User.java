public class User {
  String username;
  String password;
  Event[] events = new Event[50];
  int eventCount = 0;

  public User(String u, String p) {
    username = u;
    password = p;
  }

  public void addEvent(Event e) {
    events[eventCount] = e;
    eventCount++;
  }

  public void deleteEvent(int index) {
    if (index < 0 || index >= eventCount) {
      System.out.println("Invalid index");
      return;
    }

    for (int i = index; i < eventCount - 1; i++) {
      events[i] = events[i + 1];
    }
    events[eventCount - 1] = null;
    eventCount--;
}
}
