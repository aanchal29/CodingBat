/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author asharma
 */
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    
    public BinaryTree(int key){
        root = new Node(key);
    }
    
    /*Algorithm Postorder(tree):- left, right, root
   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   3. Visit the root.*/
    public void printPostOrder(Node node){
        if(node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.key+" ");
        
    }
    
    /*Algorithm Inorder(tree):- left, root, right
   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   2. Visit the root.
   3. Traverse the right subtree, i.e., call Inorder(right-subtree)*/
    public void printInOrder(Node node){
        if(node == null)
            return;
        printInOrder(node.left);
        System.out.println(node.key+" ");
        printInOrder(node.right);
        
    }
    
    /*Algorithm Preorder(tree):- root, left, right
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree) */
    public void printPreOrder(Node node){
        if(node == null)
            return;
        printPreOrder(node.right);
        System.out.println(node.key+" ");
        printPreOrder(node.left);
        
    }
    
    // Wrappers over above recursive functions
    void printPreOrder() {
        printPreOrder(root);  
    }

    void printInOrder() {
        printInOrder(root);  
    }

    void printPostorder(Node root1) {
        printPostorder(root);  
    }

}
