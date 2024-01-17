import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class exp72 {
    public static void main(String [] args){
        JFrame f;
        JTable t;
        int r=3;
        int c=3;
        f=new JFrame();
        String [] a1={"hello","this","is","a","grid","layout","which","is","3x3"};
        GridLayout g1=new GridLayout(r,c);
        f.setLayout(g1);
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                JLabel l1=new JLabel(a1[count],SwingConstants.CENTER);
                f.add(l1);
                count+=1;
            }
        }
        f.setSize(500,500);
        f.setVisible(true);
    }
}
