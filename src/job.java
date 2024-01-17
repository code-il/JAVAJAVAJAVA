import java.util.Scanner;
public class job {
    public static void bubble_sort(int[] d,int[] p,int[] job,int t){
        int size = d.length;
        for(int i = 0;i < size-1;i++){
            for(int j=0;j<(size-i-1);j++){
                if(d[j]<d[j+1]){
                    int temp_d = d[j];
                    d[j] = d[j+1];
                    d[j+1] = temp_d;

                    int temp_p=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp_d;

                    int temp_j=job[j];
                    job[j]=job[j+1];
                    job[j+1]=temp_j;

                }
            }
        }


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] duration;
        int[] profit;
        int[] job;
        int totprof;
        int n;
        //input
        System.out.print("size of array \nenter size:");
        n = sc.nextInt();
        duration = new int[n];
        profit = new int[n];
        job = new int[n];

        System.out.print("Enter total profit:");
        totprof = sc.nextInt();

        System.out.print("input for duration profit and job\n");
        for (int i = 0;i<n;i++){
            System.out.print("enter duration");
            duration[i]=sc.nextInt();
            System.out.print("profit input");
            profit[i]= sc.nextInt();
            System.out.print("enter job");
            job[i]=sc.nextInt();
        }
        
    }
}
