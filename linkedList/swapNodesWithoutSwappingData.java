/*
 Given a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links. 
Swapping data of nodes may be expensive in many situations when data contains many fields.
It may be assumed that all keys in linked list are distinct.

Examples:

Input:  10->15->12->13->20->14,  x = 12, y = 20
Output: 10->15->20->13->12->14

Input:  10->15->12->13->20->14,  x = 10, y = 20
Output: 20->15->12->13->10->14

Input:  10->15->12->13->20->14,  x = 12, y = 13
Output: 10->15->13->12->20->14
 */
package linkedList;

/**
 *
 * @author asharma
 */
public class swapNodesWithoutSwappingData {
    Node head; //Head of list
    
    public class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public void swapNodes(int x , int y){
        Node temp = head;
        int posX=0, posY=0;
        System.out.print("\nInitial Value: "+posX+" "+posY);
        while(temp != null){
            temp = temp.next;
            posX++;
            if(temp.data == x){
            break;  
            }
        } 
        System.out.print("\nAfter posX: "+posX+" "+posY);
        
        while(temp != null){
            temp = temp.next;
            posY++;
            if(y == temp.data){
            break;  
            }
        } 
        System.out.print("\nAfter posY: "+posX+" "+posY);
    }
    
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next= head;
        head = new_node;
    }
    
    //This function prints contents of linked list starting from the given node
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    
     public static void main(String[] args) {
        swapNodesWithoutSwappingData llist = new swapNodesWithoutSwappingData();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("Created Linked list is:");
        llist.printList();
        llist.swapNodes(7,1); //2 3 1 7
     }
        

}
