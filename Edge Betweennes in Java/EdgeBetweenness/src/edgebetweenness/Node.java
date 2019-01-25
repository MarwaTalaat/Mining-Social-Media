/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edgebetweenness;

/**
 *
 * @author User
 */
public class Node {
    String NodeID;
    public Node(String NodeID){
    this.NodeID= NodeID;
    }

    @Override
    public String toString() {
        return "Node{" + "NodeID=" + NodeID + '}';
    }
    
    
}
