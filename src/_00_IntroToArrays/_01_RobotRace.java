package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int tempx = 100;

		// 2. create an array of 5 robots.
		Robot[] Robots = new Robot[5];
		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < Robots.length; i++) {
			Robots[i] = new Robot();
			Robots[i].setX(tempx);
			Robots[i].setY(350);
			tempx = tempx + 100;
			Robots[i].setSpeed(8);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int wonRobot = 2;
		Random a = new Random();
		boolean won = false;
		while (won == false) {
			for (int i = 0; i < Robots.length; i++) {
				Robots[i].move(a.nextInt(50));
				if (Robots[i].getY() < 0) {
					won = true;
					if(won == true ) {
						wonRobot = i;
						break;
					}
				}
			}

		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
			JOptionPane.showMessageDialog(null, "Robot " + wonRobot + " won the race");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
