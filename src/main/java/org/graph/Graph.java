package org.graph;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Asbjorn
 * @version 1.0
 */
class Edge {
    int source, destination, poid;

    Edge(int source, int destination, int poid){
        this.source = source;
        this.destination = destination;
        this.poid = poid;

    }
}

/**
 * @author Asbjorn
 * @version 1;0
 */
class Graph {
    List<List<Integer>> modifList = new ArrayList<>();

    //création du graph
    public Graph(List<Edge> edge) {
        int n = 0;
        for (Edge e : edge) {
            n = Integer.max(n, Integer.max(e.source, e.destination));
        }

        // alloue de la mémoire pour la liste de contigue
        for (int i = 0; i <= n; i++) {
            modifList.add(i, new ArrayList<>());
        }
        // ajoute des arêtes au graphe orienté
        for (Edge current : edge) {
            // alloue un nouveau nœud dans la liste de contiguïté de src à dest
            modifList.get(current.source).add(current.destination);


        }
    }
    //Affiche le graph orienté
    public static void afficheGraph(Graph graph){
        int source = 0;
        int n = graph.modifList.size(); //initialisé a la taille du graph afin de parcourir tout les sommets.
        while(source<n) {
            for (int destination : graph.modifList.get(source)) {
                System.out.println("" + source + "---->" + destination + "poid : ");
            }
            source++;
        }

    }

}

