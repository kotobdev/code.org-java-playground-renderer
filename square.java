import org.code.playground.*;
import java.io.FileNotFoundException;

// Use this class to create images that cannot be clicked.
public class square {

  //Basic two coordinate system for the square
  //oh wait it's a rectangle ain't it
  //oops
  
  int p1x;
  int p1y;
  int p2x;
  int p2y;
  
	public square(int p1x, int p1y, int p2x, int p2y){
    this.p1x = p1x;
    this.p1y = p1y;
    this.p2x = p2x;
    this.p2y = p2y;
  }

  //Old testing command from when I was still using rays.
  //I mean, I could have done it this way?
  //It would still be rather disingenuous in the end.
  public boolean getHRayHit(int startY, int length)
  {
      int rx = length;
      int ry = startY;
      boolean hit = false;
      if((startY <= p2y && startY >= p1y))
      {
        hit = true;
      }
    return hit;
  }

  //yeah this one's prety simple
  public boolean isPointInside(int x, int y)
  {
    boolean ipi = false;
    if((x <= p2x && x >= p1x)&&(y <= p2y && y >= p1y))
    {
      ipi = true;
    }
    return ipi;
  }
    
}
