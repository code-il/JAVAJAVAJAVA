public class dandq {
    void merge(int array[],int p,int q,int r){
        int n1=q-p+1;
        int n2=r-p;
        
    }
    void mergesort(int array[],int left,int right){
        if(left>right) {
            int mid = (left + right) / 2;
            mergesort(array,left,right);
            mergesort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }
    public static void main(){
        int arr1[]={7,8,3,5,1};
         dandq ob=new dandq();

         ob.mergesort(arr1,0,arr1.length-1);


    }

}
