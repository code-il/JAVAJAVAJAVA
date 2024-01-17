import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teeswing2exp {
    public static void main(String [] args){
        /*JFrame f=new JFrame("TRAFFIC");
        JButton b1=new JButton("RED");
        b1.setBounds(100,100,100,100);
        f.add(b1);
        JButton b2=new JButton("YELLOW");
        b2.setBounds(100,200,100,100);
        f.add(b2);
        JButton b3=new JButton("GREEN");
        b3.setBounds(100,300,100,100);
        f.add(b3);
        String str;
        JTextField t1=new JTextField();
        t1.setBounds(200,100,100,100);
        JTextField t2=new JTextField();
        t2.setBounds(200,200,100,100);
        JTextField t3=new JTextField();
        t3.setBounds(200,300,100,100);
        f.add(t1);f.add(t2);f.add(t3);
        JButton b4=new JButton("RESET");
        b4.setBounds(100,400,200,100);
        b4.setBackground(Color.white);
        f.add(b4);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setBackground(Color.red);
                b2.setBackground(Color.white);
                b3.setBackground(Color.white);
                t1.setText("STOP!!");
                t2.setText("");
                t3.setText("");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b2.setBackground(Color.yellow);
                b1.setBackground(Color.white);
                b3.setBackground(Color.white);
                t1.setText("");
                t2.setText("GET READY !!");
                t3.setText("");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setBackground(Color.white);
                b2.setBackground(Color.white);
                b3.setBackground(Color.green);
                t1.setText("");
                t2.setText("");
                t3.setText("GOOOO!!");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setBackground(Color.white);
                b2.setBackground(Color.white);
                b3.setBackground(Color.white);
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
        JFrame f=new JFrame("Frame");
        int r=3;
        int c=3;
        int count=0;
        String [] a1={"This","is","a","grid","which","gives","3","x","3"};
        GridLayout gl=new GridLayout(r,c);
        f.setLayout(gl);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                JLabel l1=new JLabel(a1[count],SwingConstants.CENTER);
                f.add(l1);
                count=count+1;
            }
        }
        f.setSize(500,500);
        f.setVisible(true);*/
        JFrame f=new JFrame("radio");
        JRadioButton r1=new JRadioButton("A1");
        JRadioButton r2=new JRadioButton("A2");
        r1.setBounds(100,100,100,100);
        r2.setBounds(100,200,100,100);
        f.add(r1);f.add(r2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
}
