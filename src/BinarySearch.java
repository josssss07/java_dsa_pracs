public class BinarySearch {
    public NewNode root;
    void insert(int data){
        NewNode root;

    }

}
class NewNode {
    int nodeData;
    NewNode left;
    NewNode right;

    public int getNodeData() {
        return nodeData;
    }

    public void setNodeData(int nodeData) {
        this.nodeData = nodeData;
    }

    public NewNode getLeft() {
        return left;
    }

    public void setLeft(NewNode left) {
        this.left = left;
    }

    public NewNode getRight() {
        return right;
    }

    public void setRight(NewNode right) {
        this.right = right;
    }

     NewNode(int data){
        this.nodeData = data;
        this.left = null;
        this.right = null;
     }
}