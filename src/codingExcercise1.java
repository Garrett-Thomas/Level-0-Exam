import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class codingExcercise1 {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What is the color");// 3. ask the user what color they would like
																		// the Robot to draw
		Robot cp = new Robot();
		if (color.equals("yellow")) {
			cp.setPenColor(255, 000, 000);// 4. use an if/else statement to set the pen color that the user requested
											// (minimum of 2 colors)
		} else if (color.equals("ugly green")) {
			cp.setPenColor(122, 187, 000);
		}

		cp.setPenWidth(10);// 2. set the pen width to 10
		cp.penDown();
		cp.setSpeed(10);
		cp.move(20);
		cp.turn(90);
		cp.move(20);
		cp.turn(90);
		cp.move(20);
		cp.turn(90);
		cp.move(20);
		cp.penUp();
		cp.move(300);// 1. make the Robot draw a shape

	}

}
