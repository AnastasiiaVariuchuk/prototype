public class NodeAndLink {
    private int id;
    private Node node;
    private Link link;

    public NodeAndLink(int id, Node node, Link link) {
        this.id = id;
        this.node = node;
        this.link = link;
    }

    public NodeAndLink() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "NodeAndLink{" +
                "id=" + id +
                ", node=" + node +
                ", link=" + link +
                '}';
    }
}
