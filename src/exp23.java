import java.util.Scanner;
class lands {
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

public class exp23 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lands obj = new lands();
        System.out.print("Enter size:");
        obj.s = sc.nextInt();
        System.out.print("enter elements:");
        obj.arr1 = new int[obj.s];
        for (int i = 0; i < obj.s; i++) {
            obj.arr1[i] = sc.nextInt();
        }
        obj.perform();
        System.out.println("LARGEST is:");
        System.out.print(obj.arr1[obj.s-1]);
        System.out.println("SMALLEST is:");
        System.out.print(obj.arr1[0]);
    }
}
