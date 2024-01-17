import java.util.Scanner;
import java.util.Stack;

class Employee1{
    String name;
    int id;
    int dep;
    void display(){
        System.out.println("EMPLOYEE ID:"+id+"\nEMPLOYEE NAME:"+name+"\nDEPARTMENT NO.:"+dep);

    }
}
class salary extends Employee1{
    int gross;
    int payable;

    void display2(){
        super.display();
        int total=gross-200+payable;
        System.out.println("SALARY IS:"+total);
    }
}
class self_appraisal extends salary{
    int appraisal;
    int increment;
    void display3(){
        super.display2();
        System.out.println("APPRAISAL IS:"+appraisal+"\nINCREMENT IS:"+increment);

    }
}
public class empsq {
    public static void main (String [] args){
        self_appraisal ob=new self_appraisal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        ob.name=sc.nextLine();
        System.out.println("Enter the id:");
        ob.id=sc.nextInt();
        System.out.println("Enter the Department:");
        ob.dep=sc.nextInt();
        System.out.println("Enter the Gross sal:");
        ob.gross=sc.nextInt();
        System.out.println("Enter the payable sal:");
        ob.payable=sc.nextInt();
        System.out.println("Enter the appraisal:");
        ob.appraisal=sc.nextInt();
        System.out.println("Enter the increment:");
        ob.increment=sc.nextInt();
        ob.display3();
    }

}
