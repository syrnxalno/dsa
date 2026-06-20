import java.util.*;

class countProvinces {
    int vertices;
    ArrayList<Integer>[] arr;

    countProvinces(int v) {
        vertices = v;

        arr = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    void addEdge(int v, int w) {
        arr[v].add(w);
        arr[w].add(v);
    }

    int traversal(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        int count = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbour : arr[node]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        countProvinces g = new countProvinces(5);

        g.addEdge(0, 3);
        g.addEdge(1, 2);

        int count = g.traversal(0);
        System.out.println("\nNo of provinces: " + count);
    }
}