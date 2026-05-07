public class RecommendationEngine {
  String[][] monthlyRecs = {
    //January
    {"Hit the slopes! Go skiing", "Go Ice skaing at the local rink!", "Snowboarding is a must today!", "Host a marathon of your favorite films!"},
    //February
    {"TROPICAL ESCAPE: Visit an indoor botanical garden!", "Go to an indoor waterpark!", "Go for broke! Instead of a snowman, build a snow igloo, or dragon!"},
    //March
    {"Take a walk at the park and look at the early wildflowers.", "Stop by the farmers market and buy some fresh produce!", "Chase the end of a rainbow!",},
    //April
    {" "},
    //May
    {" "},
    //June
    {" "},
    //July
    {" "},
    //August
    {" "},
    //September
    {" "},
    //October
    {" "},
    //November
    {" "},
    //December
    {" "}
  };

  public String recommend(int month, int day) {
    //turning that month into an index
    int m = month - 1 ; 

    //Activity based on day
    String[] options = monthlyRecs[m];
    int index = day % options.length;

    return options[index]
