package Maths_Algorithms;

import java.util.Arrays;

/**
 * description:
 *
 * <p>absMin([0, 5, 1, 11]) = 0, absMin([3 , -10, -2]) = -2
 */
public class AbsoluteMin {
    public static void main(String[] args) {
        int[] testnums = {4, 0, 16, -10, -3};
        absMin(testnums);
        System.out.println("absMin(" + Arrays.toString(testnums) + ") = " + absMin(testnums));

        int[] numbers = {3, -10, -2};
        System.out.println("absMin(" + Arrays.toString(numbers) + ") = " + absMin(numbers));
    }

    /**
     * get the value, returns the absolute min value min
     *
     * @param numbers contains elements
     * @return the absolute min value
     */
    public static int absMin(int[] numbers) {
        int absMinValue = numbers[0];
        for (int i = 1; i < numbers.length; ++i) {
            if (Math.abs(numbers[i]) < Math.abs(absMinValue)) {
                absMinValue = numbers[i];
            }
        }
        return absMinValue;
    }
}