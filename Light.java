import org.code.playground.*;
import java.io.FileNotFoundException;

//this is the simplest class ever, no explanation needed really
public class Light {

  int x;
  int y;
  double str;
  
	public Light(int x, int y, double str){
    this.x = x;
    this.y = y;
    this.str = str;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public double getStr(){
    return str;
  }
    
}
