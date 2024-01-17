import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teeopen{
    private static JDialog d;

    teeopen(){
        JFrame f=new JFrame("FRAME");
        JRadioButton r1=new JRadioButton("A1");
        JRadioButton r2=new JRadioButton("B1");
        r1.setBounds(100,100,100,100);
        r2.setBounds(100,200,100,100);
        JLabel l1=new JLabel("WELCOME TO FRAME");
        l1.setBounds(100,300,300,100);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.add(l1);
        f.add(r1);f.add(r2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        d=new JDialog(f,"example",true);
        d.setLayout(new FlowLayout());
        JButton b=new JButton("click");
        b.setBounds(100,400,200,100);
        d.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teeopen.d.setVisible(false);
            }
        });
        d.setSize(500,500);
        d.setVisible(true);
    }
    public static void main(String [] args){
        new teeopen();
    }

}
