import java.util.*;
class TellCall{
    String phno;
    String name;
    int n;
    double a;
    TellCall(String x,String y,int k){
        phno=x;
        name=y;
        n=k;
    }
    void compute(){
        if(n>=1 && n<=100)
            a=500;
        else if (n>=101 && n<=200)
            a=500+1*(n);
        else if (n>=201 && n<=300)
            a=500+1.2*(n);
        else if(n>300)
            a=500+1.5*(n);
    }
    void display(){
        System.out.println("Phone number\tName\tcalls\tamount");
        System.out.println(phno+"\t\t\t"+name+"\t\t"+n+"\t\t"+a);
    }
}
public class exp321 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        String a1=sc.next();
        System.out.println("enter name:");
        String a2=sc.next();
        System.out.println("enter number of calls");
        int a3=sc.nextInt();
        TellCall ob=new TellCall(a1,a2,a3);
        ob.compute();
        System.out.println("DETAILS");
        ob.display();
    }
}
