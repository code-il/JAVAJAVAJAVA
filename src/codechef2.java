import java.util.*;
public class codechef2 {
    public static void main(String[] args){
        int T;
        int X,Y,Z;
        int a1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        T=sc.nextInt();
        while(T>0){
            X=sc.nextInt();
            Y=sc.nextInt();
            Z=sc.nextInt();
            a1=X*10;
            if(Y<=a1){
                System.out.println(Y*Z);
            }
            else{
                System.out.println(10*X*Z);
            }
            T--;
        }

    }
}
//CODE OF AADIL46