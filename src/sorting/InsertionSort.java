package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        InsertionSort is = new InsertionSort();

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(is.sort(arr)));
    }
}
