package Github.Sorting;

import java.util.Arrays;

class SelectionSort {

    // Clean Code (Just Code)
    public static int[] sort(int[] numbers) {
        
        int len = numbers.length;        
        for(var i = 0; i < (len - 1); i++) {
            int small = i;
            for(var j = (i + 1); j < len; j++) {
                if(numbers[j] < numbers[small]) small = j;
            }
            if(numbers[i] > numbers[small]) {
                int temp = numbers[small];
                numbers[small] = numbers[i];
                numbers[i] = temp;
            }
        }
        return numbers;
    }

    // Function step by step
    // Call this function if you want to see complete sorting proses
    public static int[] SelectionSortAlgorithm(int[] numbers) {

        System.out.println("Original Array\t: " + Arrays.toString(numbers) + "\n");

        int len = numbers.length;
        
        for(var i = 0; i < (len - 1); i++) {
            int small = i;

            System.out.println("Comparison\t: " + numbers[small]);
            
            for(var j = (i + 1); j < len; j++) {
                System.out.println(
                    "Inner loop Selection\t: " + numbers[small] + " > " + numbers[j]
                    + (numbers[j] < numbers[small] ? " => swap" : "") 
                );
                if(numbers[j] < numbers[small]) small = j;
            }

            System.out.println("Smallest\t: " + numbers[small]);
            System.out.println("-----------------------------------------");
            System.out.println(
                "Swapping out\t: " + numbers[i] + " > " + numbers[small] + "  => "
                + (numbers[i] > numbers[small] ? "swap" : "doing nothing") + "\n"
            );

            if(numbers[i] > numbers[small]) {
                int temp = numbers[small];
                numbers[small] = numbers[i];
                numbers[i] = temp;
            }   
            System.out.println("\nStep " + (i + 1) + "\t: " + Arrays.toString(numbers) + "\n\n");
        }

        return numbers;
    }
}
