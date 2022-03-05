package practiceSessionMidterm1;

public class IntersectionOfArrays {

    /**
     * Write a function that takes two sorted arrays without duplicates and prints all the elements that occur in both arrays.
     * For instance, if we pass the following two sorted arrays to the method:
     * int[] arr1= {2, 10, 12, 34, 90};
     * int[] arr2 = {4, 6, 8, 10, 11, 12, 14, 20, 26, 30, 34, 48, 50};
     * then the method should print 10 12 34
     *
     * Note: your method should be general and work for any two sorted arrays of
     * integers. It is required that it runs in linear time: Theta(n1+n2),
     * where n1 and n2 are the sizes of the two lists and takes advantages of the fact that the input lists are sorted.
     * @param sortedArr1
     * @param sortedArr2
     */
    public static void printCommonElements(int[] sortedArr1, int[] sortedArr2) {
        int i = 0, j = 0;

        while (i < sortedArr1.length && j < sortedArr2.length) {
            if (sortedArr1[i] == sortedArr2[j]) {
                System.out.println(sortedArr1[i]);
                i++;
                j++;
            }
            else
                if (sortedArr1[i] < sortedArr2[j])
                    i++;
                else
                    j++;
        }
    }

    public static void main(String[] args) {
        int[] arr1= {2, 10, 12, 34, 90};
        int[] arr2 = {4, 6, 8, 10, 11, 12, 14, 20, 26, 30, 34, 48, 50};
        printCommonElements(arr1, arr2);
    }

}
