import javax.swing.*;
import java.awt.*;

public class swinglayout {
    JFrame f;

    swinglayout(){
        f= new JFrame();
        f.setLayout(new BorderLayout());
        JButton b1=new JButton("NORTH");
        JButton b2=new JButton("WEST");
        JButton b3=new JButton("EAST");
        JButton b4=new JButton("CENTRE");
        JButton b5=new JButton("SOUTH");
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.CENTER);
        f.add(b5, BorderLayout.SOUTH);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String [] args){
        new swinglayout();
    }
}
