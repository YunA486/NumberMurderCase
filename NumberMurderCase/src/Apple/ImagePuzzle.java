package Apple;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

class MyButton extends JButton {

	static int count = 0;// ��������

	int index;

	public MyButton(String s) {

		super(s);// ����Ŭ���� ������ ȣ��

		index = count++;// ��������

	}// �����ڿ����ε�

}// MyButton class

class Puzzle extends JFrame implements ActionListener {

	MyButton[] buttons;// ��ư�迭 ����

	MyButton reset;

	public Puzzle() {

		super("�������");// ����Ŭ���� ������ ȣ���ؼ� ������������â ������

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(0, 3, 2, 2));

// ���� ������, �������� 3. 2, 2�� ���ڻ��� ����

		buttons = new MyButton[9];// �迭ũ�Ⱑ 9 ��ư �迭����

		for (int i = 0; i < 8; i++) {

			buttons[i] = new MyButton(" " + (i + 1));

// 1���� 8���� ��µǴ� ��ư ĸ�ǹ��ڿ� ����

		} // for

		buttons[8] = new MyButton(" ");// �������� ��ư�� ����ó��

		for (int i = 0; i < 9; i++) {// 9���� ��ư�� �гο� �߰�

			panel.add(buttons[i]);

		} // for

		for (int i = 0; i < 9; i++) {// 9���� ��ư �̺�Ʈ ���

			buttons[i].addActionListener(this);

		} // for

		add(panel, BorderLayout.CENTER);// �г��� ������ �߾ӿ� ��ġ

		reset = new MyButton("reset");

		reset.setBackground(Color.pink);// ��ư ���� ����

		reset.setForeground(Color.DARK_GRAY);// ��ưĸ�� ���ڿ� ���ڻ� ����

		reset.addActionListener(this);

		add(reset, BorderLayout.SOUTH);

		setSize(300, 300);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// �⺻������

	@Override

	public void actionPerformed(ActionEvent e) {

		MyButton b = (MyButton) e.getSource();

		if (b.getText().equals(" ") == true) {// �� ��ư ������ �ƹ� ���� ����

			return;// �̺�Ʈ ����

// getText()�޼���� ��ư�� ĸ�ǹ��ڿ��� ������.

// equals()�� ��ü�ּҰ� �ٸ��� ���빰�� ���Ƶ� true�� ��ȯ

		} // if

		if (b.index == 0) {// 1�� ��ư ������ ��

			if (buttons[1].getText().equals(" ")) {// 2�� �ڸ� ĸ���� ��� �ִٸ�

// ==true�� ���� ��

				buttons[1].setText(b.getText());

// 2���� ��ư ĸ�ǹ��ڿ��� ù���� ��ưĸ�ǹ��ڿ��� ����

				b.setText(" ");

// ù��° ��ư ĸ�ǹ��ڿ��� ��������� ó��

			} // if

			if (buttons[3].getText().equals(" ")) {

				buttons[3].setText(b.getText());

				b.setText(" ");

			} // if

		} // 1�� ��ư ������ ��

		if (b.index == 1) {

			if (buttons[0].getText().equals(" ")) {

				buttons[0].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[2].getText().equals(" ")) {

				buttons[2].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

		} // 2�� ��ư ������ ��

		if (b.index == 2) {// 3�� ��ư ������ ��

			if (buttons[1].getText().equals(" ")) {// 2�� �ڸ� ĸ���� ��� �ִٸ�

				buttons[1].setText(b.getText());

// 2�� �ڸ��� 1�� ĸ���� �ְ�

				b.setText(" ");

// 1�� �ڸ� ĸ���� �����.

// �� 1�� ��ư ������ �� 2���ڸ��� ����ִٸ� �������� �ڸ� �ٲ�.

			}

			if (buttons[5].getText().equals(" ")) {

				buttons[5].setText(b.getText());

				b.setText(" ");

			}

		} // 3�� ��ư ������ ��

		if (b.index == 3) {

			if (buttons[0].getText().equals(" ")) {

				buttons[0].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[6].getText().equals(" ")) {

				buttons[6].setText(b.getText());

				b.setText(" ");

			}

		} // 4�� ��ư ������ ��

		if (b.index == 4) {

			if (buttons[1].getText().equals(" ")) {

				buttons[1].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[3].getText().equals(" ")) {

				buttons[3].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[5].getText().equals(" ")) {

				buttons[5].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[7].getText().equals(" ")) {

				buttons[7].setText(b.getText());

				b.setText(" ");

			}

		} // 5�� ��ư ������ ��

		if (b.index == 5) {

			if (buttons[2].getText().equals(" ")) {

				buttons[2].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[8].getText().equals(" ")) {

				buttons[8].setText(b.getText());

				b.setText(" ");

			}

		} // 6�� ��ư ������ ��

		if (b.index == 6) {

			if (buttons[3].getText().equals(" ")) {

				buttons[3].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[7].getText().equals(" ")) {

				buttons[7].setText(b.getText());

				b.setText(" ");

			}

		} // 7�� ��ư ������ ��

		if (b.index == 7) {

			if (buttons[4].getText().equals(" ")) {

				buttons[4].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[6].getText().equals(" ")) {

				buttons[6].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[8].getText().equals(" ")) {

				buttons[8].setText(b.getText());

				b.setText(" ");

			}

		} //// 8�� ��ư ������ ��

		if (b.index == 8) {

			if (buttons[5].getText().equals(" ")) {

				buttons[5].setText(b.getText());

				b.setText(" ");

			}

			if (buttons[7].getText().equals(" ")) {

				buttons[7].setText(b.getText());

				b.setText(" ");

			}

		} // 9�� ��ư ������ ��

		if (b.getText().equals("reset")) {

			for (int i = 0; i < 8; i++) {

				buttons[i].setText("" + (i + 1));

			}

			buttons[8].setText(" ");

		}

	}

}

public class ImagePuzzle {

	public static void main(String[] args) {

		new Puzzle();

	}

}