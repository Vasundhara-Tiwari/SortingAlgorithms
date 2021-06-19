package main;

import sorting.BubbleSort;
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


        BubbleSort obj1 = new BubbleSort();
        int[] sortedArr = obj1.sort(arr);

        InsertionSort obj2 = new InsertionSort();
        arr = obj2.sort(arr);

        System.out.println("After performing insertion sort:- "+Arrays.toString(arr));
    }
}
