import java.util.Scanner;

class employee{
    int empc;
    double bpay;
    void employee(){
        empc=0;
        bpay=0;
    }
    void employee(int c,double b){
        empc=c;
        bpay=b;
    }
    void display(){
        System.out.println("---EMPLOYEE---");
        System.out.println("EMPLOYEE_ID:"+empc+" "+"BASIC:"+bpay);
    }

}
class overtime extends employee{
    int nd;
    float rate;
    void overtime(int n,float r){
        nd=n;
        rate=r;
    }
    double calculate(){
        return super.bpay+(nd*rate);
    }
    void show(){
        System.out.println("AMOUNT PAID FOR HOURS:"+(nd*rate));
    }
}
public class teeemp{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        overtime ob=new overtime();
        System.out.println("ENTER EMPCODE:");
        int e=sc.nextInt();
        System.out.println("ENTER BASIC SAL:");
        int b=sc.nextInt();
        System.out.println("ENTER NUMBER OF HOURS:");
        int h=sc.nextInt();
        System.out.println("ENTER RATE:");
        int r=sc.nextInt();
        ob.employee(e,b);
        ob.display();
        ob.overtime(h,r);
        ob.show();

    }
}
