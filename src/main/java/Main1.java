import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws InterruptedException, IOException, SQLException {
        //Parser.getTest();

        Node node1 = new Node(1, "NODE1");
        Node node2 = new Node(2, "NODE2");
        Node node3 = new Node(3, "NODE3");
        Node node4 = new Node(4, "NODE4");
        Node node5 = new Node(5, "NODE5");

        Node[] nodes = new Node[5];
        nodes[0] = node1;
        nodes[1] = node2;
        nodes[2] = node3;
        nodes[3] = node4;
        nodes[4] = node5;


        Link link1 = node1.nodeToLink();
        Link link2 = node2.nodeToLink();
        Link link3 = node3.nodeToLink();
        Link link4 = node4.nodeToLink();
        Link link5 = node5.nodeToLink();

        //1
        NodeAndLink nodeAndLink1 = new NodeAndLink(1, node1, link2);
        //2
        NodeAndLink nodeAndLink2 = new NodeAndLink(2, node2, link4);
        NodeAndLink nodeAndLink3 = new NodeAndLink(3, node2, link5);
        //3
        NodeAndLink nodeAndLink4 = new NodeAndLink(4, node3, link1);
        NodeAndLink nodeAndLink5 = new NodeAndLink(5, node3, link2);
        //4
        NodeAndLink nodeAndLink6 = new NodeAndLink(6, node4, link5);
        //5
        NodeAndLink nodeAndLink7 = new NodeAndLink(7, node5, link3);

        List<NodeAndLink> nodeAndLinkList = new ArrayList<>();
        nodeAndLinkList.add(nodeAndLink1);
        nodeAndLinkList.add(nodeAndLink2);
        nodeAndLinkList.add(nodeAndLink3);
        nodeAndLinkList.add(nodeAndLink4);
        nodeAndLinkList.add(nodeAndLink5);
        nodeAndLinkList.add(nodeAndLink6);
        nodeAndLinkList.add(nodeAndLink7);

        INL.nodeAndLinkList.addAll(nodeAndLinkList);
        //NodeAndLink nodeAndLink = new NodeAndLink(0, nodeAndLink1.getNode(), nodeAndLink1.getLink());
        //System.out.println(INL.find(nodeAndLink));

        Matrix matrix = new Matrix();
        matrix = matrix.matrixFilling(nodes);
        matrix.print();
    }
}
