import java.util.Scanner;

public class os8unequal {
    int n,m;
    int [] block;
    int [] psize;
    int [] visited;
    int [] unused;
    void firstfit(){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[j]!=1 && block[j] >= psize[i]) {
                    unused[j] = block[j] - psize[i];
                    visited[j] = 1;
                    break;
                }
            }
        }


        //int unused=0;
        int tot=0;
        for(int i=0;i<n;i++){
            //unused=unused+block[i];
            if(unused[i]==0){
                tot=block[i]+tot;
            }else {
                System.out.println("B"+(i+1)+":"+unused[i]);
                tot = unused[i] + tot;
            }
        }
        System.out.println("total unused for first fit :"+tot);
    }

    void bestfit(){
        int[] filled = new int[n];

        System.out.println("\nBest Fit\nProcess\tBlock\tUnused");

        for (int j = 0; j < m; j++) {
            int bestFitIndex = -1;
            int bestFitSize = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (filled[i] == 0 && block[i] >= psize[j] && block[i] - psize[j] < bestFitSize) {
                    bestFitIndex = i;
                    bestFitSize = block[i] - psize[j];
                }
            }

            if (bestFitIndex != -1) {
                filled[bestFitIndex] = 1;
                unused[bestFitIndex] = bestFitSize;
                System.out.println("P" + (j + 1) + "\t\tB" + (bestFitIndex + 1) + "\t\t" + unused[bestFitIndex]);
            }
        }

    }
    void worstfit() {
        int[] filled = new int[n];

        System.out.println("\nWorst Fit\nProcess\tBlock\tUnused");

        for (int j = 0; j < m; j++) {
            int worstFitIndex = -1;
            int worstFitSize = -1;

            for (int i = 0; i < n; i++) {
                if (filled[i] == 0 && block[i] >= psize[j] && block[i] - psize[j] > worstFitSize) {
                    worstFitIndex = i;
                    worstFitSize = block[i] - psize[j];
                }
            }

            if (worstFitIndex != -1) {
                filled[worstFitIndex] = 1;
                unused[worstFitIndex] = worstFitSize;
                System.out.println("P" + (j + 1) + "\t\tB" + (worstFitIndex + 1) + "\t\t" + unused[worstFitIndex]);
            }
        }

    }

    public static void main(String[] args){
        os8unequal ob=new os8unequal();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF BLOCKS:");
        ob.n=sc.nextInt();//number of blocks
        System.out.println("ENTER NUMBER OF PROCESSES:");
        ob.m=sc.nextInt();
        System.out.println("ENTER BLOCKS");
        ob.block=new int[ob.n];
        ob.visited=new int[ob.n];
        ob.unused = new int[ob.n];
        for(int i=0;i<ob.n;i++){
            System.out.println("BLOCK:"+(i+1)+" :");
            ob.block[i]=sc.nextInt();
        }
        System.out.println("ENTER PROCESS SIZE");
        ob.psize=new int[ob.m];
        for(int i=0;i<ob.m;i++){
            System.out.println("PROCESS SIZE FOR p:"+(i+1)+" :");
            ob.psize[i]=sc.nextInt();
        }

        while (true) {
            System.out.print("\n MEMORY ALLOCATION ALGORITHM \n1. First Fit\n2. Best Fit\n3. Worst Fit\n4. Exit\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ob.firstfit();
                    break;
                case 2:
                    ob.bestfit();
                    break;
                case 3:
                    ob.worstfit();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nINVALID");
            }
        }
    }

}
