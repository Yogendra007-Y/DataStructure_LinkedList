package com.bridgelabz;

import javax.xml.crypto.Data;

/* linked list learing problem
 * create a node class and perform compute on the linked list
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
    static void insertAtMid(int x)
    {
        // if list is empty
        if (head == null)
            head = new Node(x);
        else {
            // get a new node
            Node newNode = new Node(x);

            Node ptr = head;
            int len = 0;

            // calculate length of the linked list
            //, i.e, the number of nodes
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }

            // 'count' the number of nodes after which
            // the new node is to be inserted
            int count = ((len % 2) == 0) ? (len / 2) :
                    (len + 1) / 2;
            ptr = head;

            // 'ptr' points to the node after which
            // the new node is to be inserted
            while (count-- > 1)
                ptr = ptr.next;

            // insert the 'newNode' and adjust
            // the required links
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
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
        head = null;
        head = new Node(56);
        head.next = new Node(70);
        /*DataStructureLinkedList linkedList = new DataStructureLinkedList();
        linkedList.addNode(56);
        linkedList.addNode(70);
        System.out.println("Enter the node miidle of the linked list"); */
        insertAtMid(30);
        display();

    }
}
