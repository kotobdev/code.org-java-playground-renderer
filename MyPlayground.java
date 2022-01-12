import org.code.playground.*;
import java.io.FileNotFoundException;
import org.code.media.*;


public class MyPlayground {
  private static Board myBoard = Playground.board;	

  
  public static void main(String[] args) {

    //The three lights. X and Y values, and then strength: less is more.
    //It's kinda like a CMYK(?) color pallete, and I have no idea why, but... hey, that's how it turned out.
    Light blueLight = new Light(150, 400, 1);
    Light yellowLight = new Light(400, 200, 1);
    Light pinkLight = new Light(150,100,1);

    //The "object" to be lit. Really just serves as the area to be used.
    square area = new square(0,0,390,390);
    
    Renderer rend = new Renderer();

    //Lights must be in this order. I haven't implemented multiple lights of the same color.
    Light[] lights = {blueLight, yellowLight, pinkLight};


    
    
    Game.play();


    //Initializes the render engine, renders blocks within the desired area.    
    //Last value is the accuracy: 1 being perfect, 2 being half, ect.
    
    Renderer.draw(lights, area, 5);
    
    //Most render sizes take forever to render. The most accurate value I tried is 5, which got a very pretty result:
    //https://cdn.discordapp.com/attachments/664667250292293654/930627451019747388/unknown.png
    //To get quick renders, I recommend setting the accuracy value to 20-50
    
  }
}
