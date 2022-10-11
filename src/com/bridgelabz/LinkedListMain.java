package com.bridgelabz;

import java.util.LinkedList;



public class LinkedListMain {
    public static void main(String[] args) {

        System.out.println("----- Welcome to Data Structure: Linked List UC4 -----");

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListCustom myLinkedList = new LinkedListCustom();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        System.out.println("Inserting 30 between 56 and 70");
        myLinkedList.insert(firstNode, secondNode);
        myLinkedList.printLinkedList();




    }

}
