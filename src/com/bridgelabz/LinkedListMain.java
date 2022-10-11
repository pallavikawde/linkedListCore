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
        myLinkedList.printLinkedList();


        /// searching thing
        INode searchedKey = myLinkedList.search(20);

        if(searchedKey.getKey().equals(20)) {
            System.out.println("Key Found");
        }
        else {
            System.out.println("Key Not Found");
        }







    }

}
