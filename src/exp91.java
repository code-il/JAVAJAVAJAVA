import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exp91 {
    public static void main(String[] args){
        List<String> List_strings=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size:");
        n=sc.nextInt();
        String a;
        for(int i=0;i<n;i++){
            a=sc.next();
            List_strings.add(a);
        }
       /* List_strings.add("red");
        List_strings.add("blue");
        List_strings.add("rd");
        List_strings.add("bue");
        List_strings.add("re");
        List_strings.add("bl"); */
        System.out.println("og list:"+ List_strings);
        List<String>sub_list=List_strings.subList(1,n);
        System.out.println(sub_list);
    }

}