package com.bridgelabz;

import java.util.LinkedList;



public class LinkedListMain {
    public static void main(String[] args) {

        System.out.println("----- Welocme to Data Structure: Linked List -----");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedListCustom myLinkedList = new LinkedListCustom();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.printLinkedList();
    }

}
