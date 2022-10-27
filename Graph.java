import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Vertex> vertices = new ArrayList<>();
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean isWeighted, boolean isDirected) {
        this.isWeighted = isWeighted;
        this.isDirected = isDirected;
    }

    public Vertex addVertex(String data) {
        Vertex vertex = new Vertex(data);
        this.vertices.add(vertex);
        return vertex;
    }

    public void addEdge(Vertex start, Vertex end, Integer weight) {
        Integer edgeWeight = this.isWeighted ? weight : null;

        start.addEdge(end, edgeWeight);

        if (!this.isDirected) {
            end.addEdge(start, edgeWeight);
        }
    }

    public void removeEdge(Vertex start, Vertex end) {
        start.removeEdge(end);

        if (!this.isDirected) {
            end.removeEdge(start);
        }
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public Vertex getVertexByData(String data) {
        for (Vertex vertex : this.vertices) {
            if (vertex.getData().equals(data)) {
                return vertex;
            }
        }

        return null;
    }

    public void print() {
        for (Vertex vertex : this.vertices) {
            vertex.print(this.isWeighted);
        }
    }
    
    public boolean isDirected() {
        return isDirected;
    }

    public boolean isWeighted() {
        return isWeighted;
    }

    public static void main(String[] args) {

    }

}