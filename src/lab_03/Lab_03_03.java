package lab_03;

import java.util.Arrays;

public class Lab_03_03 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};
        int lengthArr = intArr.length;
        for (int unsortedIndex = lengthArr - 1; unsortedIndex > 0; unsortedIndex--) {
            for (int innerIndex = 0; innerIndex < unsortedIndex; innerIndex++) {
                if (intArr[innerIndex] > intArr[innerIndex + 1]) {
                    int temp = intArr[innerIndex];
                    intArr[innerIndex] = intArr[innerIndex + 1];
                    intArr[innerIndex + 1] = temp;
                }
            }
        }
        System.out.println("Array after sort is " + Arrays.toString(intArr));
    }
}
