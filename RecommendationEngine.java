public class RecommendationEngine {
  String[][] monthlyRecs = {
    //January
    {"Hit the slopes! Go skiing", "Go Ice skaing at the local rink!", "Snowboarding is a must today!", "Host a marathon of your favorite films!"},
    //February
    {"TROPICAL ESCAPE: Visit an indoor botanical garden!", "Go to an indoor waterpark!", "Go for broke! Instead of a snowman, build a snow igloo, or dragon!"},
    //March
    {"Take a walk at the park and look at the early wildflowers.", "Stop by the farmers market and buy some fresh produce!", "Chase the end of a rainbow!"},
    //April
    {"Try your hand at curling!", "Absolutely bowling today", "Visit and indoor rock climbing gym!", "Watch a movie at the theaters"},
    //May
    {"Go watch a baseball game!", "You're outta fruit, go shopping!", "The car has accumulated some dirt, get it washed!",  "Go for a new record sprint!"},
    //June
    {"Host a BBQ", "Gather some friends and have a picnic!", "Host a basketball tournament with the neighborhood!", "Join a hot dog eating contest"},
    //July
    {"Go to the beach!", "Cool off by going to a water park!", "Go to a nearby lake and go paddleboarding!", "Go to a park and relax on a bench"},
    //August
    {"Attend your friends BBQ wedding!", "Cool off at the local fire department", "Host an aura farming competition", "Join a local street race"},
    //September
    {"Go apple picking at a local farm!", "Go on a hike and check out the leaves", "Go on a drive by the riverside", "Eat 50 apples at an apple eating competition!"},
    //October
    {"Decorate your house with fearsome creatures", "Go shopping for a Halloween costume!", "Go trick or treating early?", "Wear a costume to a job interview!"},
    //November
    {"Suit up and buy soem coats for the winter!", "Start buying things for thanksgiving!", "Host Thanksgiving at your place!", "Prepare for daily Christmas music"},
    //December
    {"Hang up Christmas decorations!", "Gift all of your friends charcoal!", "Write a Christmas list for Santa!", "Open your gifts and enjoy!"}
  };

  public String recommend(int month, int day) {
    //turning that month into an index
    int m = month - 1 ; 

    //Activity based on day
    String[] options = monthlyRecs[m];
    int index = day % options.length;

    return options[index];
  }
}
