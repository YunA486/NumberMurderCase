package Test;

import java.awt.*;
import javax.swing.*;

public class MyPane extends JFrame {

	public MyPane() {
		setTitle("MyPane");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));
		
//		ù ��° ��
		JPanel pane1 = new JPanel();	
		pane1.setLayout(new GridLayout(3, 1));
		pane1.add(new JButton("btn1"));
		pane1.add(new JButton("btn2"));
		pane1.add(new JButton("btn3"));
		
//		�� ��° ��
		JPanel pane2 = new JPanel();
		pane2.setBackground(Color.black);
		pane2.setLayout(new FlowLayout());
		pane2.add(new JButton("btn1"));
		pane2.add(new JButton("btn2"));
		pane2.add(new JButton("btn3"));

		c.add(pane1);
		c.add(pane2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyPane();
	}

}
