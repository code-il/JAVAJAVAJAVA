import java.util.ArrayList;
import java.util.Scanner;

public class exp10_2 {
    public static void main(String [] args){
        ArrayList<Integer> a1=new ArrayList<>();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter"+" "+(i+1)+" "+"marks");
            a1.add(sc.nextInt());
        }
        double avg=0;
        double tot=0;
        char g;
        for(int i=0;i<n;i++){
            tot+=a1.get(i);
        }
        avg=tot/n;
        if(avg>=90){
            g='A';
        } else if (avg>=80 && avg<90) {
            g='B';
        }else if (avg>=70 && avg<80) {
            g='c';
        }else if (avg>=60 && avg<70) {
            g='D';
        }else if (avg>=40 && avg<60) {
            g='E';
        }else{
            g='F';
        }
        System.out.println("the grade for avg:"+" "+avg+" "+" is:"+g);
    }
}
