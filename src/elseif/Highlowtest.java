   
//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0

package elseif;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Highlowtest {

public static void main(String[] args) {
	int a = 1;
	String l = JOptionPane.showInputDialog("max");
	int L = Integer.parseInt(l);
	for (int K = L; K > 2; K = K / 2) {
		 a = a + 1;
	}
	System.out.println(a);
}

}
