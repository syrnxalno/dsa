import java.util.*;

class BFS {

    int vertices;
    ArrayList<Integer> arr[];

    // constructor
    BFS(int v) {
        this.vertices = v;
        arr = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    void addEdge(int v, int w) {
        arr[v].add(w);   // for directed graph
        // arr[w].add(v); // uncomment for undirected graph
    }

    void traversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : arr[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS g = new BFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("BFS starting from vertex 0:");
        g.traversal(0);
    }
}
