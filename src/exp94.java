import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class exp94 {
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
        Iterator<String> it=l1.descendingIterator();
        System.out.println("Reversed List:");
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }

}
