
public class LinkdLst{
    Node head;
    
    static class Node{
    int data;
    Node next;
    Node (int d){
        data =d;
        next = null;
    }
    }
    
    void printList(){
        Node n = head;
        
        while(n != null){
        System.out.println(n.data);
        n = n.next;
        }
    }
    public static void main(String s[]){
        LinkdLst l = new LinkdLst();
        
        l.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        
        l.head.next = second;
        second.next = third;
        
        l.printList();
    }
}
