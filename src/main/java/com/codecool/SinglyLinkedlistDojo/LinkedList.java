package com.codecool.SinglyLinkedlistDojo;

public class LinkedList {

    private Node head;
    private Node last;
    private int listLength;

    public LinkedList() {
        this.head = null;
        this.last = null;
        this.listLength = 0;
    }

    public int getLength() {
        return listLength;
    }

    public void add(int value) {
        Node newNode = new Node(value, null);
        listLength++;

        if (head==null) {
            head = newNode;
            last = newNode;
        } else {
            last.setLink(newNode);
            last = newNode;
        }
    }

}
