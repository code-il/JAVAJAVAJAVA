import java.util.*;
public class exp83 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String s=sc.nextLine();
        String s2="";
        for(int j=s.length()-1;j>=0;j--){
            s2=s2+s.charAt(j);
        }
        System.out.println(s2);
        if(s2.equals(s)){
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}
