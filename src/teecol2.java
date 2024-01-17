import java.util.*;
public class teecol2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
     /*ArrayList<String> arr1=new ArrayList<>();
        System.out.println("Enter size:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("enter element:"+(i+1));
            arr1.add(sc.next());
        }
        Random r1=new Random();
        int r2=0;
        r2=r1.nextInt(n);
        System.out.println("NAME IS:"+arr1.get(r2));
        ArrayList<Integer> arr2=new ArrayList<>();
        System.out.println("enter size:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the"+" "+(i+1)+" "+"element:");
            arr2.add(sc.nextInt());
        }
        int tot=0,avg=0;
        for(int i=0;i<n;i++){
            tot=tot+arr2.get(i);
        }
        avg=tot/n;
        String str;
        if(avg>=90){
            str="A";
        } else if (avg>=80 && avg<90) {
            str="B";
        } else if (avg>=70 && avg<80) {
            str="C";
        } else if (avg>=60 && avg<70) {
            str="D";
        } else if (avg>=50 && avg<60) {
            str="E";
        } else if (avg>=40 && avg<50) {
            str="E";
        } else{
            str="F";
        }
        System.out.println("THE AVG IS:"+avg+" "+"AND GRADE IS:"+str);*/
        ArrayList<Integer>arr3=new ArrayList<Integer>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            arr3.add(sc.nextInt());
        }
        ArrayList<Integer>current=new ArrayList<>();
        ArrayList<Integer>largets=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr3.get(i)==current.get(current.size()-1)+1){
                current.add(arr3.get(i));
            }else{
                if(current.size()>largets.size()){
                    largets=new ArrayList<>(current);
                }
                current=new ArrayList<>();
                current.add(arr3.get(i));
            }
        }
        if(current.size()>largets.size()){
            largets=new ArrayList<>(current);
        }
        System.out.println("Largest is:");
        for(int i=0;i< largets.size();i++){
            System.out.println(largets.get(i));
        }
    }
}
