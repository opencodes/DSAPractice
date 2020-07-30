package tree;

import lib.TreeNode;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(10);
        b.insert(8);
        b.insert(9);
        b.insert(12);
        b.insert(16);
        TreeOperations t = new TreeOperations();
        t.inOrderTraversal(b.root);
    }
}
