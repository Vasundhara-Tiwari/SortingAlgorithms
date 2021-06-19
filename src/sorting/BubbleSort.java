package sorting;

public class BubbleSort {
    public int[] sort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j = 0; j <arr.length-i; j++){
                int temp = arr[j];
                arr[j] = arr[j +1];
                arr[j +1]=temp;
            }
        }
        return arr;
    }
}
