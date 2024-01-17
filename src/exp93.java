import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exp93 {
    public static void main(String[] args) {
        List<String> List_strings = new ArrayList<String>();
        List<String>List_strings1=new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter size:");
        n = sc.nextInt();
        String a;
        int b1,b2;
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            a = sc.next();
            List_strings.add(a);
        }
        System.out.println("enter first index:");
        b1=sc.nextInt();
        System.out.println("enter second index:");
        b2=sc.nextInt();
        System.out.println("1st list:" + List_strings);
        //System.out.println("2nd list:" + List_strings);
        Collections.swap(List_strings,b1,b2);
        System.out.println(List_strings);
    }
}
