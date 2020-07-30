package tree;

import lib.TreeNode;

public class BinarySearchTree {

    public TreeNode root;

    BinarySearchTree(){
        this.root = null;
    }

    public void insert(int data){
        TreeNode current = root;
        TreeNode parent = null;

        if(root == null){
            root = new TreeNode(data);
        }else {
            if (data < root.data){
                while (current != null){
                    parent = current;
                    current = current.left;
                }
                parent.left = new TreeNode(data);

            }else{
                while (current != null){
                    parent = current;
                    current = current.right;
                }
                parent.right = new TreeNode(data);
            }
        }
    }

    public TreeNode insertRec(TreeNode root, int data){

        return root;
    }

    public void insertITR(int data){

        root = insertRec( root,  data);
    }

    public boolean isThisBinarySearchTree(){

        return false;
    }

    public TreeNode search(int data){

        return root;
    }

    public TreeNode recSearch(TreeNode root, int data){
        if (data < root.data){
            return recSearch(root.left, data);
        }
        if(data > root.data){
            return recSearch(root.right, data);
        }
        return root;
    }

    public void searchRec(int data){
        TreeNode t = recSearch(root, data);
        if (t != null){
            System.out.printf("Data found ");
        }else {
            System.out.printf("Data Not found");
        }
    }

    public boolean isEqual(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if ((root1 != null && root2 == null) || (root1 == null && root2 != null)) {
            return false;
        } else if (root1 != null && root2 != null) {
            return isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
        }
        return root1.data == root2.data;
    }

    public boolean isMirrorImage(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if ((root1 != null && root2 == null) || (root1 == null && root2 != null)) {
            return false;
        } else if (root1 != null && root2 != null) {
            return isEqual(root1.left, root2.right) && isEqual(root1.right, root2.left);
        }
        return root1.data == root2.data;
    }

}
