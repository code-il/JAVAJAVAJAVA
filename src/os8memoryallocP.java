

import java.util.Scanner;

public class os8memoryallocP {
    int[] B;
    int[] P;
    int[] unused;
    int Bn;
    int Pn;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total blocks: ");
        Bn = sc.nextInt();
        B = new int[Bn];
        System.out.print("Enter total processes: ");
        Pn = sc.nextInt();
        P = new int[Pn];

        unused = new int[Bn];

        for (int i = 0; i < Bn; i++) {
            System.out.print("Enter capacity of B" + (i + 1) + ": ");
            B[i] = sc.nextInt();
        }
        System.out.println("\nInput Process sizes");
        for (int i = 0; i < Pn; i++) {
            System.out.print("Enter size of P" + (i + 1) + ": ");
            P[i] = sc.nextInt();
        }
    }

    void FirstFit() {
        int[] filled = new int[Bn];

        System.out.println("\nFirst Fit\nProcess\tBlock\tUnused");

        for (int j = 0; j < Pn; j++) {
            for (int i = 0; i < Bn; i++) {
                if (filled[i] == 0 && B[i] >= P[j]) {
                    filled[i] = 1;
                    unused[i] = B[i] - P[j];
                    System.out.println("P" + (j + 1) + "\t\tB" + (i + 1) + "\t\t" + unused[i]);
                    break; // Process allocated, move to the next process
                }
            }
        }
        menu();
    }

    void BestFit() {
        int[] filled = new int[Bn];

        System.out.println("\nBest Fit\nProcess\tBlock\tUnused");

        for (int j = 0; j < Pn; j++) {
            int bestFitIndex = -1;
            int bestFitSize = Integer.MAX_VALUE;

            for (int i = 0; i < Bn; i++) {
                if (filled[i] == 0 && B[i] >= P[j] && B[i] - P[j] < bestFitSize) {
                    bestFitIndex = i;
                    bestFitSize = B[i] - P[j];
                }
            }

            if (bestFitIndex != -1) {
                filled[bestFitIndex] = 1;
                unused[bestFitIndex] = bestFitSize;
                System.out.println("P" + (j + 1) + "\t\tB" + (bestFitIndex + 1) + "\t\t" + unused[bestFitIndex]);
            }
        }
        menu();
    }

    void WorstFit() {
        int[] filled = new int[Bn];

        System.out.println("\nWorst Fit\nProcess\tBlock\tUnused");

        for (int j = 0; j < Pn; j++) {
            int worstFitIndex = -1;
            int worstFitSize = -1;

            for (int i = 0; i < Bn; i++) {
                if (filled[i] == 0 && B[i] >= P[j] && B[i] - P[j] > worstFitSize) {
                    worstFitIndex = i;
                    worstFitSize = B[i] - P[j];
                }
            }

            if (worstFitIndex != -1) {
                filled[worstFitIndex] = 1;
                unused[worstFitIndex] = worstFitSize;
                System.out.println("P" + (j + 1) + "\t\tB" + (worstFitIndex + 1) + "\t\t" + unused[worstFitIndex]);
            }
        }
        menu();
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n MEMORY ALLOCATION ALGORITHM \n1. First Fit\n2. Best Fit\n3. Worst Fit\n4. Exit\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    FirstFit();
                    break;
                case 2:
                    BestFit();
                    break;
                case 3:
                    WorstFit();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nHeh! You thought this hasn't been accounted for?");
            }
        }
    }

    public static void main(String[] args) {
        os8memoryallocP ob = new os8memoryallocP();
        ob.input();
        ob.menu();
    }
}