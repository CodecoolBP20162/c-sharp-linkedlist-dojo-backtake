package com.codecool.QueueDojo;

public class Node {
    private String value;
    private Node nextNode;

    public Node(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }
}
