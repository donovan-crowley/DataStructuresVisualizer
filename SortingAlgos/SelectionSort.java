public class SelectionSort<T extends Comparable<T>> {
    // Sort in ascending order
    public static void selectionSort(T[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length); j++){
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