import java.util.ArrayList;
import java.util.List;

public class Lcomparelists{
    public static void main(String[] args){
        List<String> List_strings=new ArrayList<String>();
        List_strings.add("red");
        List_strings.add("blue");
        List_strings.add("rd");
        List_strings.add("bue");
        List_strings.add("re");
        List_strings.add("bl");
        System.out.println("og list:"+ List_strings);
        List<String>sub_list=List_strings.subList(1,4);
        System.out.println(sub_list);
        List<String> List_strings1=new ArrayList<String>();
        List_strings1.add("red");
        List_strings1.add("blue");
        List_strings1.add("rd");
        List_strings1.add("bue");
        List_strings1.add("re");
        List_strings1.add("bl");
        boolean b=List_strings.equals(List_strings1);
        System.out.println(b);
    }

}
