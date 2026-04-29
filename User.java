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
}
