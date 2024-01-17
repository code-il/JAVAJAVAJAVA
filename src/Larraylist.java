import java.util.ArrayList;
import java.util.List;

public class Larraylist {
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
    }

}
