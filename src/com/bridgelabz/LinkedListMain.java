package com.bridgelabz;

import java.util.LinkedList;



public class LinkedListMain {
    public static void main(String[] args) {

        System.out.println("----- Welcome to Data Structure: Linked List -----");

        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedListCustom myLinkedList = new LinkedListCustom();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode, secondNode);

        System.out.println("Linked list before deletion: ");
        myLinkedList.printLinkedList();
        INode deletedNode = myLinkedList.deleteFirst();
        System.out.println("The deleted key value is:"+deletedNode.getKey());
        System.out.println("Final linked list is:");
        myLinkedList.printLinkedList();




    }

}
