package BST;

public class InsertBST {
    public static class Node<T> {
        public T val;
        public Node<T> left;
        public Node<T> right;

        public Node(T val) {
            this(val, null, null);
        }

        public Node(T val, Node<T> left, Node<T> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Node<Integer> insertBst(Node<Integer> bst, int val) {
        if (bst == null) {
            return new Node<>(val);
        }
        int compareVal = bst.val.compareTo(val);
        if (compareVal < 0) {
            bst.right = insertBst(bst.right, val);
        } else if (compareVal > 0) {
            bst.left = insertBst(bst.left, val);
        }
        return bst;
    }

}
