package BST;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class LevelTraversalBFS {
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

    public static List<List<Integer>> levelOrderTraversal(Node<Integer> root) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        ArrayDeque<Node<Integer>> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size()>0){
            int n = queue.size();
            List<Integer> newLevel = new ArrayList<>();
            for (int i = 0; i < n; i++){
                Node<Integer> node = queue.pop();
                newLevel.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(newLevel);
        }

        return res;
    }
}
