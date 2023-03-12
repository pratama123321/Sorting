package Github.Sorting;

import java.util.Arrays;

public class BubbleSort {

    // Clean Code (Just Sort)
    public static int[] sort(int[] array) {

        for(var i = 1; i < array.length; i++) {
            for(var j = 0; j < (array.length - i); j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    
    // Function step by step 
    // Call this function if you want to see complete sorting proses
    public static int[] bubbleSortAlgorithm(int[] array) {
        
        System.out.println("Original Array\t: " + Arrays.toString(array) + "\n");

        for(var i = 1; i < array.length; i++) {
            for(var j = 0; j < (array.length - i); j++) {
                System.out.println(
                    "Inner loop " + (j + 1) + "\t: Compare n > (n + 1) : " + array[j] + " > " + array[j + 1]
                    + (array[j] > array[j + 1] ? "\t=> swap" : "")
                );
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("\nStep " +  i + "\t: " + Arrays.toString(array) + "\n");
        }
        return array;
    }
}
