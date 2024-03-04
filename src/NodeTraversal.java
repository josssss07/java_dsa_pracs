////prac 9: node traversal
//class Node{
//    int data;
//
//    public int getData() {
//        return data;
//    }
//
//    public void setData(int data) {
//        this.data = data;
//    }
//
//    public Node getNext() {
//        return next;
//    }
//
//    public void setNext(Node next) {
//        this.next = next;
//    }
//
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//
//
//public class NodeTraversal {
//    public Node root;
//    public NodeTraversal(){
//        root = null;
//    }
//    public void insertData(int data){
//        Node newNode = new Node(data);
//        if(root == null){
//            root = newNode;
//            return;
//        }else{
//            Node current = root,parent= null;
//            while (true){
//                parent = current;
//                if(data<current.data){
//                    current = current.left;
//                    if(current == null){
//                        parent.left = newNode;
//                        return;
//                    }
//                }else{
//                    current = current.right;
//                    if(current == null){
//                        parent.right = newNode;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//}
//public Node minNode(Node root){
//    if(root == null){
//        System.out.println("Tree is empty");
//
//    }
//}


// Java program for implementation of Insertion Sort
 class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
};

