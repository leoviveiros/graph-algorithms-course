public class GraphBuilder {
    
    public static Graph createDirected() {
        Graph graph = new Graph(false, true);

        Vertex startNode = graph.addVertex("v0.0.0");

        Vertex v1 = graph.addVertex("v1.0.0");
        Vertex v2 = graph.addVertex("v2.0.0");

        Vertex v11 = graph.addVertex("v1.1.0");
        Vertex v12 = graph.addVertex("v1.2.0");

        Vertex v21 = graph.addVertex("v2.1.0");

        Vertex v111 = graph.addVertex("v1.1.1");
        Vertex v112 = graph.addVertex("v1.1.2");
        Vertex v121 = graph.addVertex("v1.2.1");

        Vertex v211 = graph.addVertex("v2.1.1");

        graph.addEdge(startNode, v1);
        graph.addEdge(startNode, v2);

        graph.addEdge(v1, v11);
        graph.addEdge(v1, v12);

        graph.addEdge(v2, v21);

        graph.addEdge(v11, v111);
        graph.addEdge(v11, v112);

        graph.addEdge(v12, v121);

        graph.addEdge(v21, v211);

        // creates a cycle
        graph.addEdge(v211, v2);

        return graph;
    }
}
