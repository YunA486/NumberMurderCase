package Apple;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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

		JButton StartBtn = new JButton("START");
		StartBtn.setForeground(Color.BLACK);
		StartBtn.setBackground(Color.WHITE);
		StartBtn.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		StartBtn.setBounds(513, 355, 139, 45);
		TitlePanel.add(StartBtn);

		JLabel Title = new JLabel("Number Murder Case");
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("Baskerville BT", Font.BOLD | Font.ITALIC, 60));
		Title.setBounds(288, 168, 638, 99);
		TitlePanel.add(Title);

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
		Room_1.setBounds(167, 69, 70, 23);
		Panel6.add(Room_1);

		JButton Room_2 = new JButton("2\uBC88 \uBC29");
		Room_2.setBounds(427, 69, 70, 23);
		Panel6.add(Room_2);

		JButton Room_3 = new JButton("3\uBC88 \uBC29");
		Room_3.setBounds(691, 69, 70, 23);
		Panel6.add(Room_3);

		JButton Room_4 = new JButton("4\uBC88 \uBC29");
		Room_4.setBounds(955, 69, 70, 23);
		Panel6.add(Room_4);

		JButton Room_5 = new JButton("5\uBC88 \uBC29");
		Room_5.setBounds(167, 355, 70, 23);
		Panel6.add(Room_5);

		JButton Room_6 = new JButton("6\uBC88 \uBC29");
		Room_6.setBounds(427, 355, 70, 23);
		Panel6.add(Room_6);

		JButton Room_7 = new JButton("7\uBC88 \uBC29");
		Room_7.setBounds(691, 355, 70, 23);
		Panel6.add(Room_7);

		JButton Room_8 = new JButton("\uBC94\uC778 \uC7A1\uAE30");
		Room_8.setBounds(943, 355, 87, 23);
		Panel6.add(Room_8);

		JLabel Rooms = new JLabel("");
		Rooms.setIcon(new ImageIcon(Story.class.getResource("/image/6.png")));
		Rooms.setBounds(0, 0, 1186, 563);
		Panel6.setVisible(false);
		Panel6.add(Rooms);

		JPanel Room1 = new JPanel();
		Room1.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room1);
		Room1.setVisible(false);
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
		FindRoom1.setVisible(false);
		FindRoom1.setLayout(null);

		JButton Room1Cups = new JButton("");
		Room1Cups.setIcon(new ImageIcon(Story.class.getResource("/image/Cups.png")));
		Room1Cups.setFocusPainted(false);
		Room1Cups.setContentAreaFilled(false);
		Room1Cups.setBorderPainted(false);
		Room1Cups.setBounds(768, 387, 40, 35);
		FindRoom1.add(Room1Cups);
		
		// 누르면 뜨게..
		Room1Cups.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "어젯밤 2번과 술을 마셨다니 정말이었군..", "두개의 잔", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room1UnderWear = new JButton("");
		Room1UnderWear.setIcon(new ImageIcon(Story.class.getResource("/image/UnderWear.png")));
		Room1UnderWear.setFocusPainted(false);
		Room1UnderWear.setContentAreaFilled(false);
		Room1UnderWear.setBorderPainted(false);
		Room1UnderWear.setBounds(891, 421, 35, 42);
		FindRoom1.add(Room1UnderWear);
		
		// 누르면 뜨게..
		Room1UnderWear.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "여자 속옷이 왜 여기에?!", "침대 밑 속옷", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room1Pill = new JButton("");
		Room1Pill.setIcon(new ImageIcon(Story.class.getResource("/image/Pill.png")));
		Room1Pill.setFocusPainted(false);
		Room1Pill.setContentAreaFilled(false);
		Room1Pill.setBorderPainted(false);
		Room1Pill.setBounds(655, 264, 30, 35);
		FindRoom1.add(Room1Pill);
		
		// 누르면 뜨게..
		Room1Pill.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "평소 잠을 못 자는군..", "침대 옆 수면제", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
	
		
		JButton Room1Script = new JButton("");
		Room1Script.setIcon(new ImageIcon(Story.class.getResource("/image/Script.png")));
		Room1Script.setFocusPainted(false);
		Room1Script.setBorderPainted(false);
		Room1Script.setBounds(849, 247, 35, 35);
		FindRoom1.add(Room1Script);
		
		// 누르면 뜨게..
		Room1Script.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번과 키스신이 있는 부분이군..", "침대 위 대본", 0);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room1Magazine = new JButton("");
		Room1Magazine.setIcon(new ImageIcon(Story.class.getResource("/image/Magazine.png")));
		Room1Magazine.setFocusPainted(false);
		Room1Magazine.setContentAreaFilled(false);
		Room1Magazine.setBorderPainted(false);
		Room1Magazine.setBounds(138, 521, 30, 42);
		FindRoom1.add(Room1Magazine);
		
		// 누르면 뜨게..
		Room1Magazine.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번이 나온 잡지야..", "소파 사이 잡지", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room1Exit = new JButton("\uB098\uAC00\uAE30");
		Room1Exit.setBounds(25, 20, 75, 23);
		FindRoom1.add(Room1Exit);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 0, 1186, 563);
		lblNewLabel_5.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		FindRoom1.setVisible(false);
		FindRoom1.add(lblNewLabel_5);

		JPanel Room2 = new JPanel();
		Room2.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room2);
		Room2.setVisible(false);
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
		FindRoom2.setVisible(false);
		FindRoom2.setLayout(null);

		JButton Room2LipStick = new JButton("");
		Room2LipStick.setIcon(new ImageIcon(Story.class.getResource("/image/LipStick.png")));
		Room2LipStick.setFocusPainted(false);
		Room2LipStick.setContentAreaFilled(false);
		Room2LipStick.setBorderPainted(false);
		Room2LipStick.setBounds(952, 440, 20, 43);
		FindRoom2.add(Room2LipStick);

		// 누르면 뜨게..
		Room2LipStick.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "들었던대로 역시 깔끔하군.. 립스틱 외에는 아무것도 없어..", "침대 밑 립스틱", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room2LipStick.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "어디서 많이 본 것 같은 립스틱인데..?", "침대 밑 립스틱", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		

		JButton Room2Exit = new JButton("\uB098\uAC00\uAE30");
		Room2Exit.setBounds(25, 20, 75, 23);
		FindRoom2.add(Room2Exit);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7.setBounds(0, 0, 1186, 563);
		FindRoom2.add(lblNewLabel_7);

		JPanel Room3 = new JPanel();
		Room3.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room3);
		Room3.setVisible(false);
		Room3.setLayout(null);

		JPanel Panel48 = new JPanel();
		Panel48.setLayout(null);
		Panel48.setBounds(0, 0, 1186, 563);
		Room3.add(Panel48);

		JButton NextBtn48 = new JButton("");
		NextBtn48.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn48.setBounds(1147, 20, 27, 23);
		Panel48.add(NextBtn48);

		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon(Story.class.getResource("/image/48.png")));
		lblNewLabel_6_2.setBounds(0, 0, 1186, 563);
		Panel48.add(lblNewLabel_6_2);

		JPanel Panel49 = new JPanel();
		Panel49.setLayout(null);
		Panel49.setBounds(0, 0, 1186, 563);
		Room3.add(Panel49);

		JButton NextBtn49 = new JButton("");
		NextBtn49.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn49.setBounds(1147, 20, 27, 23);
		Panel49.add(NextBtn49);

		JLabel lblNewLabel_6_2_1 = new JLabel("");
		lblNewLabel_6_2_1.setIcon(new ImageIcon(Story.class.getResource("/image/49.png")));
		lblNewLabel_6_2_1.setBounds(0, 0, 1186, 563);
		Panel49.add(lblNewLabel_6_2_1);

		JPanel Panel50 = new JPanel();
		Panel50.setLayout(null);
		Panel50.setBounds(0, 0, 1186, 563);
		Room3.add(Panel50);

		JButton NextBtn50 = new JButton("");
		NextBtn50.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn50.setBounds(1147, 20, 27, 23);
		Panel50.add(NextBtn50);

		JLabel lblNewLabel_6_2_2 = new JLabel("");
		lblNewLabel_6_2_2.setIcon(new ImageIcon(Story.class.getResource("/image/50.png")));
		lblNewLabel_6_2_2.setBounds(0, 0, 1186, 563);
		Panel50.add(lblNewLabel_6_2_2);

		JPanel Panel51 = new JPanel();
		Panel51.setLayout(null);
		Panel51.setBounds(0, 0, 1186, 563);
		Room3.add(Panel51);

		JButton NextBtn51 = new JButton("");
		NextBtn51.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn51.setBounds(1147, 20, 27, 23);
		Panel51.add(NextBtn51);

		JLabel lblNewLabel_6_2_3 = new JLabel("");
		lblNewLabel_6_2_3.setIcon(new ImageIcon(Story.class.getResource("/image/51.png")));
		lblNewLabel_6_2_3.setBounds(0, 0, 1186, 563);
		Panel51.add(lblNewLabel_6_2_3);

		JPanel Panel52 = new JPanel();
		Panel52.setLayout(null);
		Panel52.setBounds(0, 0, 1186, 563);
		Room3.add(Panel52);

		JButton NextBtn52 = new JButton("");
		NextBtn52.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn52.setBounds(1147, 20, 27, 23);
		Panel52.add(NextBtn52);

		JLabel lblNewLabel_6_2_4 = new JLabel("");
		lblNewLabel_6_2_4.setIcon(new ImageIcon(Story.class.getResource("/image/52.png")));
		lblNewLabel_6_2_4.setBounds(0, 0, 1186, 563);
		Panel52.add(lblNewLabel_6_2_4);

		JPanel Panel53 = new JPanel();
		Panel53.setLayout(null);
		Panel53.setBounds(0, 0, 1186, 563);
		Room3.add(Panel53);

		JButton NextBtn53 = new JButton("");
		NextBtn53.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn53.setBounds(1147, 20, 27, 23);
		Panel53.add(NextBtn53);

		JLabel lblNewLabel_6_2_5 = new JLabel("");
		lblNewLabel_6_2_5.setIcon(new ImageIcon(Story.class.getResource("/image/53.png")));
		lblNewLabel_6_2_5.setBounds(0, 0, 1186, 563);
		Panel53.add(lblNewLabel_6_2_5);

		JPanel Panel54 = new JPanel();
		Panel54.setLayout(null);
		Panel54.setBounds(0, 0, 1186, 563);
		Room3.add(Panel54);

		JButton NextBtn54 = new JButton("");
		NextBtn54.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn54.setBounds(1147, 20, 27, 23);
		Panel54.add(NextBtn54);

		JLabel lblNewLabel_6_2_6 = new JLabel("");
		lblNewLabel_6_2_6.setIcon(new ImageIcon(Story.class.getResource("/image/54.png")));
		lblNewLabel_6_2_6.setBounds(0, 0, 1186, 563);
		Panel54.add(lblNewLabel_6_2_6);

		JPanel Panel55 = new JPanel();
		Panel55.setLayout(null);
		Panel55.setBounds(0, 0, 1186, 563);
		Room3.add(Panel55);

		JButton NextBtn55 = new JButton("");
		NextBtn55.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn55.setBounds(1147, 20, 27, 23);
		Panel55.add(NextBtn55);

		JLabel lblNewLabel_6_2_7 = new JLabel("");
		lblNewLabel_6_2_7.setIcon(new ImageIcon(Story.class.getResource("/image/55.png")));
		lblNewLabel_6_2_7.setBounds(0, 0, 1186, 563);
		Panel55.add(lblNewLabel_6_2_7);

		JPanel Panel56 = new JPanel();
		Panel56.setLayout(null);
		Panel56.setBounds(0, 0, 1186, 563);
		Room3.add(Panel56);

		JButton NextBtn56 = new JButton("");
		NextBtn56.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn56.setBounds(1147, 20, 27, 23);
		Panel56.add(NextBtn56);

		JLabel lblNewLabel_6_2_8 = new JLabel("");
		lblNewLabel_6_2_8.setIcon(new ImageIcon(Story.class.getResource("/image/56.png")));
		lblNewLabel_6_2_8.setBounds(0, 0, 1186, 563);
		Panel56.add(lblNewLabel_6_2_8);

		JPanel Panel57 = new JPanel();
		Panel57.setLayout(null);
		Panel57.setBounds(0, 0, 1186, 563);
		Room3.add(Panel57);

		JButton NextBtn57 = new JButton("");
		NextBtn57.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn57.setBounds(1147, 20, 27, 23);
		Panel57.add(NextBtn57);

		JLabel lblNewLabel_6_2_9 = new JLabel("");
		lblNewLabel_6_2_9.setIcon(new ImageIcon(Story.class.getResource("/image/57.png")));
		lblNewLabel_6_2_9.setBounds(0, 0, 1186, 563);
		Panel57.add(lblNewLabel_6_2_9);

		JPanel Panel58 = new JPanel();
		Panel58.setLayout(null);
		Panel58.setBounds(0, 0, 1186, 563);
		Room3.add(Panel58);

		JButton NextBtn58 = new JButton("");
		NextBtn58.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn58.setBounds(1147, 20, 27, 23);
		Panel58.add(NextBtn58);

		JLabel lblNewLabel_6_2_10 = new JLabel("");
		lblNewLabel_6_2_10.setIcon(new ImageIcon(Story.class.getResource("/image/58.png")));
		lblNewLabel_6_2_10.setBounds(0, 0, 1186, 563);
		Panel58.add(lblNewLabel_6_2_10);

		JPanel Panel59 = new JPanel();
		Panel59.setLayout(null);
		Panel59.setBounds(0, 0, 1186, 563);
		Room3.add(Panel59);

		JButton NextBtn59 = new JButton("");
		NextBtn59.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn59.setBounds(1147, 20, 27, 23);
		Panel59.add(NextBtn59);

		JLabel lblNewLabel_6_2_11 = new JLabel("");
		lblNewLabel_6_2_11.setIcon(new ImageIcon(Story.class.getResource("/image/59.png")));
		lblNewLabel_6_2_11.setBounds(0, 0, 1186, 563);
		Panel59.add(lblNewLabel_6_2_11);

		JPanel Panel60 = new JPanel();
		Panel60.setLayout(null);
		Panel60.setBounds(0, 0, 1186, 563);
		Room3.add(Panel60);

		JButton NextBtn60 = new JButton("");
		NextBtn60.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn60.setBounds(1147, 20, 27, 23);
		Panel60.add(NextBtn60);

		JLabel lblNewLabel_6_2_12 = new JLabel("");
		lblNewLabel_6_2_12.setIcon(new ImageIcon(Story.class.getResource("/image/60.png")));
		lblNewLabel_6_2_12.setBounds(0, 0, 1186, 563);
		Panel60.add(lblNewLabel_6_2_12);

		JPanel Panel61 = new JPanel();
		Panel61.setLayout(null);
		Panel61.setBounds(0, 0, 1186, 563);
		Room3.add(Panel61);

		JButton NextBtn61 = new JButton("");
		NextBtn61.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn61.setBounds(1147, 20, 27, 23);
		Panel61.add(NextBtn61);

		JLabel lblNewLabel_6_2_13 = new JLabel("");
		lblNewLabel_6_2_13.setIcon(new ImageIcon(Story.class.getResource("/image/61.png")));
		lblNewLabel_6_2_13.setBounds(0, 0, 1186, 563);
		Panel61.add(lblNewLabel_6_2_13);

		JPanel Panel62 = new JPanel();
		Panel62.setLayout(null);
		Panel62.setBounds(0, 0, 1186, 563);
		Room3.add(Panel62);

		JButton NextBtn62 = new JButton("");
		NextBtn62.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn62.setBounds(1147, 20, 27, 23);
		Panel62.add(NextBtn62);

		JLabel lblNewLabel_6_2_14 = new JLabel("");
		lblNewLabel_6_2_14.setIcon(new ImageIcon(Story.class.getResource("/image/62.png")));
		lblNewLabel_6_2_14.setBounds(0, 0, 1186, 563);
		Panel62.add(lblNewLabel_6_2_14);

		JPanel FindRoom3 = new JPanel();
		FindRoom3.setLayout(null);
		FindRoom3.setBounds(0, 0, 1186, 563);
		FindRoom3.setVisible(false);
		Room3.add(FindRoom3);

		JButton Room3Carrier = new JButton("");
		Room3Carrier.setIcon(new ImageIcon(Story.class.getResource("/image/Carrier.png")));
		Room3Carrier.setFocusPainted(false);
		Room3Carrier.setContentAreaFilled(false);
		Room3Carrier.setBorderPainted(false);
		Room3Carrier.setBounds(926, 439, 43, 57);
		FindRoom3.add(Room3Carrier);

		// 누르면 뜨게..
		Room3Carrier.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "이건 누가 준 넥타이와 편지지?", "캐리어 안 넥타이와 러브레터", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Coat = new JButton("");
		Room3Coat.setIcon(new ImageIcon(Story.class.getResource("/image/Coat.png")));
		Room3Coat.setFocusPainted(false);
		Room3Coat.setContentAreaFilled(false);
		Room3Coat.setBorderPainted(false);
		Room3Coat.setBounds(141, 491, 72, 72);
		FindRoom3.add(Room3Coat);
		
		// 누르면 뜨게..
		Room3Coat.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "커플링인가? 누구 손에서 본 것같았는데..", "코트 안 반지", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Alchol = new JButton("");
		Room3Alchol.setIcon(new ImageIcon(Story.class.getResource("/image/alcohol.png")));
		Room3Alchol.setFocusPainted(false);
		Room3Alchol.setContentAreaFilled(false);
		Room3Alchol.setBorderPainted(false);
		Room3Alchol.setBounds(766, 364, 68, 78);
		FindRoom3.add(Room3Alchol);
		
		// 누르면 뜨게..
		Room3Alchol.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "술을 좋아하나보군..", "테이블 위 술병들", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Alchol_1 = new JButton("");
		Room3Alchol_1.setIcon(new ImageIcon(Story.class.getResource("/image/alcohol_1.png")));
		Room3Alchol_1.setFocusPainted(false);
		Room3Alchol_1.setContentAreaFilled(false);
		Room3Alchol_1.setBorderPainted(false);
		Room3Alchol_1.setBounds(746, 364, 68, 78);
		FindRoom3.add(Room3Alchol_1);

		// 누르면 뜨게..
		Room3Alchol_1.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "술을 좋아하나보군..", "테이블 위 술병들", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		JButton Room3Script = new JButton("");
		Room3Script.setIcon(new ImageIcon(Story.class.getResource("/image/Script.png")));
		Room3Script.setBorderPainted(false);
		Room3Script.setFocusPainted(false);
		Room3Script.setBounds(849, 247, 35, 35);
		
		// 누르면 뜨게..
		Room3Script.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "감독이라 그런지 대본이 많군..", "많은 대본들", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Script_1 = new JButton("");
		Room3Script_1.setIcon(new ImageIcon(Story.class.getResource("/image/Script.png")));
		Room3Script_1.setFocusPainted(false);
		Room3Script_1.setBorderPainted(false);
		Room3Script_1.setBounds(760, 250, 35, 35);
		FindRoom3.add(Room3Script_1);
		
		// 누르면 뜨게..
		Room3Script_1.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "감독이라 그런지 대본이 많군..", "많은 대본들", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Script_2 = new JButton("");
		Room3Script_2.setIcon(new ImageIcon(Story.class.getResource("/image/Script.png")));
		Room3Script_2.setFocusPainted(false);
		Room3Script_2.setBorderPainted(false);
		Room3Script_2.setBounds(50, 280, 35, 35);
		FindRoom3.add(Room3Script_2);
		
		// 누르면 뜨게..
		Room3Script_2.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "감독이라 그런지 대본이 많군..", "많은 대본들", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Script_3 = new JButton("");
		Room3Script_3.setIcon(new ImageIcon(Story.class.getResource("/image/Script.png")));
		Room3Script_3.setFocusPainted(false);
		Room3Script_3.setBorderPainted(false);
		Room3Script_3.setBounds(105, 285, 35, 35);
		FindRoom3.add(Room3Script_3);
		
		// 누르면 뜨게..
		Room3Script_3.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "감독이라 그런지 대본이 많군..", "많은 대본들", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Lighter = new JButton("");
		Room3Lighter.setIcon(new ImageIcon(Story.class.getResource("/image/Lighter.png")));
		Room3Lighter.setBorderPainted(false);
		Room3Lighter.setContentAreaFilled(false);
		Room3Lighter.setFocusPainted(false);
		Room3Lighter.setBounds(631, 266, 25, 40);
		FindRoom3.add(Room3Lighter);
		
		// 누르면 뜨게..
		Room3Lighter.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "흡연을 하는군..", "담배와 라이터", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room3Tobacco = new JButton("");
		Room3Tobacco.setIcon(new ImageIcon(Story.class.getResource("/image/Tobacco.png")));
		Room3Tobacco.setBorderPainted(false);
		Room3Tobacco.setContentAreaFilled(false);
		Room3Tobacco.setFocusPainted(false);
		Room3Tobacco.setBounds(655, 264, 32, 42);
		FindRoom3.add(Room3Tobacco);

		// 누르면 뜨게..
		Room3Tobacco.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "자세히 보니 4번과 찍은 사진처럼 보이는군..", "담배곽 안 탄 종이의 흔적", 0);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room3Tobacco.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "무엇을 태웠지?", "담배곽 안 탄 종이의 흔적", 0);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		JButton Room3Exit = new JButton("\uB098\uAC00\uAE30");
		Room3Exit.setBounds(25, 20, 75, 23);
		FindRoom3.add(Room3Exit);

		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7_1.setBounds(0, 0, 1186, 563);
		FindRoom3.add(lblNewLabel_7_1);

		JPanel Room4 = new JPanel();
		Room4.setLayout(null);
		Room4.setBounds(0, 0, 1186, 563);
		Room4.setVisible(false);
		frame.getContentPane().add(Room4);

		JPanel Panel115 = new JPanel();
		Panel115.setLayout(null);
		Panel115.setBounds(0, 0, 1186, 563);
		Room4.add(Panel115);

		JButton NextBtn115 = new JButton("");
		NextBtn115.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn115.setBounds(1147, 20, 27, 23);
		Panel115.add(NextBtn115);

		JLabel lblNewLabel_6_2_14_1 = new JLabel("");
		lblNewLabel_6_2_14_1.setIcon(new ImageIcon(Story.class.getResource("/image/115.png")));
		lblNewLabel_6_2_14_1.setBounds(0, 0, 1186, 563);
		Panel115.add(lblNewLabel_6_2_14_1);

		JPanel Panel116 = new JPanel();
		Panel116.setLayout(null);
		Panel116.setBounds(0, 0, 1186, 563);
		Room4.add(Panel116);

		JButton NextBtn116 = new JButton("");
		NextBtn116.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn116.setBounds(1147, 20, 27, 23);
		Panel116.add(NextBtn116);

		JLabel lblNewLabel_6_2_14_1_1 = new JLabel("");
		lblNewLabel_6_2_14_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/116.png")));
		lblNewLabel_6_2_14_1_1.setBounds(0, 0, 1186, 563);
		Panel116.add(lblNewLabel_6_2_14_1_1);

		JPanel Panel117 = new JPanel();
		Panel117.setLayout(null);
		Panel117.setBounds(0, 0, 1186, 563);
		Room4.add(Panel117);

		JButton NextBtn117 = new JButton("");
		NextBtn117.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn117.setBounds(1147, 20, 27, 23);
		Panel117.add(NextBtn117);

		JLabel lblNewLabel_6_2_14_1_2 = new JLabel("");
		lblNewLabel_6_2_14_1_2.setIcon(new ImageIcon(Story.class.getResource("/image/117.png")));
		lblNewLabel_6_2_14_1_2.setBounds(0, 0, 1186, 563);
		Panel117.add(lblNewLabel_6_2_14_1_2);

		JPanel Panel118 = new JPanel();
		Panel118.setLayout(null);
		Panel118.setBounds(0, 0, 1186, 563);
		Room4.add(Panel118);

		JButton NextBtn118 = new JButton("");
		NextBtn118.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn118.setBounds(1147, 20, 27, 23);
		Panel118.add(NextBtn118);

		JLabel lblNewLabel_6_2_14_1_4 = new JLabel("");
		lblNewLabel_6_2_14_1_4.setIcon(new ImageIcon(Story.class.getResource("/image/118.png")));
		lblNewLabel_6_2_14_1_4.setBounds(0, 0, 1186, 563);
		Panel118.add(lblNewLabel_6_2_14_1_4);

		JPanel Panel119 = new JPanel();
		Panel119.setLayout(null);
		Panel119.setBounds(0, 0, 1186, 563);
		Room4.add(Panel119);

		JButton NextBtn119 = new JButton("");
		NextBtn119.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn119.setBounds(1147, 20, 27, 23);
		Panel119.add(NextBtn119);

		JLabel lblNewLabel_6_2_14_1_3 = new JLabel("");
		lblNewLabel_6_2_14_1_3.setIcon(new ImageIcon(Story.class.getResource("/image/119.png")));
		lblNewLabel_6_2_14_1_3.setBounds(0, 0, 1186, 563);
		Panel119.add(lblNewLabel_6_2_14_1_3);

		JPanel FindRoom4 = new JPanel();
		FindRoom4.setLayout(null);
		FindRoom4.setBounds(0, 0, 1186, 563);
		FindRoom4.setVisible(false);
		Room4.add(FindRoom4);

		JButton Room4Sock = new JButton("");
		Room4Sock.setIcon(new ImageIcon(Story.class.getResource("/image/Sock.png")));
		Room4Sock.setBorderPainted(false);
		Room4Sock.setContentAreaFilled(false);
		Room4Sock.setFocusPainted(false);
		Room4Sock.setBounds(136, 518, 48, 45);
		FindRoom4.add(Room4Sock);
		
		// 누르면 뜨게..
		Room4Sock.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "양말이 한 짝밖에 없군..", "양말 한 짝", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4Cup = new JButton("");
		Room4Cup.setIcon(new ImageIcon(Story.class.getResource("/image/Cup.png")));
		Room4Cup.setBorderPainted(false);
		Room4Cup.setContentAreaFilled(false);
		Room4Cup.setFocusPainted(false);
		Room4Cup.setBounds(237, 232, 39, 54);
		FindRoom4.add(Room4Cup);
		
		// 누르면 뜨게..
		Room4Cup.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "이 안에 무엇이 들어있었을까?", "테이블 위 컵", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room4Cup.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "이 안에 들어있는 것을 마시고 피해자는 사망하였군..", "테이블 위 컵", 0);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4Juice = new JButton("");
		Room4Juice.setIcon(new ImageIcon(Story.class.getResource("/image/Juice.png")));
		Room4Juice.setBorderPainted(false);
		Room4Juice.setContentAreaFilled(false);
		Room4Juice.setFocusPainted(false);
		Room4Juice.setBounds(767, 401, 45, 59);
		FindRoom4.add(Room4Juice);
		
		// 누르면 뜨게..
		Room4Juice.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "누가 준 음료수일까?", "테이블 위 음료수", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4Card = new JButton("");
		Room4Card.setIcon(new ImageIcon(Story.class.getResource("/image/BusinessCard.png")));
		Room4Card.setBounds(623, 285, 40, 23);
		FindRoom4.add(Room4Card);
		
		// 누르면 뜨게..
		Room4Card.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "흥신소 명함.. 스토커를 알아보기 위함인가..", "핸드폰 옆 명함", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4HandBag = new JButton("");
		Room4HandBag.setIcon(new ImageIcon(Story.class.getResource("/image/HandBag.png")));
		Room4HandBag.setFocusPainted(false);
		Room4HandBag.setContentAreaFilled(false);
		Room4HandBag.setBorderPainted(false);
		Room4HandBag.setBounds(643, 260, 52, 39);
		FindRoom4.add(Room4HandBag);
		
		// 누르면 뜨게..
		Room4HandBag.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "2번과 같은 립스틱이군..", "핸드백 안 립스틱", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4Pill = new JButton("");
		Room4Pill.setIcon(new ImageIcon(Story.class.getResource("/image/Pill.png")));
		Room4Pill.setFocusPainted(false);
		Room4Pill.setContentAreaFilled(false);
		Room4Pill.setBorderPainted(false);
		Room4Pill.setBounds(1000, 500, 30, 35);
		FindRoom4.add(Room4Pill);
		
		// 누르면 뜨게..
		Room4Pill.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "수면제..역시 자살인건가..?", "침대 밑 수면제", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4Script = new JButton("");
		Room4Script.setIcon(new ImageIcon(Story.class.getResource("/image/Script.png")));
		Room4Script.setFocusPainted(false);
		Room4Script.setBorderPainted(false);
		Room4Script.setBounds(849, 249, 35, 35);
		FindRoom4.add(Room4Script);
		
		// 누르면 뜨게..
		Room4Script.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "대본을 보고있었나보군..", "대본", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room4Exit = new JButton("\uB098\uAC00\uAE30");
		Room4Exit.setBounds(25, 20, 75, 23);
		FindRoom4.add(Room4Exit);

		JLabel lblNewLabel_7_1_1 = new JLabel("");
		lblNewLabel_7_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7_1_1.setBounds(0, 0, 1186, 563);
		FindRoom4.add(lblNewLabel_7_1_1);

		JPanel Room5 = new JPanel();
		Room5.setLayout(null);
		Room5.setBounds(0, 0, 1186, 563);
		Room5.setVisible(false);
		frame.getContentPane().add(Room5);

		JPanel Panel63 = new JPanel();
		Panel63.setLayout(null);
		Panel63.setBounds(0, 0, 1186, 563);
		Room5.add(Panel63);

		JButton NextBtn63 = new JButton("");
		NextBtn63.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn63.setBounds(1147, 20, 27, 23);
		Panel63.add(NextBtn63);

		JLabel lblNewLabel_6_1_12_7_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1.setIcon(new ImageIcon(Story.class.getResource("/image/63.png")));
		lblNewLabel_6_1_12_7_1.setBounds(0, 0, 1186, 563);
		Panel63.add(lblNewLabel_6_1_12_7_1);

		JPanel Panel64 = new JPanel();
		Panel64.setLayout(null);
		Panel64.setBounds(0, 0, 1186, 563);
		Room5.add(Panel64);

		JButton NextBtn64 = new JButton("");
		NextBtn64.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn64.setBounds(1147, 20, 27, 23);
		Panel64.add(NextBtn64);

		JLabel lblNewLabel_6_1_12_7_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/64.png")));
		lblNewLabel_6_1_12_7_1_1.setBounds(0, 0, 1186, 563);
		Panel64.add(lblNewLabel_6_1_12_7_1_1);

		JPanel Panel65 = new JPanel();
		Panel65.setLayout(null);
		Panel65.setBounds(0, 0, 1186, 563);
		Room5.add(Panel65);

		JButton NextBtn65 = new JButton("");
		NextBtn65.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn65.setBounds(1147, 20, 27, 23);
		Panel65.add(NextBtn65);

		JLabel lblNewLabel_6_1_12_7_1_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_2.setIcon(new ImageIcon(Story.class.getResource("/image/65.png")));
		lblNewLabel_6_1_12_7_1_2.setBounds(0, 0, 1186, 563);
		Panel65.add(lblNewLabel_6_1_12_7_1_2);

		JPanel Panel66 = new JPanel();
		Panel66.setLayout(null);
		Panel66.setBounds(0, 0, 1186, 563);
		Room5.add(Panel66);

		JButton NextBtn66 = new JButton("");
		NextBtn66.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn66.setBounds(1147, 20, 27, 23);
		Panel66.add(NextBtn66);

		JLabel lblNewLabel_6_1_12_7_1_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_3.setIcon(new ImageIcon(Story.class.getResource("/image/66.png")));
		lblNewLabel_6_1_12_7_1_3.setBounds(0, 0, 1186, 563);
		Panel66.add(lblNewLabel_6_1_12_7_1_3);

		JPanel Panel67 = new JPanel();
		Panel67.setLayout(null);
		Panel67.setBounds(0, 0, 1186, 563);
		Room5.add(Panel67);

		JButton NextBtn67 = new JButton("");
		NextBtn67.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn67.setBounds(1147, 20, 27, 23);
		Panel67.add(NextBtn67);

		JLabel lblNewLabel_6_1_12_7_1_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_4.setIcon(new ImageIcon(Story.class.getResource("/image/67.png")));
		lblNewLabel_6_1_12_7_1_4.setBounds(0, 0, 1186, 563);
		Panel67.add(lblNewLabel_6_1_12_7_1_4);

		JPanel Panel68 = new JPanel();
		Panel68.setLayout(null);
		Panel68.setBounds(0, 0, 1186, 563);
		Room5.add(Panel68);

		JButton NextBtn68 = new JButton("");
		NextBtn68.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn68.setBounds(1147, 20, 27, 23);
		Panel68.add(NextBtn68);

		JLabel lblNewLabel_6_1_12_7_1_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_5.setIcon(new ImageIcon(Story.class.getResource("/image/68.png")));
		lblNewLabel_6_1_12_7_1_5.setBounds(0, 0, 1186, 563);
		Panel68.add(lblNewLabel_6_1_12_7_1_5);

		JPanel Panel69 = new JPanel();
		Panel69.setLayout(null);
		Panel69.setBounds(0, 0, 1186, 563);
		Room5.add(Panel69);

		JButton NextBtn69 = new JButton("");
		NextBtn69.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn69.setBounds(1147, 20, 27, 23);
		Panel69.add(NextBtn69);

		JLabel lblNewLabel_6_1_12_7_1_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_6.setIcon(new ImageIcon(Story.class.getResource("/image/69.png")));
		lblNewLabel_6_1_12_7_1_6.setBounds(0, 0, 1186, 563);
		Panel69.add(lblNewLabel_6_1_12_7_1_6);

		JPanel Panel70 = new JPanel();
		Panel70.setLayout(null);
		Panel70.setBounds(0, 0, 1186, 563);
		Room5.add(Panel70);

		JButton NextBtn70 = new JButton("");
		NextBtn70.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn70.setBounds(1147, 20, 27, 23);
		Panel70.add(NextBtn70);

		JLabel lblNewLabel_6_1_12_7_1_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_7.setIcon(new ImageIcon(Story.class.getResource("/image/70.png")));
		lblNewLabel_6_1_12_7_1_7.setBounds(0, 0, 1186, 563);
		Panel70.add(lblNewLabel_6_1_12_7_1_7);

		JPanel Panel71 = new JPanel();
		Panel71.setLayout(null);
		Panel71.setBounds(0, 0, 1186, 563);
		Room5.add(Panel71);

		JButton NextBtn71 = new JButton("");
		NextBtn71.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn71.setBounds(1147, 20, 27, 23);
		Panel71.add(NextBtn71);

		JLabel lblNewLabel_6_1_12_7_1_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_8.setIcon(new ImageIcon(Story.class.getResource("/image/71.png")));
		lblNewLabel_6_1_12_7_1_8.setBounds(0, 0, 1186, 563);
		Panel71.add(lblNewLabel_6_1_12_7_1_8);

		JPanel Panel72 = new JPanel();
		Panel72.setLayout(null);
		Panel72.setBounds(0, 0, 1186, 563);
		Room5.add(Panel72);

		JButton NextBtn72 = new JButton("");
		NextBtn72.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn72.setBounds(1147, 20, 27, 23);
		Panel72.add(NextBtn72);

		JLabel lblNewLabel_6_1_12_7_1_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_9.setIcon(new ImageIcon(Story.class.getResource("/image/72.png")));
		lblNewLabel_6_1_12_7_1_9.setBounds(0, 0, 1186, 563);
		Panel72.add(lblNewLabel_6_1_12_7_1_9);

		JPanel Panel73 = new JPanel();
		Panel73.setLayout(null);
		Panel73.setBounds(0, 0, 1186, 563);
		Room5.add(Panel73);

		JButton NextBtn73 = new JButton("");
		NextBtn73.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn73.setBounds(1147, 20, 27, 23);
		Panel73.add(NextBtn73);

		JLabel lblNewLabel_6_1_12_7_1_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_10.setIcon(new ImageIcon(Story.class.getResource("/image/73.png")));
		lblNewLabel_6_1_12_7_1_10.setBounds(0, 0, 1186, 563);
		Panel73.add(lblNewLabel_6_1_12_7_1_10);

		JPanel Panel74 = new JPanel();
		Panel74.setLayout(null);
		Panel74.setBounds(0, 0, 1186, 563);
		Room5.add(Panel74);

		JButton NextBtn74 = new JButton("");
		NextBtn74.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn74.setBounds(1147, 20, 27, 23);
		Panel74.add(NextBtn74);

		JLabel lblNewLabel_6_1_12_7_1_11 = new JLabel("");
		lblNewLabel_6_1_12_7_1_11.setIcon(new ImageIcon(Story.class.getResource("/image/74.png")));
		lblNewLabel_6_1_12_7_1_11.setBounds(0, 0, 1186, 563);
		Panel74.add(lblNewLabel_6_1_12_7_1_11);

		JPanel Panel75 = new JPanel();
		Panel75.setLayout(null);
		Panel75.setBounds(0, 0, 1186, 563);
		Room5.add(Panel75);

		JButton NextBtn75 = new JButton("");
		NextBtn75.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn75.setBounds(1147, 20, 27, 23);
		Panel75.add(NextBtn75);

		JLabel lblNewLabel_6_1_12_7_1_12 = new JLabel("");
		lblNewLabel_6_1_12_7_1_12.setIcon(new ImageIcon(Story.class.getResource("/image/75.png")));
		lblNewLabel_6_1_12_7_1_12.setBounds(0, 0, 1186, 563);
		Panel75.add(lblNewLabel_6_1_12_7_1_12);

		JPanel Panel76 = new JPanel();
		Panel76.setLayout(null);
		Panel76.setBounds(0, 0, 1186, 563);
		Room5.add(Panel76);

		JButton NextBtn76 = new JButton("");
		NextBtn76.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn76.setBounds(1147, 20, 27, 23);
		Panel76.add(NextBtn76);

		JLabel lblNewLabel_6_1_12_7_1_13 = new JLabel("");
		lblNewLabel_6_1_12_7_1_13.setIcon(new ImageIcon(Story.class.getResource("/image/76.png")));
		lblNewLabel_6_1_12_7_1_13.setBounds(0, 0, 1186, 563);
		Panel76.add(lblNewLabel_6_1_12_7_1_13);

		JPanel Panel77 = new JPanel();
		Panel77.setLayout(null);
		Panel77.setBounds(0, 0, 1186, 563);
		Room5.add(Panel77);

		JButton NextBtn77 = new JButton("");
		NextBtn77.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn77.setBounds(1147, 20, 27, 23);
		Panel77.add(NextBtn77);

		JLabel lblNewLabel_6_1_12_7_1_14 = new JLabel("");
		lblNewLabel_6_1_12_7_1_14.setIcon(new ImageIcon(Story.class.getResource("/image/77.png")));
		lblNewLabel_6_1_12_7_1_14.setBounds(0, 0, 1186, 563);
		Panel77.add(lblNewLabel_6_1_12_7_1_14);

		JPanel Panel78 = new JPanel();
		Panel78.setLayout(null);
		Panel78.setBounds(0, 0, 1186, 563);
		Room5.add(Panel78);

		JButton NextBtn78 = new JButton("");
		NextBtn78.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn78.setBounds(1147, 20, 27, 23);
		Panel78.add(NextBtn78);

		JLabel lblNewLabel_6_1_12_7_1_15 = new JLabel("");
		lblNewLabel_6_1_12_7_1_15.setIcon(new ImageIcon(Story.class.getResource("/image/78.png")));
		lblNewLabel_6_1_12_7_1_15.setBounds(0, 0, 1186, 563);
		Panel78.add(lblNewLabel_6_1_12_7_1_15);

		JPanel Panel79 = new JPanel();
		Panel79.setLayout(null);
		Panel79.setBounds(0, 0, 1186, 563);
		Room5.add(Panel79);

		JButton NextBtn79 = new JButton("");
		NextBtn79.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn79.setBounds(1147, 20, 27, 23);
		Panel79.add(NextBtn79);

		JLabel lblNewLabel_6_1_12_7_1_16 = new JLabel("");
		lblNewLabel_6_1_12_7_1_16.setIcon(new ImageIcon(Story.class.getResource("/image/79.png")));
		lblNewLabel_6_1_12_7_1_16.setBounds(0, 0, 1186, 563);
		Panel79.add(lblNewLabel_6_1_12_7_1_16);

		JPanel Panel80 = new JPanel();
		Panel80.setLayout(null);
		Panel80.setBounds(0, 0, 1186, 563);
		Room5.add(Panel80);

		JButton NextBtn80 = new JButton("");
		NextBtn80.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn80.setBounds(1147, 20, 27, 23);
		Panel80.add(NextBtn80);

		JLabel lblNewLabel_6_1_12_7_1_17 = new JLabel("");
		lblNewLabel_6_1_12_7_1_17.setIcon(new ImageIcon(Story.class.getResource("/image/80.png")));
		lblNewLabel_6_1_12_7_1_17.setBounds(0, 0, 1186, 563);
		Panel80.add(lblNewLabel_6_1_12_7_1_17);

		JPanel Panel81 = new JPanel();
		Panel81.setLayout(null);
		Panel81.setBounds(0, 0, 1186, 563);
		Room5.add(Panel81);

		JButton NextBtn81 = new JButton("");
		NextBtn81.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn81.setBounds(1147, 20, 27, 23);
		Panel81.add(NextBtn81);

		JLabel lblNewLabel_6_1_12_7_1_18 = new JLabel("");
		lblNewLabel_6_1_12_7_1_18.setIcon(new ImageIcon(Story.class.getResource("/image/81.png")));
		lblNewLabel_6_1_12_7_1_18.setBounds(0, 0, 1186, 563);
		Panel81.add(lblNewLabel_6_1_12_7_1_18);

		JPanel Panel82 = new JPanel();
		Panel82.setLayout(null);
		Panel82.setBounds(0, 0, 1186, 563);
		Room5.add(Panel82);

		JButton NextBtn82 = new JButton("");
		NextBtn82.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn82.setBounds(1147, 20, 27, 23);
		Panel82.add(NextBtn82);

		JLabel lblNewLabel_6_1_12_7_1_19 = new JLabel("");
		lblNewLabel_6_1_12_7_1_19.setIcon(new ImageIcon(Story.class.getResource("/image/82.png")));
		lblNewLabel_6_1_12_7_1_19.setBounds(0, 0, 1186, 563);
		Panel82.add(lblNewLabel_6_1_12_7_1_19);

		JPanel Panel83 = new JPanel();
		Panel83.setLayout(null);
		Panel83.setBounds(0, 0, 1186, 563);
		Room5.add(Panel83);

		JButton NextBtn83 = new JButton("");
		NextBtn83.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn83.setBounds(1147, 20, 27, 23);
		Panel83.add(NextBtn83);

		JLabel lblNewLabel_6_1_12_7_1_20 = new JLabel("");
		lblNewLabel_6_1_12_7_1_20.setIcon(new ImageIcon(Story.class.getResource("/image/83.png")));
		lblNewLabel_6_1_12_7_1_20.setBounds(0, 0, 1186, 563);
		Panel83.add(lblNewLabel_6_1_12_7_1_20);

		JPanel Panel84 = new JPanel();
		Panel84.setLayout(null);
		Panel84.setBounds(0, 0, 1186, 563);
		Room5.add(Panel84);

		JButton NextBtn84 = new JButton("");
		NextBtn84.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn84.setBounds(1147, 20, 27, 23);
		Panel84.add(NextBtn84);

		JLabel lblNewLabel_6_1_12_7_1_21 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21.setIcon(new ImageIcon(Story.class.getResource("/image/84.png")));
		lblNewLabel_6_1_12_7_1_21.setBounds(0, 0, 1186, 563);
		Panel84.add(lblNewLabel_6_1_12_7_1_21);

		JPanel Panel85 = new JPanel();
		Panel85.setLayout(null);
		Panel85.setBounds(0, 0, 1186, 563);
		Room5.add(Panel85);

		JButton NextBtn85 = new JButton("");
		NextBtn85.setBounds(1147, 20, 27, 23);
		Panel85.add(NextBtn85);

		JLabel lblNewLabel_6_1_12_7_1_21_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1.setIcon(new ImageIcon(Story.class.getResource("/image/85.png")));
		lblNewLabel_6_1_12_7_1_21_1.setBounds(0, 0, 1186, 563);
		Panel85.add(lblNewLabel_6_1_12_7_1_21_1);

		JPanel FindRoom5 = new JPanel();
		FindRoom5.setLayout(null);
		FindRoom5.setBounds(0, 0, 1186, 563);
		FindRoom5.setVisible(false);
		Room5.add(FindRoom5);

		JButton Room5Camera = new JButton("");
		Room5Camera.setIcon(new ImageIcon(Story.class.getResource("/image/Camera.png")));
		Room5Camera.setBorderPainted(false);
		Room5Camera.setContentAreaFilled(false);
		Room5Camera.setFocusPainted(false);
		Room5Camera.setBounds(567, 277, 47, 45);
		FindRoom5.add(Room5Camera);
		
		// 누르면 뜨게..
		Room5Camera.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "스태프라 카메라가 있군..", "카메라", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Schedule = new JButton("");
		Room5Schedule.setIcon(new ImageIcon(Story.class.getResource("/image/Schedule.png")));
		Room5Schedule.setBorderPainted(false);
		Room5Schedule.setContentAreaFilled(false);
		Room5Schedule.setFocusPainted(false);
		Room5Schedule.setBounds(637, 277, 36, 45);
		FindRoom5.add(Room5Schedule);
		
		// 누르면 뜨게..
		Room5Schedule.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "촬영 스케줄표군..", "스케줄 표", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Sign = new JButton("");
		Room5Sign.setIcon(new ImageIcon(Story.class.getResource("/image/Sign.png")));
		Room5Sign.setBounds(210, 270, 32, 38);
		FindRoom5.add(Room5Sign);
		
		// 누르면 뜨게..
		Room5Sign.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번의 싸인과 잡지군.. 4번의 팬인가..?", "4번의 싸인과 잡지", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Alchol = new JButton("");
		Room5Alchol.setIcon(new ImageIcon(Story.class.getResource("/image/alcohol.png")));
		Room5Alchol.setFocusPainted(false);
		Room5Alchol.setContentAreaFilled(false);
		Room5Alchol.setBorderPainted(false);
		Room5Alchol.setBounds(900, 425, 68, 78);
		FindRoom5.add(Room5Alchol);
		
		// 누르면 뜨게..
		Room5Alchol.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "술을 좋아하나..?", "침대 밑 술병들", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Alchol_1 = new JButton("");
		Room5Alchol_1.setIcon(new ImageIcon(Story.class.getResource("/image/alcohol_1.png")));
		Room5Alchol_1.setFocusPainted(false);
		Room5Alchol_1.setContentAreaFilled(false);
		Room5Alchol_1.setBorderPainted(false);
		Room5Alchol_1.setBounds(930, 425, 68, 78);
		FindRoom5.add(Room5Alchol_1);
		
		// 누르면 뜨게..
		Room5Alchol_1.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "술을 좋아하나..?", "침대 밑 술병들", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Carrier = new JButton("");
		Room5Carrier.setIcon(new ImageIcon(Story.class.getResource("/image/Carrier.png")));
		Room5Carrier.setFocusPainted(false);
		Room5Carrier.setContentAreaFilled(false);
		Room5Carrier.setBorderPainted(false);
		Room5Carrier.setBounds(472, 319, 43, 57);
		FindRoom5.add(Room5Carrier);
		
		// 누르면 뜨게..
		Room5Carrier.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번이 가지고 있던 음료수잖아??", "캐리어 안 음료수", 0);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room5Carrier.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "누구에게 줄 편지와 선물이지..?", "캐리어 안 편지와 선물", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Pill = new JButton("");
		Room5Pill.setIcon(new ImageIcon(Story.class.getResource("/image/Pill.png")));
		Room5Pill.setFocusPainted(false);
		Room5Pill.setContentAreaFilled(false);
		Room5Pill.setBorderPainted(false);
		Room5Pill.setBounds(800, 250, 30, 35);
		FindRoom5.add(Room5Pill);
		
		Room5Pill.addActionListener(new ActionListener() {

		       @Override
		       public void actionPerformed(ActionEvent e) {
		          JOptionPane.showMessageDialog(null, "숨겨둔건가..?", "침대 사이 수면제", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
		       }
		         
		});
		
		// 누르면 뜨게..
		Room5Pill.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "이불에 숨겨져있어 발견하지 못할 뻔 했군..", "침대 사이 수면제", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room5Exit = new JButton("\uB098\uAC00\uAE30");
		Room5Exit.setBounds(25, 20, 75, 23);
		FindRoom5.add(Room5Exit);

		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7_2.setBounds(0, 0, 1186, 563);
		FindRoom5.add(lblNewLabel_7_2);

		JPanel Room6 = new JPanel();
		Room6.setBounds(0, 0, 1186, 563);
		Room6.setVisible(false);
		frame.getContentPane().add(Room6);
		Room6.setLayout(null);

		JPanel Panel86 = new JPanel();
		Panel86.setLayout(null);
		Panel86.setBounds(0, 0, 1186, 563);
		Room6.add(Panel86);

		JButton NextBtn86 = new JButton("");
		NextBtn86.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn86.setBounds(1147, 20, 27, 23);
		Panel86.add(NextBtn86);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/63.png")));
		lblNewLabel_6_1_12_7_1_21_1_1.setBounds(0, 0, 1186, 563);
		Panel86.add(lblNewLabel_6_1_12_7_1_21_1_1);

		JPanel Panel87 = new JPanel();
		Panel87.setLayout(null);
		Panel87.setBounds(0, 0, 1186, 563);
		Room6.add(Panel87);

		JButton NextBtn87 = new JButton("");
		NextBtn87.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn87.setBounds(1147, 20, 27, 23);
		Panel87.add(NextBtn87);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/87.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_1.setBounds(0, 0, 1186, 563);
		Panel87.add(lblNewLabel_6_1_12_7_1_21_1_1_1);

		JPanel Panel88 = new JPanel();
		Panel88.setLayout(null);
		Panel88.setBounds(0, 0, 1186, 563);
		Room6.add(Panel88);

		JButton NextBtn88 = new JButton("");
		NextBtn88.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn88.setBounds(1147, 20, 27, 23);
		Panel88.add(NextBtn88);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_2.setIcon(new ImageIcon(Story.class.getResource("/image/88.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_2.setBounds(0, 0, 1186, 563);
		Panel88.add(lblNewLabel_6_1_12_7_1_21_1_1_2);

		JPanel Panel89 = new JPanel();
		Panel89.setLayout(null);
		Panel89.setBounds(0, 0, 1186, 563);
		Room6.add(Panel89);

		JButton NextBtn89 = new JButton("");
		NextBtn89.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn89.setBounds(1147, 20, 27, 23);
		Panel89.add(NextBtn89);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_3.setIcon(new ImageIcon(Story.class.getResource("/image/89.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_3.setBounds(0, 0, 1186, 563);
		Panel89.add(lblNewLabel_6_1_12_7_1_21_1_1_3);

		JPanel Panel90 = new JPanel();
		Panel90.setLayout(null);
		Panel90.setBounds(0, 0, 1186, 563);
		Room6.add(Panel90);

		JButton NextBtn90 = new JButton("");
		NextBtn90.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn90.setBounds(1147, 20, 27, 23);
		Panel90.add(NextBtn90);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_4.setIcon(new ImageIcon(Story.class.getResource("/image/90.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_4.setBounds(0, 0, 1186, 563);
		Panel90.add(lblNewLabel_6_1_12_7_1_21_1_1_4);

		JPanel Panel91 = new JPanel();
		Panel91.setLayout(null);
		Panel91.setBounds(0, 0, 1186, 563);
		Room6.add(Panel91);

		JButton NextBtn91 = new JButton("");
		NextBtn91.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn91.setBounds(1147, 20, 27, 23);
		Panel91.add(NextBtn91);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_5.setIcon(new ImageIcon(Story.class.getResource("/image/91.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_5.setBounds(0, 0, 1186, 563);
		Panel91.add(lblNewLabel_6_1_12_7_1_21_1_1_5);

		JPanel Panel92 = new JPanel();
		Panel92.setLayout(null);
		Panel92.setBounds(0, 0, 1186, 563);
		Room6.add(Panel92);

		JButton NextBtn92 = new JButton("");
		NextBtn92.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn92.setBounds(1147, 20, 27, 23);
		Panel92.add(NextBtn92);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_6.setIcon(new ImageIcon(Story.class.getResource("/image/92.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_6.setBounds(0, 0, 1186, 563);
		Panel92.add(lblNewLabel_6_1_12_7_1_21_1_1_6);

		JPanel Panel93 = new JPanel();
		Panel93.setLayout(null);
		Panel93.setBounds(0, 0, 1186, 563);
		Room6.add(Panel93);

		JButton NextBtn93 = new JButton("");
		NextBtn93.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn93.setBounds(1147, 20, 27, 23);
		Panel93.add(NextBtn93);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_7.setIcon(new ImageIcon(Story.class.getResource("/image/93.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_7.setBounds(0, 0, 1186, 563);
		Panel93.add(lblNewLabel_6_1_12_7_1_21_1_1_7);

		JPanel Panel94 = new JPanel();
		Panel94.setLayout(null);
		Panel94.setBounds(0, 0, 1186, 563);
		Room6.add(Panel94);

		JButton NextBtn94 = new JButton("");
		NextBtn94.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn94.setBounds(1147, 20, 27, 23);
		Panel94.add(NextBtn94);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_8.setIcon(new ImageIcon(Story.class.getResource("/image/94.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_8.setBounds(0, 0, 1186, 563);
		Panel94.add(lblNewLabel_6_1_12_7_1_21_1_1_8);

		JPanel Panel95 = new JPanel();
		Panel95.setLayout(null);
		Panel95.setBounds(0, 0, 1186, 563);
		Room6.add(Panel95);

		JButton NextBtn95 = new JButton("");
		NextBtn95.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn95.setBounds(1147, 20, 27, 23);
		Panel95.add(NextBtn95);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_10.setIcon(new ImageIcon(Story.class.getResource("/image/95.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_10.setBounds(0, 0, 1186, 563);
		Panel95.add(lblNewLabel_6_1_12_7_1_21_1_1_10);

		JPanel Panel96 = new JPanel();
		Panel96.setLayout(null);
		Panel96.setBounds(0, 0, 1186, 563);
		Room6.add(Panel96);

		JButton NextBtn96 = new JButton("");
		NextBtn96.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn96.setBounds(1147, 20, 27, 23);
		Panel96.add(NextBtn96);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_9.setIcon(new ImageIcon(Story.class.getResource("/image/96.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_9.setBounds(0, 0, 1186, 563);
		Panel96.add(lblNewLabel_6_1_12_7_1_21_1_1_9);

		JPanel Panel97 = new JPanel();
		Panel97.setLayout(null);
		Panel97.setBounds(0, 0, 1186, 563);
		Room6.add(Panel97);

		JButton NextBtn97 = new JButton("");
		NextBtn97.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn97.setBounds(1147, 20, 27, 23);
		Panel97.add(NextBtn97);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_13 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_13.setIcon(new ImageIcon(Story.class.getResource("/image/97.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_13.setBounds(0, 0, 1186, 563);
		Panel97.add(lblNewLabel_6_1_12_7_1_21_1_1_13);

		JPanel Panel98 = new JPanel();
		Panel98.setLayout(null);
		Panel98.setBounds(0, 0, 1186, 563);
		Room6.add(Panel98);

		JButton NextBtn98 = new JButton("");
		NextBtn98.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn98.setBounds(1147, 20, 27, 23);
		Panel98.add(NextBtn98);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_14 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_14.setIcon(new ImageIcon(Story.class.getResource("/image/98.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_14.setBounds(0, 0, 1186, 563);
		Panel98.add(lblNewLabel_6_1_12_7_1_21_1_1_14);

		JPanel Panel99 = new JPanel();
		Panel99.setLayout(null);
		Panel99.setBounds(0, 0, 1186, 563);
		Room6.add(Panel99);

		JButton NextBtn99 = new JButton("");
		NextBtn99.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn99.setBounds(1147, 20, 27, 23);
		Panel99.add(NextBtn99);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_12 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_12.setIcon(new ImageIcon(Story.class.getResource("/image/99.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_12.setBounds(0, 0, 1186, 563);
		Panel99.add(lblNewLabel_6_1_12_7_1_21_1_1_12);

		JPanel Panel100 = new JPanel();
		Panel100.setLayout(null);
		Panel100.setBounds(0, 0, 1186, 563);
		Room6.add(Panel100);

		JButton NextBtn100 = new JButton("");
		NextBtn100.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn100.setBounds(1147, 20, 27, 23);
		Panel100.add(NextBtn100);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11.setIcon(new ImageIcon(Story.class.getResource("/image/100.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11.setBounds(0, 0, 1186, 563);
		Panel100.add(lblNewLabel_6_1_12_7_1_21_1_1_11);

		JPanel FindRoom6 = new JPanel();
		FindRoom6.setLayout(null);
		FindRoom6.setBounds(0, 0, 1186, 563);
		FindRoom6.setVisible(false);
		Room6.add(FindRoom6);

		JButton Room6Picture = new JButton("");
		Room6Picture.setIcon(new ImageIcon(Story.class.getResource("/image/Picture.png")));
		Room6Picture.setBorderPainted(false);
		Room6Picture.setContentAreaFilled(false);
		Room6Picture.setFocusPainted(false);
		Room6Picture.setBounds(635, 272, 51, 45);
		FindRoom6.add(Room6Picture);
		
		// 누르면 뜨게..
		Room6Picture.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "1번의 사진들이군..", "사진들", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room6Magazine = new JButton("");
		Room6Magazine.setIcon(new ImageIcon(Story.class.getResource("/image/Magazine.png")));
		Room6Magazine.setFocusPainted(false);
		Room6Magazine.setContentAreaFilled(false);
		Room6Magazine.setBorderPainted(false);
		Room6Magazine.setBounds(837, 254, 30, 42);
		FindRoom6.add(Room6Magazine);
		
		// 누르면 뜨게..
		Room6Magazine.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "1번이 나온 잡지야.. 1번의 팬인가?", "잡지", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room6Sign = new JButton("");
		Room6Sign.setIcon(new ImageIcon(Story.class.getResource("/image/Sign.png")));
		Room6Sign.setBounds(580, 277, 32, 38);
		FindRoom6.add(Room6Sign);
		
		// 누르면 뜨게..
		Room6Sign.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "1번의 팬이 확실해!", "싸인", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room6Juice = new JButton("");
		Room6Juice.setIcon(new ImageIcon(Story.class.getResource("/image/Juice.png")));
		Room6Juice.setBorderPainted(false);
		Room6Juice.setContentAreaFilled(false);
		Room6Juice.setFocusPainted(false);
		Room6Juice.setBounds(747, 411, 45, 59);
		FindRoom6.add(Room6Juice);
		
		// 누르면 뜨게..
		Room6Juice.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번과 5번이 가지고 있는 음료수잖아!", "음료수", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room6Carrier = new JButton("");
		Room6Carrier.setIcon(new ImageIcon(Story.class.getResource("/image/Carrier.png")));
		Room6Carrier.setFocusPainted(false);
		Room6Carrier.setContentAreaFilled(false);
		Room6Carrier.setBorderPainted(false);
		Room6Carrier.setBounds(472, 319, 43, 57);
		FindRoom6.add(Room6Carrier);
		
		// 누르면 뜨게..
		Room6Carrier.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "공책 안에 1번의 이름이 가득하군..", "캐리어 안 공책", 0);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room6Exit = new JButton("\uB098\uAC00\uAE30");
		Room6Exit.setBounds(25, 20, 75, 23);
		FindRoom6.add(Room6Exit);

		JLabel lblNewLabel_7_2_1 = new JLabel("");
		lblNewLabel_7_2_1.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7_2_1.setBounds(0, 0, 1186, 563);
		FindRoom6.add(lblNewLabel_7_2_1);

		JPanel Room7 = new JPanel();
		Room7.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room7);
		Room7.setVisible(false);
		Room7.setLayout(null);

		JPanel Panel101 = new JPanel();
		Panel101.setLayout(null);
		Panel101.setBounds(0, 0, 1186, 563);
		Room7.add(Panel101);

		JButton NextBtn101 = new JButton("");
		NextBtn101.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn101.setBounds(1147, 20, 27, 23);
		Panel101.add(NextBtn101);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1.setIcon(new ImageIcon(Story.class.getResource("/image/101.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1.setBounds(0, 0, 1186, 563);
		Panel101.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1);

		JPanel Panel102 = new JPanel();
		Panel102.setLayout(null);
		Panel102.setBounds(0, 0, 1186, 563);
		Room7.add(Panel102);

		JButton NextBtn102 = new JButton("");
		NextBtn102.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn102.setBounds(1147, 20, 27, 23);
		Panel102.add(NextBtn102);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/102.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_1.setBounds(0, 0, 1186, 563);
		Panel102.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_1);

		JPanel Panel103 = new JPanel();
		Panel103.setLayout(null);
		Panel103.setBounds(0, 0, 1186, 563);
		Room7.add(Panel103);

		JButton NextBtn103 = new JButton("");
		NextBtn103.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn103.setBounds(1147, 20, 27, 23);
		Panel103.add(NextBtn103);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_2.setIcon(new ImageIcon(Story.class.getResource("/image/103.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_2.setBounds(0, 0, 1186, 563);
		Panel103.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_2);

		JPanel Panel104 = new JPanel();
		Panel104.setLayout(null);
		Panel104.setBounds(0, 0, 1186, 563);
		Room7.add(Panel104);

		JButton NextBtn104 = new JButton("");
		NextBtn104.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn104.setBounds(1147, 20, 27, 23);
		Panel104.add(NextBtn104);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_3.setIcon(new ImageIcon(Story.class.getResource("/image/104.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_3.setBounds(0, 0, 1186, 563);
		Panel104.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_3);

		JPanel Panel105 = new JPanel();
		Panel105.setLayout(null);
		Panel105.setBounds(0, 0, 1186, 563);
		Room7.add(Panel105);

		JButton NextBtn105 = new JButton("");
		NextBtn105.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn105.setBounds(1147, 20, 27, 23);
		Panel105.add(NextBtn105);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_4.setIcon(new ImageIcon(Story.class.getResource("/image/105.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_4.setBounds(0, 0, 1186, 563);
		Panel105.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_4);

		JPanel Panel106 = new JPanel();
		Panel106.setLayout(null);
		Panel106.setBounds(0, 0, 1186, 563);
		Room7.add(Panel106);

		JButton NextBtn106 = new JButton("");
		NextBtn106.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn106.setBounds(1147, 20, 27, 23);
		Panel106.add(NextBtn106);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_6.setIcon(new ImageIcon(Story.class.getResource("/image/106.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_6.setBounds(0, 0, 1186, 563);
		Panel106.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_6);

		JPanel Panel107 = new JPanel();
		Panel107.setLayout(null);
		Panel107.setBounds(0, 0, 1186, 563);
		Room7.add(Panel107);

		JButton NextBtn107 = new JButton("");
		NextBtn107.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn107.setBounds(1147, 20, 27, 23);
		Panel107.add(NextBtn107);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_5.setIcon(new ImageIcon(Story.class.getResource("/image/107.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_5.setBounds(0, 0, 1186, 563);
		Panel107.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_5);

		JPanel Panel108 = new JPanel();
		Panel108.setLayout(null);
		Panel108.setBounds(0, 0, 1186, 563);
		Room7.add(Panel108);

		JButton NextBtn108 = new JButton("");
		NextBtn108.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn108.setBounds(1147, 20, 27, 23);
		Panel108.add(NextBtn108);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_7.setIcon(new ImageIcon(Story.class.getResource("/image/108.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_7.setBounds(0, 0, 1186, 563);
		Panel108.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_7);

		JPanel Panel109 = new JPanel();
		Panel109.setLayout(null);
		Panel109.setBounds(0, 0, 1186, 563);
		Room7.add(Panel109);

		JButton NextBtn109 = new JButton("");
		NextBtn109.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn109.setBounds(1147, 20, 27, 23);
		Panel109.add(NextBtn109);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_9.setIcon(new ImageIcon(Story.class.getResource("/image/109.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_9.setBounds(0, 0, 1186, 563);
		Panel109.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_9);

		JPanel Panel110 = new JPanel();
		Panel110.setLayout(null);
		Panel110.setBounds(0, 0, 1186, 563);
		Room7.add(Panel110);

		JButton NextBtn110 = new JButton("");
		NextBtn110.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn110.setBounds(1147, 20, 27, 23);
		Panel110.add(NextBtn110);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_10.setIcon(new ImageIcon(Story.class.getResource("/image/110.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_10.setBounds(0, 0, 1186, 563);
		Panel110.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_10);

		JPanel Panel111 = new JPanel();
		Panel111.setLayout(null);
		Panel111.setBounds(0, 0, 1186, 563);
		Room7.add(Panel111);

		JButton NextBtn111 = new JButton("");
		NextBtn111.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn111.setBounds(1147, 20, 27, 23);
		Panel111.add(NextBtn111);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_8.setIcon(new ImageIcon(Story.class.getResource("/image/111.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_8.setBounds(0, 0, 1186, 563);
		Panel111.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_8);

		JPanel Panel112 = new JPanel();
		Panel112.setLayout(null);
		Panel112.setBounds(0, 0, 1186, 563);
		Room7.add(Panel112);

		JButton NextBtn112 = new JButton("");
		NextBtn112.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn112.setBounds(1147, 20, 27, 23);
		Panel112.add(NextBtn112);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_11 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_11.setIcon(new ImageIcon(Story.class.getResource("/image/112.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_11.setBounds(0, 0, 1186, 563);
		Panel112.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_11);

		JPanel Panel113 = new JPanel();
		Panel113.setLayout(null);
		Panel113.setBounds(0, 0, 1186, 563);
		Room7.add(Panel113);

		JButton NextBtn113 = new JButton("");
		NextBtn113.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn113.setBounds(1147, 20, 27, 23);
		Panel113.add(NextBtn113);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_12 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_12.setIcon(new ImageIcon(Story.class.getResource("/image/113.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_12.setBounds(0, 0, 1186, 563);
		Panel113.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_12);

		JPanel Panel114 = new JPanel();
		Panel114.setLayout(null);
		Panel114.setBounds(0, 0, 1186, 563);
		Room7.add(Panel114);

		JButton NextBtn114 = new JButton("");
		NextBtn114.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn114.setBounds(1147, 20, 27, 23);
		Panel114.add(NextBtn114);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13.setIcon(new ImageIcon(Story.class.getResource("/image/114.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13.setBounds(0, 0, 1186, 563);
		Panel114.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13);

		JPanel FindRoom7 = new JPanel();
		FindRoom7.setLayout(null);
		FindRoom7.setBounds(0, 0, 1186, 563);
		FindRoom7.setVisible(false);
		Room7.add(FindRoom7);

		JButton Room7Telescope = new JButton("");
		Room7Telescope.setIcon(new ImageIcon(Story.class.getResource("/image/Telescope.png")));
		Room7Telescope.setFocusPainted(false);
		Room7Telescope.setContentAreaFilled(false);
		Room7Telescope.setBorderPainted(false);
		Room7Telescope.setBounds(796, 423, 53, 49);
		FindRoom7.add(Room7Telescope);
		
		// 누르면 뜨게..
		Room7Telescope.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "망원경을 가지고 있군 뭘 보려 한거지?", "망원경", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room7Bag = new JButton("");
		Room7Bag.setIcon(new ImageIcon(Story.class.getResource("/image/Bag.png")));
		Room7Bag.setFocusPainted(false);
		Room7Bag.setContentAreaFilled(false);
		Room7Bag.setBorderPainted(false);
		Room7Bag.setBounds(149, 508, 47, 45);
		FindRoom7.add(Room7Bag);

		// 누르면 뜨게..
		Room7Bag.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "잠을 잘 못자나보군..", "가방 안 수면제", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room7Bag.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "왜 이렇게 많은 돈을?", "가방 안 돈다발", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room7Bag.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "가방 안에는 뭐가 있을까?", "소파사이 가방", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		JButton Room7Schedule = new JButton("");
		Room7Schedule.setIcon(new ImageIcon(Story.class.getResource("/image/Schedule.png")));
		Room7Schedule.setBorderPainted(false);
		Room7Schedule.setContentAreaFilled(false);
		Room7Schedule.setFocusPainted(false);
		Room7Schedule.setBounds(637, 277, 36, 45);
		FindRoom7.add(Room7Schedule);

		
		// 누르면 뜨게..
		Room7Schedule.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "정말 실수로 이 호텔에 오게된건가 보군..", "일정표", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });
		
		// 누르면 뜨게..
		Room7Schedule.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "원래가기로 했던 호텔의 일정표이군..", "일정표", 1);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room7Magazine = new JButton("");
		Room7Magazine.setIcon(new ImageIcon(Story.class.getResource("/image/Magazine.png")));
		Room7Magazine.setFocusPainted(false);
		Room7Magazine.setContentAreaFilled(false);
		Room7Magazine.setBorderPainted(false);
		Room7Magazine.setBounds(255, 255, 30, 42);
		FindRoom7.add(Room7Magazine);
		
		// 누르면 뜨게..
		Room7Magazine.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번이 있는 잡지군..4번의 팬인가?", "잡지", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room7Sock = new JButton("");
		Room7Sock.setIcon(new ImageIcon(Story.class.getResource("/image/Sock.png")));
		Room7Sock.setBorderPainted(false);
		Room7Sock.setContentAreaFilled(false);
		Room7Sock.setFocusPainted(false);
		Room7Sock.setBounds(910, 440, 48, 45);
		FindRoom7.add(Room7Sock);
		
		// 누르면 뜨게..
		Room7Sock.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "4번이 가지고 있는 양말과 같군..", "양말 한 짝", 2);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room7Carrier = new JButton("");
		Room7Carrier.setIcon(new ImageIcon(Story.class.getResource("/image/Carrier.png")));
		Room7Carrier.setFocusPainted(false);
		Room7Carrier.setContentAreaFilled(false);
		Room7Carrier.setBorderPainted(false);
		Room7Carrier.setBounds(1018, 490, 43, 57);
		FindRoom7.add(Room7Carrier);
		
		// 누르면 뜨게..
		Room7Carrier.addActionListener(new ActionListener() {

	       @Override
	       public void actionPerformed(ActionEvent e) {
	          JOptionPane.showMessageDialog(null, "장갑이 왜 있지..?", "캐리어 안 장갑", 3);   // 창이 어디에 뜨게 할지, 메시지, 창 제목, 아이콘
	       }
	         
	    });

		JButton Room7Exit = new JButton("\uB098\uAC00\uAE30");
		Room7Exit.setFont(new Font("굴림", Font.PLAIN, 12));
		Room7Exit.setBounds(25, 20, 75, 23);
		FindRoom7.add(Room7Exit);

		JLabel lblNewLabel_7_2_1_1 = new JLabel("");
		lblNewLabel_7_2_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/SpecialRoom 1.png")));
		lblNewLabel_7_2_1_1.setBounds(0, 0, 1186, 563);
		FindRoom7.add(lblNewLabel_7_2_1_1);

		JPanel Room8 = new JPanel();
		Room8.setBounds(0, 0, 1186, 563);
		frame.getContentPane().add(Room8);
		Room8.setVisible(false);
		Room8.setLayout(null);

		JPanel Suicide = new JPanel();
		Suicide.setBounds(0, 0, 1186, 563);
		Room8.add(Suicide);
		Suicide.setVisible(false);
		Suicide.setLayout(null);

		JPanel Panel172 = new JPanel();
		Panel172.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel172);
		Panel172.setLayout(null);

		JButton NextBtn172 = new JButton("");
		NextBtn172.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn172.setBounds(1147, 20, 27, 23);
		Panel172.add(NextBtn172);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3
				.setIcon(new ImageIcon(Story.class.getResource("/image/172.png")));
		Panel172.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3);

		JPanel Panel173 = new JPanel();
		Panel173.setLayout(null);
		Panel173.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel173);

		JButton NextBtn173 = new JButton("");
		NextBtn173.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn173.setBounds(1147, 20, 27, 23);
		Panel173.add(NextBtn173);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_1.setBounds(0, -19, 1186, 582);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/173.png")));
		Panel173.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_1);

		JPanel Panel174 = new JPanel();
		Panel174.setLayout(null);
		Panel174.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel174);

		JButton NextBtn174 = new JButton("");
		NextBtn174.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn174.setBounds(1147, 20, 27, 23);
		Panel174.add(NextBtn174);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_2.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/174.png")));
		Panel174.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_2);

		JPanel Panel175 = new JPanel();
		Panel175.setLayout(null);
		Panel175.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel175);

		JButton NextBtn175 = new JButton("");
		NextBtn175.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn175.setBounds(1147, 20, 27, 23);
		Panel175.add(NextBtn175);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_3.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_3
				.setIcon(new ImageIcon(Story.class.getResource("/image/175.png")));
		Panel175.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_3);

		JPanel Panel176 = new JPanel();
		Panel176.setLayout(null);
		Panel176.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel176);

		JButton NextBtn176 = new JButton("");
		NextBtn176.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn176.setBounds(1147, 20, 27, 23);
		Panel176.add(NextBtn176);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_4.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_4
				.setIcon(new ImageIcon(Story.class.getResource("/image/176.png")));
		Panel176.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_4);

		JPanel Panel177 = new JPanel();
		Panel177.setLayout(null);
		Panel177.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel177);

		JButton NextBtn177 = new JButton("");
		NextBtn177.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn177.setBounds(1147, 20, 27, 23);
		Panel177.add(NextBtn177);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_5.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_5
				.setIcon(new ImageIcon(Story.class.getResource("/image/177.png")));
		Panel177.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_5);

		JPanel Panel178 = new JPanel();
		Panel178.setLayout(null);
		Panel178.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel178);

		JButton NextBtn178 = new JButton("");
		NextBtn178.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn178.setBounds(1147, 20, 27, 23);
		Panel178.add(NextBtn178);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_6.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_6
				.setIcon(new ImageIcon(Story.class.getResource("/image/178.png")));
		Panel178.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_6);

		JPanel Panel179 = new JPanel();
		Panel179.setLayout(null);
		Panel179.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel179);

		JButton NextBtn179 = new JButton("");
		NextBtn179.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn179.setBounds(1147, 20, 27, 23);
		Panel179.add(NextBtn179);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_7.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_7
				.setIcon(new ImageIcon(Story.class.getResource("/image/179.png")));
		Panel179.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_7);

		JPanel Panel180 = new JPanel();
		Panel180.setLayout(null);
		Panel180.setBounds(0, 0, 1186, 563);
		Suicide.add(Panel180);

		JButton NextBtn180 = new JButton("");
		NextBtn180.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn180.setBounds(1147, 20, 27, 23);
		Panel180.add(NextBtn180);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_8.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_8
				.setIcon(new ImageIcon(Story.class.getResource("/image/180.png")));
		Panel180.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_3_8);

		JPanel GameOver_1 = new JPanel();
		GameOver_1.setLayout(null);
		GameOver_1.setBounds(0, 0, 1186, 563);
		GameOver_1.setVisible(false);
		Suicide.add(GameOver_1);

		JButton Retry_1 = new JButton("Retry");
		Retry_1.setFont(new Font("Baskerville BT", Font.BOLD, 30));
		Retry_1.setBounds(523, 251, 127, 54);
		Retry_1.setVisible(false);
		GameOver_1.add(Retry_1);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/Hotel 1.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_2.setBounds(0, 0, 1186, 563);
		GameOver_1.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_2);

		JPanel Success = new JPanel();
		Success.setBounds(0, 0, 1186, 563);
		Room8.add(Success);
		Success.setVisible(false);
		Success.setLayout(null);

		JPanel Panel128 = new JPanel();
		Panel128.setLayout(null);
		Panel128.setBounds(0, 0, 1186, 563);
		Success.add(Panel128);

		JButton NextBtn128 = new JButton("");
		NextBtn128.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn128.setBounds(1147, 20, 27, 23);
		Panel128.add(NextBtn128);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2.setIcon(new ImageIcon(Story.class.getResource("/image/128.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2.setBounds(0, 0, 1186, 563);
		Panel128.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2);

		JPanel Panel129 = new JPanel();
		Panel129.setLayout(null);
		Panel129.setBounds(0, 0, 1186, 563);
		Success.add(Panel129);

		JButton NextBtn129 = new JButton("");
		NextBtn129.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn129.setBounds(1147, 20, 27, 23);
		Panel129.add(NextBtn129);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/129.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_2.setBounds(0, 0, 1186, 563);
		Panel129.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_2);

		JPanel Panel130 = new JPanel();
		Panel130.setLayout(null);
		Panel130.setBounds(0, 0, 1186, 563);
		Success.add(Panel130);

		JButton NextBtn130 = new JButton("");
		NextBtn130.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn130.setBounds(1147, 20, 27, 23);
		Panel130.add(NextBtn130);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/130.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1.setBounds(0, 0, 1186, 563);
		Panel130.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1);

		JPanel Panel131 = new JPanel();
		Panel131.setLayout(null);
		Panel131.setBounds(0, 0, 1186, 563);
		Success.add(Panel131);

		JButton NextBtn131 = new JButton("");
		NextBtn131.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn131.setBounds(1147, 20, 27, 23);
		Panel131.add(NextBtn131);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/131.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1.setBounds(0, 0, 1186, 563);
		Panel131.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1);

		JPanel Panel131_1 = new JPanel();
		Panel131_1.setLayout(null);
		Panel131_1.setBounds(0, 0, 1186, 563);
		Success.add(Panel131_1);

		JButton NextBtn131_1 = new JButton("");
		NextBtn131_1.setBounds(1147, 20, 27, 23);
		Panel131_1.add(NextBtn131_1);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/131-1.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1_1.setBounds(0, 0, 1186, 563);
		Panel131_1.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_1_1);

		JPanel Panel132 = new JPanel();
		Panel132.setLayout(null);
		Panel132.setBounds(0, 0, 1186, 563);
		Success.add(Panel132);

		JButton NextBtn132 = new JButton("");
		NextBtn132.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn132.setBounds(1147, 20, 27, 23);
		Panel132.add(NextBtn132);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/132.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_2.setBounds(0, 0, 1186, 563);
		Panel132.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_2);

		JPanel Panel133 = new JPanel();
		Panel133.setLayout(null);
		Panel133.setBounds(0, 0, 1186, 563);
		Success.add(Panel133);

		JButton NextBtn133 = new JButton("");
		NextBtn133.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn133.setBounds(1147, 20, 27, 23);
		Panel133.add(NextBtn133);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_3
				.setIcon(new ImageIcon(Story.class.getResource("/image/133.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_3.setBounds(0, 0, 1186, 563);
		Panel133.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_3);

		JPanel Panel134 = new JPanel();
		Panel134.setLayout(null);
		Panel134.setBounds(0, 0, 1186, 563);
		Success.add(Panel134);

		JButton NextBtn134 = new JButton("");
		NextBtn134.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn134.setBounds(1147, 20, 27, 23);
		Panel134.add(NextBtn134);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_4
				.setIcon(new ImageIcon(Story.class.getResource("/image/134.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_4.setBounds(0, 0, 1186, 563);
		Panel134.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_4);

		JPanel Panel135 = new JPanel();
		Panel135.setLayout(null);
		Panel135.setBounds(0, 0, 1186, 563);
		Success.add(Panel135);

		JButton NextBtn135 = new JButton("");
		NextBtn135.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn135.setBounds(1147, 20, 27, 23);
		Panel135.add(NextBtn135);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_5
				.setIcon(new ImageIcon(Story.class.getResource("/image/135.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_5.setBounds(0, 0, 1186, 563);
		Panel135.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_5);

		JPanel Panel136 = new JPanel();
		Panel136.setLayout(null);
		Panel136.setBounds(0, 0, 1186, 563);
		Success.add(Panel136);

		JButton NextBtn136 = new JButton("");
		NextBtn136.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn136.setBounds(1147, 20, 27, 23);
		Panel136.add(NextBtn136);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_6
				.setIcon(new ImageIcon(Story.class.getResource("/image/136.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_6.setBounds(0, 0, 1186, 563);
		Panel136.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_6);

		JPanel Panel137 = new JPanel();
		Panel137.setLayout(null);
		Panel137.setBounds(0, 0, 1186, 563);
		Success.add(Panel137);

		JButton NextBtn137 = new JButton("");
		NextBtn137.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn137.setBounds(1147, 20, 27, 23);
		Panel137.add(NextBtn137);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_7
				.setIcon(new ImageIcon(Story.class.getResource("/image/137.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_7.setBounds(0, 0, 1186, 563);
		Panel137.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_7);

		JPanel Panel138 = new JPanel();
		Panel138.setLayout(null);
		Panel138.setBounds(0, 0, 1186, 563);
		Success.add(Panel138);

		JButton NextBtn138 = new JButton("");
		NextBtn138.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn138.setBounds(1147, 20, 27, 23);
		Panel138.add(NextBtn138);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_8
				.setIcon(new ImageIcon(Story.class.getResource("/image/138.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_8.setBounds(0, 0, 1186, 563);
		Panel138.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_8);

		JPanel Panel139 = new JPanel();
		Panel139.setLayout(null);
		Panel139.setBounds(0, 0, 1186, 563);
		Success.add(Panel139);

		JButton NextBtn139 = new JButton("");
		NextBtn139.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn139.setBounds(1147, 20, 27, 23);
		Panel139.add(NextBtn139);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_9
				.setIcon(new ImageIcon(Story.class.getResource("/image/139.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_9.setBounds(0, 0, 1186, 563);
		Panel139.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_9);

		JPanel Panel140 = new JPanel();
		Panel140.setLayout(null);
		Panel140.setBounds(0, 0, 1186, 563);
		Success.add(Panel140);

		JButton NextBtn140 = new JButton("");
		NextBtn140.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn140.setBounds(1147, 20, 27, 23);
		Panel140.add(NextBtn140);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10
				.setIcon(new ImageIcon(Story.class.getResource("/image/140.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10.setBounds(-2, 0, 1186, 563);
		Panel140.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10);

		JPanel Panel141 = new JPanel();
		Panel141.setLayout(null);
		Panel141.setBounds(0, 0, 1186, 563);
		Success.add(Panel141);

		JButton NextBtn141 = new JButton("");
		NextBtn141.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn141.setBounds(1147, 20, 27, 23);
		Panel141.add(NextBtn141);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_1.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/141.png")));
		Panel141.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_1);

		JPanel Panel142 = new JPanel();
		Panel142.setLayout(null);
		Panel142.setBounds(0, 0, 1186, 563);
		Success.add(Panel142);

		JButton NextBtn142 = new JButton("");
		NextBtn142.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn142.setBounds(1147, 20, 27, 23);
		Panel142.add(NextBtn142);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_2.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/142.png")));
		Panel142.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_2);

		JPanel Panel143 = new JPanel();
		Panel143.setLayout(null);
		Panel143.setBounds(0, 0, 1186, 563);
		Success.add(Panel143);

		JButton NextBtn143 = new JButton("");
		NextBtn143.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn143.setBounds(1147, 20, 27, 23);
		Panel143.add(NextBtn143);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_3.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_3
				.setIcon(new ImageIcon(Story.class.getResource("/image/143.png")));
		Panel143.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_3);

		JPanel Panel144 = new JPanel();
		Panel144.setLayout(null);
		Panel144.setBounds(0, 0, 1186, 563);
		Success.add(Panel144);

		JButton NextBtn144 = new JButton("");
		NextBtn144.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn144.setBounds(1147, 20, 27, 23);
		Panel144.add(NextBtn144);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_4.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_4
				.setIcon(new ImageIcon(Story.class.getResource("/image/144.png")));
		Panel144.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_4);

		JPanel Panel145 = new JPanel();
		Panel145.setLayout(null);
		Panel145.setBounds(0, 0, 1186, 563);
		Success.add(Panel145);

		JButton NextBtn145 = new JButton("");
		NextBtn145.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn145.setBounds(1147, 20, 27, 23);
		Panel145.add(NextBtn145);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_5.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_5
				.setIcon(new ImageIcon(Story.class.getResource("/image/145.png")));
		Panel145.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_5);

		JPanel Panel146 = new JPanel();
		Panel146.setLayout(null);
		Panel146.setBounds(0, 0, 1186, 563);
		Success.add(Panel146);

		JButton NextBtn146 = new JButton("");
		NextBtn146.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn146.setBounds(1147, 20, 27, 23);
		Panel146.add(NextBtn146);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_6.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_6
				.setIcon(new ImageIcon(Story.class.getResource("/image/146.png")));
		Panel146.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_6);

		JPanel Panel147 = new JPanel();
		Panel147.setLayout(null);
		Panel147.setBounds(0, 0, 1186, 563);
		Success.add(Panel147);

		JButton NextBtn147 = new JButton("");
		NextBtn147.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn147.setBounds(1147, 20, 27, 23);
		Panel147.add(NextBtn147);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_7.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_7
				.setIcon(new ImageIcon(Story.class.getResource("/image/147.png")));
		Panel147.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_7);

		JPanel Panel148 = new JPanel();
		Panel148.setLayout(null);
		Panel148.setBounds(0, 0, 1186, 563);
		Success.add(Panel148);

		JButton NextBtn148 = new JButton("");
		NextBtn148.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn148.setBounds(1147, 20, 27, 23);
		Panel148.add(NextBtn148);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_8.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_8
				.setIcon(new ImageIcon(Story.class.getResource("/image/148.png")));
		Panel148.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_8);

		JPanel Panel149 = new JPanel();
		Panel149.setLayout(null);
		Panel149.setBounds(0, 0, 1186, 563);
		Success.add(Panel149);

		JButton NextBtn149 = new JButton("");
		NextBtn149.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn149.setBounds(1147, 20, 27, 23);
		Panel149.add(NextBtn149);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_9.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_9
				.setIcon(new ImageIcon(Story.class.getResource("/image/149.png")));
		Panel149.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_9);

		JPanel Panel150 = new JPanel();
		Panel150.setLayout(null);
		Panel150.setBounds(0, 0, 1186, 563);
		Success.add(Panel150);

		JButton NextBtn150 = new JButton("");
		NextBtn150.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn150.setBounds(1147, 20, 27, 23);
		Panel150.add(NextBtn150);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10
				.setIcon(new ImageIcon(Story.class.getResource("/image/150.png")));
		Panel150.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10);

		JPanel Panel151 = new JPanel();
		Panel151.setLayout(null);
		Panel151.setBounds(0, 0, 1186, 563);
		Success.add(Panel151);

		JButton NextBtn151 = new JButton("");
		NextBtn151.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn151.setBounds(1147, 20, 27, 23);
		Panel151.add(NextBtn151);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_1.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/151.png")));
		Panel151.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_1);

		JPanel Panel152 = new JPanel();
		Panel152.setLayout(null);
		Panel152.setBounds(0, 0, 1186, 563);
		Success.add(Panel152);

		JButton NextBtn152 = new JButton("");
		NextBtn152.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn152.setBounds(1147, 20, 27, 23);
		Panel152.add(NextBtn152);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_2.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/152.png")));
		Panel152.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_2);

		JPanel Panel153 = new JPanel();
		Panel153.setLayout(null);
		Panel153.setBounds(0, 0, 1186, 563);
		Success.add(Panel153);

		JButton NextBtn153 = new JButton("");
		NextBtn153.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn153.setBounds(1147, 20, 27, 23);
		Panel153.add(NextBtn153);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_3.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_3
				.setIcon(new ImageIcon(Story.class.getResource("/image/153.png")));
		Panel153.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_3);

		JPanel Panel154 = new JPanel();
		Panel154.setLayout(null);
		Panel154.setBounds(0, 0, 1186, 563);
		Success.add(Panel154);

		JButton NextBtn154 = new JButton("");
		NextBtn154.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn154.setBounds(1147, 20, 27, 23);
		Panel154.add(NextBtn154);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_4.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_4
				.setIcon(new ImageIcon(Story.class.getResource("/image/154.png")));
		Panel154.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_4);

		JPanel Panel155 = new JPanel();
		Panel155.setLayout(null);
		Panel155.setBounds(0, 0, 1186, 563);
		Success.add(Panel155);

		JButton NextBtn155 = new JButton("");
		NextBtn155.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn155.setBounds(1147, 20, 27, 23);
		Panel155.add(NextBtn155);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_5.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_5
				.setIcon(new ImageIcon(Story.class.getResource("/image/155.png")));
		Panel155.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_5);

		JPanel Panel156 = new JPanel();
		Panel156.setLayout(null);
		Panel156.setBounds(0, 0, 1186, 563);
		Success.add(Panel156);

		JButton NextBtn156 = new JButton("");
		NextBtn156.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn156.setBounds(1147, 20, 27, 23);
		Panel156.add(NextBtn156);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_6.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_6
				.setIcon(new ImageIcon(Story.class.getResource("/image/156.png")));
		Panel156.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_6);

		JPanel Panel157 = new JPanel();
		Panel157.setLayout(null);
		Panel157.setBounds(0, 0, 1186, 563);
		Success.add(Panel157);

		JButton NextBtn157 = new JButton("");
		NextBtn157.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn157.setBounds(1147, 20, 27, 23);
		Panel157.add(NextBtn157);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_7.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_7
				.setIcon(new ImageIcon(Story.class.getResource("/image/157.png")));
		Panel157.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_7);

		JPanel Panel158 = new JPanel();
		Panel158.setLayout(null);
		Panel158.setBounds(0, 0, 1186, 563);
		Success.add(Panel158);

		JButton NextBtn158 = new JButton("");
		NextBtn158.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn158.setBounds(1147, 20, 27, 23);
		Panel158.add(NextBtn158);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_8.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_8
				.setIcon(new ImageIcon(Story.class.getResource("/image/158.png")));
		Panel158.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_8);

		JPanel Panel159 = new JPanel();
		Panel159.setLayout(null);
		Panel159.setBounds(0, 0, 1186, 563);
		Success.add(Panel159);

		JButton NextBtn159 = new JButton("");
		NextBtn159.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn159.setBounds(1147, 20, 27, 23);
		Panel159.add(NextBtn159);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_9.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_9
				.setIcon(new ImageIcon(Story.class.getResource("/image/159.png")));
		Panel159.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_9);

		JPanel Panel160 = new JPanel();
		Panel160.setLayout(null);
		Panel160.setBounds(0, 0, 1186, 563);
		Success.add(Panel160);

		JButton NextBtn160 = new JButton("");
		NextBtn160.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn160.setBounds(1147, 20, 27, 23);
		Panel160.add(NextBtn160);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10
				.setIcon(new ImageIcon(Story.class.getResource("/image/160.png")));
		Panel160.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10);

		JPanel Panel161 = new JPanel();
		Panel161.setLayout(null);
		Panel161.setBounds(0, 0, 1186, 563);
		Success.add(Panel161);

		JButton NextBtn161 = new JButton("");
		NextBtn161.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn161.setBounds(1147, 20, 27, 23);
		Panel161.add(NextBtn161);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_1.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/161.png")));
		Panel161.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_1);

		JPanel Panel162 = new JPanel();
		Panel162.setLayout(null);
		Panel162.setBounds(0, 0, 1186, 563);
		Success.add(Panel162);

		JButton NextBtn162 = new JButton("");
		NextBtn162.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn162.setBounds(1147, 20, 27, 23);
		Panel162.add(NextBtn162);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_2.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_2
				.setIcon(new ImageIcon(Story.class.getResource("/image/162.png")));
		Panel162.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_2);

		JPanel Panel163 = new JPanel();
		Panel163.setLayout(null);
		Panel163.setBounds(0, 0, 1186, 563);
		Success.add(Panel163);

		JButton NextBtn163 = new JButton("");
		NextBtn163.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn163.setBounds(1147, 20, 27, 23);
		Panel163.add(NextBtn163);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_3.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_3
				.setIcon(new ImageIcon(Story.class.getResource("/image/163.png")));
		Panel163.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_3);

		JPanel Panel164 = new JPanel();
		Panel164.setLayout(null);
		Panel164.setBounds(0, 0, 1186, 563);
		Success.add(Panel164);

		JButton NextBtn164 = new JButton("");
		NextBtn164.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn164.setBounds(1147, 20, 27, 23);
		Panel164.add(NextBtn164);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_4.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_4
				.setIcon(new ImageIcon(Story.class.getResource("/image/164.png")));
		Panel164.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_4);

		JPanel Panel165 = new JPanel();
		Panel165.setLayout(null);
		Panel165.setBounds(0, 0, 1186, 563);
		Success.add(Panel165);

		JButton NextBtn165 = new JButton("");
		NextBtn165.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn165.setBounds(1147, 20, 27, 23);
		Panel165.add(NextBtn165);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_5 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_5.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_5
				.setIcon(new ImageIcon(Story.class.getResource("/image/165.png")));
		Panel165.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_5);

		JPanel Panel166 = new JPanel();
		Panel166.setLayout(null);
		Panel166.setBounds(0, 0, 1186, 563);
		Success.add(Panel166);

		JButton NextBtn166 = new JButton("");
		NextBtn166.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn166.setBounds(1147, 20, 27, 23);
		Panel166.add(NextBtn166);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_6 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_6.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_6
				.setIcon(new ImageIcon(Story.class.getResource("/image/166.png")));
		Panel166.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_6);

		JPanel Panel167 = new JPanel();
		Panel167.setLayout(null);
		Panel167.setBounds(0, 0, 1186, 563);
		Success.add(Panel167);

		JButton NextBtn167 = new JButton("");
		NextBtn167.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn167.setBounds(1147, 20, 27, 23);
		Panel167.add(NextBtn167);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_7 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_7.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_7
				.setIcon(new ImageIcon(Story.class.getResource("/image/167.png")));
		Panel167.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_7);

		JPanel Panel168 = new JPanel();
		Panel168.setLayout(null);
		Panel168.setBounds(0, 0, 1186, 563);
		Success.add(Panel168);

		JButton NextBtn168 = new JButton("");
		NextBtn168.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn168.setBounds(1147, 20, 27, 23);
		Panel168.add(NextBtn168);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_8 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_8.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_8
				.setIcon(new ImageIcon(Story.class.getResource("/image/168.png")));
		Panel168.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_8);

		JPanel Panel169 = new JPanel();
		Panel169.setLayout(null);
		Panel169.setBounds(0, 0, 1186, 563);
		Success.add(Panel169);

		JButton NextBtn169 = new JButton("");
		NextBtn169.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn169.setBounds(1147, 20, 27, 23);
		Panel169.add(NextBtn169);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_9 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_9.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_9
				.setIcon(new ImageIcon(Story.class.getResource("/image/169.png")));
		Panel169.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_9);

		JPanel Panel170 = new JPanel();
		Panel170.setLayout(null);
		Panel170.setBounds(0, 0, 1186, 563);
		Success.add(Panel170);

		JButton NextBtn170 = new JButton("");
		NextBtn170.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn170.setBounds(1147, 20, 27, 23);
		Panel170.add(NextBtn170);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_10 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_10.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_10
				.setIcon(new ImageIcon(Story.class.getResource("/image/170.png")));
		Panel170.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_10);

		JPanel Panel171 = new JPanel();
		Panel171.setLayout(null);
		Panel171.setBounds(0, 0, 1186, 563);
		Success.add(Panel171);

		JButton NextBtn171 = new JButton("");
		NextBtn171.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn171.setBounds(1147, 20, 27, 23);
		Panel171.add(NextBtn171);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_11 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_11.setBounds(0, 0, 1186, 563);
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_11
				.setIcon(new ImageIcon(Story.class.getResource("/image/171.png")));
		Panel171.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_2_1_10_10_10_11);

		JPanel Vic = new JPanel();
		Vic.setLayout(null);
		Vic.setBounds(0, 0, 1186, 563);
		Vic.setVisible(false);
		Success.add(Vic);

		JLabel lblNewLabel_8 = new JLabel("End of Number Murder Case");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Baskerville BT", Font.BOLD | Font.ITALIC, 55));
		lblNewLabel_8.setBounds(200, 130, 819, 126);
		Vic.add(lblNewLabel_8);

		JButton End = new JButton("Success");
		End.setFont(new Font("Baskerville BT", Font.BOLD, 30));
		End.setBounds(513, 280, 182, 54);
		Vic.add(End);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/Hotel 1.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_1.setBounds(0, 0, 1186, 563);
		Vic.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1_1);

		JPanel Defeat = new JPanel();
		Defeat.setBounds(0, 0, 1186, 563);
		Room8.add(Defeat);
		Defeat.setVisible(false);
		Defeat.setLayout(null);

		JPanel Panel120 = new JPanel();
		Panel120.setLayout(null);
		Panel120.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel120);

		JButton NextBtn120 = new JButton("");
		NextBtn120.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn120.setBounds(1147, 20, 27, 23);
		Panel120.add(NextBtn120);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_4 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_4.setIcon(new ImageIcon(Story.class.getResource("/image/120.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_4.setBounds(0, 0, 1186, 563);
		Panel120.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_4);

		JPanel Panel121 = new JPanel();
		Panel121.setLayout(null);
		Panel121.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel121);

		JButton NextBtn121 = new JButton("");
		NextBtn121.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn121.setBounds(1147, 20, 27, 23);
		Panel121.add(NextBtn121);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_3.setIcon(new ImageIcon(Story.class.getResource("/image/121.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_3.setBounds(0, 0, 1186, 563);
		Panel121.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_3);

		JPanel Panel122 = new JPanel();
		Panel122.setLayout(null);
		Panel122.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel122);

		JButton NextBtn122 = new JButton("");
		NextBtn122.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn122.setBounds(1147, 20, 27, 23);
		Panel122.add(NextBtn122);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_2.setIcon(new ImageIcon(Story.class.getResource("/image/122.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_2.setBounds(0, 0, 1186, 563);
		Panel122.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_2);

		JPanel Panel123 = new JPanel();
		Panel123.setLayout(null);
		Panel123.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel123);

		JButton NextBtn123 = new JButton("");
		NextBtn123.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn123.setBounds(1147, 20, 27, 23);
		Panel123.add(NextBtn123);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2.setIcon(new ImageIcon(Story.class.getResource("/image/123.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2.setBounds(0, 0, 1186, 563);
		Panel123.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2);

		JPanel Panel124 = new JPanel();
		Panel124.setLayout(null);
		Panel124.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel124);

		JButton NextBtn124 = new JButton("");
		NextBtn124.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn124.setBounds(1147, 20, 27, 23);
		Panel124.add(NextBtn124);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_3 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_3.setIcon(new ImageIcon(Story.class.getResource("/image/124.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_3.setBounds(0, 0, 1186, 563);
		Panel124.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_3);

		JPanel Panel125 = new JPanel();
		Panel125.setLayout(null);
		Panel125.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel125);

		JButton NextBtn125 = new JButton("");
		NextBtn125.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn125.setBounds(1147, 20, 27, 23);
		Panel125.add(NextBtn125);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1.setIcon(new ImageIcon(Story.class.getResource("/image/125.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1.setBounds(0, 0, 1186, 563);
		Panel125.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1);

		JPanel Panel125_1 = new JPanel();
		Panel125_1.setLayout(null);
		Panel125_1.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel125_1);

		JButton NextBtn125_1 = new JButton("");
		NextBtn125_1.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn125_1.setBounds(1147, 20, 27, 23);
		Panel125_1.add(NextBtn125_1);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1_1.setIcon(new ImageIcon(Story.class.getResource("/image/125-1.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1_1.setBounds(0, 0, 1186, 563);
		Panel125_1.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_1_1);

		JPanel Panel126 = new JPanel();
		Panel126.setLayout(null);
		Panel126.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel126);

		JButton NextBtn126 = new JButton("");
		NextBtn126.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn126.setBounds(1147, 20, 27, 23);
		Panel126.add(NextBtn126);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2.setIcon(new ImageIcon(Story.class.getResource("/image/126.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2.setBounds(0, 0, 1186, 563);
		Panel126.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2);

		JPanel Panel127 = new JPanel();
		Panel127.setLayout(null);
		Panel127.setBounds(0, 0, 1186, 563);
		Defeat.add(Panel127);

		JButton NextBtn127 = new JButton("");
		NextBtn127.setIcon(new ImageIcon(Story.class.getResource("/image/arrow.png")));
		NextBtn127.setBounds(1147, 20, 27, 23);
		Panel127.add(NextBtn127);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1.setIcon(new ImageIcon(Story.class.getResource("/image/127.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1.setBounds(0, 0, 1186, 563);
		Panel127.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1);

		JPanel GameOver = new JPanel();
		GameOver.setLayout(null);
		GameOver.setBounds(0, 0, 1186, 563);
		GameOver.setVisible(false);
		Defeat.add(GameOver);

		JButton Retry = new JButton("Retry");
		Retry.setFont(new Font("Baskerville BT", Font.BOLD, 30));
		Retry.setBounds(513, 251, 127, 54);
		GameOver.add(Retry);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/Hotel 1.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1.setBounds(0, 0, 1186, 563);
		GameOver.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_2_2_1_1);

		JPanel SevenDoors = new JPanel();
		SevenDoors.setLayout(null);
		SevenDoors.setBounds(0, 0, 1186, 563);
		SevenDoors.setVisible(false);
		Room8.add(SevenDoors);

		JButton Room8Exit = new JButton("\uB098\uAC00\uAE30");
		Room8Exit.setBounds(1105, 20, 75, 23);
		SevenDoors.add(Room8Exit);

		JButton Criminal1 = new JButton("1\uBC88");
		Criminal1.setBounds(236, 139, 61, 23);
		SevenDoors.add(Criminal1);

		JButton Criminal2 = new JButton("2\uBC88");
		Criminal2.setBounds(454, 139, 61, 23);
		SevenDoors.add(Criminal2);

		JButton Criminal3 = new JButton("3\uBC88");
		Criminal3.setBounds(673, 139, 61, 23);
		SevenDoors.add(Criminal3);

		JButton Criminal4 = new JButton("4\uBC88");
		Criminal4.setBounds(890, 139, 61, 23);
		SevenDoors.add(Criminal4);

		JButton Criminal5 = new JButton("5\uBC88");
		Criminal5.setBounds(355, 373, 61, 23);
		SevenDoors.add(Criminal5);

		JButton Criminal6 = new JButton("6\uBC88");
		Criminal6.setBounds(573, 373, 61, 23);
		SevenDoors.add(Criminal6);

		JButton Criminal7 = new JButton("7\uBC88");
		Criminal7.setBounds(790, 373, 61, 23);
		SevenDoors.add(Criminal7);

		JLabel lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_1 = new JLabel("");
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_1
				.setIcon(new ImageIcon(Story.class.getResource("/image/SevenDoors.png")));
		lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_1.setBounds(0, 0, 1186, 563);
		SevenDoors.add(lblNewLabel_6_1_12_7_1_21_1_1_11_1_13_1);

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
		Room_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room2.setVisible(true);
				Panel27.setVisible(true);
			}

		});
		Room_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room3.setVisible(true);
				Panel48.setVisible(true);
			}

		});
		Room_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room4.setVisible(true);
				Panel115.setVisible(true);
			}

		});
		Room_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room5.setVisible(true);
				Panel63.setVisible(true);
			}

		});
		Room_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room6.setVisible(true);
				Panel86.setVisible(true);
			}

		});
		Room_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room7.setVisible(true);
				Panel101.setVisible(true);
			}

		});
		Room_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel6.setVisible(false);
				Room8.setVisible(true);
				SevenDoors.setVisible(true);
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
		NextBtn48.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel48.setVisible(false);
				Panel49.setVisible(true);

			}

		});
		NextBtn49.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel49.setVisible(false);
				Panel50.setVisible(true);

			}

		});
		NextBtn50.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel50.setVisible(false);
				Panel51.setVisible(true);

			}

		});
		NextBtn51.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel51.setVisible(false);
				Panel52.setVisible(true);

			}

		});
		NextBtn52.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel52.setVisible(false);
				Panel53.setVisible(true);

			}

		});
		NextBtn53.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel53.setVisible(false);
				Panel54.setVisible(true);

			}

		});
		NextBtn54.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel54.setVisible(false);
				Panel55.setVisible(true);

			}

		});
		NextBtn55.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel55.setVisible(false);
				Panel56.setVisible(true);

			}

		});
		NextBtn56.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel56.setVisible(false);
				Panel57.setVisible(true);

			}

		});
		NextBtn57.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel57.setVisible(false);
				Panel58.setVisible(true);

			}

		});
		NextBtn58.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel58.setVisible(false);
				Panel59.setVisible(true);

			}

		});
		NextBtn59.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel59.setVisible(false);
				Panel60.setVisible(true);

			}

		});
		NextBtn60.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel60.setVisible(false);
				Panel61.setVisible(true);

			}

		});
		NextBtn61.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel61.setVisible(false);
				Panel62.setVisible(true);

			}

		});
		NextBtn62.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel62.setVisible(false);
				FindRoom3.setVisible(true);

			}

		});
		Room3Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindRoom3.setVisible(false);
				Room3.setVisible(false);
				Panel6.setVisible(true);

			}

		});
		NextBtn115.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel115.setVisible(false);
				Panel116.setVisible(true);

			}

		});
		NextBtn116.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel116.setVisible(false);
				Panel117.setVisible(true);

			}

		});
		NextBtn117.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel117.setVisible(false);
				Panel118.setVisible(true);

			}

		});
		NextBtn118.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel118.setVisible(false);
				Panel119.setVisible(true);

			}

		});
		NextBtn119.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel119.setVisible(false);
				FindRoom4.setVisible(true);

			}

		});

		Room4Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindRoom4.setVisible(false);
				Room4.setVisible(false);
				Panel6.setVisible(true);

			}

		});
		NextBtn63.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel63.setVisible(false);
				Panel64.setVisible(true);

			}

		});
		NextBtn64.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel64.setVisible(false);
				Panel65.setVisible(true);

			}

		});
		NextBtn65.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel65.setVisible(false);
				Panel66.setVisible(true);

			}

		});
		NextBtn66.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel66.setVisible(false);
				Panel67.setVisible(true);

			}

		});
		NextBtn67.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel67.setVisible(false);
				Panel68.setVisible(true);

			}

		});
		NextBtn68.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel68.setVisible(false);
				Panel69.setVisible(true);

			}

		});
		NextBtn69.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel69.setVisible(false);
				Panel70.setVisible(true);

			}

		});
		NextBtn70.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel70.setVisible(false);
				Panel71.setVisible(true);

			}

		});
		NextBtn71.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel71.setVisible(false);
				Panel72.setVisible(true);

			}

		});
		NextBtn72.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel72.setVisible(false);
				Panel73.setVisible(true);

			}

		});
		NextBtn73.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel73.setVisible(false);
				Panel74.setVisible(true);

			}

		});
		NextBtn74.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel74.setVisible(false);
				Panel75.setVisible(true);

			}

		});
		NextBtn75.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel75.setVisible(false);
				Panel76.setVisible(true);

			}

		});
		NextBtn76.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel76.setVisible(false);
				Panel77.setVisible(true);

			}

		});
		NextBtn77.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel77.setVisible(false);
				Panel78.setVisible(true);

			}

		});
		NextBtn78.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel78.setVisible(false);
				Panel79.setVisible(true);

			}

		});
		NextBtn79.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel79.setVisible(false);
				Panel80.setVisible(true);

			}

		});
		NextBtn80.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel80.setVisible(false);
				Panel81.setVisible(true);

			}

		});
		NextBtn81.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel81.setVisible(false);
				Panel82.setVisible(true);

			}

		});
		NextBtn82.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel82.setVisible(false);
				Panel83.setVisible(true);

			}

		});
		NextBtn83.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel83.setVisible(false);
				Panel84.setVisible(true);

			}

		});
		NextBtn84.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel84.setVisible(false);
				Panel85.setVisible(true);

			}

		});
		NextBtn85.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel85.setVisible(false);
				FindRoom5.setVisible(true);

			}

		});
		Room5Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindRoom5.setVisible(false);
				Room5.setVisible(false);
				Panel6.setVisible(true);

			}

		});
		NextBtn86.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel86.setVisible(false);
				Panel87.setVisible(true);

			}

		});
		NextBtn87.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel87.setVisible(false);
				Panel88.setVisible(true);

			}

		});
		NextBtn88.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel88.setVisible(false);
				Panel89.setVisible(true);

			}

		});
		NextBtn89.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel89.setVisible(false);
				Panel90.setVisible(true);

			}

		});
		NextBtn90.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel90.setVisible(false);
				Panel91.setVisible(true);

			}

		});
		NextBtn91.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel91.setVisible(false);
				Panel92.setVisible(true);

			}

		});
		NextBtn92.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel92.setVisible(false);
				Panel93.setVisible(true);

			}

		});
		NextBtn93.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel93.setVisible(false);
				Panel94.setVisible(true);

			}

		});
		NextBtn94.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel94.setVisible(false);
				Panel95.setVisible(true);

			}

		});
		NextBtn95.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel95.setVisible(false);
				Panel96.setVisible(true);

			}

		});
		NextBtn96.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel96.setVisible(false);
				Panel97.setVisible(true);

			}

		});
		NextBtn97.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel97.setVisible(false);
				Panel98.setVisible(true);

			}

		});
		NextBtn98.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel98.setVisible(false);
				Panel99.setVisible(true);

			}

		});
		NextBtn99.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel99.setVisible(false);
				Panel100.setVisible(true);

			}

		});
		NextBtn100.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel100.setVisible(false);
				FindRoom6.setVisible(true);

			}

		});

		Room6Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindRoom6.setVisible(false);
				Room6.setVisible(false);
				Panel6.setVisible(true);

			}

		});
		NextBtn101.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel101.setVisible(false);
				Panel102.setVisible(true);

			}

		});
		NextBtn102.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel102.setVisible(false);
				Panel103.setVisible(true);

			}

		});
		NextBtn103.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel103.setVisible(false);
				Panel104.setVisible(true);

			}

		});
		NextBtn104.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel104.setVisible(false);
				Panel105.setVisible(true);

			}

		});
		NextBtn105.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel105.setVisible(false);
				Panel106.setVisible(true);

			}

		});
		NextBtn106.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel106.setVisible(false);
				Panel107.setVisible(true);

			}

		});
		NextBtn107.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel107.setVisible(false);
				Panel108.setVisible(true);

			}

		});
		NextBtn108.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel108.setVisible(false);
				Panel109.setVisible(true);

			}

		});
		NextBtn109.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel109.setVisible(false);
				Panel110.setVisible(true);

			}

		});
		NextBtn110.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel110.setVisible(false);
				Panel111.setVisible(true);

			}

		});
		NextBtn111.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel111.setVisible(false);
				Panel112.setVisible(true);

			}

		});
		NextBtn112.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel112.setVisible(false);
				Panel113.setVisible(true);

			}

		});
		NextBtn113.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel113.setVisible(false);
				Panel114.setVisible(true);

			}

		});
		NextBtn114.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel114.setVisible(false);
				FindRoom7.setVisible(true);

			}

		});

		Room7Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FindRoom7.setVisible(false);
				Room7.setVisible(false);
				Panel6.setVisible(true);

			}

		});
		Criminal1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Defeat.setVisible(true);
				Panel120.setVisible(true);

			}

		});
		Criminal2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Defeat.setVisible(true);
				Panel120.setVisible(true);

			}

		});
		Criminal3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Defeat.setVisible(true);
				Panel120.setVisible(true);

			}

		});
		Criminal5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Defeat.setVisible(true);
				Panel120.setVisible(true);

			}

		});
		Criminal6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Defeat.setVisible(true);
				Panel120.setVisible(true);

			}

		});
		NextBtn120.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel120.setVisible(false);
				Panel121.setVisible(true);

			}

		});
		NextBtn121.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel121.setVisible(false);
				Panel122.setVisible(true);

			}

		});
		NextBtn122.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel122.setVisible(false);
				Panel123.setVisible(true);

			}

		});
		NextBtn123.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel123.setVisible(false);
				Panel124.setVisible(true);

			}

		});
		NextBtn124.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel124.setVisible(false);
				Panel125.setVisible(true);

			}

		});
		NextBtn125.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel125.setVisible(false);
				Panel125_1.setVisible(true);

			}

		});
		NextBtn125_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel125_1.setVisible(false);
				Panel126.setVisible(true);

			}

		});
		NextBtn126.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel126.setVisible(false);
				Panel127.setVisible(true);

			}

		});
		NextBtn127.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel127.setVisible(false);
				GameOver.setVisible(true);

			}

		});
		Criminal7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Room8.setVisible(true);
				Success.setVisible(true);
				Panel128.setVisible(true);

			}

		});
		NextBtn128.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel128.setVisible(false);
				Panel129.setVisible(true);

			}

		});
		NextBtn129.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel129.setVisible(false);
				Panel130.setVisible(true);

			}

		});
		NextBtn130.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel130.setVisible(false);
				Panel131.setVisible(true);

			}

		});
		NextBtn131.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel131.setVisible(false);
				Panel131_1.setVisible(true);

			}

		});
		NextBtn131_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel131_1.setVisible(false);
				Panel132.setVisible(true);

			}

		});
		NextBtn132.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel132.setVisible(false);
				Panel133.setVisible(true);

			}

		});
		NextBtn133.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel133.setVisible(false);
				Panel134.setVisible(true);

			}

		});
		NextBtn134.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel134.setVisible(false);
				Panel135.setVisible(true);

			}

		});
		NextBtn135.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel135.setVisible(false);
				Panel136.setVisible(true);

			}

		});
		NextBtn136.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel136.setVisible(false);
				Panel137.setVisible(true);

			}

		});
		NextBtn137.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel137.setVisible(false);
				Panel138.setVisible(true);

			}

		});
		NextBtn138.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel138.setVisible(false);
				Panel139.setVisible(true);

			}

		});
		NextBtn139.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel139.setVisible(false);
				Panel140.setVisible(true);

			}

		});
		NextBtn140.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel140.setVisible(false);
				Panel141.setVisible(true);

			}

		});
		NextBtn141.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel141.setVisible(false);
				Panel142.setVisible(true);

			}

		});
		NextBtn142.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel142.setVisible(false);
				Panel143.setVisible(true);

			}

		});
		NextBtn143.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel143.setVisible(false);
				Panel144.setVisible(true);

			}

		});
		NextBtn144.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel144.setVisible(false);
				Panel145.setVisible(true);

			}

		});
		NextBtn145.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel145.setVisible(false);
				Panel146.setVisible(true);

			}

		});
		NextBtn146.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel146.setVisible(false);
				Panel147.setVisible(true);

			}

		});
		NextBtn147.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel147.setVisible(false);
				Panel148.setVisible(true);

			}

		});
		NextBtn148.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel148.setVisible(false);
				Panel149.setVisible(true);

			}

		});
		NextBtn149.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel149.setVisible(false);
				Panel150.setVisible(true);

			}

		});
		NextBtn150.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel150.setVisible(false);
				Panel151.setVisible(true);

			}

		});
		NextBtn151.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel151.setVisible(false);
				Panel152.setVisible(true);

			}

		});
		NextBtn152.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel152.setVisible(false);
				Panel153.setVisible(true);

			}

		});
		NextBtn153.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel153.setVisible(false);
				Panel154.setVisible(true);

			}

		});
		NextBtn154.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel154.setVisible(false);
				Panel155.setVisible(true);

			}

		});
		NextBtn155.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel155.setVisible(false);
				Panel156.setVisible(true);

			}

		});
		NextBtn156.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel156.setVisible(false);
				Panel157.setVisible(true);

			}

		});
		NextBtn157.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel157.setVisible(false);
				Panel158.setVisible(true);

			}

		});
		NextBtn158.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel158.setVisible(false);
				Panel159.setVisible(true);

			}

		});
		NextBtn159.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel159.setVisible(false);
				Panel160.setVisible(true);

			}

		});
		NextBtn160.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel160.setVisible(false);
				Panel161.setVisible(true);

			}

		});
		NextBtn161.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel161.setVisible(false);
				Panel162.setVisible(true);

			}

		});
		NextBtn162.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel162.setVisible(false);
				Panel163.setVisible(true);

			}

		});
		NextBtn163.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel163.setVisible(false);
				Panel164.setVisible(true);

			}

		});
		NextBtn164.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel164.setVisible(false);
				Panel165.setVisible(true);

			}

		});
		NextBtn165.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel165.setVisible(false);
				Panel166.setVisible(true);

			}

		});
		NextBtn166.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel166.setVisible(false);
				Panel167.setVisible(true);

			}

		});
		NextBtn167.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel167.setVisible(false);
				Panel168.setVisible(true);

			}

		});
		NextBtn168.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel168.setVisible(false);
				Panel169.setVisible(true);

			}

		});
		NextBtn169.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel169.setVisible(false);
				Panel170.setVisible(true);

			}

		});
		NextBtn170.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel170.setVisible(false);
				Panel171.setVisible(true);

			}

		});
		NextBtn171.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel171.setVisible(false);
				Vic.setVisible(true);

			}

		});
		End.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}

		});
		Criminal4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Room8.setVisible(true);
				Suicide.setVisible(true);
				Panel172.setVisible(true);

			}

		});
		NextBtn172.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel172.setVisible(false);
				Panel173.setVisible(true);

			}

		});
		NextBtn173.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel173.setVisible(false);
				Panel174.setVisible(true);

			}

		});
		NextBtn174.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel174.setVisible(false);
				Panel175.setVisible(true);

			}

		});
		NextBtn175.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel175.setVisible(false);
				Panel176.setVisible(true);

			}

		});
		NextBtn176.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel176.setVisible(false);
				Panel177.setVisible(true);

			}

		});
		NextBtn177.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel177.setVisible(false);
				Panel178.setVisible(true);

			}

		});
		NextBtn178.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel178.setVisible(false);
				Panel179.setVisible(true);

			}

		});
		NextBtn179.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel179.setVisible(false);
				Panel180.setVisible(true);

			}

		});
		NextBtn180.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Panel180.setVisible(false);
				Retry_1.setVisible(true);
				GameOver_1.setVisible(true);

			}

		});
		Retry_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Room8.setVisible(false);
				Suicide.setVisible(false);
				SevenDoors.setVisible(false);
				Panel6.setVisible(true);

			}

		});

		Retry.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Room8.setVisible(false);
				Defeat.setVisible(false);
				SevenDoors.setVisible(false);
				Panel6.setVisible(true);

			}

		});

		Room8Exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SevenDoors.setVisible(false);
				Room8.setVisible(false);
				Panel6.setVisible(true);

			}

		});

	}
}
