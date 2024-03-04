//
//class Node{
//    int data;
//    Node left;
//    Node right;
//    public int getData() {
//        return data;
//    }
//    public void setData(int data) {
//        this.data = data;
//    }
//    public Node getLeft() {
//        return left;
//    }
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//    public Node getRight() {
//        return right;
//    }
//    public void setRight(Node right) {
//        this.right = right;
//    }
//    public Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//
//
// class BinaryTree {
//
//    //represent the root of the tree
//    public Node root;
//
//    public BinaryTree() {
//        root = null;
//    }
//
//    // insert () will add a new node to the binary tree
//    public void insert(int data) {
//        // create a new node
//        Node newNode = new Node(data);
//        // check whether tree is empty
//        if(root == null) {
//            root = newNode;
//            return;
//        }
//        else {
//            // current node point to root node
//            Node current = root,parent = null;
//            while(true) {
//                //current node point to root of the tree
//                parent = current;
//                //if the value of the data is less than the current node insert it to the left of the tree
//                if(data<current.data) {
//                    current = current.left;
//                    if(current == null) {
//                        parent.left = newNode;
//                        return;
//                    }
//                }
//                // if data is greater than current's data, node will be inserted to the right of tree
//                else {
//                    current = current.right;
//                    if(current == null) {
//                        parent.right = newNode;
//                        return;
//                    }
//                }
//            }
//        }
//    }
//
//    // minNode() will find out the minimum node
//    public Node minNode(Node root) {
//        if(root.left!=null) {
//            return minNode(root.left);
//        }
//        else {
//            return root;
//        }
//    }
//
//    // deleteNode() will delete the given node from the binary search tree
//    public Node deleteNode(Node node,int value) {
//        if(node == null) { // base condition
//            return null;
//        }
//        else {
//            // value is less than node's data then search the value in the left subtree
//            if(value<node.data) {
//                node.left = deleteNode(node.left, value);
//            }
//            // value is greater than node's data then search the value in right subtree
//            else if(value>node.data) {
//                node.right = deleteNode(node.right, value);
//            }
//            // if value is equal to node's data that is we have found the node to be deleted
//            else {
//                // if node to be deleted has no child then set the node to null
//                if(node.left == null && node.right == null) {
//                    node = null;
//                }
//                // if node to be deleted has only one right child
//                else if (node.left == null) {
//                    node = node.right;
//                }
//                // if node to be deleted has only on left child
//                else if (node.right == null) {
//                    node = node.left;
//                }
//                // if node to be delete has two child nodes
//                else {
//                    // then find the minimum node from right subtree
//                    Node temp = minNode(node.right);
//                    // exchange the data between node and temp
//                    node.data = temp.data;
//                    // delete the node duplicate node from the right subtree
//                    node.right = deleteNode(node.right, temp.data);
//                }
//            }
//            return node;
//        }
//    }
//
//    // inorder () will perform inorder traversal on binary search tree
//    public void inorderTraversal(Node node) {
//        // check whether tree is empty
//        if(root == null) {
//            System.out.println("Tree is empty");
//            return;
//        }
//        else {
//            if(node.left!=null) {
//                inorderTraversal(node.left);
//
//            }
//            System.out.println(node.data+" ");
//            if(node.right!=null) {
//                inorderTraversal(node.right);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        BinaryTree bt = new BinaryTree();
//        // add nodes to the binary tree
//        bt.insert(50);
//        bt.insert(30);
//        bt.insert(70);
//        bt.insert(60);
//        bt.insert(10);
//        bt.insert(90);
//        System.out.println("Binary Search Tree after insertion: ");
//        bt.inorderTraversal(bt.root);
//
//    }
//
//}
//
//
//


import java.util.*;
//how to create LinkedList function in java? Illustrate (with diagram)

// dynamic nodes
//conversion of a diagram into following code (sample Q for exam)




class LLNodeTwo {

    private int data;
    private LLNodeTwo next; //data type of next is LLNode

    public int getData() {
        return data; //getter
    }
    public void setData(int data) {
        this.data = data; //setter
    }
    public LLNodeTwo getNext() {
        return next;
    }
    public void setNext(LLNodeTwo next) {
        this.next = next;
    }

    public LLNodeTwo(int data) {
        // TODO Auto-generated constructor stub
        this.data = data;
        this.next = null;
    }

}// end of node

 class LLdemo {

    //don't comment
    // creation of a linked list
    static LLNodeTwo createLL(LLNodeTwo head, int data) { //head is start pointer here if its null we add data to it
        LLNodeTwo h = head;
        LLNodeTwo p =h;
        LLNodeTwo q = h;
        LLNodeTwo newNode = null;

        if(h==null) {
            h = new LLNodeTwo(data);
        }

        else {
            while(p!=null) {
                q=p;
                p=p.getNext();
            }

            newNode = new LLNodeTwo(data);
            q.setNext(newNode); // connect q's 'next' to newNode
        }
        return h;
    }





    // insertion of data with the help of position -- [b]
    static LLNodeTwo alterLL(LLNodeTwo head, int data, int pos) {
        LLNodeTwo h = head;
        LLNodeTwo p =h;
        LLNodeTwo q = h;
        LLNodeTwo newNode =new LLNodeTwo(data);

        if(pos==1) {
            newNode.setNext(h);
            return newNode;
        }
        for(int i=1; i<pos;i++) {
            p=p.getNext();
        }
        for(int j=1; j<pos-1; j++) {
            q=q.getNext();
        }
        newNode.setNext(p);
        q.setNext(newNode);



        return h;
    }

    static LLNodeTwo SecondLasttLL(LLNodeTwo head, int n, int data) {

        LLNodeTwo h = head;
        LLNodeTwo p =h;
        LLNodeTwo q = h;
        int pos = n-1;
        LLNodeTwo newNode =new LLNodeTwo(data);

        if(pos==1) {
            newNode.setNext(h);
            return newNode;
        }
        for(int i=0; i<pos;i++) {
            p=p.getNext();
        }
        for(int j=0; j<pos-1; j++) {
            q=q.getNext();
        }
        newNode.setNext(p);
        q.setNext(newNode);



        return h;
    }




    //adding the value to the last node --- [a]
    static void addLast(LLNodeTwo head, int d) {
        LLNodeTwo newNode = new LLNodeTwo(d);
        if (head == null)
            head = newNode;
        LLNodeTwo Current = head;
        while (Current.getNext() != null)
            Current = Current.getNext();
        Current.setNext(newNode);
        newNode.setNext(null);
        display(head);
    }


    // changing the first value in the sense changing 20 to 99 -- [c]
    static void changeVAl(LLNodeTwo head, int d, int change)
    {
        System.out.println("After changing:");
        LLNodeTwo newnode = new LLNodeTwo(d);
        LLNodeTwo current = head;
        while(current!=null)
        {
            if(current.getData()== d)
            {
                current.setData(change);
            }
            current = current.getNext();
        }
        display(head);

    }
    // adding the value directly to the first node -- [d]
    static void addFirst(LLNodeTwo head, int d) {
        LLNodeTwo newNode = new LLNodeTwo(d);
        if (head == null)
            head = newNode;
        newNode.setNext(head);
        head = newNode;
        display(head);

    }



    // inserting a value with the help of a value asked from the user present in the list --[e]
    static void addNodeval(LLNodeTwo head, int d, int change)
    {
        LLNodeTwo newnode = new LLNodeTwo(d);
        LLNodeTwo current = head;
        while(current!= null)
        {
            if(current.getData()== d)
            {
                newnode.setNext(current.getNext());
                current.setNext(newnode);
                newnode.setData(change);

            }
            current = current.getNext();
        }
        display(head);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many nodes you want ? ");
        int n = sc.nextInt();

        LLNodeTwo head = null;
        LLNodeTwo p= null;
        LLNodeTwo q = null;
        for(int i=0; i<n; i++) {
            System.out.println("Enter the data : ");
            int data = sc.nextInt();
            LLNodeTwo x = createLL(head, data);
            if(i==0) {
                head = x;
                p =x;
                q=x;
            }

        }

        display(head);  //don't comment
        System.out.println();  //don't comment
        //changeVAl(head, 20, 99); // [c]
        //addNodeval(head, 30, 99); //[e]
        //addFirst(head,40); // [d]
        //lastLL(head,100); //[a]
        SecondLasttLL(head,n,100);
        display(head);

        //[b]
        System.out.println("enter the new data: ");
        int nd=sc.nextInt();
        System.out.println("enter the new position: ");
        int np=sc.nextInt();
        LLNodeTwo ghg=alterLL(head,nd,np);
        display(ghg);

    }
    static void display(LLNodeTwo head) {
        LLNodeTwo p=head;
        LLNodeTwo q = null;
        while(p!=null) {

            q=p; //one node behind p
            System.out.print("-->" + q.getData());
            p = p.getNext();
        }
    }

}
