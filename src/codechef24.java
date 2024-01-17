

import java.util.*;
import java.lang.*;
import java.io.*;

class codechef24 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            boolean a = false;
            boolean b = false;

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if ( A[i] == 1) {
                    a = true;
                }
            }
            int B[] = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
                if (B[i] == 1) {
                    b = true;
                }
            }
            boolean ans = true;
            if (A[0] != B[0]) {
                ans = false;
            }
            if (A[N - 1] != B[N- 1]) {
                ans = false;
            }
            int var1 = 0;
            int var2 = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == 0)
                    var1++;
                else
                    var2++;
            }
            for (int i = 1; i < N - 1; i++) {
                if (A[i] != B[i] && A[i] == 0 && var2 == 0) {
                    ans = false;
                } else if (A[i] != B[i] && A[i] == 1) {
                    ans = false;
                }
            }
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
