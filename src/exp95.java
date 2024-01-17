import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class exp95 {
    public static void main(String[] args){
        LinkedList<String> l1=new LinkedList<>();
        int n;
        System.out.println("enter size:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            l1.add(sc.next());
        }
        System.out.println("og list:"+l1);
        System.out.println("insert value:");
        String a1=sc.next();
        System.out.println("insert position:");
        int p1=sc.nextInt();
        l1.add(p1-1,a1);
        System.out.println("after insertion:"+l1);

    }

}
