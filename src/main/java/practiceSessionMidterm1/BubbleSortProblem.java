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
            for (int pos = low; pos < arr.length - 1; pos++) {
                for (int  j = arr.length - 1; j > pos; j--) {
                    if (arr[j]  > arr[j-1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = tmp;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int[] arr = {9, 5, 8, 1, 2, 15, 7, 13};
        bubbleSortSubarrayDescending(arr, 2);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {9, 5, 8, 1, 2, 15, 7, 13};
        bubbleSortSubarrayDescending(arr2, 0);
        System.out.println(Arrays.toString(arr2));
    }
}
