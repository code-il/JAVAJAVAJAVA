import java.util.Scanner;

public class codechef211 {
    public static void main(String [] args){
        int T;
        int N;
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF TEST CASE:");
        T=sc.nextInt();
        for (int i=0;i<T;i++){
              N=sc.nextInt();
              if(N%3==0){
                  System.out.println("YES");
              }
              else{
                  System.out.println("NO");
              }
    }
}
}
