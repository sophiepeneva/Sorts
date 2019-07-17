# Sorts

public class QuickSort {

    private static int partition(int[] arr, int low, int high){
        int i = low -1;
        int pivot = arr[high];
        for (int j = low; j < high ; j++) {
            if(arr[j] <= pivot){
                i++;
                swap(i, j ,arr);
            }
        }
        swap(high, i +1, arr);
        return i+1;
    }


    public static void quickSort(int left, int right, int[] arr) {
        if (left < right) {
            int partition = partition(arr, left, right);
            quickSort(left, partition - 1, arr);
            quickSort(partition +1, right, arr);
        }
    }

}
