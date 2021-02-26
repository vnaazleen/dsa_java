/**
 * 
 * Author: Shaik Vaseem Naazleen
 * email: shaikvaseemnaazleen@gmail.com
 * Program: Representation of directed graph using adjacency matrix
 * Operations: addEdge, removeEdge
 */

public class DirectedGraphUsingAdjMatrix {

    int nodes;
    int[][] adjMatrix;

    /**
     * Takes number of nodes and creates a matrix representing nodes
     * @param nodes
     */
    DirectedGraphUsingAdjMatrix(int nodes) {
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
    }
  
    public void removeEdge(int start, int end) {
        adjMatrix[start][end] = 0;
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
        1 -> 2
        ^    ^    
        |    | 
        3 <- 4
    Adjacency matrix representation:
          1  2  3  4
        1 0  1  1  0
        2 0  0  0  0
        3 1  0  0  0
        4 0  1  1  0
     */
    public static void main(String[] args) {
        DirectedGraphUsingAdjMatrix g = new DirectedGraphUsingAdjMatrix(4);
        g.addEdge(1, 2);
        g.addEdge(3, 1);
        g.addEdge(4, 2);
        g.addEdge(4, 3);

        g.display();
    }
}
