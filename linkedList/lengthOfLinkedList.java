/*
 *A function to count number of nodes in a given singly linked list.
 */
package linkedList;

/**
 *
 * @author asharma
 */
public class lengthOfLinkedList {
     Node head;
     
    class Node{  
        int data;
        Node next;
        
        public Node(int d){
            data=d;
            next= null;
        }
    }
    
    //Inserts a new Node at front of the list
    public void push(int new_data){
    Node new_node = new Node(new_data); //Allocate the Node & Put in the data
    new_node.next = head;//Make next of new Node as head
    head= new_node; //Move the head to point to new Node    
    }
    
    public int getCount(){
        int count=0;
        Node temp= head;
        while(temp != null){
            temp= temp.next;
            count++;
        }
        return count;
    }
    
    //Printing the LinkedList
    public void printList(){
        Node print_node = head; //traverse till the last node
        while (print_node != null){
            System.out.print(print_node.data+" ");
            print_node = print_node.next;
        }
    }
    
    //Driver Method
    public static void main(String args[]){
        lengthOfLinkedList llist = new lengthOfLinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.printList();
        System.out.println("Count of nodes is " + llist.getCount());
    }
}

    
