import java.util.*;
public class jobseq {
    static void bsort(int d[],int p[],int J[]){
        int size=p.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<(size-i-1);j++){
                if(p[j]<p[j+1]){
                    int temp_p=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp_p;

                    int temp_d=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp_d;

                    int temp_j=J[j];
                    J[j]=J[j+1];
                    J[j+1]=temp_j;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] duration;
        int [] profit;
        int [] job;
        int [] x;
        int n;
        System.out.println("Enter size:");
        n=sc.nextInt();
        duration=new int[n];
        profit= new int[n];
        job= new int[n];
        x= new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            System.out.println("enter duration "+(i+1)+":");
            duration[i]= sc.nextInt();
            System.out.println("enter profit "+(i+1)+":");
            profit[i]= sc.nextInt();
            job[i]=(i+1);

        }
        bsort(duration,profit,job);
        int m=duration[0];
        for(int i=1;i<n;i++){
            if(duration[i]>m){
                m=duration[i];
            }
        }
        for(int i=0;i<n;i++ ){
            for(int j=duration[i]-1;j>=0;j--){
                if(x[j]==0){
                    x[j]=job[i];
                }
            }
        }
        double t=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x[i]==job[j]){
                    t+=profit[j];
                }
            }
        }
        System.out.print("\nJob Sequence: ");
        for(int i=0;i<m;i++){
            System.out.print("J"+x[i]+" ");
        }
        System.out.println("\nTotal profit: "+t);
    }
}
