import java.util.Scanner;

public class codechef3 {
    public static void main(String[] args) {
        int T;
        int A, B, C;
        int a1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        T = sc.nextInt();

        while (T > 0) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            B = B - Math.min(B, C);
            C = C - Math.min(B, C);
            A = A - Math.min(A, B);
            B = B - Math.min(A, B);
            A = A - Math.min(A, C);
            C = C - Math.min(A, C);

            if (A > 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");

            T--;
        }
    }
}
