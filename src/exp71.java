import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class exp71 {
    public static void main(String[] args){
        JFrame f=new JFrame("TRAFFIC LIGHT");
        /*JRadioButton r1=new JRadioButton("RED");
        JRadioButton r2=new JRadioButton("YELLOW");
        JRadioButton r3=new JRadioButton("GREEN");
        r1.setBounds(20,30,100,50);
        r2.setBounds(100,30,100,50);
        r3.setBounds(200,30,100,50);*/
        JButton b1=new JButton();
        b1.setBounds(100,130,100,100);
        b1.setBackground(Color.white);
        JButton b2=new JButton();
        b2.setBounds(100,230,100,100);
        b2.setBackground(Color.white);
        JButton b3=new JButton();
        b3.setBounds(100,330,100,100);
        b3.setBackground(Color.white);
        String msg=new String();
        JTextField t=new JTextField();
        t.setBounds(200,130,100,100);
        JTextField t2=new JTextField();
        t2.setBounds(200,230,100,100);
        JTextField t3=new JTextField();
        t3.setBounds(200,330,100,100);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("STOP!");
                t2.setText("");
                t3.setText("");
                b1.setBackground(Color.red);
                b2.setBackground(Color.white);
                b3.setBackground(Color.white);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText("READY TO GO");
                t.setText("");
                t3.setText("");
                b2.setBackground(Color.yellow);
                b1.setBackground(Color.white);
                b3.setBackground(Color.white);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3.setText("GOOOOOOO!");
                t2.setText("");
                t.setText("");
                b3.setBackground(Color.green);
                b1.setBackground(Color.white);
                b2.setBackground(Color.white);
            }
        });

        /*ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        f.add(r1);
        f.add(r2);
        f.add(r3);*/
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(t);
        f.add(t2);
        f.add(t3);
        f.setSize(1000,2000);
        f.setLayout(null);
        f.setVisible(true);
    }

}
