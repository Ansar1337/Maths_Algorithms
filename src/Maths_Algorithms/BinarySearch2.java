package Maths_Algorithms;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 111};
        System.out.println(binarySearch(array, 3));
    }

    public static int binarySearch(int[] array, int item) {
        int low = 0;
        int guess = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high);
            guess = array[mid];
            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
                break;
            }
        }
        return guess;
    }
}
