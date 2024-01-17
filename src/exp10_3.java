import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class exp10_3 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> a1=new ArrayList<>();
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter"+" "+(i+1)+" "+"marks");
            a1.add(sc.nextInt());
        }



        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<Integer> largest = new ArrayList<>();
        //current.add(numArr.get(0));
        for (int i = 0; i < n; i++) {
            if (i > 0 && a1.get(i) == current.get(current.size()-1) + 1)
                current.add(a1.get(i));
            else {
                if (current.size() > largest.size()) {
                    largest = new ArrayList<>(current);
                }
                current = new ArrayList<>();
                current.add(a1.get(i));
            }
        }

        if (current.size() > largest.size()) {
            largest = new ArrayList<>(current);
        }

        System.out.println("Largest subsequence is:");
        for (int i = 0; i < largest.size(); i++) {
            System.out.print(largest.get(i) + " ");
        }
        System.out.println();
    }
}
