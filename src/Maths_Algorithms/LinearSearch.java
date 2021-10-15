package Maths_Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99};
        int searchElement = 22;
        System.out.println(searchElement + " is found at index " + linearSearch(array, 22));
    }

    public static int linearSearch(int[] array, int searchElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }
}