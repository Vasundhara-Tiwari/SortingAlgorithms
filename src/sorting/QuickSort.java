package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for (int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }
}
