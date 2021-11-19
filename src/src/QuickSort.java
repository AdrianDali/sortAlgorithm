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
        //Change i for j and j for i
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /*this function takes last element as pivot, places 
    the pivot element at its correct position in sorted array, and places all smaller
    (smaller than pivot) to left of pivot and all greater elements to right 
    of pivot 
    
    int[] arr2 = {10,7,8,9,1,5}
    vuelrta dos = 1 5 8 9 10 7
    vuelta tre = 1  5 7 9 10 8
    vuelta cua = 1  5 7 8 10 9
    vuelta sin = 1  5  7 8 9 10
1    */
    static int partition(int[] arr, int low, int high){ 
        int pivot = arr[high];//5
        Printear prin = new Printear();
        
       
        int i = (low - 1);//  -1  --   1  --   2  --  3 
        
        for(int j = low; j <= high - 1; j++){
            System.out.println(j + "  j");
            if (arr[j] < pivot){ //10  <  5
                System.out.println(j + "  jjj");
                i ++;// 0
                System.out.println(j);
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, high);
        prin.printArray(arr);
        return(i+1);
                
        
    }
    static void quickSort(int[] arr, int low, int high){
        if(low< high){
            int pi = partition(arr,low, high);
            quickSort(arr,low,pi-1);//before pi 
            quickSort(arr, pi + 1, high);//after pi
    }
    }
    
}
