/*import java.util.Scanner;

public class codechef23 {
    public static void main(String [] args){
        int T;
        int N;
        Scanner sc= new Scanner(System.in);
        T=sc.nextInt();
        for (int i=0;i<T;i++){
            N=sc.nextInt();
            int A[]=new int[N];
            int M=9999999;//max val to compare
            for(int j=0;j<N;j++){
                A[j]=sc.nextInt();
                M=Math.min(M,A[j]);
            }
            int a1=0;
            for(int j1=0;j1<N;j1++){
                if(A[j1]!=M){
                    a1++;
                }
            }
            System.out.println("a1");
        }
    }
}
*/
import java.util.*;

class codechef23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            int m = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
                m = Math.min(m, A[i]);
            }
            int a1 = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] != m) {
                    a1++;
                }
            }
            System.out.println(a1);
        }
    }
}
