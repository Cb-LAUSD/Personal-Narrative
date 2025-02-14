import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene{

  private String[][] win;
  private String[][] LU;

  //Getter method
  public MyStory(String[][] win, String[][] LU){
    this.win = win;
    this.LU = LU; 
  }

  //runs all images. 
  public void drawScene(){
   ChangeImage intro = new ChangeImage("yankees-dodgers.png");
    ChangeImage game1 = new ChangeImage("game-1.png");
    ChangeImage game2 = new ChangeImage("game-2.png");
    ChangeImage game3 = new ChangeImage("game-3.png");
    ChangeImage game4 = new ChangeImage("game-4.png");
    ChangeImage game5 = new ChangeImage("game-5.png");
    ChangeImage winner = new ChangeImage("dodgers-winnn.png");

        
        drawImage(intro, 0, 0, intro.getWidth());
    pause(1.0);
        drawText("Yankees VS Dodgers", 200, 50);
        pause(2.0);

        // **Game 1**
         
        drawImage(game1, 0, 0, game1.getWidth());
    pause(1.0);
        drawText("Game 1", 200, 50);
    pause(1.0);
        drawText(win[0][1], 200, 100); 
    pause(1.0);
     game1.makeBlue();
    drawImage(game1, 0, 0, game1.getWidth());
        pause(2.0);

        // **Game 2**
       
        drawImage(game2, 0, 0, game2.getWidth());
    pause(1.0);
        drawText("Game 2", 200, 50);
    pause(1.0);
        drawText(win[1][1], 200, 100);  
    pause(1.0);
     game2.makeBlue(); 
    drawImage(game2, 0, 0, game2.getWidth());
        pause(2.0);

        // **Game 3**
  
        drawImage(game3, 0, 0, game3.getWidth());
    pause(1.0);
        drawText("Game 3", 200, 50);
    pause(1.0);
        drawText(win[0][2], 200, 100);
    pause(1.0);
    game3.makeBlue();
    drawImage(game3, 0, 0, game3.getWidth());
        pause(2.0);

        // **Game 4**
     
        drawImage(game4, 0, 0, game4.getWidth());
    pause(1.0);
        drawText("Game 4", 200, 50);
    pause(1.0);
        drawText(win[1][2], 200, 100);
    pause(1.0);
       game4.BlackTint();
      drawImage(game4, 0, 0, game4.getWidth());
        pause(2.0);

        // **Game 5**
        drawImage(game5, 0, 0, game5.getWidth());
    pause(1.0);
        drawText("Game 5", 200, 50);
    pause(1.0);
        drawText(win[0][6], 200, 100);
    pause(1.0);
    game5.makeBlue();
            drawImage(game5, 0, 0, game5.getWidth());
        pause(2.0);

        // **Final Winner Scene**

        drawImage(winner, 0, 0, winner.getWidth());
    pause(1.0);
        drawText("DODGERS WIN", 200, 50);
    pause(1.0);
        drawText(win[0][6], 200, 100);
    pause(1.0);
    winner.mirrorVertical();
     drawImage(winner, 0, 0, winner.getWidth());
        pause(2.0);
    }
  }
