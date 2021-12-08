package DFS;

import java.util.*;

public class DFSonGraph {
    class Node {
        public int val;
        public List<Node> neighbours;

        public Node(int val) {
            this.val = val;
            neighbours = new ArrayList<>();
        }

        public List<Node> getNeighbours() {
            return this.neighbours;
        }
    }

    public void dfs(Node root, Set<Node> visited) {
        for(Node neighbor : root.getNeighbours()) {
            if(visited.contains(neighbor)) {
                visited.add(neighbor);
                dfs(neighbor, visited);
            }
        }
    }
}
