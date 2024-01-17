import java.util.Scanner;

public class exp84 {
    void ro_tate(String a1,String a2){
        String f1="";
        String b1="";
        f1= a1.substring(2)+ a1.substring(0,2);
        b1=a1.substring(a1.length()-2)+ a1.substring(0, a1.length()-2);
        System.out.println("Front rotation:"+f1+"Back rotation:"+b1);
        if(f1.equalsIgnoreCase(a2))
            System.out.println("STRING a1 AND STRING a2 MATCH WITH FRONT ROTATION");
        else if(b1.equalsIgnoreCase(a2))
            System.out.println("STRING a1 AND STRING a2 MATCH WITH BACK ROTATION");
        else
            System.out.println("STRING a1 AND STRING a2 DON'T MATCH");
    }
    public static void main(String[] args){
        exp84 ob = new exp84();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String a1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a String a2: ");
        String s2 = sc.nextLine();
        ob.ro_tate(s1,s2);
    }

}

