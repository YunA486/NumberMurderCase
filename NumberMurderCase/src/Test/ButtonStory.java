package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
class MyListener implements ActionListener{
 
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button  = (JButton)e.getSource();
        button.setText("버튼이 눌렸습니다.");
        
    }
    
}
 
class MyFrameTest extends JFrame{
    
    private JButton button;
    private JLabel label;
    //생성자
    public MyFrameTest() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("독립 리스너");
        
        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르세요");
        label = new JLabel("Yoon's Dev");
        button.addActionListener(new MyListener());
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
 
public class ButtonStory {
 
    public static void main(String[] args) {
        new MyFrameTest();
 
    }
 
}