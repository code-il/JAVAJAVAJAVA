import java.util.Scanner;

public class codechef22 {
    public static void main(String [] args){
        int T;
        Scanner sc= new Scanner(System.in);
        T=sc.nextInt();
        for (int i=0;i<T;i++){
            String [] a1=sc.nextLine().split("\\s+");
            int X=Integer.parseInt(a1[0]);
            int Y=Integer.parseInt(a1[1]);
            if(X*5-Y>=0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}




