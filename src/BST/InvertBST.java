package BST;

public class InvertBST {
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

    public static Node<Integer> invertBinaryTree(Node<Integer> tree) {
        if (tree == null)
            return null;
        return new Node<>(tree.val, invertBinaryTree(tree.right), invertBinaryTree(tree.left));
    }
}
