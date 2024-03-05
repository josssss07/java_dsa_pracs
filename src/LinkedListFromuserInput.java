import java.util.*;

class Node {

  private int data;
  private Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }

  public int getData() {    
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}

public class LLDemo {

  static Node create(Node head, int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node tail = head;
      while (tail.getNext() != null) {
        tail = tail.getNext();
      }
      tail.setNext(newNode);
    }
    return head;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of nodes: ");
    int n = sc.nextInt();
    Node head = null;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the data: ");
      int data = sc.nextInt();
      head = create(head, data);
    }
    Node current = head;
    while (current != null) {
      System.out.print("-->" + current.getData());
      current = current.getNext();
    }
  }
}
