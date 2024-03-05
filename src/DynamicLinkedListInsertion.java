import java.util.Scanner;

class Node {

  int val;
  Node next;

  Node(int data) {
    val = data;
    next = null;
  }
}

class LL {

  static Node add(Node head, int data) {
    Node newNode = new Node(data);
    if (head == null) {
      return newNode;
    }
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
    return head;
  }

  static Node insert(Node head, int data, int pos) {
    Node newNode = new Node(data);
    if (pos == 1) {
      newNode.next = head;
      return newNode;
    }
    Node current = head;
    for (int i = 1; i < pos - 1; i++) {
      current = current.next;
    }
    newNode.next = current.next;
    current.next = newNode;
    return head;
  }

  static Node addSecondLast(Node head, int n, int data) {
    return insert(head, data, n - 1);
  }

  static void append(Node head, int data) {
    add(head, data);
  }

  static void changeValue(Node head, int d, int newData) {
    Node current = head;
    while (current != null) {
      if (current.val == d) {
        current.val = newData;
      }
      current = current.next;
    }
  }

  static void prepend(Node head, int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  static void addNodeVal(Node head, int d, int newData) {
    Node newNode = new Node(newData); // Adjusted for consistency
    Node current = head;
    while (current != null) {
      if (current.val == d) {
        newNode.next = current.next;
        current.next = newNode;
        break;
      }
      current = current.next;
    }
  }

  static void print(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print("-->" + current.val);
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many nodes do you want? ");
    int n = sc.nextInt();
    Node head = null;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the data for node " + (i + 1) + ": ");
      int data = sc.nextInt();
      head = add(head, data);
    }
    print(head);
    System.out.println("Enter the node value to add after: ");
    int d = sc.nextInt();
    System.out.println("Enter the new data for the added node: ");
    int nd = sc.nextInt();
    addNodeVal(head, d, nd);
    print(head);
  }
}
