package Maths_Algorithms;

/**
 * Calculate average of a list of numbers
 */
public class Average {
    private static final double SMALL_VALUE = 0.00001f;

    public static void main(String[] args) {
        double[] array1 = {3, 6, 9, 12, 15, 18, 21};
        System.out.println("The average of double array is: " + average(array1));
        int[] array = {2, 4, 10};
        System.out.println("The average of int array is: " + average(array));
    }

    /**
     * Calculate average of a list of numbers
     *
     * @param numbers array to store numbers
     * @return mean of given numbers
     */
    public static double average(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /**
     * find average value of int array
     *
     * @param array the array contains element and the sum does not excess long value limit
     * @return average value
     */
    public static int average(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return (int) (sum / array.length);
    }
}
