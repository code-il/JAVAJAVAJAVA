import java.util.*;

public class maxmin {
    void method1(int A[]){
        int max=A[0];
        int min=A[0];
        for(int I=1;I<A.length;I++){
            if(A[I]>max)
                max=A[I];
            else if (A[I]<min)
                min= A[I];
        }
        System.out.println("MAX:"+max+"\tMIN:"+min);

    }
    int [] dnc_minmax(int A[],int i,int j){
        int r[]=new int[2];
        int mid;

        if(i==j){
            r[0]=A[i];
            r[1]=A[j];
        }
        else if(j==i+1){
            if(A[i]>A[j]){
                r[0]=A[j];
                r[1]=A[i];
            }
            else{
                r[0]=A[i];
                r[1]=A[j];
            }
        }
        else{
            mid=(i+j)/2;
            int [] lm=dnc_minmax(A,i,mid);
            int [] rm=dnc_minmax(A,mid+1,j);
            r[0]=Math.min(lm[0],rm[0]);
            r[1]=Math.max(lm[1],rm[1]);
        }
        return r;
    }

    public static void main(String[] args){
        maxmin ob=new maxmin();
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size:");
        size=sc.nextInt();
        int arr[];
        arr=new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        ob.method1(arr);
        int result[]=ob.dnc_minmax(arr,size,size-1);
        System.out.println("MAX:"+result[1]+"\tMIN:"+result[0]);
    }
}
