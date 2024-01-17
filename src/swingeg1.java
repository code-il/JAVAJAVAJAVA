import javax.swing.*;
import java.awt.event.*;
public class swingeg1 {
    /*public static void sw1(){
        JFrame f=new JFrame("secondwindow");
        f.setSize(1000,400);
        f.setVisible(true);
    }*/
    public static void main(String[] args){
        JFrame f=new JFrame("this is a frame");
        JButton b=new JButton("CLICK HEREEEE!!!!!");
        JTextField a=new JTextField();
        //JTextArea b=new JTextArea("hi");
        b.setBounds(130,100,100,20);
        a.setBounds(130,180,200,20);
        f.add(b);
        f.add(a);
        b.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                a.setText("button was clicked");
            }
        });
        JLabel j1,j2;
        j1=new JLabel("first");
        j1.setBounds(130,210,200,20);
        f.add(j1);
        JPasswordField value=new JPasswordField();
        j2=new JLabel("Password:");
        j2.setBounds(130,240,100,20);
        value.setBounds(130,260,200,20);
        f.add(value);f.add(j2);
        f.setSize(1000,500);
        f.setLayout(null);
        f.setVisible(true);
        /*if(b.){
            sw1();

        }*/

    }
}
