import java.util.*;
import java.util.LinkedList;

/**
 * 
 * Author: Shaik Vaseem Naazleen
 * email: shaikvaseemnaazleen@gmail.com
 * Program: DFS and BFS on directed graph
 * Operations: addEdge, dfs, bfs
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

    void dfs(int start) {
        boolean[] visited = new boolean[nodes];

        dfTraversal(start, visited);
        for(int i = 1; i < nodes; i++) {
            if(!visited[i]) {
                dfTraversal(i, visited);
            }
        }

        System.out.println();
    }

    

    private void dfTraversal(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        Iterator<Integer> itr = adjList[start].listIterator();
        while( itr.hasNext()) {
            int neighbour = itr.next();
            if(!visited[neighbour]) {
                dfTraversal(neighbour, visited);
            }
        }
        
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

        for (int i = 1; i < nodes; i++) {
            if(!visited[i]) {
                bfs(i, visited);
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        DirectedGraphUsingAdjList g = new DirectedGraphUsingAdjList(10);
        
		g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(4, 7);
        g.addEdge(4, 8);
        g.addEdge(3, 9);
        g.addEdge(3, 4);
        g.addEdge(4, 3);

        System.out.println("DFS order:");
        g.dfs(1);
        System.out.println("BFS order:");
        g.bfs(1, new boolean[10]);

        /*
        Output:
        
        DFS order:
        1 2 5 6 4 7 8 3 9
        BFS order:
        1 2 4 5 6 7 8 3 9
        */
    }
}
