import org.code.playground.*;
import java.io.FileNotFoundException;

// Use this class to create images that can be clicked.
public class GameClickable extends ClickableImage {  
	public GameClickable(String filename, int x, int y, int width, int height) throws FileNotFoundException {
    super(filename, x, y, width, height);
  }

  /* Use this method to call isValidMove() from Game.
   * You may have this ClickableImage perform other actions
   * as well based on the rules of your game.
   */
  public void onClick() {
    
  }
}
