package com.codecool.SinglyLinkedlistDojo;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(12);
        myLinkedList.add(15);
        myLinkedList.add(3,1000);
        myLinkedList.add(0,1000);
        myLinkedList.add(2,1000);
        System.out.println(myLinkedList);
        myLinkedList.remove(6);
        System.out.println(myLinkedList);
    }
}
