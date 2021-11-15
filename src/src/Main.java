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
        int arr[] = {64,25,12,22,11};
        SelectionSort sortOne = new SelectionSort();
        sortOne.sort(arr);
        sortOne.printArray(arr);
        
        
    }   
}
