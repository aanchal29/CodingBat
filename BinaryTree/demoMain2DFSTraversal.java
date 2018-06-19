package BinaryTree;

/**
 *
 * @author asharma
 */
// Java program for different tree traversals

/* Class containing left and right child of current
node and key value*/
class Nodee
{
	int key;
	Nodee left, right;

	public Nodee(int item)
	{
		key = item;
		left = right = null;
	}
}

class demoMain2DFSTraversal
{
	Nodee root;

	demoMain2DFSTraversal(){
		root = null;
	}

	void printPostorder(Nodee node)
	{
		if (node == null)
			return;
		printPostorder(node.left);
                printPostorder(node.right);
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Nodee node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Nodee node)
	{
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left sutree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() {	 printPostorder(root); }
	void printInorder() {	 printInorder(root); }
	void printPreorder() {	 printPreorder(root); }

	// Driver method
	public static void main(String[] args)
	{
		demoMain2DFSTraversal tree = new demoMain2DFSTraversal();
		tree.root = new Nodee(1);
		tree.root.left = new Nodee(2);
		tree.root.right = new Nodee(3);
		tree.root.left.left = new Nodee(4);
		tree.root.left.right = new Nodee(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}
}
