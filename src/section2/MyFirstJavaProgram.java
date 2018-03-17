package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot robber=new Robot();
	robber.setSpeed(4000);
	robber.move (250);
	robber.turn(-90);
		robber.move(350);
		robber.turn(-90);
		robber.move(450);
		robber.turn(-90);
	}
	
	void draw() {
		
	}
}
