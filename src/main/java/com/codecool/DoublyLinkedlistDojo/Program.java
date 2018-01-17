package com.codecool.DoublyLinkedlistDojo;

public class Program {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(12);
        myLinkedList.add(15);
        System.out.println(myLinkedList.toString());
        myLinkedList.remove(2);
        System.out.println(myLinkedList.toString());
    }
}
