// Node class for creating nodes in a binary search tree
class NodeTwo {
    int data;
    NodeTwo left;
    NodeTwo right;

    // Getter and Setter methods for the Node class
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeTwo getLeft() {
        return left;
    }

    public void setLeft(NodeTwo left) {
        this.left = left;
    }

    public NodeTwo getRight() {
        return right;
    }

    public void setRight(NodeTwo right) {
        this.right = right;
    }

    // Constructor for creating a new Node with given data
    public NodeTwo(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// BinarySearchDemo class for demonstrating binary search tree operations
 class BinarySearchDemoOne {
    public NodeTwo root;

    // Constructor for creating an instance of BinarySearchDemo with an initially empty tree
    public BinarySearchDemoOne() {
        root = null;
    }

    // Method to insert a new node with the given data into the binary search tree
    public void insert(int data) {
        NodeTwo newNode = new NodeTwo(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            NodeTwo current = root, parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // Method to find the node with the minimum value in a given subtree
    public NodeTwo minNode(NodeTwo root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }

    // Method to delete a node with a specific value from the binary search tree
    public NodeTwo deleteNode(NodeTwo node, int value) {
        if (node == null) {
            return null;
        } else {
            if (value < node.data) {
                node.left = deleteNode(node.left, value);
            } else if (value > node.data) {
                node.right = deleteNode(node.right, value);
            } else {
                if (node.left == null && node.right == null) {
                    node = null;
                } else if (node.left == null) {
                    node = node.right;
                } else if (node.right == null) {
                    node = node.left;
                } else {
                    NodeTwo temp = minNode(node.right);
                    node.data = temp.data;
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }

    // Method to perform inorder traversal of the binary search tree
    public void inorderTraversal(NodeTwo node) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        } else {
            if (node.left != null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if (node.right != null)
                inorderTraversal(node.right);
        }
    }

    // Main method for testing the binary search tree operations
    public static void main(String[] args) {
        // Creating an instance of BinarySearchDemo
        BinarySearchDemoOne bt = new BinarySearchDemoOne();

        // Inserting nodes into the binary search tree
        bt.insert(50);
        bt.insert(30);
        bt.insert(70);
        bt.insert(60);
        bt.insert(10);
        bt.insert(90);

        System.out.println("Binary search tree after insertion: ");
        // Performing inorder traversal to display the tree
        bt.inorderTraversal(bt.root);

        // Deleting nodes from the binary search tree
        NodeTwo deletedNode = null;
        deletedNode = bt.deleteNode(bt.root, 90);
        System.out.println("\nBinary search tree after deleting node 90: ");
        bt.inorderTraversal(bt.root);

        deletedNode = bt.deleteNode(bt.root, 30);
        System.out.println("\nBinary search tree after deleting node 30: ");
        bt.inorderTraversal(bt.root);

        deletedNode = bt.deleteNode(bt.root, 50);
        System.out.println("\nBinary search tree after deleting node 50: ");
        bt.inorderTraversal(bt.root);
    }
}