package one;

import java.util.HashMap;
public class Node implements Comparable<Node> {

    public static Double DEFAULT_EDGE_WEIGHT = 0.0;
    //public HashSet<one.Node> edges = new HashSet<one.Node>();
    public HashMap<Node, Double> outgoingEdges;
    public HashMap<Node, Double> incomingEdges;
    public double rank = 0.0D;
    public String key = null;
    public boolean marked = false;
    public String data = null;

    /**
     * Private constructor.
     */
    private Node(final String key, final String data) {
        this.rank = 1.0D;
        this.key = key;
        this.data = data;
        this.outgoingEdges = new HashMap<Node, Double>();
        this.incomingEdges = new HashMap<Node, Double>();
    }

    public int compareTo(final Node that) {
        if (this.rank > that.rank) {
            return -1;
        }
        else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Node) {
            Node node = (Node) o;
            if (node.key.equals(this.key)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public void connect(final Node that, Double weight) {
        this.outgoingEdges.put(that, weight);
        that.incomingEdges.put(this, weight);
    }

    public void disconnect(final Node that) {
        this.outgoingEdges.remove(that);
        that.incomingEdges.remove(this);
    }

    public String getId() {
        return Integer.toString(hashCode(), 16);
    }

    public static Node buildNode(final Graph graph, final String key,
                                 final String data) {
        Node n = graph.get(key);

        if (n == null) {
            n = new Node(key, data);
            graph.put(key, n);
        }

        return n;
    }

    @Override
    public String toString() {
        String string = "";
        string += "Key: " + this.key;
        string += ", Data: " + this.data;
        string += ", Rank: " + this.rank;
        string += ", Outgoing Edges: " + this.outgoingEdges.size();
        string += ", Incoming Edges: " + this.incomingEdges.size();

        return string;
    }
}
