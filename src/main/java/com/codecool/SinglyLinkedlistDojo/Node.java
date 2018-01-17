package com.codecool.SinglyLinkedlistDojo;

public class Node {

    private int info;
    private Node linkToNextNode;

    public Node(){
        this.info = 0;
        this.linkToNextNode = null;
    }

    public Node(int data, Node link) {
        this.info = data;
        this.linkToNextNode = link;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int data) {
        this.info = data;
    }

    public Node getLink() {
        return linkToNextNode;
    }

    public void setLink(Node link) {
        this.linkToNextNode = link;
    }
}
