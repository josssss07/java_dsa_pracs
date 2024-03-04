public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 1, 4, 7, 31, 6, 23 ,52, 110};
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        bubbleSortDem(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void bubbleSortDem(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j= 1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
