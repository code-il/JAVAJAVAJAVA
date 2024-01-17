public class mergesortshyam{
    public static void conquer(int arr[], int[] L, int[] R){
        //int merged[]=new int[ei-si+1];
        int idx1=L.length;
        int idx2=R.length;
        int x=0;
        while (idx1<=L.length && idx2<=R.length){
            if(arr[idx1]<=arr[idx2]){
                arr[x] = arr[idx1];
                x++;
                idx1++;
                //merged[x++]=arr[idx1++];
            }else{
                arr[x] = arr[idx2];
                x++;
                idx2++;
                //merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=L.length){
            arr[x] = arr[idx1];
            x++;
            idx1++;
            //merged[x++]=arr[idx1++];
        }
        while(idx2<=R.length){
            arr[x] = arr[idx2];
            x++;
            idx2++;
            //merged[x++]=arr[idx2++];
        }
        /*for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }*/
    }
    public static void divide(int arr[], int si, int ei){
        if(arr.length < 2){
            return;
        }

        //int mid=si+(ei-si)/2;
        int mid = arr.length/2;
        int[] L =new int[mid];
        int[] R = new int[ei-mid];
        for(int i=0;i<mid;i++){
            L[i]=arr[i];
        }
        for(int i=mid;i<ei;i++){
            R[i-mid]=arr[i];
        }
        divide(L,si,mid-1);
        divide(R,mid, ei);
        conquer(arr,L,R);
    }
    public static void main(String args[]){
        int arr[]={6,3,9,2,5,6,7};
        int n=arr.length;
        divide(arr,0,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}