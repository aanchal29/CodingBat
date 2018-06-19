/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asharma
 */
public class binTreeSet1 {
    
    Node root;
    
    
    public binTreeSet1(){
        root = null;
    }
    
    public binTreeSet1(int item){
        root = new Node(item);
    }
    
    public static void main(String s[]){
        binTreeSet1 tree = new binTreeSet1();
        
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        //System.out.println(tree);
    }
}
