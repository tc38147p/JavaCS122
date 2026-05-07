public class HolidayEvent extends Event {
  String holidayName;

  public HolidayEvent(int m, int d, String a, String h) {
    super(m, d, a);
    holidayName = h;
  }

  public String getDescription() {
    return super.getDescription() + "Holiday: " + holidayName + ")";
  }
}
