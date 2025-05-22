public class QuickSort<T extends Comparable<T>> {
    // Sort in ascending order
    public static void quickSort(T[] arr, int low, int high){
        if(low < high){
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(T[] arr, int low, int high){
        T pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(arr[j].compareTo(pivot) <= 0){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}