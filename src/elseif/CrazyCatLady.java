//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String L = JOptionPane.showInputDialog("How many cat's does thee have?");
		// 2. Convert their answer into an int
int l = Integer.parseInt(L);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
if (l > 2) {
	JOptionPane.showMessageDialog(null, "crazy cat lady");
}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
if (l <= 1 && l >= 2) {
	playVideo("https://youtu.be/5dsGWM5XGdg");
	}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
else {
	playVideo("https:// youtu.be/5dsGWM5XGdg");
	}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
