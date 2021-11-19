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
 public class Printear{
    public void printArray(int arr[]){
        int n = arr.length;
        System.out.print("ARR: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}