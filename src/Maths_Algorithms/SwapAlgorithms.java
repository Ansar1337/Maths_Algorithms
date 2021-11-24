package Maths_Algorithms;

public class SwapAlgorithms {
    public static void main(String[] args) {
        swap(1, 2);
        swap(-1, 2);
        swapTemp(-1, -2);
        swapTemp(-10, -33);
        swap3(1, 2);
        swap2("Hello", "World");
    }

    // Swapping two integers
    public static void swap(int a, int b) {
        a = a + b - (b = a);
        System.out.println(a + ":" + b);
    }

    // Swapping two integers using a third value
    public static void swapTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + ":" + b);
    }

    // Swapping two integers using array and for loop
    public static void swap3(int a, int b) {
        int[] arr = {a, b};
        int src = 0;
        int temp = arr[src];
        arr[0] = arr[1];
        arr[1] = temp;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    // Swapping two Strings
    public static void swap2(String a, String b) {
        a = a + b;
        b = a.substring(0, (a.length() - b.length()));
        a = a.substring(b.length());
        System.out.println(a + ":" + b);
    }
}