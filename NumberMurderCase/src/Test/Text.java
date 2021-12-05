package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 입력 값 불러오기

public class Text extends JFrame implements ActionListener
{
    JTextField textField;
    JButton submitButton = new JButton("Submit");

    public Text()
    {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(3, 2));
        textField = new JTextField();
        myPanel.add(textField);
        myPanel.add(submitButton);
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == submitButton) {
            String data = textField.getText(); 
            System.out.println(data);
        }
    }

    public static void main(String args[])
    {
    	Text g = new Text();
        g.setLocation(10, 10);
        g.setSize(300, 300);
        g.setVisible(true);
    }
}