import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


public class INL {
    public static List<NodeAndLink> nodeAndLinkList = new ArrayList<>();//з бази дістати всі пари

    /*public static NodeAndLink find(NodeAndLink nodeAndLink) {
        for (NodeAndLink nodeAndLink1 : nodeAndLinkList) {
            if (nodeAndLink1.getNode().equals(nodeAndLink.getNode())) {
                if (nodeAndLink1.getLink().equals(nodeAndLink.getLink())) {
                    return nodeAndLink1;
                }
            }
        }
        return null;
    }*/

   public static NodeAndLink find(NodeAndLink nodeAndLink) {
        NodeAndLink nodeAndLink1 = nodeAndLinkList.stream()
                .filter(e1 -> e1.getNode().equals(nodeAndLink.getNode()) && e1.getLink().equals(nodeAndLink.getLink()))
                .findAny().orElse(null);
        return nodeAndLink1;
    }
}
