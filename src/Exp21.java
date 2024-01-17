import java.util.Scanner;
class a1
{
    int arr1[];
    int s;
    int c;
    public void perform(){
        c=arr1[0];
        for(int i=0;i<s;i++){
            if(arr1[i]>c)
                c=arr1[i];
        }
    }
}

public class Exp21 {
    public static void main(String[] args)
    {
        a1 obj = new a1();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array \nentersize:");
        obj.s = sc.nextInt();
        System.out.print("Enter element:");
        obj.arr1 = new int[obj.s];
        for(int i=0;i<obj.s;i++){
            obj.arr1[i]=sc.nextInt();
        }
        System.out.print("array is:");
        for(int i=0;i<obj.s;i++){
            System.out.println(obj.arr1[i]);
        }
        obj.perform();
        System.out.println("answer is:"+obj.c);
    }
}
