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

//  UC5  Ability to delete the first
//    element in the LinkedList
//    of sequence 56->30->70 - Write pop method
//- Note there is new head
//- Final Sequence: 30->70

    public INode deleteFirst() {
        INode temporaryNode = this.head;
        this.head = this.head.getNext();
        return temporaryNode;

    }


//  UC6  Ability to delete the last
//    element in the LinkedList
//    of sequence 56->30->70 - Write popLast method
//- Note there is new tail
//- Final Sequence: 56->30
    public INode deleteLastNode() {
        INode temporaryNode = head;
        while(!temporaryNode.getNext().equals(tail)) {
            temporaryNode = temporaryNode.getNext();
        }
        this.tail = temporaryNode;
        temporaryNode = temporaryNode.getNext();
        return temporaryNode;
    }

//    Ability to search
//    LinkedList to find Node
//    with value 30
//- Loop through LinkedList to
//    find node with key 30


    public INode search(int key){
        INode temperoryNode = head;
        boolean isFound = false;

        while(temperoryNode !=null && isFound == false){
            if(temperoryNode.getKey().equals(key)) {
                isFound = true;
            } else {
                temperoryNode = temperoryNode.getNext();
            }
        }

        if(isFound)
            return temperoryNode;
        else {
            return head;
        }

    }

// UC8   Ability to insert 40 after 30 to
//    the Linked List sequence of 56->30->70

//- Search LinkedList to get Node with key value 30
//            - Then Insert 40 to 30
//            - Final Sequence: 56->30->40->70

    public void insertWithKey(int key, INode newNode) {

        INode nodeWithKeyValue = search(key); // UC7
        if(nodeWithKeyValue.getKey().equals(key)) {  //key 70
            INode temporaryNode = nodeWithKeyValue.getNext();
            nodeWithKeyValue.setNext(newNode);
            newNode.setNext(temporaryNode);
        }
        else {
            System.out.println("Key Node Found");
        }

    }

    public void printLinkedList () {
        System.out.println("My Nodes: "+head);
    }


}
