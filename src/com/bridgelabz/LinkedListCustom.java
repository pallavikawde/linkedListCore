package com.bridgelabz;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LinkedListCustom {
    private INode head;
    private INode tail;

    public LinkedListCustom() {

        this.head = null;
        this.tail = null;
    }


    // UC2   Ability to create Linked
//        List by adding 30 and 56
//        to 70
//        - Node with data 70 is First Created
//        - Next 30 is added to 70
//        - Finally 56 is added to 30
//        - LinkedList Sequence: 56->30->70
    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode temporarayNode = this.head;
            this.head = newNode;
            this.head.setNext(temporarayNode);

        }

    }


    // UC3   Ability to create Linked
//    List by appending 30 and 70 to 56
//            - Node with data 56 is First Created
//            - Next Append 30 to 56
//            - Finally Append 70 to 30
//            - LinkedList Sequence: 56->30->70

    public void append (INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode tempINode = this.tail;
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

//  UC4  Ability to insert
//    30 between 56 and 70
//            - Final Sequence: 56->30->70

    public void insert(INode previousNode, INode newNode) {
        // 56.getnext() address of 70
        // addesss of 70 avialable
        // 56.setNext(newNode)  56 -> 30 - > 70
        INode temporaryNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(temporaryNode);
    }



    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }


}
