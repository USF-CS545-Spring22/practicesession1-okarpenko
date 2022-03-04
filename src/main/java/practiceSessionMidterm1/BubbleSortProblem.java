package practiceSessionMidterm1;

import java.util.Arrays;

public class BubbleSortProblem {
       /**
       * Fill in the missing code of the bubble sort so that it sorts the
        * subarray from index low to index arr.length-1 in descending order.
        * For instance, if the array is {4,19, 0, 3, 6, 2, 8} and low = 2,
        * the result should be: 4, 19, 8, 6, 3, 2, 0.
       * @param arr
       * @param low
       */
        public static void bubbleSortSubarrayDescending(int[] arr, int low) {
            // FILL IN CODE:
        }

    public static void main(String[] args) {
        int[] arr = {9, 5, 8, 1, 2, 15, 7, 13};
        bubbleSortSubarrayDescending(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
