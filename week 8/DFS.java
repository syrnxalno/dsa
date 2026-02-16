import java.util.*;

class DFS {

    int vertices;
    ArrayList<Integer> arr[];

    // constructor
    DFS(int v) {
        this.vertices = v;
        arr = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    void addEdge(int v, int w) {
        arr[v].add(w); // for directed graph
        // arr[w].add(v); // uncomment for undirected graph
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : arr[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    void traversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(startVertex, visited);
    }

    public static void main(String[] args) {
        DFS g = new DFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        System.out.println("DFS starting from vertex 0:");
        g.traversal(0);
    }
}
