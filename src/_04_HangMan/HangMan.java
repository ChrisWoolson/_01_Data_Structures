package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

public class HangMan implements KeyListener {
	public static void main(String[] args) {
		HangMan game = new HangMan();
		game.go();
	}

	public void go() {
		String wordCountS = JOptionPane.showInputDialog("How many words would you like to guess?");
		int WordCount = Integer.parseInt(wordCountS);
		if (WordCount >= 267 && WordCount <= 1) {
			JOptionPane.showMessageDialog(null, "Please enter a number within 1 and 267");
			JOptionPane.showInputDialog("How many words would you like to guess?");
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
