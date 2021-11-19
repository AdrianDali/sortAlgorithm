package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hermo
 */
public class MergeSort {
    
      int[] arr3 = {12,11,16,5,6,7};
    
    //Merges two subarrays of arr[]
    //first subarray is arr[l..m]
    //second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r){
        
        // Find sizes of tho subarrays to be merged
        int n1 = m-l +1;
        int n2 = r - m;
        
        /*Create temp arrays*/
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        /*Copy data to temps arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m+1+j];
        
        //Merge the temps arrays
        
        //initial indexes of first and second subarrays
        int i =0, j=0 ;
        
        //initial index of merged subarray array
        int k =l ;
        while (i<n1 && j< n2) {
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
            
        }
           /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    
        
                
    }
    
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    
}
