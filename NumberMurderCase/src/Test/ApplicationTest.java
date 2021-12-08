package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class ApplicationTest {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationTest window = new ApplicationTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(135, 109, 372, 276);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(62, 56, 116, 40);
		frame.getContentPane().add(passwordField);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(12, 109, 131, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(202, 56, 103, 23);
		frame.getContentPane().add(menuBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 361, 657, 120);
		frame.getContentPane().add(panel);
	}
}
