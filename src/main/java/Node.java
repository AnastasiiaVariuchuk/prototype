import java.util.List;

public class Node {
    private int linksToOthers;
    private int linksToMyself;

    public Node() {
    }

    public Node(int linksToOthers, int linksToMyself) {
        this.linksToOthers = linksToOthers;
        this.linksToMyself = linksToMyself;
    }

    public int getLinksToOthers() {
        return linksToOthers;
    }

    public void setLinksToOthers(int linksToOthers) {
        this.linksToOthers = linksToOthers;
    }

    public int getLinksToMyself() {
        return linksToMyself;
    }

    public void setLinksToMyself(int linksToMyself) {
        this.linksToMyself = linksToMyself;
    }

    @Override
    public String toString() {
        return "Node{" +
                "linksToOthers=" + linksToOthers +
                ", linksToMyself=" + linksToMyself +
                '}';
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

