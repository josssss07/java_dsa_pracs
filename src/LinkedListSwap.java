import java.util.LinkedList;

public class LinkedListSwap {
    public static void main(String[] args) {
        LinkedList node = new LinkedList<Integer>();
        node.add(1);
        node.add(69);
        node.add(3);
        node.add(4);

        LinkedList node1 = new LinkedList<Integer>();
        node1.add(1);
        node1.add(68);
        node1.add(3);
        node1.add(4);
        System.out.println(node);
        System.out.println(node1);
        System.out.println(swap(node, node1));
    }

    static LinkedList swap(LinkedList node, LinkedList node1){
        node1.add(1, node.get(1));
        node.remove(1);
        return node1    ;
    }
}
