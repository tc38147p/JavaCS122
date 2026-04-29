public class HolidayManager { 

  String[] holidayNames = {
    "New Years Day",
    "Martin Luther King Day",
    "Valentine's Day",
    "Presidents Day",
    "Saint Patricks Day",
    "Easter",
    "Mother's Day",
    "Memorial Day",
    "Juneteenth",
    "Independence Day",
    "International Beer Day",
    "Labor Day",
    "Columbus Day",
    "Halloween",
    "Veterans Day",
    "Thanksgiving day",
    "Christmas Day"
  };

  int[] holidayMonths = {1,1,2,2,3,3,4,5,5,6,7,8,9,10,10,11,11,12}; 
  int[] holidayDays = {1,19,14,16,17,28,1,9,31,19,4,6,6,11,31,11,25,25};

  public String getHoliday(int month, int day) {
    for (int i = 0; i < holidayNames.length; i++) {
      if (holidayMonths[i] == month && holidayDays[i] == day) {
        return holidayNames[i];
      }
    }
    return null;
  }
}
