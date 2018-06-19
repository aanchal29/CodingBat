/*
 * Recursive Java program for level order traversal of Binary Tree
 */
package BinaryTree;

/**
 *
 * @author asharma
 */

//Class containing left and right child of current node and key value
class Nodde{
    Nodde left, right;
    int key;
    
    public Nodde(int value){
        key= value;
        left = right = null;
    }
}

public class demoMain3BFSTraversal {
    
    Nodde root; // Root of the Binary Tree
    
    public demoMain3BFSTraversal(){
        root = null;
    }
    
    
    //Compute the "height" of a tree -- the number of nodes along the longest path from the root node down to the farthest leaf node.
    public int height(Nodde root){
        if( root == null){
            return 0;
        }
        else{
            //compute height of each subtree
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            //use the larger one
            if(leftHeight > rightHeight)
                return leftHeight+1;
            else
                return rightHeight+1;
        }
    }
    
    //function to print level order traversal of tree
    public void printLevel(){
        int h = height(root);
        for ( int i = 1; i<=h; i++){
            printGivenLevel(root, i);
        }
    }
    
    //Print nodes at the given level
    public void printGivenLevel(Nodde root, int level){
        if(root == null)
            return;
        if( level == 1)
            System.out.print(root.key+" ");
        else if (level>1){
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    
    // Driver program to test above functions 
    public static void main(String args[]){
	demoMain3BFSTraversal tree = new demoMain3BFSTraversal();
	tree.root= new Nodde(1);
	tree.root.left= new Nodde(2);
	tree.root.right= new Nodde(3);
	tree.root.left.left= new Nodde(4);
	tree.root.left.right= new Nodde(5);
		
	System.out.println("Level order traversal of binary tree is ");
	tree.printLevel();
    }
    
}

/*
Time Complexity: O(n^2) in worst case. For a skewed tree, printGivenLevel() takes O(n) time where n is the number of nodes in the skewed tree. 
So time complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2).
*/
