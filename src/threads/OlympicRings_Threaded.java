package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot r1 = new Robot(600, 400);
	Robot r2 = new Robot(7, 400);
	//Robot r3 = new Robot(800, 400);
	//Robot r4 = new Robot(650, 490);
	//Robot r5 = new Robot(750, 490);
	r1.penDown();
	r2.penDown();
	//r3.penDown();
	//r4.penDown();
//	r5.penDown();
	new Thread(()->moveCircle(r1)).start();
	new Thread(()->moveCircle(r2)).start();
	//new Thread(()->moveCircle(r3)).start();
	//new Thread(()->moveCircle(r4)).start();
	//new Thread(()->moveCircle(r5)).start();
}
	public static void moveCircle(Robot r1) {
		for (int i = 0; i < 360; i++) {
			r1.hide();
			r1.setSpeed(100);
			r1.move(1);
			r1.turn(1);
			
		}
}
}
