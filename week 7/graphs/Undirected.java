package graphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndirectedGraph {

    public void printMatrix(int[][] graph) {
        char[] labels = {'A', 'B', 'C', 'D'};
        System.out.print("    ");
        for (char c : labels) System.out.print(c + " ");
        System.out.println();

        for (int i = 0; i < graph.length; i++) {
            System.out.print(labels[i] + " | ");
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printList(Map<Character, List<Character>> adj) {
        for (Map.Entry<Character, List<Character>> entry : adj.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
    }
}

public class Undirected {
    public static void main(String[] args) {
        // undirected & unweighted with adjacency matrix
        int[][] g1 = {
            {0, 1, 1, 0}, // a
            {1, 0, 0, 1}, // b
            {1, 0, 0, 1}, // c
            {0, 1, 1, 0}  // d
        };

        // undirected & unweighted with adjacency list
        Map<Character, List<Character>> g2 = new HashMap<>();
        g2.put('A', Arrays.asList('B', 'C'));
        g2.put('B', Arrays.asList('A', 'D'));
        g2.put('C', Arrays.asList('A', 'D'));
        g2.put('D', Arrays.asList('B', 'C'));

        UndirectedGraph ug = new UndirectedGraph();
        ug.printMatrix(g1);
        ug.printList(g2);
    }
}
