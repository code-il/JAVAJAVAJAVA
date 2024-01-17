import java.util.Scanner;

class teacher{
    String [] name=new String[3];
    String [] dob=new String[3];
    String [] doj=new String[3];
    void getdate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT");
        for(int i=0;i<3;i++){
            System.out.println("TEACHER:"+(i+1));
            System.out.println("ENTER NAME");
            name[i]=sc.next();
            dob[i]=sc.next();
            doj[i]=sc.next();
        }
    }
    void show_getdata(){
        System.out.println("\nTEACHERDEATAILS");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+".\t"+name[i]+"\t"+dob[i]+"\t"+doj[i]);
        }
    }
}
class principal extends teacher{
    void sortdata(){
        super.getdate();
        int size=super.name.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<(size-i-1);j++){
                if(super.name[j].compareTo(super.name[j+1])>0){
                    String temp=super.name[j];
                    super.name[j]=super.name[j+1];
                    super.name[j+1]=temp;

                    String temp1=super.dob[j];
                    super.dob[j]=super.dob[j+1];
                    super.dob[j+1]=temp1;

                    String temp2=super.doj[j];
                    super.doj[j]=super.doj[j+1];
                    super.doj[j+1]=temp2;
                }
            }
        }
    }
    void display(){
        super.show_getdata();
    }
    void searchdata(){
        String st1;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        st1=sc.next();
        for(int i=0;i<3;i++){
            if(st1==super.name[i]){
                System.out.println(super.name[i]);
                System.out.println(super.dob[i]);
                System.out.println(super.doj[i]);
            }else{
                System.out.println("NOT THERE");
            }
        }
    }
}
public class teeteacher {
    public static void main(String [] args){
        principal ob=new principal();
        ob.sortdata();
        ob.display();
        ob.searchdata();
    }

}
