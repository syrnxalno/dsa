import java.util.Queue;
import java.util.*;

class ReorderRoutes {

    int vertices;
    ArrayList<Integer> arr[];

    // constructor
    ReorderRoutes(int v) {
        this.vertices = v;
        arr = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    // add directed edge
    void addEdge(int from, int to) {
        arr[from].add(to);     // original direction
        arr[to].add(-from);    // reverse direction marked negative
    }

    int minReorder(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        int reorderCount = 0;

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int v = queue.poll();

            for (int neighbor : arr[v]) {
                int absNeighbor = Math.abs(neighbor);

                if (!visited[absNeighbor]) {
                    visited[absNeighbor] = true;
                    queue.add(absNeighbor);

                    // if edge is positive, it was original direction
                    // meaning it needs to be reordered
                    if (neighbor > 0) {
                        reorderCount++;
                    }
                }
            }
        }

        return reorderCount;
    }

    public static void main(String[] args) {

        // Example:
        // n = 6
        // connections = [[0,1],[1,3],[2,3],[4,0],[4,5]]

        ReorderRoutes g = new ReorderRoutes(6);

        g.addEdge(0, 1);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(4, 0);
        g.addEdge(4, 5);

        System.out.println("Minimum edges to reorder: " + g.minReorder(0));
    }
}