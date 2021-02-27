import java.util.*;
import java.util.LinkedList;

/**
 * 
 * Author: Shaik Vaseem Naazleen
 * email: shaikvaseemnaazleen@gmail.com
 * Program: BFS on directed graph
 * Operations: addEdge, BFS
 */

public class DirectedGraphUsingAdjList {
    LinkedList<Integer> adjList[];
    int nodes;

    DirectedGraphUsingAdjList(int nodes) {
        adjList =  new LinkedList[nodes];
        this.nodes = nodes;

        for (int i= 0; i < nodes; i++)
		{
			adjList[i] = new LinkedList();
		}
    }

    void addEdge(int start, int end) {
        adjList[start].add(end);
    }

    void bfs(int start, boolean[] visited) {
        Queue<Integer> visitNext = new LinkedList<>();

        visitNext.add(start);
        visited[start] = true;


        while (!visitNext.isEmpty()) {
            int currNode = visitNext.poll();

            System.out.print(currNode + " ");

            Iterator<Integer> i = adjList[currNode].listIterator();
			int neighbour;
			
			while( i.hasNext() )
			{  
		        
        		neighbour = i.next();
                if(!visited[neighbour]) {
                    visitNext.add(neighbour);
                    visited[neighbour] = true;
                }
            }

		}

        for (int i = 0; i < nodes; i++) {
            if(!visited[i]) {
                bfs(i, visited);
            }
        }

        System.out.println();
    }

    

    public static void main(String[] args) {
        DirectedGraphUsingAdjList g = new DirectedGraphUsingAdjList(10);
        
		g.addEdge(0, 1);
		g.addEdge(0, 9);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(3, 6);
		g.addEdge(4, 7);
		g.addEdge(4, 8);

        System.out.println("BFS order:");
        g.bfs(0, new boolean[10]);
    }
}
