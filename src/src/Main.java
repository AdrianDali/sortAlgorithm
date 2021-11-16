/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author hermo
 */
 
public class Main {
  
    public static void main(String[] args) {
        Printear printarr = new Printear();
        //---------------------------------------
        int arr[] = {12,11,13,5,6};
        //SelectionSort sortOne = new SelectionSort();
        //sortOne.sort(arr);
        //sortOne.printArray(arr);
        //--------------------------------------
        //InsertionSort sortTwo = new InsertionSort();
        //sortTwo.sort(arr);
        //printarr.printArray(arr);
        //-------------------------------------
        int[] arr2 = {10,7,8,9,1,5};
        int n = arr2.length;
        QuickSort sortThree = new QuickSort();
        sortThree.quickSort(arr,0,n-1);
        System.out.println("Sorted array: ");
        printarr.printArray(arr2);
        
        
    }   
}


