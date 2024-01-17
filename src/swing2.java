import javax.swing.*;
import java.awt.*;

public class swing2 {
    public static void main(String [] args) {
        JFrame f = new JFrame();
        JRadioButton r1 = new JRadioButton("A) B1");
        JRadioButton r2 = new JRadioButton("B) B2");
        r1.setBounds(20, 20, 100, 30);
        r2.setBounds(30, 50, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        f.add(r1);
        f.add(r2);
        JPanel panel=new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.CYAN);
        JButton b1=new JButton("Button1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.GREEN);
        JButton b2=new JButton("Button 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.MAGENTA);
        panel.add(b1);panel.add(b2);
        f.add(panel);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
