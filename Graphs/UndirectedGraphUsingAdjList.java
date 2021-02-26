import java.util.*;

/**
 * 
 * Author: Shaik Vaseem Naazleen
 * email: shaikvaseemnaazleen@gmail.com
 * Program: Representation of undirected graph using adjacency list
 * Operations: addEdge, removeEdge
 */

public class UndirectedGraphUsingAdjList {
    HashMap<Integer, ArrayList<Integer>> adjList;

    UndirectedGraphUsingAdjList() {
        adjList = new HashMap<>();
    }

    void addEdge(int start, int end) {
        if(!adjList.containsKey(start)) {
            adjList.put(start,new ArrayList<Integer>());
        }

        if(!adjList.containsKey(end)) {
            adjList.put(end,new ArrayList<Integer>());
        }

        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }

    void removeEdge(int start, int end) {
        if(adjList.containsKey(start) && adjList.containsKey(end)) {
            adjList.get(start).remove(end);
            adjList.get(end).remove(start);
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
        1 - 2
        | / |
        3 - 4
    Adjacency matrix representation:
        1 : 2 3
        2 : 1 3 4
        3 : 1 2 4
        4 : 2 3
     */

    public static void main(String[] args) {
        UndirectedGraphUsingAdjList g = new UndirectedGraphUsingAdjList();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.display();
    }
}
