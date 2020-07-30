package lib;

import java.util.LinkedList;

public class Graph {
    public Vertex[] vertex;
    public int[][] adjMatrix;
    public LinkedList<Vertex>[] adjList;
    int size;
    int maxSize;

    /**
     * @param size
     */
    public Graph(int size) {
        this.vertex = new Vertex[size];
        this.maxSize = size;
        this.size = 0;
        this.adjMatrix = new int[maxSize][maxSize];
        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                this.adjMatrix[i][j] = 0;
            }
        }
    }

    /**
     * @param v
     */
    public void addVertex(Vertex v) {
        this.vertex[this.size++] = v;
    }

    /**
     * @param i
     * @param j
     */
    public void addEdge(int i, int j) {
        this.adjMatrix[i][j] = 1;
    }

    /**
     * @param i
     * @return
     */
    public int getAdjacentVertex(int i) {
        for (int j = 0; j < maxSize; j++) {
            if (adjMatrix[i][j] == 1 && vertex[j].wasVisited == false) {
                return j;
            }
        }
        return -1;
    }
}
