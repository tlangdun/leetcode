package DFS;

public class MaxDepthOfTree {
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

    public static int treeMaxDepth(Node<Integer> root) {
        // Null node adds no depth
        if (root == null) return 0;
        // Depth of current node's subtree = max depth of the two subtrees + 1 provided by current node
        return Math.max(treeMaxDepth(root.left), treeMaxDepth(root.right)) + 1;
    }

}
