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
public class Link {
    double LinkWeight;
    int LinkID;
    static int DirectedEdge=0; 

    public Link(double LinkWeight) {
        this.LinkWeight = LinkWeight;
        this.LinkID = DirectedEdge ++;
    }

    public Link() {
    }
    

    @Override
    public String toString() {
        return "Link{" + "LinkID=" + LinkID + '}';
    }
    
    
    
}
