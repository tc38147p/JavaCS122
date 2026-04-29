public class WeatherPredictor {

  String[] weeklyWeather = {
    "Estimated High 38F \nEstimated Low 25F \nCold and cloudy", "Estimated High 44F \nEstimated Low 30F \nCold and some rain", "Estimated High 33F \nEstimated Low 21F \nMild wind and cold", "Estimated High 22F \nEstimated Low 9F \nDeep freezes and sub zero wind chills", "Estimated High 36F \nEstimated Low 20F \nMix of sunny and cloudy, some snow dust", "Estimated High -4F \nEstimated Low -30F \nCrisp wind, clear skies, arctic hell", "Estimated High 40F \nEstimated Low 25F \nSome mild cold breezes, yet sunny", "Estimated High 38F \nEstimated Low 22F \nBright skies, and cold winds", "Estimated High 45F \nEstimated Low 29F \nChilly winds and a chance of snow", "Estimated High 48F \nEstimated Low 32F \nGround is starting to thaw, cloudy skies and persistent dampness", "Estimated High 52F \nEstimated Low 35F \nSunshine and some nice spring weather", "Estimated High 56F \nEstimated Low 38F \nWindy", "Estimated High 58F \nEstimated Low 40F \nCool and breezy, some morning fog", "Estimated High 62F \nEstimated Low 44F \nSteady rain, yet nice temperatures", "Estimated High 65F \nEstimated Low 47F \nNice cool weather with cloudy skies",
    "Estimated High 68F \nEstimated Low 50F \nWarm and bright days", "Estimated High 71F \nEstimated Low 53F \nLots of sunshine and nice weather", "Estimated High 73F \nEstimated Low 55F \nHumid and thunderstorms", "Estimated High 75F \nEstimated Low 58F \nLight breezes and clear skies", "Estimated High 78F \nEstimated Low 61F \nHigh humidity", "Estimated High 81F \nEstimated Low 63F \nBright sunshine and warm air", "Estimated High 83F \nEstimated Low 65F \nHazy mornings and heat showers", "Estimated High 85F \nEstimated Low 68F \nHigh humidity and clear skies", "Estimated High 87F \nEstimated Low 70F \nHot with lots of sunshine", "Estimated High 89F \nEstimated Low 72F \nExtremely humid and intense sunshine", "Estimated High 150F \nEstimated Low 120F \nHeatwave", "Estimated High 91F \nEstimated Low 74F \nHazy skies and mild moisture", "Estimated High 88F \nEstimated Low 71F \nSome brief rain sporadically", "Estimated High 86F \nEstimated Low 69F \nHigh humidity and thunderstorms in the afternoon", "Estimated High 84F \nEstimated Low 67F \nMuggy air and hazy skies",
    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
    "", "", "", "", "", "", ""
  

  };



  int[] daysBeforeMonth = {
    0,   //January
    31,  //February
    59,  //March
    90,  //April
    110,  //May
    141,  //June
    170,  //July
    201,  //August
    232,  //September
    262,  //October
    293,  //November
    323,  //December
    
    


  };

  int dayOfYear = daysBeforeMonth[month - 1] + day;
  return (dayOfYear - 1) / 7;

public String predict(int month, int day) {
  int week = getWeekNumber(month, day);
  return weeklyWeather[week];
}
