import java.util.List;
import java.util.Objects;

public class Node {
    private int id;
    private String node;

    public Node(int id, String node) {
        this.id = id;
        this.node = node;
    }

    public Node() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Link nodeToLink() {
        Link link = new Link(id, node);
        return link;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", node='" + node + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node1 = (Node) o;
        return id == node1.id && Objects.equals(node, node1.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, node);
    }

    public static Node[] getOneDimArray(List<Node> nodeList) {
        Node[] nodes = new Node[nodeList.size()];
        int i = 0;
        for(Node node:nodeList) {
            nodes[i] = node;
            i++;
        }
        return nodes;
    }
}

