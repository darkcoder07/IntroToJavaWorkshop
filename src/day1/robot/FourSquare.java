package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot KingBot = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
KingBot.setSpeed(90);
		// 5. Set the pen width to 5
KingBot.setPenWidth(5);
		// 6. Do steps #6 to #7 four times...
for (int i = 0; i < 200; i++) {
	

			// 7. Set the pen color to random
	KingBot.setRandomPenColor();
	drawSquare();

			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right
KingBot.turn(100);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
		KingBot.penDown();	
		KingBot.move(250);	
		KingBot.turn(90);
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
