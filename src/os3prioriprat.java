import java.util.Scanner;

public class os3prioriprat {
    public static void main(String[] args){
        int[] P;
        int[] BT;
        int[] AT;
        int[] WT;
        int[] TAT;
        int[] CT;
        int[] PR;
        int n;
        int[] completed;

        Scanner sc = new Scanner(System.in);

        //Inputs
        System.out.print("Enter size: ");
        n = sc.nextInt();
        P = new int[n];
        BT = new int[n];
        AT = new int[n];
        WT = new int[n];
        TAT = new int[n];
        CT = new int[n];
        PR = new int[n];
        completed = new int[n];

        System.out.println("\n>>>>Input BT & AT<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter BT " + (i + 1) + ": ");
            BT[i] = sc.nextInt();
            System.out.print("Enter AT " + (i + 1) + ": ");
            AT[i] = sc.nextInt();
            System.out.print("Enter PR " + (i + 1) + ": ");
            PR[i] = sc.nextInt();
            System.out.println();
            P[i] = i+1;
        }

        int start_time = 0;
        int completed_count = 0;

        while (completed_count < n) {
            int shortest_process = n;
            int minPR = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (AT[i] <= start_time && completed[i] == 0 && PR[i] < minPR) {
                    minPR = PR[i];
                    shortest_process = i;
                }
            }
            if (shortest_process == n) {
                start_time++;
            } else {
                completed[shortest_process] = 1;
                CT[shortest_process] = start_time + BT[shortest_process];
                start_time += BT[shortest_process];
                TAT[shortest_process] = CT[shortest_process] - AT[shortest_process];
                WT[shortest_process] = TAT[shortest_process] - BT[shortest_process];
                P[completed_count] = shortest_process + 1;
                completed_count++;
            }
        }

        System.out.println("Process execution in order: ");
        for(int i=0;i<n;i++) {
            System.out.print(P[i] + " ");
        }
        System.out.println();



        double sum2=0;
        for(int i=0;i<n;i++){
            sum2+=TAT[i];
        }
        double ATAT = sum2/n;


        double sum=0;
        for(int i=0;i<n;i++){
            sum+=WT[i];
        }
        double AWT = sum/n;


        System.out.println("Completion Time:");
        for(int i=0;i<n;i++){
            System.out.print(CT[i]+" ");
        }
        System.out.println();
        System.out.println("Wait Time:");
        for(int i=0;i<n;i++){
            System.out.print(WT[i]+" ");
        }
        System.out.println();
        System.out.println("Turnaround Time:");
        for(int i=0;i<n;i++){
            System.out.print(TAT[i]+" ");
        }
        System.out.println();
        System.out.println("Await Time: "+AWT+"\nAverage Turnaround Time: "+ATAT);

    }
}