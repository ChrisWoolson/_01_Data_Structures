package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	ArrayList<Song> songs = new ArrayList<Song>();

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		button.setText("Suprise Me!");
		frame.pack();
		Song song1 = new Song("demo.mp3");
		;
		songs.add(song1);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
		// Song song = new Song("demo.mp3");
		// song.play();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {

		}

	}

}