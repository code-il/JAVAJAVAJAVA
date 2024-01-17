import java.util.*;
public class exp81 {
    public static void main(String [] args){
        System.out.println("Enter input:");
        Scanner sc=new Scanner(System.in);
        String s2=new String();
        s2= sc.nextLine();
        String [] s=new String(s2).split(" ");
        StringBuilder s1=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            s1.append(s[i]+" ");
        }
        System.out.println(s1);
    }
}