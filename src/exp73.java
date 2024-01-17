import javax.swing.*;

public class exp73 {
    public static void main(String[] args){
        JFrame f=new JFrame();
        JRadioButton r1=new JRadioButton("IT");
        JRadioButton r2=new JRadioButton("CSE");
        JRadioButton r3=new JRadioButton("ECE");
        r1.setBounds(100,100,100,100);
        r2.setBounds(100,200,100,100);
        r3.setBounds(100,300,100,100);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
}
