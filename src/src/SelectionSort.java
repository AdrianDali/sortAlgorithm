/*
 * SELECTION SORT 
The selection sort algorithm sorts an array by repeatedly finding the minimum
element (considering ascending order) from unsorted part and putting it at the beginning.
The algorithm  maintains two subarrays in a given array 
    1) the subarray which is already sorted
    2) Remaining subarray which is unsorted

in every iteration od selection sort, the minimum element from the unsorted subarray
is picked and moved to the sorted subarray

 */
package src;

/**
 *
 * @author Dali
 */
public class SelectionSort {

    public void sort(int arr[]) {
        int n = arr.length;
        // boundary of unsorted subarray, scrolls right
        for (int i = 0; i < n - 1; i++) {

            //find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }

    }
    
    //print de array 
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]+ "  ");
            
        }
        System.out.println();
    }

}
