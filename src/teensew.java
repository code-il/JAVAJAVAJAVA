import javax.swing.*;
import java.awt.*;

public class teensew {
    JFrame f;
    teensew(){
        f=new JFrame();
        f.setLayout(new BorderLayout());
        JButton b1=new JButton("North");
        JButton b2=new JButton("North");
        JButton b3=new JButton("North");
        JButton b4=new JButton("North");
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.EAST);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.SOUTH);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String [] args){
        new teensew();
    }
}