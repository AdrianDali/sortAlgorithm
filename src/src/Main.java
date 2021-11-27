/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import com.sun.scenario.effect.Merge;
import static src.RadixSort.radixsort;

/**
 *
 * @author hermo
 */
 
public class Main {
  
    public static void main(String[] args) {
        Printear printarr = new Printear();
        //---------------------------------------
        //int arr[] = {12,11,13,5,6};
        //SelectionSort sortOne = new SelectionSort();
        //sortOne.sort(arr);
        //sortOne.printArray(arr);
        //--------------------------------------
        //InsertionSort sortTwo = new InsertionSort();
        //sortTwo.sort(arr);
        //printarr.printArray(arr);
        //-------------------------------------
        //int[] arr2 = {10,7,8,9,1,5};
        //int n = arr2.length;
        
        //QuickSort sortThree = new QuickSort();
        //sortThree.quickSort(arr2,0,n-1);
        //System.out.println("Sorted array: ");
        //printarr.printArray(arr2);
        //---------------------------------------------------
        //int[] arr3 = {12,11,9,5,7,6};
        //System.out.println("Arr");
        //printarr.printArray(arr3);
        
        //MergeSort merge = new MergeSort();
        //merge.sort(arr3, 0, arr3.length-1);
        
        //printarr.printArray(arr3);
        //------------------------------------------------------
        //divide and code
        int arr[] = {170,45,75,90,802,24,2,66};
        int n = arr.length;
        
        // Function Call
        radixsort(arr,n);
        printarr.printArray(arr);
        
    }   
}


