import java.util.Scanner;

public class osbankersalgo {
    /*public static void need1(int m[][],int all[][],int av[],int n[][]){

    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("ENTER THE NUMBER OF PROCESSES:");
        n = sc.nextInt();
        System.out.print("\nENTER THE NUMBER OF RESOURCE TYPES:");
        m = sc.nextInt();
        int[][] max = new int[n][m];
        int[][] allocation = new int[n][m];
        int[] avail = new int[n];
        int[][] need = new int[n][m];
        int[] work = new int[m];
        int[] safesequence = new int[n];
        /*for (int i = 0; i < m; i++) {//available
            System.out.println("enter resource available for:" + (i + 1) + ":");
            avail[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("enter allocation:" + (i + 1) + ":process");
            for (int j = 0; j < m; j++) {
                System.out.println("enter allocation for:" + (j + 1) + ":Resource type:");
                allocation[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("enter max:" + (i + 1) + ":process");
            for (int j = 0; j < m; j++) {
                System.out.println("enter max for:" + (j + 1) + ":Resource type:");
                max[i][j] = sc.nextInt();
            }
        }*/
        allocation = new int[][] { { 0, 1, 0 }, //P0
                { 2, 0, 0 }, //P1
                { 3, 0, 2 }, //P2
                { 2, 1, 1 }, //P3
                { 0, 0, 2 } }; //P4

        // MAX Matrix
        max = new int[][] { { 7, 5, 3 }, //P0
                { 3, 2, 2 }, //P1
                { 9, 0, 2 }, //P2
                { 2, 2, 2 }, //P3
                { 4, 3, 3 } }; //P4

        // Available Resources
        avail = new int[] { 3, 3, 2 };
        //need1(max,allocation,avail,need);
        for (int i = 0; i < n; i++) {//need calc
            for (int j = 0; j < m; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
        System.out.println(">>NEED<<");
        for (int i = 0; i < n; i++) {
            //System.out.println("PROCESS:"+(i+0)+":");
            for (int j = 0; j < m; j++) {
                System.out.print("\t" + need[i][j]);
            }
        }
        //is safe
        int count = 0;
        boolean visited[] = new boolean[n];//Visited array to find allocated processes
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }
        for(int i=0;i<m;i++){
            work[i]=avail[i];
        }
        while (count < n) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (visited[i] == false) {

                    int j;
                    for (j = 0; j < m; j++) {
                        if (need[i][j] > work[j])
                            break;
                    }
                    if (j == m) {
                        safesequence[count++] = i;
                        visited[i] = true;
                        flag = true;
                        for (j = 0; j < m; j++) {
                            work[j] = work[j] + allocation[i][j];
                        }
                    }
                }
                if (flag == false) {
                    break;
                }
            }
            if (count < n) {
                System.out.println("Unsafe!!");
            } else {
                System.out.println("Safe sequence:");
                for (int i = 0; i < n; i++) {
                    System.out.print("p" + safesequence[i]);
                    if (i != n - 1)
                        System.out.print(" ->");
                }
            }
        }
    }
}
