package Test;

//JFC Components 클래스의 종류3 - JDesktopPane 클래스

//이벤트 패키지

import java.awt.BorderLayout;

import java.awt.Container;

import java.awt.Dimension;

import java.awt.Image;

import java.awt.Toolkit;

import javax.swing.JDesktopPane;

import javax.swing.JFrame;

import javax.swing.JInternalFrame;

class Exam_05_sub extends JFrame { // jframe를 상속

//프레임 배열

	private BorderLayout bl = new BorderLayout();

	private JDesktopPane pane = new JDesktopPane();

	private JInternalFrame jif1 = new JInternalFrame("내부1번", true, true, true, true);

	private JInternalFrame jif2 = new JInternalFrame("내부2번", true, true, true, true);

	private JInternalFrame jif3 = new JInternalFrame("내부3번", true, true, true, true);

	public Exam_05_sub(String title) { // 생성자

		super(title);

		this.init();

		this.start();

//메인메뉴 아이콘 조정

		Toolkit tk = Toolkit.getDefaultToolkit();

		Image img = tk.getImage("nex.gif");

		this.setIconImage(img);

//윈도우 정렬

		this.setSize(300, 300);

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		Dimension frm = this.getSize();

		int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);

		int ypos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);

		this.setLocation(xpos, ypos);

		this.setResizable(false);

		this.setVisible(true);

	}

//프레인 안에 다른 프레임만들기

	public void init() {

		Container con = this.getContentPane();

		con.setLayout(bl);

		jif1.setBounds(0, 0, 200, 150); // 프레임의 위치 크기

		jif2.setBounds(20, 20, 200, 150);

		jif3.setBounds(40, 40, 200, 150);

		pane.add(jif1); // 프레임 실행

		pane.add(jif2);

		pane.add(jif3);

		jif1.setVisible(true); // 프레임이 보여지는 ..

		jif2.setVisible(true);

		jif3.setVisible(true);

		con.add("Center", pane);

	}

	public void start() {
	}

}

public class sdfd {

	public static void main(String[] arStrings) { // ar 매개변수

		Exam_05_sub ex = new Exam_05_sub("이미지닉스"); // 객체생성

	}

}