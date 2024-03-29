import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int size;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    size = sc.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.println("Enter element " + i + ": ");
      new Main().dynamicSort(i, arr, sc.nextInt());
    }
    System.out.println();
    for (int a : arr) {
      System.out.println(a);
    }
  }

  void dynamicSort(int i, int[] arr, int elem) {
    if (i < 1) {
      arr[0] = elem;
      return;
    }
    boolean replace = false;
    int temp = 0;
    int temp2;
    for (int j = 0; j < i + 1; j++) {
      if (!replace) {
        if (arr[j] > elem) {
          replace = true;
          temp = arr[j];
          arr[j] = elem;
        }
      } else {
        temp2 = arr[j];
        arr[j] = temp;
        temp = temp2;
      }
    }
    if (!replace) {
      arr[i] = elem;
    }
  }
}
