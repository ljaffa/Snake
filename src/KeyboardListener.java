import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardListener extends KeyAdapter {

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 39: // -> Right
					// if it's not the opposite direction
			if (SnakeThreads.directionSnake != 2) {
				SnakeThreads.directionSnake = 1;
			}
			break;
		case 38: // -> Top
			if (SnakeThreads.directionSnake != 4) {
				SnakeThreads.directionSnake = 3;
			}
			break;

		case 37: // -> Left
			if (SnakeThreads.directionSnake != 1) {
				SnakeThreads.directionSnake = 2;
			}
			break;

		case 40: // -> Bottom
			if (SnakeThreads.directionSnake != 3) {
				SnakeThreads.directionSnake = 4;
			}
			break;

		default:
			break;
		}
	}

}
