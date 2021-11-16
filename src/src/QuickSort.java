/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.io.*;
/**
 *
 * @author hermo
 */
public class QuickSort {
    
    // A function to swap two elements
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /*this function takes last element as pivot, places 
    the pivot element at its correct position in sorted array, and places all smaller
    (smaller than pivot) to left of pivot and all greater elements to right 
    of pivot */
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        
        
        int i = (low - 1);
        
        for(int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i ++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, high);
        return(i+1);
                
        
    }
    static void quickSort(int[] arr, int low, int high){
        if(low< high){
            int pi = partition(arr,low, high);
            quickSort(arr,low,pi-1);
            quickSort(arr, pi + 1, high);
    }
    }
    
}
