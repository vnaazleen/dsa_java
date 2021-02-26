import java.util.*;

/**
 * 
 * Author: Shaik Vaseem Naazleen
 * email: shaikvaseemnaazleen@gmail.com
 * Program: Representation of directed graph using adjacency list
 * Operations: addEdge, removeEdge
 */

public class DirectedGraphUsingAdjList {
    HashMap<Integer, ArrayList<Integer>> adjList;

    DirectedGraphUsingAdjList() {
        adjList = new HashMap<>();
    }

    void addEdge(int start, int end) {
        if(!adjList.containsKey(start)) {
            adjList.put(start,new ArrayList<Integer>());
        }

        adjList.get(start).add(end);
    }

    void removeEdge(int start, int end) {
        if(adjList.containsKey(start)) {
            adjList.get(start).remove(end);
        }
    }

    void display() {
        for (int node : adjList.keySet()) {
            System.out.print(node + " : ");
            for (int neighbour : adjList.get(node)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

    /*
    Graph:
        1 -> 2
        ^    ^    
        |    | 
        3 <- 4
    Adjacency list representation:
        1 : 2
        3 : 1
        4 : 2 3
     */

    public static void main(String[] args) {
        DirectedGraphUsingAdjList g = new DirectedGraphUsingAdjList();
        g.addEdge(1, 2);
        g.addEdge(3, 1);
        g.addEdge(4, 2);
        g.addEdge(4, 3);

        g.display();
    }
}
