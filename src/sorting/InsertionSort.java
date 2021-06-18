package sorting;

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
}
