public class WeatherPredictor {

  String[] weeklyWeather = {
    "   ", "   "

  };



  int[] daysBeforeMonth = {
    0,   //January
    31,  //February
    59,  //March


  };

  int dayOfYear = daysBeforeMonth[month - 1] + day;
  return (dayOfYear - 1) / 7;

public String predict(int month, int day) {
  int week = getWeekNumber(month, day);
  return weeklyWeather[week];
}
