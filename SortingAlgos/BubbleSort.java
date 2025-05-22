public class BubbleSort<T> {
    // Sort in ascending order
    public static <T extends Comparable<T>> bubbleSort(T[] arr){
        boolean swap;
        for(int i = 0; i < arr.size() - 1; i++){
            swap = false;
            for(int j = 0; j < arr.size() - i - 1; j++){
                // arr[j] > arr[j + 1]
                if(arr[j].compareTo(arr[j + 1]) > 0){
                    int temp = arr[j]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if(!swap){
                break;
            }
        }
    }



}