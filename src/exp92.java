import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exp92 {
    public static void main(String[] args) {
        List<String> List_strings = new ArrayList<String>();
        List<String>List_strings1=new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int n,n1;
        System.out.println("enter size for first:");
        n = sc.nextInt();
        System.out.println("enter size for second:");
        n1 = sc.nextInt();
        String a,a1;
        for (int i = 0; i < n; i++) {
            a = sc.next();
            List_strings.add(a);
        }
        System.out.println("enter for second :");
        for (int i = 0; i < n1; i++) {
            a1 = sc.next();
            List_strings1.add(a1);
        }

        System.out.println("1st list:" + List_strings);
        System.out.println("2nd list:" + List_strings);
        boolean b=List_strings.equals(List_strings1);
        System.out.println(b);
    }
}