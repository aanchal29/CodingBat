/*
 * Linked List Insertion
 */
package linkedList;

/**
 *
 * @author asharma
 */
public class insertion {
    Node head;
    
    class Node{
        int data;
        Node next;
        
        public Node(int d){
            data=d;
            next = null;
        }
    }
    
    // Inserts a new Node at front of the list
    public void push(int new_data){
       Node new_node = new Node(new_data); //Allocate the Node & Put in the data
       new_node.next = head;//Make next of new Node as head
       head= new_node; //Move the head to point to new Node
    }
    
    // Inserts a new Node after a given node in the list
    public void insertAfter(Node prev_node, int new_data){
        if(prev_node == null){//Check if the given Node is null
            System.out.println("The given previous node cannot be null");
            return;
        }
       Node new_node = new Node(new_data);//Allocate the Node & Put in the data
       new_node.next = prev_node.next;//Make next of new Node as next of prev_node
       prev_node.next=new_node;//make next of prev_node as new_node
    }
    
    // Inserts a new Node at the end of list
    public void insertEnd(int new_data){
       Node new_node = new Node(new_data);//Allocate the Node & Put in the data
       
       if(head == null){
           //System.out.println("The list is null. Adding the node as first element of the list");
           head = new Node(new_data);
           return;
       }
       new_node.next = null;//This new node is going to be the last node, so make next of it as null
       Node last = head; //traverse till the last node
       while(last.next != null){
           last = last.next;
       }
       last.next=new_node;//Change the next of last node
       
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
        insertion lList = new insertion();
        
        lList.insertEnd(6); //6->null
        lList.push(7);  //7->6->null
        lList.push(1); //1->7->6->null
        lList.insertEnd(4); //1->7->6->4->null
        lList.insertAfter(lList.head.next, 8); //1->7->8->6->4->NUllist
        lList.insertEnd(42);
        lList.printList();
    }
}
