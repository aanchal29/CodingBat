/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author asharma
 */
public class IntLinkedList {

    class Node {

        private int value;
        private Node link;
    }

    private Node head;

    //constructor
    public IntLinkedList(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    //inserting node at the begining of the linked list
    public boolean insertNode(int item) {
        Node n = new Node();
        n.value = item; //adding the item
        n.link = head;
        head = n; //Move the head to point to new Node
        return true;
    }

    //displaying all what we have in linkedlist
    public void printAll() {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.link;

        }
    }

    public static void main(String s[]) {
        IntLinkedList i = new IntLinkedList(2);
        i.insertNode(3);
        i.printAll();
    }

}
