package BFS;

import java.util.*;

public class BFSonGraph {
    class Node{
        public int val;
        public List<Node> neighbours;
        public Node(int val){
            this.val = val;
            neighbours = new ArrayList<>();
        }

        public List<Node> getNeighbours(){
            return this.neighbours;
        }
    }
    public void bfs(Node root) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        Set<Node> visited = new HashSet<>();
        int level = 0;
        while (queue.size() > 0) {
            int n = queue.size();  // get # of nodes in the current level
            for (int i = 0; i < n; i++) {
                Node node = queue.pop();
                for (Node neighbor : node.getNeighbours()) {
                    if (visited.contains(neighbor)) {
                        continue;
                    }
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
            // increment level after we have processed all nodes of the level
            level++;
        }
    }
}
