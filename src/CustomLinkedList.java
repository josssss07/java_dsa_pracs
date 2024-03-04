//prac3
public class CustomLinkedList {
    int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    CustomLinkedList nextNode;

    public CustomLinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(CustomLinkedList nextNode) {
        this.nextNode = nextNode;
    }
    CustomLinkedList(int data){
        this.data = data;
        this.nextNode = null;
    }
}


class LLDemo
{
    public static void main(String[] args)
    {
        CustomLinkedList head = null;
        CustomLinkedList p = null;
        CustomLinkedList q = null;

        CustomLinkedList node1 = new CustomLinkedList(20);
        CustomLinkedList node2 = new CustomLinkedList(30);
        CustomLinkedList node3 = new CustomLinkedList(40);

        node2.setNextNode(node3);
        node1.setNextNode(node2);
        head = node1;
        p = node1;
        q = node1;


        while(p != null)
        {
            q = p;
            System.out.print("-->" + q.getData());
            p = p.getNextNode();
        }
    }
}


