/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Dali
 */
public class SelectionSort {

    public void sort(int arr[]) {
        int n = arr.length;
        // boundary of unsorted subarray
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
