package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
  JFrame frame = new JFrame();
  JPanel panel = new JPanel();
  JButton button1 = new JButton();
  JButton button2 = new JButton();
  JButton button3 = new JButton();
  HashMap <Integer, String > logs = new HashMap <Integer, String>();
    
    
    public static void main(String[] args) {
    	_02_LogSearch log = new _02_LogSearch();	
    	log.start();
	}
    
    public void start() {
    	frame.add(panel);
    	panel.add(button1);
    	panel.add(button2);
    	panel.add(button3);
    	
    	button1.setText("Add Entry");
    	button2.setText("Search by ID");
    	button3.setText("View List");
    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button3.addActionListener(this);
    	
    	
    	frame.setVisible(true);
    	frame.pack();
    }


	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == button1) {
			System.out.println("button1");
			String enteredS1= JOptionPane.showInputDialog("Enter an ID number.");
			int entered= Integer.parseInt(enteredS1);
			
			
			String entered2 = JOptionPane.showInputDialog("Enter a name");
			
			logs.put(entered, entered2);
			
		}
		
		if(buttonPressed == button2) {
			String enterIDS = JOptionPane.showInputDialog("Enter an ID number");
			int enterID1 = Integer.parseInt(enterIDS);
			
			if(logs.containsKey(enterID1)) {
				String getting = logs.get(enterID1);
				JOptionPane.showMessageDialog(null, getting);
			}else { 
				JOptionPane.showMessageDialog(null, "Doesn't exist");
			}
		}
		
		if(buttonPressed == button3) {
			String toS = "";
			for (int keys : logs.keySet()) {
			String temp = "ID: "+ keys + " Name: "+ logs.get(keys)+ "\n" ;
			toS+= temp;
			}
			JOptionPane.showMessageDialog(null, toS);
		}
	}
    
    /*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	
	
	
	
	
}
