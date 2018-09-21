package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	String wordCountS;
	int WordCount;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel labelL = new JLabel();
	String word;
	String typed;
	int lives = 15;
	String popped;
	
	
	String text;
	Stack <String> words = new Stack <String>();
	public static void main(String[] args) {
		HangMan game = new HangMan();
		game.go();
	}

	public void go() {
		
		wordCountS = JOptionPane.showInputDialog("How many words would you like to guess?");
		WordCount = Integer.parseInt(wordCountS);
		if (WordCount > 267 || WordCount < 1) {
			JOptionPane.showMessageDialog(null, "Please enter a number within 1 and 267");
			wordCountS = JOptionPane.showInputDialog("How many words would you like to guess?");
			WordCount = Integer.parseInt(wordCountS);
		
		}
setup();
frame.addKeyListener(this);
		getDictionary();
		
		loadLines();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int lvs = 0;
		String newString = "";
		for (int i = 0; i < popped.length(); i++) {
			if(e.getKeyChar()== popped.charAt(i)) {
				newString += e.getKeyChar();
				System.out.println("got it right");
				
			}
			else {
				newString += text.charAt(i);
		System.out.println("wrong");
		lvs++;
			}
			
		}
		text = newString;
		label.setText(text);
		if(!text.contains("_")) {
			loadLines();
		}
		if(lvs == popped.length()) {
			lives--;
		}
		
		/*
		System.out.println("keyPressed");
		String txt = label.getText();
		txt += e.getKeyChar();
		label.setText(txt);
		*/
		
		
		
		labelL.setText("Lives Remaining: " + lives);
		frame.pack();
		if(lives <=0) {
			String startNew = JOptionPane.showInputDialog("You lost. Would you like to start a new game?");
			if(startNew.equals("yes")) {
				go();
			}else {
				System.exit(0);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
	public void setup() {
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		panel.add(labelL);
		labelL.setText("Lives Remaining: " + lives);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void getDictionary() {
		for (int i = 0; i < WordCount; i++) {
			
		
		word= Utilities.readRandomLineFromFile("src/_04_HangMan/dictionary.txt");
		if(words.contains(word)) {
			word = Utilities.readRandomLineFromFile("src/_04_HangMan/dictionary.txt");
		}
		words.push(word);
		}
	}
	
	public void loadLines(){
		lives = 15;
		if(words.isEmpty()) {
			label.setText("Good Job");
			go();
		}else {
		
		text = label.getText();
		popped =words.pop();
		text = "";
		System.out.println(popped);
		for (int i = 0; i < popped.length() ; i++) {
			text += "_";
		}
		label.setText(text);
		frame.pack();
	}}
}

