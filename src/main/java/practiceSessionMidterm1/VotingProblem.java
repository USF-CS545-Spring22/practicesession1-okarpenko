package practiceSessionMidterm1;

import java.util.Arrays;

public class VotingProblem {
    // Please see the description on Canvas, it is too long to include it here
    public static String sortAndFindWinner (String[] votes) {

        // First, sort A and not A-s  - just like we sorted As and Bs in class
        int indexAfterLastA = sortHelper(0, votes, "A");
        //System.out.println(Arrays.toString(votes)); // A-s are in front now
        //System.out.println(indexAfterLastA);

        // Now sort B-s and C-s starting at index j = indexAfterLastA
        int indexAfterLastB = sortHelper(indexAfterLastA, votes, "B");
        System.out.println(Arrays.toString(votes)); // the list is now sorted
        //System.out.println(indexAfterLastB);

        int numAs  = indexAfterLastA;
        int numBs = indexAfterLastB - indexAfterLastA;
        int numCs = votes.length  - numAs - numBs;
        System.out.println("numAs = " + numAs + ", numBs = " + numBs + ", numCs = " + numCs);

        if (numAs >= numBs) {
            if (numAs >= numCs)
                return "A";
            else // numAs < numCs
                return "C";
        }
        else  // numAs < numBs
            if (numBs >= numCs)
                return "B";
            else
                return "C";

    }

    /** Rearranges the array so that all characters equal to the given letter are in front */
    public static int sortHelper(int startIndex, String[] votes, String letter) {
        int i = startIndex;
        int j = votes.length - 1;

        while (i < j) { // keep going until i == j
            // Move i as long as it is looking at an given letter
            while ((i < j) && (votes[i].equals(letter))) {
                i++;
            }
            // Move j as long as it is looking at a character not equal to the given letter
            while ((i < j) && (!votes[j].equals(letter))) {
                j--;
            }

            // Swap
            if (i < j) {
                String tmp = votes[i];
                votes[i] = votes[j];
                votes[j] = tmp;
            }
        }
        return i; // index after the last occurrence of the letter
    }

    public static void main(String[] args) {
        //String[] votes = {"A", "A", "B", "A", "B", "C", "B", "A", "A", "B", "C", "B", "C", "A"};
        String[] votes = {"C", "A", "C", "A", "B", "A", "B", "C", "C", "B", "C", "C", "A", "B", "C", "B", "C", "A", "A"};

        System.out.println("The winner is  " + sortAndFindWinner(votes));
    }
}
