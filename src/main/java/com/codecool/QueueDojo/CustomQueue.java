package com.codecool.QueueDojo;

public class CustomQueue {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public Node getFirstNode() {
        return firstNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public void enqueue(String value){
        Node newNode = new Node(value);
        size++;

        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
            lastNode = newNode;
        }
    }

    public String peek(){
        if (firstNode==null) {
            throw new IndexOutOfBoundsException("There is nothing to peek at!");
        }
        return firstNode.getValue();
    }

    public String dequeue(){
        if (firstNode==null) {
            throw new IndexOutOfBoundsException("There is nothing to remove!");
        }
        Node temp = firstNode.getNextNode();
        Node nodeToRemove = firstNode;
        firstNode = temp;
        size--;
        return nodeToRemove.getValue();
    }


}
