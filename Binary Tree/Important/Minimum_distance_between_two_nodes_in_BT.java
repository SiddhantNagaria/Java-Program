
public class Minimum_distance_between_two_nodes_in_BT {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }
        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);
        if (left == -1 && right == -1) {
            return -1;
        }
        else if (left == -1) {
            return right + 1;
        }
        else { // if(right == -1)
            return left + 1;
        }
    }

    static int min_distance(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 5;
        System.out.println("Minimum distance between " + n1 + " and " + n2 + " is " + min_distance(root, n1, n2));
    }
}
