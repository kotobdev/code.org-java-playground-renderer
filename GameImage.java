import org.code.playground.*;
import java.io.FileNotFoundException;

// Use this class to create images that cannot be clicked.
public class GameImage extends ImageItem {
  
	public GameImage(String filename, int x, int y, int width, int height) throws FileNotFoundException {
    super(filename, x, y, width, height);
  }

}
