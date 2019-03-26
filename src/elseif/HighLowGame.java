//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 1000.
		int random = new Random().nextInt(1001);

		// 2. Print out the random variable above
		// skip step 2
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 1; i < 8; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response
			String I = JOptionPane.showInputDialog("Guess my number between -1 and 1001");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int k = Integer.parseInt(I);
			// 5. if the guess is correct
			if (random == k) {
				JOptionPane.showMessageDialog(null, "You won");
				System.exit(0);
			}

			// 7. if the guess is high
			if (k < random) {
				JOptionPane.showMessageDialog(null, "Too low");
			} else {
				JOptionPane.showMessageDialog(null, "Too high");
			}
			// 8. Tell them it's too high

			// 9. if the guess is low

			// 10. Tell them it's too low

		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "you lose");
	}

}
