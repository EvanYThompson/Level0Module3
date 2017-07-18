package variables_and_conditionals;

import javax.swing.JOptionPane;

public class DizzyTortoise {

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		// that number of times.
		String tor = JOptionPane.showInputDialog("How dizzy do you want the tortiose from 1-10?");
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		// 1. Use the dance method to make the Tortoise spin.

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			DizzyTortoise.turn(360);
		}
	}

	private static void turn(int i) {
		// TODO Auto-generated method stub

	}
}
