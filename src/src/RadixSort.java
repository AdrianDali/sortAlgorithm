/*
El tiempo de ejecucion de radix sort
 */
package src;

import java.util.Arrays;

/**
 * O (nLog b (n)). Pero todavía no supera
 * a los algoritmos de clasificación basados ​​en
 * comparaciones. 
 * ¿Qué pasa si aumentamos el valor de b? 
 * ¿Cuál debería ser el valor de b para hacer 
 * lineal la complejidad del tiempo?
 * Si establecemos b como n, obtenemos la complejidad 
 * de tiempo como O (n). En otras palabras,
 * podemos ordenar una matriz de números enteros 
 * con un rango de 1 an c si los números están representados
 * en base n (o cada dígito toma log 2 (n) bits). 
 */
public class RadixSort {
    
    //A utility function to get maximum value in arr[]
    static int getMax(int arr[],int n){
        int mx = arr[0];
        for(int i=0; i<n;i++){
            if(arr[i] > mx )
                mx = arr[i];
        }
        return mx;
    }
    
    //A function to do counting sort of arr[] according to
    // the digit represented by exp
    static void countSort(int arr[], int n, int exp){
        
        int output[] = new int[n]; //output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
        
        // Store count of occurrence in count[]
        for(i = 0; i < n;i++){
            count[(arr[i]/exp) % 10]++;
        }
        //Change count[i] so thaht count[i] now contains
        // actual position of this digit in output[]
        for ( i = 1; i < 10; i++) {
            count[i] += count[i-1];    
        }
        
        //built the output array 
        for(i =n -1;i >=0; i--){
            output[count[(arr[i] / exp ) % 10]-1] = arr[i];
            count[(arr[i] / exp) % 10] --;
        }
        //copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to current digit
        for ( i = 0; i < n; i++) {
            arr[i] = output[i];
            
        }
    }   
    //the main function to thaht sorts arr[] of size n using
    //radix Sort
    static void radixsort(int arr[], int n){
        //find the maximum number to know number of digits
        int m = getMax(arr,n);
        
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed 
        // exp is 10^i where i is current digint number 
        for(int exp = 1; m / exp > 0; exp *= 10){
            
            countSort(arr,n,exp);
            System.out.println("m / exp: " + m / exp );
            System.out.println("exp: " + exp );
            System.out.println("m: " + m );
        }
    }
}


    