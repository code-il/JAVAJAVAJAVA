import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exp10_1 {
    public static void main(String[] args){
        ArrayList<String> a1=new ArrayList<>();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        n=sc.nextInt();
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            System.out.println("enter"+" "+ (i+1)+" " +"element:");
            a1.add(sc.next());
        }
        Random r1=new Random();
        int r2=0;
        r2= r1.nextInt(n);
        System.out.println("Random name:"+a1.get(r2));
    }
}
