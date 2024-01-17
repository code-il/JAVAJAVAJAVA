import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dialogegswing {
    private static JDialog d;
    dialogegswing(){
        JFrame f=new JFrame();
        JRadioButton r1=new JRadioButton("A) B1");
        JRadioButton r2=new JRadioButton("B) B2");
        r1.setBounds(100,50,100,30);
        r2.setBounds(100,100,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.add(r1);f.add(r2);
        f.setLayout(null);
        f.setVisible(true);
        d=new JDialog(f,"Dialog Example",true);
        d.setLayout(new FlowLayout());
        JButton b=new JButton("OK");
        b.setBounds(100,250,100,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogegswing.d.setVisible(false);
            }
        });
        d.add(new JLabel("click button"));
        d.add(b);
        d.setSize(500,300);
        d.setVisible(true);
    }
    public static void main(String [] args){
        new dialogegswing();
    }
}
