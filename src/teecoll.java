import java.util.*;

public class teecoll {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    /*    ArrayList<String> arr1=new ArrayList<>();
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int n1,n2;
        for(int i=0;i<n;i++){
            System.out.println("Enter element:"+(i+1));
            arr1.add(i,sc.next());
        }
        System.out.println("The array is:"+arr1);
        System.out.println("enter starting");
        n1=sc.nextInt();
        System.out.println("enter ending");
        n2=sc.nextInt();
        List<String> arr2=arr1.subList(n1,n2);
        System.out.println("sublist is :"+arr2);
        System.out.println("-----------");
        ArrayList<String> arr2=new ArrayList<>();
        ArrayList<String> arr3=new ArrayList<>();
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        for(int i=0;i<n;i++){
            arr2.add(sc.next());
        }
        for(int i=0;i<n1;i++){
            arr3.add(sc.next());
        }
        boolean b=arr2.equals(arr3);
        System.out.println(b);
        Collections.swap(arr2,0,1);
        System.out.println(arr2);*/
        LinkedList<String>LL1=new LinkedList<>();
        LinkedList<String> LL2=new LinkedList<>();
        LinkedList<String> LL3=new LinkedList<>();
        int n3=sc.nextInt();
        for(int i=0;i<n3;i++){
            LL1.add(sc.next());
        }
        for(int i=n3-1;i>=0;i--){
            LL2.add(LL1.get(i));
        }
        Iterator<String> it= LL1.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println(LL2);
        Iterator<String> it1=LL1.listIterator();
        if(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
