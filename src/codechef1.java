import java.util.*;
public class codechef1 {
    public void calc(){

    }
    public static void main(String[] args){
        int T;
        int X[];
        int Y[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        T=sc.nextInt();
        X=new int[T];
        Y=new int[T];
        for(int i=0;i<T;i++) {
            System.out.println("Enter Jerry speed:");
            X[i] = sc.nextInt();
            System.out.println("Enter Tom speed:");
            Y[i] = sc.nextInt();
        }
        for(int i=0;i<T;i++) {

            if (X[i] > Y[i]) {
                System.out.println("NO");
            } else if (X[i] == Y[i]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
//CODE OF AADILN046