import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  String[][] winRatio = {
    {"Zero", "First Win","Second Win","Third Win", "First Loss","Fourth Win", "DODGERS WIN"},
    {"Zero", "First Loss" , "Second Loss", "Third Loss", "First Win","Fourth Loss", "YANKEES LOSE"}
  };

    String[][] Lineups = {
      {"Shohei Otani", "Mookie Betts", "Freddie Freeman", "Teoscar Hernandez", "Max Muncy", "Will Smith", "Gavin Lux", "Tommy Edman"},
      {"Distinct Hitter","Right Fielder","First Baseman","Left Fielder","Third Baseman","Center Fielder","Catcher","Second Baseman","ShortStop"},
      {"Gleyber Torres","Juan Soto","Aaron Judge","Giancarlo Stanton","Jazz Chisholm","Anthony Rizzo","Anthony Volpe","Austin Wells","Alex Verdugo"},
      {"Second Baseman","Right Fielder","Center Fielder","Distinct Hitter","Third Baseman","First Baseman","ShortStop","Catcher","Left Fielder"},
    };


    
        MyStory scene = new MyStory(winRatio, Lineups);
        scene.drawScene();
    
    
    
  }
}