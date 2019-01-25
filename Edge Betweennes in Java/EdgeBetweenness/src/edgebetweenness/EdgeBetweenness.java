/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edgebetweenness;
import java.util.*;

import org.apache.commons.collections15.Transformer;
import edu.uci.ics.jung.algorithms.importance.*;
import edu.uci.ics.jung.graph.*;
/**
 *
 * @author User
 */
public class EdgeBetweenness {
//this method is used to construct the graph and invokes methods in JUNG (JAVA UNIVERSAL NETWORK GRAOPH)
   public void BetweennessMethod(LinkedList<String> DistNodes, LinkedList<String> SVertex, LinkedList<String> Targrt, LinkedList<Double> EWeight){
   Link linkObj = new Link();
      Graph<Node, Link> graphh = new DirectedSparseGraph<>();
    //create node 
       LinkedList<Node> NodesSum = new LinkedList<>();
       Hashtable<String, Node> GNodes = new Hashtable< >(); // graph node
       LinkedList<Node> SNode= new LinkedList<>(); //source node
       LinkedList<Node> TNode = new LinkedList<>(); // target node
       //building graph nodes
       for (String NName : DistNodes) {
           Node data = new Node(NName);
           GNodes.put(NName, data);
       }
        
       //Now convert all source and target nodes into objects
       for (String SVertex1 : SVertex) {
           SNode.add(GNodes.get(SVertex1));
           TNode.add(GNodes.get(SVertex1));
       }
      
      //Now add nodes and edges to the graph
        for(int i=0;i<EWeight.size();i++)
        {
        graphh.addEdge(new Link(EWeight.get(i)),SNode.get(i), TNode.get(i), EdgeType.DIRECTED);
        }
        Transformer<Link, Double> Transformerwt = (Link mylink) -> linkObj.LinkWeight;
        BetweennessCentrality<Node,Link> betweeness;
       betweeness = new BetweennessCentrality<Node,Link>(graphh,Transformerwt);
       
       //Calculating Betweenness for all nodes
       NodesSum.stream().forEach((NodesSum1) -> {
           System.out.println(NodesSum1 + " Betweenness Centrality" + "Graph Node " + betweeness.getVertexRankScore(NodesSum1));
       });
       
   }
    
}
