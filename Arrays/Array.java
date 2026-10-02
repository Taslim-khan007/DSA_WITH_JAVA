package Arrays;

// import java.util.*;

public class Array {

    public static void linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }

        System.out.println("Key not found");
    }

    public static void main(String args[]) {

        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        linearSearch(numbers, key);
    }
}