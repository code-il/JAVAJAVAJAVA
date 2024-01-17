import java.util.Scanner;

public class os2SJF {
    public static void sort(int b[]){
        int l=b.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<(l-i-1);j++){
                if(b[j]>b[j+1]){

                    int temp_bt=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp_bt;

                }
            }
        }
    }

    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of jobs:");
        n=sc.nextInt();
        int [] BT=new int[n];
        int ct[]=new int[n];
        int tat[]=new int[n];
        int wt[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter:"+(i+1)+": Burst Time:");
            BT[i]=sc.nextInt();
        }
        sort(BT);//code of aadil
        ct[0]=BT[0];
        for (int i=1;i<n;i++){
            ct[i]=ct[i-1]+BT[i];
        }
        for (int i=0;i<n;i++){
            tat[i]=ct[i];
        }
        for (int i=0;i<n;i++){
            wt[i]=tat[i]-BT[i];
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
