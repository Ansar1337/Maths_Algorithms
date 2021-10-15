package Maths_Algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        int searchElement = 99;
        System.out.println(searchElement + " is found at index " + binarySearch(array, 99));
    }

    public static int binarySearch(int[] array, int searchElement) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == searchElement) {
                return middleIndex;
            } else if (array[middleIndex] < searchElement) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > searchElement) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}