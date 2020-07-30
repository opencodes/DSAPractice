package tree;

import lib.Tree;
import lib.TreeNode;

public class TreeMain {
    public static void main(String[] args) {
        Tree t = new Tree(10);
        t.root.left = new TreeNode(20);
        t.root.right = new TreeNode(30);
        t.root.left.left = new TreeNode(40);
        t.root.left.right = new TreeNode(50);
        t.root.right.left = new TreeNode(60);
        t.root.right.right = new TreeNode(70);

        TreeOperations top = new TreeOperations();

        System.out.printf("\n Pre Order Traversal : \n");
        top.preOrderTraversal(t.root);

        System.out.printf("\n Pre Order Traversal ITR: \n");
        top.preOrderTraverseITR(t.root);

        System.out.printf("\n In Order Traversal : \n");
        top.inOrderTraversal(t.root);

        System.out.printf("\n In Order Traversal ITR: \n");
        top.inOrderTraversalITR(t.root);

        System.out.printf("\n Post Order Traversal : \n");
        top.postOrderTraversal(t.root);

        System.out.printf("\n Post Order Traversal ITR: \n");
        top.postOrderTraversalITR(t.root);

        System.out.printf("\n Level Order Traversal: \n");
        top.levelOrderTraversal(t.root);

        System.out.printf("\n Count Tree Node: \n");
        System.out.print(top.countFullNode(t.root));

        System.out.printf("\n Count Tree Node: \n");
        System.out.print(top.countLeafNode(t.root));

        System.out.printf("\n Count Tree Node: \n");
        System.out.print(top.countHalfLeafNode(t.root));
    }
}
