import java.util.Scanner;

 class DynamicSort {
    // Function to perform the Bubble Sort algorithm on an array
    static void bubbleSort1(int[] arr1, int m) {
        int temp = 0;
        // Nested loops to compare and swap elements for sorting
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < (m - i); j++) {
                if (arr1[j - 1] > arr1[j]) {
                    // Swap elements if they are in the wrong order
                    temp = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------OTHER SORT--------");
        System.out.println("Enter the length of the array and then the array elements: ");
        int m = sc.nextInt();
        int arr1[] = new int[m];

        // Populate the array and sort dynamically after each input
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
            bubbleSort1(arr1, i + 1);

            // Display the sorted array after each input
            System.out.println("Sorted array after " + (i + 1) + "th element is entered: ");
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array is sorted.");
    }
}