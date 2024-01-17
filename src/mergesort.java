import java.util.*;
public class mergesort {

    void merge(int[] left, int[] right, int[] arr) {
        int sizeL = left.length;
        int sizeR = right.length;
        int i = 0, j = 0, k = 0;

        while (i < sizeL && j < sizeR) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

        while (i < sizeL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < sizeR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    void mergeSort(int[] A) {
        int size = A.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int[] L = new int[mid];
        int[] R = new int[size - mid];
        for (int i = 0; i < mid; i++) {
            L[i] = A[i];
        }
        for (int i = mid; i < size; i++) {
            R[i-mid] = A[i];
        }

        mergeSort(L);
        mergeSort(R);
        merge(L, R, A);
    }

    void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        mergesort ob = new mergesort();
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size: ");
        size = sc.nextInt();
        int[] arr;
        arr = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array: ");
        ob.display(arr);
        ob.mergeSort(arr);
        System.out.println("Sorted array: ");
        ob.display(arr);
    }
}