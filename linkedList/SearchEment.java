/*
Write a C function that searches a given key ‘x’ in a given singly linked list. 
The function should return true if x is present in linked list and false otherwise
 */
package linkedList;

/**
 *
 * @author asharma
 */
public class SearchEment {
    Node head; //Head of list
    
    public class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next= head;
        head = new_node;
    }
    
    public boolean search(int key ){
        Node temp = head; //Initialize current
        while(temp != null){
          if(temp.data == key){
              return true;//data found
          }
          temp = temp.next;
        }
        return false;//data not found
    }
    
    public void printList(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main( String args[]){
        SearchEment llist = new SearchEment();
        llist.push(1);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        System.out.print("\nCreated Linked list is: ");
        llist.printList();
        System.out.println("\nElement 80 is present in Linked list: "+llist.search(80));
        
    }
}
