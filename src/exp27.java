import java.util.*;
class lins{
    int arr1[];
    int s;
    int s1;
    int c;
    void perform(){
        c=0;
        for(int i=0;i< arr1.length;i++){
            if(arr1[i]==s1){
                c=i;
            }
        }
    }
}
public class exp27 {
    public static void main(String[] args){
        lins ob=new lins();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        ob.s=sc.nextInt();
        ob.arr1=new int[ob.s];
        for(int i=0;i<ob.s;i++){
            ob.arr1[i]=sc.nextInt();
        }
        System.out.println("enter element:");
        ob.s1=sc.nextInt();
        ob.perform();
        System.out.println("element at"+ob.c);
    }
}
