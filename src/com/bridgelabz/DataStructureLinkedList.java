package com.bridgelabz;

import javax.xml.crypto.Data;

/* linked list learing problem
 * create a node class and perform compute on the linked list
 * create a linked list and pop the tail node
 */
public class DataStructureLinkedList {
    static Node head;
    //create a node for the linked list
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    // create the add method the give the value linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (this.head == null) {
            head = newNode;
        }
        else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    //create pop method make second last node tail node
    public  void popLastNode(){
        Node node = head;
        Node tail = head;
        while( tail.next.next != null)
            tail = tail.next;
        tail.next = null;

    }

    //display the data to linked list
    public static void display(){
        if(head == null){
            System.out.println("linked list has no value");
        }
        Node node = head;
        while(node.next != null){
            System.out.print("->"+node.data);
            node = node.next;
        }
        if(node.next == null){
            System.out.print("->"+node.data);
        }
    }
    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        //create obejct and give to the method
        DataStructureLinkedList linkedList = new DataStructureLinkedList();
        linkedList.addNode(56);
        linkedList.addNode(30);
        linkedList.addNode(70);
        display();
        System.out.println("linked list data");
        //pop method point the next node
        linkedList.popLastNode();
        display();


    }
}