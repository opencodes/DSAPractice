package Graph;

import lib.Graph;
import lib.Vertex;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addVertex(new Vertex('A'));
        g.addVertex(new Vertex('B'));
        g.addVertex(new Vertex('C'));
        g.addVertex(new Vertex('D'));

        // A0 - B1
        // |    |
        // C2 - D3

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.addEdge(3, 2);

    }
}
