package Arrays;

// import java.util.*;

public class Array {

    public static void getLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };

        getLargest(numbers);
    }
}