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
public class demoMain1 {

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        /*    10
            /    \
          null  null
        */
        
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        
        /*     10
            /      \
           5        30
          / \       / \
        null null null null
        */
        
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(6);
        /*    10
            /    \
           5     30
          /\
         3  6
        */

        tree.root.right.left = new Node(21);
        tree.root.right.right = new Node(30);
        /*    10
            /    \
           5     20
                 / \
                21  30
        */

    }
}
