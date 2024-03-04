//prac5
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQuest {
    public static void main(String[] args) {
        LinkedList node = new LinkedList<Integer>();
        node.add(1);
        node.add(2);
        node.add(3);
        node.add(4);

        LinkedList node1 = new LinkedList<Integer>();
        node1.add(1);
        node1.add(2);
        node1.add(3);
        node1.add(4);

        System.out.println(addtionOfLists(node, node1));
        System.out.println(addAllOdd(node, node1));

    }
    static int addtionOfLists(LinkedList node, LinkedList node1){
        node.addAll(node1);
        int sum = 0;
        for(int i = 0; i<node.size(); i++){
            sum = sum + (int)node.get(i);
        }
        return sum;
    }

    static int addAllOdd(LinkedList node, LinkedList node1){
        int sum= 0;
        node.addAll(node1);
        Iterator it = node.iterator();
        while (it.hasNext()){
            int n = (int)it.next();
            if(n%2 != 0){
                sum = sum+ n;
            }
        }
        return sum;
    }
}
