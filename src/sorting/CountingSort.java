package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    static void sort(int arr[])
    {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));


        sort(arr);

        System.out.print("Sorted array is ");
        System.out.println(Arrays.toString(arr));
    }
}
