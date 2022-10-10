package com.bridgelabz;

import java.util.LinkedList;



public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("----- Welocme to Data Structure: Linked List -----");
        System.out.println("Linked list 1 using add");
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedListCustom myLinkedList = new LinkedListCustom();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.printLinkedList();

        System.out.println("Linked list 1 using append");
        MyNode<Integer> Node1 = new MyNode<Integer>(56);
        MyNode<Integer> Node2 = new MyNode<Integer>(30);
        MyNode<Integer> Node3 = new MyNode<Integer>(70);
        LinkedListCustom myLinkedList1 = new LinkedListCustom();
        myLinkedList1.append(Node1);
        myLinkedList1.append(Node2);
        myLinkedList1.append(Node3);
        myLinkedList1.printLinkedList();
    }

}
