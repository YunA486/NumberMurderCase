package Test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;

public class FirstStory {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstStory window = new FirstStory();
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
	public FirstStory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(40, 20, 1209, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// 첫번쨰 판넬
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1201, 610);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		// 첫번째 판넬 위 이미지
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1200, 599);
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace-java\\Img\\Frame 1.png"));
		panel.add(lblNewLabel);
		
		// 첫번째 판넬 시작 버튼
		JButton btnStart = new JButton("btnbtn");
		btnStart.setBounds(525, 411, 95, 23);
		panel.add(btnStart);
		
		// 두번째 판넬
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1201, 593);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		// 두번째 판넬 위 이미지
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\joyun\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\Untitled\\Frame 2.png"));
		lblNewLabel_1.setBounds(0, 5, 1201, 588);
		panel_1.add(lblNewLabel_1);
		
		
		// 첫번째 판넬 시작 버튼 누르면 켜지고 꺼지기..
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
			
		});
	}
}
