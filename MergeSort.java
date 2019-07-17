# Sorts

public class MergeSort {

public static void mergeSort(int left, int right, int[] arr) {
        if (left >= right) return;
        int middle = (left + right) / 2;
        mergeSort(left, middle, arr);
        mergeSort(middle + 1, right, arr);
        merge(left, right, middle, arr);
    }

    private static void merge(int left, int right, int middle, int[] arr) {
        int leftIdx = left;
        int rightIdx = middle + 1;
        int[] temp = new int[right - left + 1];
        int idx = 0;
        while (leftIdx <= middle && rightIdx <= right) {
            if (arr[leftIdx] < arr[rightIdx]) {
                temp[idx++] = arr[leftIdx++];
            } else {
                temp[idx++] = arr[rightIdx++];
            }
        }
        int rem = (leftIdx <= middle) ? leftIdx : rightIdx;
        for (int i = idx; i < temp.length; i++) {
            temp[i] = arr[rem++];
        }
        int counter = left;
        for (int i = 0; i < temp.length; i++) {
            arr[counter++] = temp[i];
        }
    }
    
}
