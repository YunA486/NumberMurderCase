package Test;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

// �̹��� ��ư ����

public class Button extends JFrame{
	/*��ư����*/
	static JButton b1=new JButton("��ư1");
	/*�׷��ֱ�*/
	private ImageIcon btImage = new ImageIcon(Button.class.getResource("../image/Frame 2.png"));//�������ư ������ �� �̹���
	private Image background=new ImageIcon(Button.class.getResource("../image/Frame 1.png")).getImage();//����̹���
	/*������*/
	public Button() {
		homeframe();
		btn();
	}
	/*������ ���� �Լ�*/
	public void homeframe() {
		setTitle("1");//Ÿ��Ʋ
		setBounds(40, 20, 1200, 600);//�������� ũ��
		setResizable(false);//â�� ũ�⸦ �������� ���ϰ�
		setLayout(null);//���̾ƿ��� ������� ���������ϰ� ����.
		setVisible(true);//â�� ���̰�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame�� ���������� ����ǰ�
	}
	/*��ư����*/
	public void btn() {
		b1.setLayout(null);//���̾ƿ�
		b1.setBounds(0, 0, 1200, 600);//�������� ũ��
		add(b1);//�����ӿ� �߰�
		b1.setIcon(btImage);//��ư�� ������ ����
	}
	public void paint(Graphics g) {//�׸��� �Լ�
		g.drawImage(background, 0, 0, null);//background�� �׷���
		//paintComponents(g);//add�� �߰����غκ��� �׷���
	}
	/*�����Լ�*/
	public static void main(String[] args){
		new Button();
	}
}