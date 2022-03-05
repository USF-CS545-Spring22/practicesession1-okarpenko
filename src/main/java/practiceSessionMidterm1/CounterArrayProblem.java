package practiceSessionMidterm1;

import java.util.Arrays;

public class CounterArrayProblem {
    /**Assume the range of values in the array of integers arr is from 1 to m,
     and that you have a modified counter array counter from counting sort
     computed by first incrementing counter[arr[i]] for each element of arr[i] and
     then setting each element of counter for i from 1 to m to:
     counter[i] = counter[i] + counter[i-1].
     Write a function numBetween(int counter[], int m, int low, int high) that takes
     as input this counter array, m, and two values low and high,
     and returns the number of elements in the original list arr
     whose values are between low and high, inclusive.
     Array arr may contain duplicates, and you should be able to handle this.
     Running time of your function should be constant, Θ(1).
    */
    public static int numBetween(int[] counter, int m, int low, int high) {
        // Correction: m is not required to solve the problem

        // Consider the input array given in the main method [8, 4, 7, 1, 3, 4, 5, 4, 1, 6, 0, 1, 5, 4, 7],  assume
        // the keys range from 0 to 8, and consider the corresponding counter array: [1, 4, 4, 5, 9, 11, 12, 14, 15].
        // Observe c[i] contains the the number of elements in the original array that are less or equal to i.
        // So c[high] contains the number of elements that are less than  or equal to high.
        // For instance, to compute how many values we have that are less than or equal to 2,
        // we can access c[2] = 4 (and indeed, in A, we have four numbers that are 2 or less:  0, 1, 1, 1).

        //To compute the number of values in the range from low to high (inclusive),
        // we can access c[high] to get the total number of values that are less than or equal to high,
        // and then subtract the number of values that are strictly less than low - this value is stored in c[low - 1].
        if (low == 0)
            return counter[high];
        else
            return counter[high] - counter[low - 1];
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 1, 3, 4, 5, 4, 1, 6, 0, 1, 5, 4, 7};
        int[] counter = new int[9];
        for (int i = 0; i < arr.length; i++)
            counter[arr[i]]++;
        for (int k = 1; k < counter.length; k++)
            counter[k] = counter[k] + counter[k-1];
        System.out.println(Arrays.toString(counter));
        int res = numBetween(counter, 8, 4, 5);
        System.out.println(res);
    }
}

