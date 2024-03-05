

import java.util.Scanner;

public class DynamicInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dynamically sorting while inserting elements:\n");

        System.out.println("Enter the number of elements: ");
        int numElements = sc.nextInt();

        int[] data = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int element = sc.nextInt();

            // Insert the new element and sort the array
            insertAndSort(data, i, element);

            // Print the sorted array after insertion
            System.out.print("Sorted array: ");
            for (int j = 0; j <= i; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    static void insertAndSort(int[] arr, int n, int element) {
        // Shift elements to make space for the new element
        if (n != 0) {
            for (int i = n - 1; i >= 0 && arr[i] > element; i--) {
                arr[i + 1] = arr[i];
            }
        }

        // Insert the new element at its correct position
        arr[n] = element;
    }
}
