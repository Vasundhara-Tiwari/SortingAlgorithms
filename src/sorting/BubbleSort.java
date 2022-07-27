package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public int[] sort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j = 0; j <arr.length-i-1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j +1]=temp;
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

        BubbleSort bs = new BubbleSort();
        bs.sort(arr);

        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }
}
