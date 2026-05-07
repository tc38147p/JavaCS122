public class HolidayEvent extends Event {
  String holidayName;

  public HolidayEvent(int m, ind d, String a, String h) {
    super(m, d, a);
    holidayName = h;
  }

  public String getDescription() {
    return super.fetDescription() + "Holiday: " + holidayName + ")";
  }
}
