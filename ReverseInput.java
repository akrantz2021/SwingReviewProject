import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ReverseInput implements ActionListener {
	
	JFrame frame;
	JTextField input;
	JButton button;
	JLabel label;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String output = "";
		for (int i = input.getText().length(); i > 0; i--) {
			output += input.getText().substring(i-1, i);
		}
		label.setText("Result: "+ output);
		input.setText("");
	}
	
	
	public ReverseInput() {
		frame = new JFrame("Reverse text");
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		input = new JTextField(10);
		button = new JButton("Reverse");
		label = new JLabel();
		
		frame.add(input);
		frame.add(button);
		frame.add(label);
		frame.setLayout(new FlowLayout());

		
		// Create button action (addActionListener method takes in an ActionListener object)
		button.addActionListener(this);
		input.addActionListener(this);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run () {
				new ReverseInput();
			}
		});	}



}
