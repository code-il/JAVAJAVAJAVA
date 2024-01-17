
import java.util.Scanner;
class a2 {
    int arr1[];
    int s;
    int secondlarge;

    public void perform() {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < (s - 1 - i); j++) {
                if (arr1[j] > arr1[j+1]) {
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;

                }
            }
        }
    }
}

public class exp22 {
        static public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            a2 obj = new a2();
            System.out.print("Enter size:");
            obj.s = sc.nextInt();
            System.out.print("enter elements:");
            obj.arr1 = new int[obj.s];
            for (int i = 0; i < obj.s; i++) {
                obj.arr1[i] = sc.nextInt();
            }
            obj.perform();
            System.out.print(obj.arr1[obj.s-2]);
        }
}