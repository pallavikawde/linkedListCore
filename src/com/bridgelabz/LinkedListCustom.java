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





    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }


}
