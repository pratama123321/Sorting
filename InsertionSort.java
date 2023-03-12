package Github.Sorting;

import java.util.Arrays;

class InsertionSort {

    // Clean Code (Just Code)
    public static int[] sort(int[] array) {

        for(var i = 0; i < array.length - 1; i++) {
            for(var j = i; j >= 0; j--) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    // Function step by step
    // Call this function if you want to see complete sorting proses
    public static int[] insertionSortAlgorithm(int[] array) {

        System.out.println("Original Array\t: " + Arrays.toString(array) + "\n");
        
        for(var i = 0; i < array.length - 1; i++) {
            for(var j = i; j >= 0; j--) {
                System.out.println(
                    "Inner loop\t: Compare (n + 1) < n : " + (array[j + 1]) + " < " + array[j]
                    + (array[j] > array[j + 1] ? "\t=> swap" : "")
                );
                if(array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }
            System.out.println("\n" + Arrays.toString(array) + "\n");
        }
        System.out.println();

        return array;
    }
}
