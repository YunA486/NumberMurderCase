package Apple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

public class Story {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Story window = new Story();
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
	public Story() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(43, 40, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel TitlePanel = new JPanel();
		TitlePanel.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(TitlePanel);
		TitlePanel.setLayout(null);
		
		JLabel Title = new JLabel("Number Murder Case");
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("Baskerville BT", Font.BOLD | Font.ITALIC, 60));
		Title.setBounds(288, 168, 638, 99);
		TitlePanel.add(Title);
		
		JButton StartBtn = new JButton("START");
		StartBtn.setForeground(Color.BLACK);
		StartBtn.setBackground(Color.WHITE);
		StartBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		StartBtn.setBounds(507, 355, 139, 45);
		TitlePanel.add(StartBtn);
		
		JLabel StartHotel = new JLabel("");
		StartHotel.setBackground(Color.WHITE);
		StartHotel.setIcon(new ImageIcon(Story.class.getResource("/image/Hotel 1.png")));
		StartHotel.setBounds(0, 0, 1186, 563);
		TitlePanel.add(StartHotel);
		
		JPanel Panel1 = new JPanel();
		Panel1.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Panel1);
		Panel1.setLayout(null);
		
		JButton NextBtn1 = new JButton("");
		NextBtn1.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn1.setBounds(1147, 20, 27, 23);
		Panel1.add(NextBtn1);
		
		JLabel story1 = new JLabel("");
		story1.setIcon(new ImageIcon(Story.class.getResource("/image/1.png")));
		story1.setBounds(0, 0, 1186, 563);
		Panel1.setVisible(false);
		Panel1.add(story1);
		
		JPanel Panel2 = new JPanel();
		Panel2.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Panel2);
		Panel2.setLayout(null);
		
		JButton NextBtn2 = new JButton("");
		NextBtn2.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn2.setBounds(1147, 20, 27, 23);
		Panel2.add(NextBtn2);
		
		JLabel story2 = new JLabel("");
		story2.setIcon(new ImageIcon(Story.class.getResource("/image/2.png")));
		story2.setBounds(0, 0, 1186, 563);
		Panel2.setVisible(false);
		Panel2.add(story2);
		
		JPanel Panel3 = new JPanel();
		Panel3.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Panel3);
		Panel3.setLayout(null);
		
		JButton NextBtn3 = new JButton("");
		NextBtn3.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn3.setBounds(1147, 20, 27, 23);
		Panel3.add(NextBtn3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Story.class.getResource("/image/3.png")));
		lblNewLabel.setBounds(0, 0, 1186, 563);
		Panel3.setVisible(false);
		Panel3.add(lblNewLabel);
		
		JPanel Panel4 = new JPanel();
		Panel4.setLayout(null);
		Panel4.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Panel4);
		
		JButton NextBtn4 = new JButton("");
		NextBtn4.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn4.setBounds(1147, 20, 27, 23);
		Panel4.add(NextBtn4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Story.class.getResource("/image/4.png")));
		lblNewLabel_1.setBounds(0, 0, 1186, 563);
		Panel4.setVisible(false);
		Panel4.add(lblNewLabel_1);
		
		JPanel Panel5 = new JPanel();
		Panel5.setLayout(null);
		Panel5.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Panel5);
		
		JButton NextBtn5 = new JButton("");
		NextBtn5.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn5.setBounds(1147, 20, 27, 23);
		Panel5.add(NextBtn5);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/5.png")));
		lblNewLabel_1_1.setBounds(0, 0, 1186, 563);
		Panel5.setVisible(false);
		Panel5.add(lblNewLabel_1_1);
		
		JPanel Panel6 = new JPanel();
		Panel6.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Panel6);
		Panel6.setLayout(null);
		
		JButton Room_1 = new JButton("1\uBC88 \uBC29");
		Room_1.setBounds(197, 69, 70, 23);
		Panel6.add(Room_1);
		
		JButton Room_2 = new JButton("2\uBC88 \uBC29");
		Room_2.setBounds(426, 69, 70, 23);
		Panel6.add(Room_2);
		
		JButton Room_3 = new JButton("3\uBC88 \uBC29");
		Room_3.setBounds(681, 69, 70, 23);
		Panel6.add(Room_3);
		
		JButton Room_4 = new JButton("4\uBC88 \uBC29");
		Room_4.setBounds(930, 69, 70, 23);
		Panel6.add(Room_4);
		
		JButton Room_5 = new JButton("5\uBC88 \uBC29");
		Room_5.setBounds(197, 355, 70, 23);
		Panel6.add(Room_5);
		
		JButton Room_6 = new JButton("6\uBC88 \uBC29");
		Room_6.setBounds(426, 355, 70, 23);
		Panel6.add(Room_6);
		
		JButton Room_7 = new JButton("7\uBC88 \uBC29");
		Room_7.setBounds(681, 355, 70, 23);
		Panel6.add(Room_7);
		
		JButton Room_8 = new JButton("\uBC94\uC778 \uC7A1\uAE30");
		Room_8.setBounds(918, 355, 87, 23);
		Panel6.add(Room_8);
		
		JLabel Rooms = new JLabel("");
		Rooms.setIcon(new ImageIcon(Story.class.getResource("/image/6.png")));
		Rooms.setBounds(0, 0, 1186, 563);
		Panel6.setVisible(false);
		Panel6.add(Rooms);
		
		JPanel Room1 = new JPanel();
		Room1.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room1);
		Room1.setLayout(null);
		
		JPanel Panel7 = new JPanel();
		Panel7.setBounds(0, 0, 1186, 563);
		Room1.add(Panel7);
		Panel7.setLayout(null);
		
		JButton NextBtn7 = new JButton("");
		NextBtn7.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn7.setBounds(1147, 20, 27, 23);
		Panel7.add(NextBtn7);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Story.class.getResource("/image/7.png")));
		lblNewLabel_2.setBounds(0, 0, 1186, 563);
		Panel7.add(lblNewLabel_2);
		
		JPanel Panel8 = new JPanel();
		Panel8.setBounds(0, 0, 1186, 563);
		Room1.add(Panel8);
		Panel8.setLayout(null);
		
		JButton NextBtn8 = new JButton("");
		NextBtn8.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn8.setBounds(1147, 20, 27, 23);
		Panel8.add(NextBtn8);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Story.class.getResource("/image/8.png")));
		lblNewLabel_3.setBounds(0, 0, 1186, 563);
		Panel8.setVisible(false);
		Panel8.add(lblNewLabel_3);
		
		JPanel Panel9 = new JPanel();
		Panel9.setBounds(0, 0, 1186, 563);
		Room1.add(Panel9);
		Panel9.setLayout(null);
		
		JButton NextBtn9 = new JButton("");
		NextBtn9.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn9.setBounds(1147, 20, 27, 23);
		Panel9.add(NextBtn9);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Story.class.getResource("/image/9.png")));
		lblNewLabel_4.setBounds(0, 0, 1186, 563);
		Panel9.setVisible(false);
		Panel9.add(lblNewLabel_4);
		
		JPanel Panel10 = new JPanel();
		Panel10.setLayout(null);
		Panel10.setBounds(0, 0, 1186, 563);
		Room1.add(Panel10);
		
		JButton NextBtn10 = new JButton("");
		NextBtn10.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn10.setBounds(1147, 20, 27, 23);
		Panel10.add(NextBtn10);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(Story.class.getResource("/image/10.png")));
		lblNewLabel_4_1.setBounds(0, 0, 1186, 563);
		Panel10.setVisible(false);
		Panel10.add(lblNewLabel_4_1);
		
		JPanel Panel11 = new JPanel();
		Panel11.setLayout(null);
		Panel11.setBounds(0, 0, 1186, 563);
		Room1.add(Panel11);
		
		JButton NextBtn11 = new JButton("");
		NextBtn11.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn11.setBounds(1147, 20, 27, 23);
		Panel11.add(NextBtn11);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setIcon(new ImageIcon(Story.class.getResource("/image/11.png")));
		lblNewLabel_4_2.setBounds(0, 0, 1186, 563);
		Panel11.setVisible(false);
		Panel11.add(lblNewLabel_4_2);
		
		JPanel Panel12 = new JPanel();
		Panel12.setLayout(null);
		Panel12.setBounds(0, 0, 1186, 563);
		Room1.add(Panel12);
		
		JButton NextBtn12 = new JButton("");
		NextBtn12.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn12.setBounds(1147, 20, 27, 23);
		Panel12.add(NextBtn12);
		
		JLabel lblNewLabel_4_3 = new JLabel("");
		lblNewLabel_4_3.setIcon(new ImageIcon(Story.class.getResource("/image/12.png")));
		lblNewLabel_4_3.setBounds(0, 0, 1186, 563);
		Panel12.setVisible(false);
		Panel12.add(lblNewLabel_4_3);
		
		JPanel Panel13 = new JPanel();
		Panel13.setLayout(null);
		Panel13.setBounds(0, 0, 1186, 563);
		Room1.add(Panel13);
		
		JButton NextBtn13 = new JButton("");
		NextBtn13.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn13.setBounds(1147, 20, 27, 23);
		Panel13.add(NextBtn13);
		
		JLabel lblNewLabel_4_4 = new JLabel("");
		lblNewLabel_4_4.setIcon(new ImageIcon(Story.class.getResource("/image/13.png")));
		lblNewLabel_4_4.setBounds(0, 0, 1186, 563);
		Panel13.setVisible(false);
		Panel13.add(lblNewLabel_4_4);
		
		JPanel Panel14 = new JPanel();
		Panel14.setLayout(null);
		Panel14.setBounds(0, 0, 1186, 563);
		Room1.add(Panel14);
		
		JButton NextBtn14 = new JButton("");
		NextBtn14.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn14.setBounds(1147, 20, 27, 23);
		Panel14.add(NextBtn14);
		
		JLabel lblNewLabel_4_5 = new JLabel("");
		lblNewLabel_4_5.setIcon(new ImageIcon(Story.class.getResource("/image/14.png")));
		lblNewLabel_4_5.setBounds(0, 0, 1186, 563);
		Panel14.setVisible(false);
		Panel14.add(lblNewLabel_4_5);
		
		JPanel Panel15 = new JPanel();
		Panel15.setLayout(null);
		Panel15.setBounds(0, 0, 1186, 563);
		Room1.add(Panel15);
		
		JButton NextBtn15 = new JButton("");
		NextBtn15.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn15.setBounds(1147, 20, 27, 23);
		Panel15.add(NextBtn15);
		
		JLabel lblNewLabel_4_6 = new JLabel("");
		lblNewLabel_4_6.setIcon(new ImageIcon(Story.class.getResource("/image/15.png")));
		lblNewLabel_4_6.setBounds(0, 0, 1186, 563);
		Panel15.setVisible(false);
		Panel15.add(lblNewLabel_4_6);
		
		JPanel Panel16 = new JPanel();
		Panel16.setLayout(null);
		Panel16.setBounds(0, 0, 1186, 563);
		Room1.add(Panel16);
		
		JButton NextBtn16 = new JButton("");
		NextBtn16.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn16.setBounds(1147, 20, 27, 23);
		Panel16.add(NextBtn16);
		
		JLabel lblNewLabel_4_7 = new JLabel("");
		lblNewLabel_4_7.setIcon(new ImageIcon(Story.class.getResource("/image/16.png")));
		lblNewLabel_4_7.setBounds(0, 0, 1186, 563);
		Panel16.setVisible(false);
		Panel16.add(lblNewLabel_4_7);
		
		JPanel Panel17 = new JPanel();
		Panel17.setLayout(null);
		Panel17.setBounds(0, 0, 1186, 563);
		Room1.add(Panel17);
		
		JButton NextBtn17 = new JButton("");
		NextBtn17.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn17.setBounds(1147, 20, 27, 23);
		Panel17.add(NextBtn17);
		
		JLabel lblNewLabel_4_8 = new JLabel("");
		lblNewLabel_4_8.setIcon(new ImageIcon(Story.class.getResource("/image/17.png")));
		lblNewLabel_4_8.setBounds(0, 0, 1186, 563);
		Panel17.setVisible(false);
		Panel17.add(lblNewLabel_4_8);
		
		JPanel Panel18 = new JPanel();
		Panel18.setLayout(null);
		Panel18.setBounds(0, 0, 1186, 563);
		Room1.add(Panel18);
		
		JButton NextBtn18 = new JButton("");
		NextBtn18.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn18.setBounds(1147, 20, 27, 23);
		Panel18.add(NextBtn18);
		
		JLabel lblNewLabel_4_9 = new JLabel("");
		lblNewLabel_4_9.setIcon(new ImageIcon(Story.class.getResource("/image/18.png")));
		lblNewLabel_4_9.setBounds(0, 0, 1186, 563);
		Panel18.setVisible(false);
		Panel18.add(lblNewLabel_4_9);
		
		JPanel Panel19 = new JPanel();
		Panel19.setLayout(null);
		Panel19.setBounds(0, 0, 1186, 563);
		Room1.add(Panel19);
		
		JButton NextBtn19 = new JButton("");
		NextBtn19.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn19.setBounds(1147, 20, 27, 23);
		Panel19.add(NextBtn19);
		
		JLabel lblNewLabel_4_10 = new JLabel("");
		lblNewLabel_4_10.setIcon(new ImageIcon(Story.class.getResource("/image/19.png")));
		lblNewLabel_4_10.setBounds(0, 0, 1186, 563);
		Panel19.setVisible(false);
		Panel19.add(lblNewLabel_4_10);
		
		JPanel Panel20 = new JPanel();
		Panel20.setLayout(null);
		Panel20.setBounds(0, 0, 1186, 563);
		Room1.add(Panel20);
		
		JButton NextBtn20 = new JButton("");
		NextBtn20.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn20.setBounds(1147, 20, 27, 23);
		Panel20.add(NextBtn20);
		
		JLabel lblNewLabel_4_11 = new JLabel("");
		lblNewLabel_4_11.setIcon(new ImageIcon(Story.class.getResource("/image/20.png")));
		lblNewLabel_4_11.setBounds(0, 0, 1186, 563);
		Panel20.setVisible(false);
		Panel20.add(lblNewLabel_4_11);
		
		JPanel Panel21 = new JPanel();
		Panel21.setLayout(null);
		Panel21.setBounds(0, 0, 1186, 563);
		Room1.add(Panel21);
		
		JButton NextBtn21 = new JButton("");
		NextBtn21.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn21.setBounds(1147, 20, 27, 23);
		Panel21.add(NextBtn21);
		
		JLabel lblNewLabel_4_11_1 = new JLabel("");
		lblNewLabel_4_11_1.setIcon(new ImageIcon(Story.class.getResource("/image/21.png")));
		lblNewLabel_4_11_1.setBounds(0, 0, 1186, 563);
		Panel21.setVisible(false);
		Panel21.add(lblNewLabel_4_11_1);
		
		JPanel Panel22 = new JPanel();
		Panel22.setLayout(null);
		Panel22.setBounds(0, 0, 1186, 563);
		Room1.add(Panel22);
		
		JButton NextBtn22 = new JButton("");
		NextBtn22.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn22.setBounds(1147, 20, 27, 23);
		Panel22.add(NextBtn22);
		
		JLabel lblNewLabel_4_11_2 = new JLabel("");
		lblNewLabel_4_11_2.setIcon(new ImageIcon(Story.class.getResource("/image/22.png")));
		lblNewLabel_4_11_2.setBounds(0, 0, 1186, 563);
		Panel22.setVisible(false);
		Panel22.add(lblNewLabel_4_11_2);
		
		JPanel Panel23 = new JPanel();
		Panel23.setLayout(null);
		Panel23.setBounds(0, 0, 1186, 563);
		Room1.add(Panel23);
		
		JButton NextBtn23 = new JButton("");
		NextBtn23.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn23.setBounds(1147, 20, 27, 23);
		Panel23.add(NextBtn23);
		
		JLabel lblNewLabel_4_11_3 = new JLabel("");
		lblNewLabel_4_11_3.setIcon(new ImageIcon(Story.class.getResource("/image/23.png")));
		lblNewLabel_4_11_3.setBounds(0, 0, 1186, 563);
		Panel23.setVisible(false);
		Panel23.add(lblNewLabel_4_11_3);
		
		JPanel Panel24 = new JPanel();
		Panel24.setLayout(null);
		Panel24.setBounds(0, 0, 1186, 563);
		Room1.add(Panel24);
		
		JButton NextBtn24 = new JButton("");
		NextBtn24.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn24.setBounds(1147, 20, 27, 23);
		Panel24.add(NextBtn24);
		
		JLabel lblNewLabel_4_11_4 = new JLabel("");
		lblNewLabel_4_11_4.setIcon(new ImageIcon(Story.class.getResource("/image/24.png")));
		lblNewLabel_4_11_4.setBounds(0, 0, 1186, 563);
		Panel24.setVisible(false);
		Panel24.add(lblNewLabel_4_11_4);
		
		JPanel Panel25 = new JPanel();
		Panel25.setLayout(null);
		Panel25.setBounds(0, 0, 1186, 563);
		Room1.add(Panel25);
		
		JButton NextBtn25 = new JButton("");
		NextBtn25.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn25.setBounds(1147, 20, 27, 23);
		Panel25.add(NextBtn25);
		
		JLabel lblNewLabel_4_11_5 = new JLabel("");
		lblNewLabel_4_11_5.setIcon(new ImageIcon(Story.class.getResource("/image/25.png")));
		lblNewLabel_4_11_5.setBounds(0, 0, 1186, 563);
		Panel25.setVisible(false);
		Panel25.add(lblNewLabel_4_11_5);
		
		JPanel Panel26 = new JPanel();
		Panel26.setLayout(null);
		Panel26.setBounds(0, 0, 1186, 563);
		Room1.add(Panel26);
		
		JButton NextBtn26 = new JButton("");
		NextBtn26.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn26.setBounds(1147, 20, 27, 23);
		Panel26.add(NextBtn26);
		
		JLabel lblNewLabel_4_11_6 = new JLabel("");
		lblNewLabel_4_11_6.setIcon(new ImageIcon(Story.class.getResource("/image/26.png")));
		lblNewLabel_4_11_6.setBounds(0, 0, 1186, 563);
		Panel26.setVisible(false);
		Panel26.add(lblNewLabel_4_11_6);
		
		JPanel FindRoom1 = new JPanel();
		FindRoom1.setBounds(0, 0, 1186, 563);
		Room1.add(FindRoom1);
		FindRoom1.setLayout(null);
		
		JButton Room1Exit = new JButton("New button");
		Room1Exit.setBounds(1147, 20, 27, 23);
		FindRoom1.add(Room1Exit);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 0, 1186, 563);
		lblNewLabel_5.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		FindRoom1.setVisible(false);
		FindRoom1.add(lblNewLabel_5);
		
		JPanel Room2 = new JPanel();
		Room2.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room2);
		Room2.setLayout(null);
		
		JPanel Panel27 = new JPanel();
		Panel27.setLayout(null);
		Panel27.setBounds(0, 0, 1186, 563);
		Room2.add(Panel27);
		
		JButton NextBtn27 = new JButton("");
		NextBtn27.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn27.setBounds(1147, 20, 27, 23);
		Panel27.add(NextBtn27);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Story.class.getResource("/image/27.png")));
		lblNewLabel_6.setBounds(0, 0, 1186, 563);
		Panel27.add(lblNewLabel_6);
		
		JPanel Panel28 = new JPanel();
		Panel28.setLayout(null);
		Panel28.setBounds(0, 0, 1186, 563);
		Room2.add(Panel28);
		
		JButton NextBtn28 = new JButton("");
		NextBtn28.setBounds(1147, 20, 27, 23);
		Panel28.add(NextBtn28);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(Story.class.getResource("/image/28.png")));
		lblNewLabel_6_1.setBounds(0, 0, 1186, 563);
		Panel28.add(lblNewLabel_6_1);
		
		JPanel Panel29 = new JPanel();
		Panel29.setLayout(null);
		Panel29.setBounds(0, 0, 1186, 563);
		Room2.add(Panel29);
		
		JButton NextBtn29 = new JButton("");
		NextBtn29.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn29.setBounds(1147, 20, 27, 23);
		Panel29.add(NextBtn29);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("");
		lblNewLabel_6_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/29.png")));
		lblNewLabel_6_1_1.setBounds(0, 0, 1186, 563);
		Panel29.add(lblNewLabel_6_1_1);
		
		JPanel Panel30 = new JPanel();
		Panel30.setLayout(null);
		Panel30.setBounds(0, 0, 1186, 563);
		Room2.add(Panel30);
		
		JButton NextBtn30 = new JButton("");
		NextBtn30.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn30.setBounds(1147, 20, 27, 23);
		Panel30.add(NextBtn30);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("");
		lblNewLabel_6_1_2.setIcon(new ImageIcon(Story.class.getResource("/image/30.png")));
		lblNewLabel_6_1_2.setBounds(0, 0, 1186, 563);
		Panel30.add(lblNewLabel_6_1_2);
		
		JPanel Panel31 = new JPanel();
		Panel31.setLayout(null);
		Panel31.setBounds(0, 0, 1186, 563);
		Room2.add(Panel31);
		
		JButton NextBtn31 = new JButton("");
		NextBtn31.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn31.setBounds(1147, 20, 27, 23);
		Panel31.add(NextBtn31);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("");
		lblNewLabel_6_1_3.setIcon(new ImageIcon(Story.class.getResource("/image/31.png")));
		lblNewLabel_6_1_3.setBounds(0, 0, 1186, 563);
		Panel31.add(lblNewLabel_6_1_3);
		
		JPanel Panel32 = new JPanel();
		Panel32.setLayout(null);
		Panel32.setBounds(0, 0, 1186, 563);
		Room2.add(Panel32);
		
		JButton NextBtn32 = new JButton("");
		NextBtn32.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn32.setBounds(1147, 20, 27, 23);
		Panel32.add(NextBtn32);
		
		JLabel lblNewLabel_6_1_4 = new JLabel("");
		lblNewLabel_6_1_4.setIcon(new ImageIcon(Story.class.getResource("/image/32.png")));
		lblNewLabel_6_1_4.setBounds(0, 0, 1186, 563);
		Panel32.add(lblNewLabel_6_1_4);
		
		JPanel Panel33 = new JPanel();
		Panel33.setLayout(null);
		Panel33.setBounds(0, 0, 1186, 563);
		Room2.add(Panel33);
		
		JButton NextBtn33 = new JButton("");
		NextBtn33.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn33.setBounds(1147, 20, 27, 23);
		Panel33.add(NextBtn33);
		
		JLabel lblNewLabel_6_1_5 = new JLabel("");
		lblNewLabel_6_1_5.setIcon(new ImageIcon(Story.class.getResource("/image/33.png")));
		lblNewLabel_6_1_5.setBounds(0, 0, 1186, 563);
		Panel33.add(lblNewLabel_6_1_5);
		
		JPanel Panel34 = new JPanel();
		Panel34.setLayout(null);
		Panel34.setBounds(0, 0, 1186, 563);
		Room2.add(Panel34);
		
		JButton NextBtn34 = new JButton("");
		NextBtn34.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn34.setBounds(1147, 20, 27, 23);
		Panel34.add(NextBtn34);
		
		JLabel lblNewLabel_6_1_6 = new JLabel("");
		lblNewLabel_6_1_6.setIcon(new ImageIcon(Story.class.getResource("/image/34.png")));
		lblNewLabel_6_1_6.setBounds(0, 0, 1186, 563);
		Panel34.add(lblNewLabel_6_1_6);
		
		JPanel Panel35 = new JPanel();
		Panel35.setLayout(null);
		Panel35.setBounds(0, 0, 1186, 563);
		Room2.add(Panel35);
		
		JButton NextBtn35 = new JButton("");
		NextBtn35.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn35.setBounds(1147, 20, 27, 23);
		Panel35.add(NextBtn35);
		
		JLabel lblNewLabel_6_1_7 = new JLabel("");
		lblNewLabel_6_1_7.setIcon(new ImageIcon(Story.class.getResource("/image/35.png")));
		lblNewLabel_6_1_7.setBounds(0, 0, 1186, 563);
		Panel35.add(lblNewLabel_6_1_7);
		
		JPanel Panel36 = new JPanel();
		Panel36.setLayout(null);
		Panel36.setBounds(0, 0, 1186, 563);
		Room2.add(Panel36);
		
		JButton NextBtn36 = new JButton("");
		NextBtn36.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn36.setBounds(1147, 20, 27, 23);
		Panel36.add(NextBtn36);
		
		JLabel lblNewLabel_6_1_8 = new JLabel("");
		lblNewLabel_6_1_8.setIcon(new ImageIcon(Story.class.getResource("/image/36.png")));
		lblNewLabel_6_1_8.setBounds(0, 0, 1186, 563);
		Panel36.add(lblNewLabel_6_1_8);
		
		JPanel Panel37 = new JPanel();
		Panel37.setLayout(null);
		Panel37.setBounds(0, 0, 1186, 563);
		Room2.add(Panel37);
		
		JButton NextBtn37 = new JButton("");
		NextBtn37.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn37.setBounds(1147, 20, 27, 23);
		Panel37.add(NextBtn37);
		
		JLabel lblNewLabel_6_1_9 = new JLabel("");
		lblNewLabel_6_1_9.setIcon(new ImageIcon(Story.class.getResource("/image/37.png")));
		lblNewLabel_6_1_9.setBounds(0, 0, 1186, 563);
		Panel37.add(lblNewLabel_6_1_9);
		
		JPanel Panel38 = new JPanel();
		Panel38.setLayout(null);
		Panel38.setBounds(0, 0, 1186, 563);
		Room2.add(Panel38);
		
		JButton NextBtn38 = new JButton("");
		NextBtn38.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn38.setBounds(1147, 20, 27, 23);
		Panel38.add(NextBtn38);
		
		JLabel lblNewLabel_6_1_10 = new JLabel("");
		lblNewLabel_6_1_10.setIcon(new ImageIcon(Story.class.getResource("/image/38.png")));
		lblNewLabel_6_1_10.setBounds(0, 0, 1186, 563);
		Panel38.add(lblNewLabel_6_1_10);
		
		JPanel Panel39 = new JPanel();
		Panel39.setLayout(null);
		Panel39.setBounds(0, 0, 1186, 563);
		Room2.add(Panel39);
		
		JButton NextBtn39 = new JButton("");
		NextBtn39.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn39.setBounds(1147, 20, 27, 23);
		Panel39.add(NextBtn39);
		
		JLabel lblNewLabel_6_1_11 = new JLabel("");
		lblNewLabel_6_1_11.setIcon(new ImageIcon(Story.class.getResource("/image/39.png")));
		lblNewLabel_6_1_11.setBounds(0, 0, 1186, 563);
		Panel39.add(lblNewLabel_6_1_11);
		
		JPanel Panel40 = new JPanel();
		Panel40.setLayout(null);
		Panel40.setBounds(0, 0, 1186, 563);
		Room2.add(Panel40);
		
		JButton NextBtn40 = new JButton("");
		NextBtn40.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn40.setBounds(1147, 20, 27, 23);
		Panel40.add(NextBtn40);
		
		JLabel lblNewLabel_6_1_12 = new JLabel("");
		lblNewLabel_6_1_12.setIcon(new ImageIcon(Story.class.getResource("/image/40.png")));
		lblNewLabel_6_1_12.setBounds(0, 0, 1186, 563);
		Panel40.add(lblNewLabel_6_1_12);
		
		JPanel Panel41 = new JPanel();
		Panel41.setLayout(null);
		Panel41.setBounds(0, 0, 1186, 563);
		Room2.add(Panel41);
		
		JButton NextBtn41 = new JButton("");
		NextBtn41.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn41.setBounds(1147, 20, 27, 23);
		Panel41.add(NextBtn41);
		
		JLabel lblNewLabel_6_1_12_1 = new JLabel("");
		lblNewLabel_6_1_12_1.setIcon(new ImageIcon(Story.class.getResource("/image/41.png")));
		lblNewLabel_6_1_12_1.setBounds(0, 0, 1186, 563);
		Panel41.add(lblNewLabel_6_1_12_1);
		
		JPanel Panel42 = new JPanel();
		Panel42.setLayout(null);
		Panel42.setBounds(0, 0, 1186, 563);
		Room2.add(Panel42);
		
		JButton NextBtn42 = new JButton("");
		NextBtn42.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn42.setBounds(1147, 20, 27, 23);
		Panel42.add(NextBtn42);
		
		JLabel lblNewLabel_6_1_12_2 = new JLabel("");
		lblNewLabel_6_1_12_2.setIcon(new ImageIcon(Story.class.getResource("/image/42.png")));
		lblNewLabel_6_1_12_2.setBounds(0, 0, 1186, 563);
		Panel42.add(lblNewLabel_6_1_12_2);
		
		JPanel Panel43 = new JPanel();
		Panel43.setLayout(null);
		Panel43.setBounds(0, 0, 1186, 563);
		Room2.add(Panel43);
		
		JButton NextBtn43 = new JButton("");
		NextBtn43.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn43.setBounds(1147, 20, 27, 23);
		Panel43.add(NextBtn43);
		
		JLabel lblNewLabel_6_1_12_3 = new JLabel("");
		lblNewLabel_6_1_12_3.setIcon(new ImageIcon(Story.class.getResource("/image/43.png")));
		lblNewLabel_6_1_12_3.setBounds(0, 0, 1186, 563);
		Panel43.add(lblNewLabel_6_1_12_3);
		
		JPanel Panel44 = new JPanel();
		Panel44.setLayout(null);
		Panel44.setBounds(0, 0, 1186, 563);
		Room2.add(Panel44);
		
		JButton NextBtn44 = new JButton("");
		NextBtn44.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn44.setBounds(1147, 20, 27, 23);
		Panel44.add(NextBtn44);
		
		JLabel lblNewLabel_6_1_12_4 = new JLabel("");
		lblNewLabel_6_1_12_4.setIcon(new ImageIcon(Story.class.getResource("/image/44.png")));
		lblNewLabel_6_1_12_4.setBounds(0, 0, 1186, 563);
		Panel44.add(lblNewLabel_6_1_12_4);
		
		JPanel Panel45 = new JPanel();
		Panel45.setLayout(null);
		Panel45.setBounds(0, 0, 1186, 563);
		Room2.add(Panel45);
		
		JButton NextBtn45 = new JButton("");
		NextBtn45.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn45.setBounds(1147, 20, 27, 23);
		Panel45.add(NextBtn45);
		
		JLabel lblNewLabel_6_1_12_5 = new JLabel("");
		lblNewLabel_6_1_12_5.setIcon(new ImageIcon(Story.class.getResource("/image/45.png")));
		lblNewLabel_6_1_12_5.setBounds(0, 0, 1186, 563);
		Panel45.add(lblNewLabel_6_1_12_5);
		
		JPanel Panel46 = new JPanel();
		Panel46.setLayout(null);
		Panel46.setBounds(0, 0, 1186, 563);
		Room2.add(Panel46);
		
		JButton NextBtn46 = new JButton("");
		NextBtn46.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn46.setBounds(1147, 20, 27, 23);
		Panel46.add(NextBtn46);
		
		JLabel lblNewLabel_6_1_12_6 = new JLabel("");
		lblNewLabel_6_1_12_6.setIcon(new ImageIcon(Story.class.getResource("/image/46.png")));
		lblNewLabel_6_1_12_6.setBounds(0, 0, 1186, 563);
		Panel46.add(lblNewLabel_6_1_12_6);
		
		JPanel Panel47 = new JPanel();
		Panel47.setLayout(null);
		Panel47.setBounds(0, 0, 1186, 563);
		Room2.add(Panel47);
		
		JButton NextBtn47 = new JButton("");
		NextBtn47.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn47.setBounds(1147, 20, 27, 23);
		Panel47.add(NextBtn47);
		
		JLabel lblNewLabel_6_1_12_7 = new JLabel("");
		lblNewLabel_6_1_12_7.setIcon(new ImageIcon(Story.class.getResource("/image/47.png")));
		lblNewLabel_6_1_12_7.setBounds(0, 0, 1186, 563);
		Panel47.add(lblNewLabel_6_1_12_7);
		
		JPanel FindRoom2 = new JPanel();
		FindRoom2.setBounds(0, 0, 1186, 563);
		Room2.add(FindRoom2);
		FindRoom2.setLayout(null);
		
		JButton Room2Exit = new JButton("");
		Room2Exit.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		Room2Exit.setBounds(1147, 20, 27, 23);
		FindRoom2.add(Room2Exit);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7.setBounds(0, 0, 1186, 563);
		FindRoom2.add(lblNewLabel_7);
		
		JPanel Room3 = new JPanel();
		Room3.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room3);
		Room3.setLayout(null);
		
		StartBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TitlePanel.setVisible(false);
				Panel1.setVisible(true);
				
			}
			
		});
		NextBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel1.setVisible(false);
				Panel2.setVisible(true);
			}
			
		});
		NextBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel2.setVisible(false);
				Panel3.setVisible(true);
				
			}
			
		});
		NextBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel3.setVisible(false);
				Panel4.setVisible(true);
				
			}
			
		});
		NextBtn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel4.setVisible(false);
				Panel5.setVisible(true);
				
			}
			
		});
		NextBtn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel5.setVisible(false);
				Panel6.setVisible(true);
				
			}
			
		});
		Room_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room1.setVisible(true);
				Panel7.setVisible(true);
				
			}
			
		});
		NextBtn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel7.setVisible(false);
				Panel8.setVisible(true);
				
			}
			
		});
		NextBtn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel8.setVisible(false);
				Panel9.setVisible(true);
				
			}
			
		});
		NextBtn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel9.setVisible(false);
				Panel10.setVisible(true);
				
			}
			
		});
		NextBtn10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel10.setVisible(false);
				Panel11.setVisible(true);
				
			}
			
		});
		NextBtn11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel11.setVisible(false);
				Panel12.setVisible(true);
				
			}
			
		});
		NextBtn12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel12.setVisible(false);
				Panel13.setVisible(true);
				
			}
			
		});
		NextBtn13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel13.setVisible(false);
				Panel14.setVisible(true);
				
			}
			
		});
		NextBtn14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel14.setVisible(false);
				Panel15.setVisible(true);
				
			}
			
		});
		NextBtn15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel15.setVisible(false);
				Panel16.setVisible(true);
				
			}
			
		});
		NextBtn16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel16.setVisible(false);
				Panel17.setVisible(true);
				
			}
			
		});
		NextBtn17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel17.setVisible(false);
				Panel18.setVisible(true);
				
			}
			
		});
		NextBtn18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel18.setVisible(false);
				Panel19.setVisible(true);
				
			}
			
		});
		NextBtn19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel19.setVisible(false);
				Panel20.setVisible(true);
				
			}
			
		});
		NextBtn20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel20.setVisible(false);
				Panel21.setVisible(true);
				
			}
			
		});
		NextBtn21.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel21.setVisible(false);
				Panel22.setVisible(true);
				
			}
			
		});
		NextBtn22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel22.setVisible(false);
				Panel23.setVisible(true);
				
			}
			
		});
		NextBtn23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel23.setVisible(false);
				Panel24.setVisible(true);
				
			}
			
		});
		NextBtn24.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel24.setVisible(false);
				Panel25.setVisible(true);
				
			}
			
		});
		NextBtn25.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel25.setVisible(false);
				Panel26.setVisible(true);
				
			}
			
		});
		NextBtn26.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel26.setVisible(false);
				FindRoom1.setVisible(true);
				
			}
			
		});
		Room1Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Room1.setVisible(false);
				FindRoom1.setVisible(false);
				Panel6.setVisible(true);
				
			}
			
		});
		Room_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room2.setVisible(true);
				Panel27.setVisible(true);
			}
			
		});
		NextBtn27.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel27.setVisible(false);
				Panel28.setVisible(true);
				
			}
			
		});
		NextBtn28.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel28.setVisible(false);
				Panel29.setVisible(true);
				
			}
			
		});
		NextBtn29.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel29.setVisible(false);
				Panel30.setVisible(true);
				
			}
			
		});
		NextBtn30.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel30.setVisible(false);
				Panel31.setVisible(true);
				
			}
			
		});
		NextBtn31.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel31.setVisible(false);
				Panel32.setVisible(true);
				
			}
			
		});
		NextBtn32.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel32.setVisible(false);
				Panel33.setVisible(true);
				
			}
			
		});
		NextBtn33.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel33.setVisible(false);
				Panel34.setVisible(true);
				
			}
			
		});
		NextBtn34.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel34.setVisible(false);
				Panel35.setVisible(true);
				
			}
			
		});
		NextBtn35.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel35.setVisible(false);
				Panel36.setVisible(true);
				
			}
			
		});
		NextBtn36.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel36.setVisible(false);
				Panel37.setVisible(true);
				
			}
			
		});
		NextBtn37.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel37.setVisible(false);
				Panel38.setVisible(true);
				
			}
			
		});
		NextBtn38.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel38.setVisible(false);
				Panel39.setVisible(true);
				
			}
			
		});
		NextBtn39.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel39.setVisible(false);
				Panel40.setVisible(true);
				
			}
			
		});
		NextBtn40.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel40.setVisible(false);
				Panel41.setVisible(true);
				
			}
			
		});
		NextBtn41.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel41.setVisible(false);
				Panel42.setVisible(true);
				
			}
			
		});
		NextBtn42.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel42.setVisible(false);
				Panel43.setVisible(true);
				
			}
			
		});
		NextBtn43.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel43.setVisible(false);
				Panel44.setVisible(true);
				
			}
			
		});
		NextBtn44.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel44.setVisible(false);
				Panel45.setVisible(true);
				
			}
			
		});
		NextBtn45.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel45.setVisible(false);
				Panel46.setVisible(true);
				
			}
			
		});
		NextBtn46.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel46.setVisible(false);
				Panel47.setVisible(true);
				
			}
			
		});
		NextBtn47.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel47.setVisible(false);
				FindRoom2.setVisible(true);
				
			}
			
		});
		Room2Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindRoom2.setVisible(false);
				Room2.setVisible(false);
				Panel6.setVisible(true);
				
			}
			
		});
		
	}
}
