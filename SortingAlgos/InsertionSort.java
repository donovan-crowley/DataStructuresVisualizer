public class InsertionSort<T> {
    // Sort in ascending order
    public static <T extends Comparable<T>> insertionSort(T[] arr){
        for(int i = 1; i < arr.size(); i++){
            T key = arr[i];
            int j = i - 1;

            // j >= 0 and arr[j] > key
            while(j >= 0 && arr[j].compareTo(key) > 0){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}