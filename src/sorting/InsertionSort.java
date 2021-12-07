package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public int[] sort(int[] arr){

        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
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
