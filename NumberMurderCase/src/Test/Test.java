package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class SubFrame extends JFrame implements ActionListener{

    public SubFrame(){
        super("나는 자식");	// 창 이름
        setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton bt = new JButton("닫기");
        add(bt);
        bt.addActionListener(this);
        setLocation(200, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        dispose();
    }
}

public class Test extends JFrame implements ActionListener{
    SubFrame sf;

    public Test(){
        super("프레임 생성");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton bt = new JButton("단추");
        add(bt);
        bt.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(sf == null){
            sf = new SubFrame();
        }else{
            sf.dispose();
            sf = new SubFrame();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Test();
    }
}