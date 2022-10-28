import java.util.ArrayList;
import java.util.List;

public class GraphTraverser {
    
    public static void depthFirstTraversal(Vertex startNode, List<Vertex> visited) {
        System.out.println(startNode.getData());

        for (Edge edge : startNode.getEdges()) {
            Vertex neighbor = edge.getEnd();

            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                depthFirstTraversal(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = GraphBuilder.createDirected();        
        List<Vertex> visited = new ArrayList<Vertex>();
        Vertex startingVertex = graph.getStartingVertex();

        visited.add(startingVertex);

        depthFirstTraversal(startingVertex, visited);
    }
}
