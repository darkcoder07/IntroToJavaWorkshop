package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot DarkBot = new Robot();
DarkBot.move(200);
DarkBot.setSpeed(36);
DarkBot.turn(36);	
DarkBot.setPenColor(Color.blue);	
DarkBot.setPenWidth(2);
DarkBot.penDown();	
for (int i = 0; i < 10; i++) {
DarkBot.move(250);	
DarkBot.setRandomPenColor();
DarkBot.turn(36);
}
DarkBot.turn(36);


for (int j = 0; j < 1; j++) {
	DarkBot.move(1);
DarkBot.setRandomPenColor();
DarkBot.turn(1);
}



	}
}
