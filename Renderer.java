import org.code.playground.*;
import java.io.FileNotFoundException;
import org.code.media.*;

public class Renderer {
  private static Board myBoard = Playground.board;	

  
	public Renderer(){
    //imagine having instantiation vars smh
  }

  static public void draw(Light[] lights, square square, int res)
  {            
      //Loop through every pixel on screen. Yep. It's gonna take a while.
      //okay I know there's a way to get screen width, but it's not like it's ever not gonna be 400
      //I could alternatively use the square's measurements, but that wouldn't be very scalable (say, if I want more objects)
      for(int x = 0; x < 400; x+=res)
        {
          for(int y = 0; y < 400; y+=res)
            {
              //Only render if the pixel is inside the square
              if(square.isPointInside(x,y))
              {
                
                //cool lil progress shower thingy (updates every row)
                System.out.println("Progress: " + (double)((x/400)*10) + "%");
                
                //Code.org doesn't let you modify images here, apparently. Weird. Maybe the documentation's missing it, I dunno.
                //So instead, I used textboxes to render each "pixel". And the @ symbol because it's a popular choice in ASCII art for this stuff.
                //Code.org uses flexboxes to render text in the playground. Which, while this is good for most purposes, sucks here.
                //High accuracy will bring a browser to it's knees trying to render each and every flexbox. Be warned!
                TextItem text = new TextItem("@",x,y,Color.WHITE, Font.SANS,res,0);


                //The lighting itself. Pretty simple, but... I like it.
                //Gets the distance from the correctly colored light, and sets the color accordingly.
                //Apparently it's not actually RGB? maybe I just messed something up. Probably.
                text.setBlue((int)((pointDistance(x,y,lights[1].getX(),lights[1].getY())*lights[1].getStr())));
                text.setRed((int)((pointDistance(x,y,lights[0].getX(),lights[0].getY())*lights[0].getStr())));
                text.setGreen((int)((pointDistance(x,y,lights[2].getX(),lights[2].getY())*lights[2].getStr())));
                
                //160000 lines of html flexboxes :despair:
                myBoard.addTextItem(text);                             
              }
            }
        }
  }
  static public double pointDistance(int p1x, int p1y, int p2x, int p2y)
  {
    //Yes, I had to look it up. Yes, I kinda know what this does.
    //Geometry was two years ago, don't judge me
    double distance = Math.hypot(p1x-p2x, p1y-p2y);
    return distance;
  }

    
}
