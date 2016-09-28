/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class codingExcercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int yearsAlive = Integer.parseInt(age);
		System.out.println(2016 - yearsAlive);
		if (yearsAlive > 30) {
			System.out.println("Youre to old");
		}
	}
}
