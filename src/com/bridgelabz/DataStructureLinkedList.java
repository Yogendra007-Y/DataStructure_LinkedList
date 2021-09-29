package com.bridgelabz;

public class DataStructureLinkedList {
    Node head;
    //create a node for the linked list
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String args[]) {
        System.out.println("welcome to linked list");
        //create obejct and give to the method
        DataStructureLinkedList linkedList = new DataStructureLinkedList();

    }
}
