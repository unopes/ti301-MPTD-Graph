
package test;

import MTPD_EyOD.Graph;


public class GraphTest {
    public static void main(String[] args) {
        Graph defaultGraph  = new Graph();
        
        System.out.println(defaultGraph.toString());
        
        defaultGraph.setVertex(3);
        System.out.println(defaultGraph.toString());
        
        defaultGraph.setEdge(0, 1);
        defaultGraph.setEdge(1, 2);
        defaultGraph.setEdge(0, 2);
        
        System.out.println(defaultGraph.toString());
    }
}
