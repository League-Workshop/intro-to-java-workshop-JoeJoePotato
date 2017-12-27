package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE 
		Robot  marvin=new Robot();
		marvin.penDown();
		marvin.miniaturize();
		marvin.setPenColor(200, 90, 0);
		marvin.setSpeed(400);
	marvin.move(500);
	marvin.turn(180);
	marvin.move(1000);
	marvin.turn(180);
	marvin.move(500);
	marvin.turn(90);
		
	}
}
