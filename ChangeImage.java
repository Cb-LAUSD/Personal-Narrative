 import org.code.theater.*;
import org.code.media.*;

public class ChangeImage extends ImagePlus{

//Uses file to change image. 
  public ChangeImage(String filename){
    super(filename);

  }
// Will change color of picture to a slightly more blue color
  public void makeBlue() {
    
     Pixel[][] x = getImagePixels();
    for(int row = 0; row < x.length;row++){
      for(int col = 0; col< x[0].length; col++){
        Pixel currentPixel = x[row][col];
        int currentGreenPixel = currentPixel.getGreen();
        int currentRedPixel = currentPixel.getRed();
        int currentBluePixel = currentPixel.getBlue();
        currentPixel.setBlue(currentBluePixel + 50);

        if(currentPixel.getBlue() > 255){
          currentPixel.setBlue(255); 
        }
      }
    }   
  }

  //will make picture slightly more black
  public void BlackTint() {
    
     Pixel[][] x = getImagePixels();
    for(int row = 0; row < x.length;row++){
      for(int col = 0; col< x[0].length; col++){
        Pixel currentPixel = x[row][col];
        int currentGreenPixel = currentPixel.getGreen();
        int currentRedPixel = currentPixel.getRed();
        int currentBluePixel = currentPixel.getBlue();
        currentPixel.setBlue(currentBluePixel + 75);
        currentPixel.setRed(currentRedPixel + 75);
        currentPixel.setGreen(currentGreenPixel + 75);

        if(currentPixel.getBlue() > 255){
          currentPixel.setBlue(255); 
        }
           
        if(currentPixel.getRed() > 255){
          currentPixel.setRed(255); 
        }      
        if(currentPixel.getGreen() > 255){
          currentPixel.setGreen(255); 
        }
      }
    }   
  }
    // Will create a mirror Veritcle filter
  public void mirrorVertical() {
Pixel[][] x = getImagePixels();
    for (int row = 0; row < x.length; row++){
      for(int col = 0; col < x[0].length/2; col++){
        Pixel leftSide = x[row][col];
          Pixel rightSide = x[row][x[0].length-col-1];

          leftSide.setColor(rightSide.getColor());
      }
    }
  }
  // Will create a motion blur filter
      public void motionBlur(int length, String direction) {  
        Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        int x = col;
        int y = row;
        int count = 0;

        while (count < length && x < pixels[0].length && y < pixels.length) {
          Pixel currentPixel = pixels[y][x];
          totalRed += currentPixel.getRed();
          totalGreen += currentPixel.getGreen();
          totalBlue += currentPixel.getBlue();
          count++;

          if (direction.equals("horizontal")) {
            x++;
          }
          else if (direction.equals("vertical")) {
            y++;
          }
          else if (direction.equals("diagonal")) {
            x++;
            y++;
          }
        }

        int avgRed = totalRed / count;
        int avgGreen = totalGreen / count;
        int avgBlue = totalBlue / count;

        Pixel currentPixel = pixels[row][col];
        currentPixel.setRed(avgRed);
        currentPixel.setGreen(avgGreen);
        currentPixel.setBlue(avgBlue);
      }
    }
    
  }
  
}