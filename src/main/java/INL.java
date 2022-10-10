import java.util.ArrayList;
import java.util.List;

public class INL {
    public static List<NodeAndLink> nodeAndLinkList = new ArrayList<>();//з ьази дістати всі пари
    public static List<Node> nodes = new ArrayList<>();
    public static List<Link> links = new ArrayList<>();

    public static void add() {
        for (NodeAndLink nodeAndLink : nodeAndLinkList) {
            nodes.add(nodeAndLink.getNode());
            links.add(nodeAndLink.getLink());
        }
    }

    public static boolean isContains(String node, String link) {
        if (nodes.contains(node) && links.contains(link)) {
            return true;
        }
        return false;
    }

}
