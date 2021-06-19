package main;

import sorting.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array before sorting:- ");
        System.out.println(Arrays.toString(arr));

        InsertionSort obj = new InsertionSort();
        arr = obj.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
