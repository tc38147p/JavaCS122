public class Event {
  int month;
  int day;
  String activity;

  public Event(int m, int d, String a) {
    month = m;
    day = d;
    activity = a;
  }
  
  public String getDescription() {
    return "Event on " + month + "/" + day + ": " + activity;
  }
}
