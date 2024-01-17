import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teeswing {
    public static void main(String [] args){
        JFrame f= new JFrame("FOR TEE");
        JButton b=new JButton("BUT-ON");
        b.setBounds(130,100,200,80);
        f.add(b);
        JLabel l0;
        l0=new JLabel("Username:");
        l0.setBounds(130,160,200,100);
        f.add(l0);
        JTextField t1=new JTextField();
        t1.setText("HELLO");
        t1.setBounds(130,220,200,25);
        f.add(t1);
        JLabel l1;
        l1=new JLabel("PASSWORD:");
        l1.setBounds(130,240,200,100);
        f.add(l1);
        JPasswordField p=new JPasswordField();
        p.setBounds(130,300,200,25);
        f.add(p);
        JTextField a1=new JTextField("this is a text");
        a1.setBounds(130,340,200,25);
        f.add(a1);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a1.setText("BUTTON GOT CLICKED");
            }
        });
        JPanel p1=new JPanel();
        p1.setBounds(130,380,400,400);
        p1.setBackground(Color.BLACK);
        JButton b1=new JButton("BUTTON1");
        b1.setBackground(Color.red);
        b1.setBounds(50,200,50,50);
        JButton b2=new JButton("BUTTON2");
        b2.setBackground(Color.yellow);
        b2.setBounds(100,200,50,50);
        p1.add(b1);
        p1.add(b2);
        f.add(p1);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}
