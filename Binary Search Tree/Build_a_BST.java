public class Build_a_BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBST(Node root, int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left = buildBST(root.left, val);
        }
        else{
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
    if(root == null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,2,4,7};
        Node root = null;
        for(int i = 0; i < values.length; i++){
            root = buildBST(root, values[i]);
        }
        inOrder(root);
        System.out.println();   
    }

}
