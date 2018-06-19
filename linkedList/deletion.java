/*
 * LinkedList Deletion
 */
package linkedList;

/**
 *
 * @author asharma
 */
public class deletion {

    Node head;

    class Node {

        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    // Inserts a new Node at front of the list
    public void push(int new_data) {
        Node new_node = new Node(new_data); //Allocate the Node & Put in the data
        new_node.next = head;//Make next of new Node as head
        head = new_node; //Move the head to point to new Node
    }

    // Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key) {
        Node temp = head; 
        Node prev = null;  // Store head node        

        if (temp != null && temp.data == key) { //If head node itself holds the key to be deleted
            head = temp.next; // Changed head
            return;
        }

        while (temp != null && temp.data != key) { //Search for the key to be deleted
            prev = temp; //keep track of the previous node as we need to change temp.next
            temp = temp.next;
        }

        if (temp == null) {
            return;// If key was not present in linked list
        }
        prev.next = temp.next;// Unlink the node from linked list
    }

    // Given a reference (pointer to pointer) to the head of a list and a position, deletes the node at the given position
    void deleteNodeByPosition(int position){       
        if (head == null) return; //If linked list is empty
        Node temp = head; // Store head node

        if (position == 0){ // If head needs to be removed
            head = temp.next;   // Change head
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++) // Find previous node of the node to be deleted
            temp = temp.next;
 
        if (temp == null || temp.next == null) // If position is more than number of ndoes
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next = next;  // Unlink the deleted node from list- free memory
    }
    
    //This function prints contents of linked list starting from the given node
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    //Drier program to test above functions
    public static void main(String[] args) {
        deletion llist = new deletion();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList(); //2 3 1 7

        llist.deleteNode(1); // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList(); //2 3 7
        //--------------------------
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList(); //8 2 3 1 7 2 3 7
 
        llist.deleteNodeByPosition(4);  // Delete node at position 4. Th position starts from 0
 
        System.out.println("\nLinked List after Deletion at position 4: ");
        llist.printList();//8 2 3 1 2 3 7
    }
}
