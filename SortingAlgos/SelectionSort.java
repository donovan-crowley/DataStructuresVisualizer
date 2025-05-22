public class SelectionSort<T> {
    // Sort in ascending order
    public static <T extends Comparable<T>> selectionSort(T[] arr){
        for(int i = 0; i < arr.size() - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.size(); j++){
                // arr[j] < arr[minIndex]
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}