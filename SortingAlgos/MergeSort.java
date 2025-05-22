public class MergeSort<T extends Comparable<T>> {
    // Sort in ascending order
    public static void mergeSort(T[] arr, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;

            // First half of array
            mergeSort(arr, start, mid);

            // Second half of array
            mergeSort(arr, mid, end);

            merge(arr, start, mid, end);
        }
    }

    public static void merge(T[] arr, int start, int mid, int end){
        T[] leftArray = (T[]) new Comparable[mid - start + 1];
        T[] rightArray = (T[]) new Comparable[end - mid];

        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = arr[start + i];
        }

        for(int j = 0; j < rightArray.length; i++){
            rightArray[i] = arr[mid + i + 1];
        }

        int left = 0, right = 0, current = start;

        while(left < leftArray.length && right < rightArray.length){
            if(leftArray[left].compareTo(rightArray[right]) <= 0){
                arr[current] = leftArray[left];
                left++;
            } else {
                arr[current] = rightArray[right];
                right++;
            }
        }

        while(left < leftArray.length){
            arr[current++] = leftArray[left++];
        }

        while(right < rightArray.length){
            arr[current++] = rightArray[right++];
        }
    }
}