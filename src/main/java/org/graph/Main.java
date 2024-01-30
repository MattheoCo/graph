package org.graph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Edge> edge = Arrays.asList(
                new Edge(1,0, 23),
                new Edge(1, 2, 45),
                new Edge(2, 0, 12),
                new Edge(0, 3, 32)

        );
    Graph graph = new Graph(edge);
    graph.afficheGraph();
    }
}