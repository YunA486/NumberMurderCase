package Test;

//JFC Components Ŭ������ ����3 - JDesktopPane Ŭ����

//�̺�Ʈ ��Ű��

import java.awt.BorderLayout;

import java.awt.Container;

import java.awt.Dimension;

import java.awt.Image;

import java.awt.Toolkit;

import javax.swing.JDesktopPane;

import javax.swing.JFrame;

import javax.swing.JInternalFrame;

class Exam_05_sub extends JFrame { // jframe�� ���

//������ �迭

	private BorderLayout bl = new BorderLayout();

	private JDesktopPane pane = new JDesktopPane();

	private JInternalFrame jif1 = new JInternalFrame("����1��", true, true, true, true);

	private JInternalFrame jif2 = new JInternalFrame("����2��", true, true, true, true);

	private JInternalFrame jif3 = new JInternalFrame("����3��", true, true, true, true);

	public Exam_05_sub(String title) { // ������

		super(title);

		this.init();

		this.start();

//���θ޴� ������ ����

		Toolkit tk = Toolkit.getDefaultToolkit();

		Image img = tk.getImage("nex.gif");

		this.setIconImage(img);

//������ ����

		this.setSize(300, 300);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension frm = this.getSize();

		int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);

		int ypos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);

		this.setLocation(xpos, ypos);

		this.setResizable(false);

		this.setVisible(true);

	}

//������ �ȿ� �ٸ� �����Ӹ����

	public void init() {

		Container con = this.getContentPane();

		con.setLayout(bl);

		jif1.setBounds(0, 0, 200, 150); // �������� ��ġ ũ��

		jif2.setBounds(20, 20, 200, 150);

		jif3.setBounds(40, 40, 200, 150);

		pane.add(jif1); // ������ ����

		pane.add(jif2);

		pane.add(jif3);

		jif1.setVisible(true); // �������� �������� ..

		jif2.setVisible(true);

		jif3.setVisible(true);

		con.add("Center", pane);

	}

	public void start() {
	}

}

public class sdfd {

	public static void main(String[] arStrings) { // ar �Ű�����

		Exam_05_sub ex = new Exam_05_sub("�̹����н�"); // ��ü����

	}

}