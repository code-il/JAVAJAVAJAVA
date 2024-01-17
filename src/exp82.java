import java.util.*;
public class exp82 {
    public static void main(String [] args){
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        String s2=new String();
        s2= sc.nextLine();
        String [] s=new String(s2).split("\\.");
        StringBuilder s1=new StringBuilder();
        for(int i=s.length-1;i>=0;i--) {
            if (i > 0) {
                s1.append(s[i] + ".");
            } else {
                s1.append(s[i]);
            }
        }
        System.out.println(s1);
    }
}
