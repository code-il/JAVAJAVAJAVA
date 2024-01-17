import java.util.Scanner;
public class os1 {
    static void bsort(int job[],int bt[],int at[]){
        int l=job.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<(l-i-1);j++){
                if(at[j]>at[j+1]){
                    int temp_j=job[j];
                    job[j]=job[j+1];
                    job[j+1]=temp_j;

                    int temp_bt=bt[j];
                    bt[j]=bt[j+1];
                    bt[j+1]=temp_bt;

                    int temp_at=at[j];
                    at[j]=at[j+1];
                    at[j+1]=temp_at;
                }
            }
        }
    }
    public static void main(String[] args){
        int n;
        System.out.println("Enter number of jobs:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr1[]=new int[n];
        int j1[]=new int[n];
        int arr2[]=new int[n];
        int tat[]=new int[n];
        int wt[]=new int[n];
        int ct[]=new int[n];//Code of @@dil
        int ck=0;
        String ck1=new String();
        System.out.println("ARRIVAL TIME PROVIDED(Y/N):");
        ck1=sc.next();
        if(ck1=="Y"||ck1=="y"){
            ck=1;
        }
        else{
            ck=0;
        }
        for(int i=0;n>i;i++){
            System.out.println("enter:"+(i+1)+":Burst time:");
            arr1[i]=sc.nextInt();
            j1[i]= i+1;
            if(ck==1) {
                System.out.println("enter:" + (1 + i) + ":arrvial time:");
                arr2[i] = sc.nextInt();
            }else{
                arr2[i] =0;
            }
        }
        bsort(j1,arr1,arr2);
        ct[0]=arr1[0];
        for (int i=1;i<n;i++){
            ct[i]=ct[i-1]+arr1[i];
        }
        for (int i=0;i<n;i++){
            tat[i]=ct[i]-arr2[i];
        }
        for (int i=0;i<n;i++){
            wt[i]=tat[i]-arr1[i];
        }
        double totat=0;
        double totwt=0;
        for (int i=0;i<n;i++){
            totat=totat+tat[i];
            totwt=totwt+wt[i];
        }
        double avgtat=totat/n;
        double avgwt=totwt/n;
        System.out.println("TURN AROUND TIME:");
        for (int i=0;i<n;i++){
            System.out.print(tat[i]+" ");
        }
        System.out.println("\nWAIT TIME:");
        for (int i=0;i<n;i++){
            System.out.print(wt[i]+" ");
        }

        System.out.println("\nAVG TURN AROUND TIME:"+avgtat);
        System.out.println("\nAVG WAIT TIME:"+avgwt);

    }

}
