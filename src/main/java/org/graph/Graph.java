package org.graph;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthéo
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
 * @author Matthéo
 * @version 1;0
 */
class Graph {
    List<List<Edge>> modifList = new ArrayList<>();

    //création du graph
    public Graph(List<Edge> edge) {
        int n = 0;
        for (Edge e : edge) {
            n = Integer.max(n, Integer.max(e.source, e.destination));
        }

        //Alloue de la mémoire pour la liste de contigue
        for (int i = 0; i <= n; i++) {
            modifList.add(i, new ArrayList<>());
        }
        // ajoute des arêtes au graphe orienté
        for (Edge current : edge) {
            // alloue un nouveau nœud dans la liste contigue
            modifList.get(current.source).add(current);


        }
    }
    //Affiche le graph orienté
    public void afficheGraph(){
        int source = 0;
        int n = modifList.size(); //initialisé a la taille du graph afin de parcourir tout les sommets.
        while(source<n) {
            for (Edge destination : modifList.get(source)) {
                System.out.println(" " + source + "---->" + destination.destination + "poid : " + destination.poid);
            }
            source++;
        }

    }

}

