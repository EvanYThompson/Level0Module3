package for_loops;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	

	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int randomNumber = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		//System.out.println(randomNumber);

		// 3. Use the randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
		if (randomNumber == 0) {
			System.out.println("Your high");
		}
		if (randomNumber == 1) {
			System.out.println("your tall");
		}
		if (randomNumber == 3) {
			System.out.println("That's a nice tie");
		}
			if(randomNumber == 4) {
				System.out.println("your awesome");
			}
		randomNumber = new Random().nextInt(6);
		
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
		}
		}
}


