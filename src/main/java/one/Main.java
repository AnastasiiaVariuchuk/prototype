package one;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * one.Main class for running one.PageRank
 *
 * @author Gerardo Figueroa
 * Institute of Information Systems and Applications
 * National Tsing Hua University
 * Hsinchu, Taiwan
 * October 2013
 */
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    private static void printResultsCSV(Node[] nodeList, String separator) {
        System.out.println("Number" + separator + "one.Node data" +
                separator + "Rank" + separator + "Incoming" + separator + "Outgoing");
        for (Node node : nodeList) {
            System.out.println(
                    node.key + separator +
                            node.data + separator +
                            node.rank + separator +
                            node.incomingEdges.size() + separator +
                            node.outgoingEdges.size());
        }
    }

    public static void main(String[] args) {
        /*
         * Arg 0: Properties file
         * Arg 1: one.Graph matrix file
         */
        try {

            if (args.length == 2) {

                // Load one.PageRank Properties
                FileInputStream fis = new FileInputStream(args[0]);
                Properties props = new Properties();
                props.load(fis);
                PageRankProperties pageRankProperties = new PageRankProperties(props);

                // Load graph matrix file
                String graphFileDir = args[1];

                logger.info("");
                logger.info("Starting one.PageRank...");
                logger.info("one.PageRank Properties:\n" + pageRankProperties.toString());
                logger.info("");

                final PageRank pageRank = new PageRank(pageRankProperties);

                // Run one.PageRank
                Node[] nodeList = pageRank.run(graphFileDir);

                printResultsCSV(nodeList, pageRankProperties.graphFileSeparator);

                logger.info("");
                logger.info("one.PageRank completed!");
                logger.info("");
            }
            else {
                logger.error("Wrong arguments. Usage:\n"
                        + "one.PageRank properties_file graph_file");
            }

        }
        catch (FileNotFoundException fnfe) {
            logger.error("Properties file not found! " + fnfe.getMessage());
        }
        catch (IOException ioe) {
            logger.error("IO Exception! " + ioe.getMessage());
        }
        catch (Exception e) {
            logger.error("Exception in one.PageRank one.Main: " + e.getMessage());
        }
    }
}