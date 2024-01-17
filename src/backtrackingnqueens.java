/*import java.util.*;
public class backtrackingnqueens {
    boolean nqueen(int g[][],int r, int n) {
        if (r == n) {
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (nqueen1(g, r, col))
                g[r][col] = 1;
            if (nqueen(g, r + 1,n)) {
                return true;

            }
        }
    }

        boolean nqueen1(int g[][], int r, int c){
        int drow = r;
        int dcol = c;
        //upper diagonal
        while (r >= 0 && c >= 0) {
            if (g[r][c] == 'Q') {
                return false;

            } else {
                r--;
                c--;
            }
        }
        //column
        c = dcol;
        r = drow;
        while (c >= 0) {
            if (g[r][c] == 'Q') {
                return false;
            } else {
                c--;
            }
        }
        //lower diagonal
        r = drow;
        c = dcol;
        while (r < n && c >= 0) {
            if (g[r][c] == 'Q') {
                return false;
            } else {
                r++;
                c--;
            }
        }
    }
    }
        public static void main (String[] args){
            int g[][];
            backtrackingnqueens ob=new backtrackingnqueens();
            int s;
            int row=0;
            Scanner sc = new Scanner(System.in);
            s=sc.nextInt();
            g = new int[s][s];
            ob.nqueen(g,row,s);
        }
    }
}*/