import java.awt.Color;
import java.util.ArrayList;

public class DataOfSquare {

	// ArrayList that'll contain the colors
	ArrayList<Color> c = new ArrayList<Color>();
	int color; // 2: snake , 1: food, 0:empty
	SquarePanel square;

	public DataOfSquare(int col) {

		// Lets add the color to the arrayList
		c.add(Color.darkGray);// 0
		c.add(Color.BLUE); // 1
		c.add(Color.white); // 2
		color = col;
		square = new SquarePanel(c.get(color));
	}

	public void lightMeUp(int c) {
		square.ChangeColor(this.c.get(c));
	}
}
