import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Demo {
	public Demo () {
		// Create JFrame container
		JFrame frame = new JFrame("Demo");
		
		// Give frame a size
		frame.setSize(300, 100);
		
		// Terminate program on window close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display frame
		frame.setVisible(true);
		
		// Create label
		JLabel label = new JLabel("Enter name");
		
		// Add label to frame
		frame.add(label);
		
		// Create input field
		JTextField input = new JTextField(10);
		
		// Add input to frame
		frame.add(input);
		
		// Set layout
		frame.setLayout(new FlowLayout());
		
		// Create button
		JButton button = new JButton("Submit");
		
		// Create button action (addActionListener method takes in an ActionListener object)
		button.addActionListener(new ActionListener() {
			
			// actionPerformed is an abstract method of the ActionListener class
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello " + input.getText());
				input.setText("");
			}
			
		});
		
		// Add button to frame
		frame.add(button);
		
		
		
	}
	
	public static void main(String[] args) {
		// Launch app on a separate thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run () {
				new Demo();
			}
		});
 	}
}
