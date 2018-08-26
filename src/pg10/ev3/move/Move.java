package pg10.ev3.move;

import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class Move {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor.A.forward();
		Motor.B.forward();
		Delay.msDelay(2000);
		Motor.A.stop();
		Motor.B.stop();
	}

}
