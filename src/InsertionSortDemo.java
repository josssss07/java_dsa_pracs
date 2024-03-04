import java.util.Scanner;

public class InsertionSortDemo {

    static void bubbleSortDem(int[] arr, int n){
        for(int i = 0; i<n; i++){
            for(int j= 1; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.println("enter the size of this array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.println("enter elemnet "+ (i+1) + " :");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArry before sorting:");
        for(int i = 0; i< n; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println("array after sorting: ");

        for(int i = 0 ; i< n; i++){
            bubbleSortDem(arr, i+1);
            System.out.println("\narray after sorting: ");
            for(int j = 0; j<n; j++){
                System.out.println(arr[j] + " ");
            }
        }
    }

}
