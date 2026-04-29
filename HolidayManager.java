public class HolidayManager { 

  String[] holidayNames = {
    "New Years Day",
    "Valentine's Day",



  };

  int[] holidayMonths = {1, 2};
  int[] holidayDays = {1, 14};

  public String getHoliday(int month, int day) {
    for (int i = 0; i < holidayNames.length; i++) {
      if (holidayMonths[i] == month && holidayDays[i] == day) {
        return holidayNames[i];
      }
    }
    return null;
  }
}
