
/**
 * 
 * Author: Shaik Vaseem Naazleen
 * email: shaikvaseemnaazleen@gmail.com
 * Program: Representation of undirected graph using adjacency matrix
 * Operations: addEdge, removeEdge
 */

public class UndirectedGraphUsingAdjMatrix {

    int nodes;
    int[][] adjMatrix;

    /**
     * Takes number of nodes and creates a matrix representing nodes
     * @param nodes
     */
    UndirectedGraphUsingAdjMatrix(int nodes) {
        this.nodes = nodes;
        adjMatrix = new int[nodes+1][nodes+1];
        init();
    }

    public void init() {
        for (int i = 0; i <= nodes; i++) {
            for (int j = 0; j <= nodes; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void display() {
        System.out.println("Graph: ");
        for (int i = 1; i <= nodes; i++) {
            for (int j = 1; j <= nodes; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    Graph:
        1 - 2
        | / |
        3 - 4
    Adjacency list representation:
          1  2  3  4
        1 0  1  1  0
        2 1  0  1  1
        3 1  1  0  1
        4 0  1  1  0
     */
    public static void main(String[] args) {
        UndirectedGraphUsingAdjMatrix g = new UndirectedGraphUsingAdjMatrix(4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.display();
    }
}
