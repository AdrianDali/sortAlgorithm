/*
 * Algorithm
insertion sort is a simple sorting algorithm that works similar to the way
you sort playing cards in your hands. The array is virtually split into a sorted 
and an unsorted part. values from the unsorted part are picked and placed at the
correct position in the sorted part

To sort an array od size n in ascending order 
1: iterate from arr[1] to arr[n] over the array
2: compare the current element(key) to its predecessors
3: if the element is smaller than its predecessor, compare it to the 
elements before. Move the greater elements one position up to make space for the 
swapped element

12, 11, 13, 5, 6
Let us loop for i = 1 (second element of the array) to 4 (last element of the array)
i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12 
11, 12, 13, 5, 6
i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13 
11, 12, 13, 5, 6
i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position. 
5, 11, 12, 13, 6
i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position. 
5, 6, 11, 12, 13 
 */
package src;

/**
 *
 * @author Dali
 */
public class InsertionSort {
    Printear pr = new Printear();
    
    //  int arr[] = {12,11,13,5,6};
    public void sort(int arr[]){
        
        int n = arr.length;
        for(int i = 1; i < n; i++ ){
           // pr.printArray(arr);
            int key = arr[i]; //11 
            //System.out.println("key1  " + key);
            int j = i - 1;    //0
            //System.out.println("j en el for: " + j);
        
        
        /*move elements of arr[0..i-1], that are 
        greater than key, to one position ahead (adelante)
        of their current(actual) position */
        while (j >= 0 && arr[j] > key ){
            arr[j+1] = arr[j]; //11 = 12
            //System.out.println("J en while: " + j );
            j = j-1; //-1
            //System.out.println("j after: " + j);
            
        }
        arr[j+1] = key;
            //System.out.println("key " + key);
            
    }}
    
}
