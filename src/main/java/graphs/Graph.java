package main.java.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Graph {
    Map<Integer, List<Integer>> adjacentGraph = new HashMap<>();

    public void addVertex(Integer val){

        List<Integer> conncections = new ArrayList<>();
        adjacentGraph.put(val, conncections);
    }

    public void addEdge(Integer node1, Integer node2){
        adjacentGraph.get(node1).add(node2);
        adjacentGraph.get(node2).add(node1);
    }

    public void showConnections(){
        adjacentGraph.forEach((key, value) -> {
            System.out.println(key + " -> " +value.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        });
    }

    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addVertex(5);
        myGraph.addVertex(6);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(4, 2);
        myGraph.addEdge(4, 5);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 0);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(6, 5);

        myGraph.showConnections();
    }
}
