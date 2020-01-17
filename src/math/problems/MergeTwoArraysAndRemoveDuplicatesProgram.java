package math.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args) {

        int[] arrayA = new int[]{1, 3, 4};
        int[] arrayB = new int[]{4, 5, 6, 7, 8};
        int[] mergedArray = mergedArrayAndRemoveDuplicates(arrayA, arrayB);
        System.out.println("ArrayA: " + Arrays.toString(arrayA));
        System.out.println("ArrayB: " + Arrays.toString(arrayB));
        System.out.println("sorted merged arrays with no duplicates : ");
        System.out.println("ArrayA: " + Arrays.toString(mergedArray));
    }

    public static int[] mergedArrayAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
        return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();
    }


}
