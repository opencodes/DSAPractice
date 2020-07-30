package tree;

import lib.Tree;
import lib.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeOperations {
    // Root Left Right
    public void preOrderTraversal(TreeNode root){
        if (root != null){
            System.out.printf("" + root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    // Left Root Right
    public void inOrderTraversal(TreeNode root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.printf("" + root.data + " ");
            inOrderTraversal(root.right);

        }
    }
    // Left Right Root
    public void postOrderTraversal(TreeNode root){
        if (root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.printf("" + root.data + " ");
        }
    }
    // Root Left Right
    public void preOrderTraverseITR(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;
        if (root != null){
            st.push(root);
            while (!st.isEmpty()){
                TreeNode temp = st.pop();

                if (temp.right != null){
                    st.push(temp.right);
                }
                if (temp.left != null){
                    st.push(temp.left);
                }
                System.out.printf("" + temp.data + " ");
                current = temp.left;
            }
        }

    }
    // Left Root Right
    public void inOrderTraversalITR(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        // traverse the tree
        while (curr != null || st.size() > 0)
        {

            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                st.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = st.pop();

            System.out.print(curr.data + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }

    }
    // Left Right Root
    public void postOrderTraversalITR(TreeNode root){
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;
        st.push(root);
        // traverse the tree
        while (curr !=null){
            if (curr.left != null){
                st.push(curr.left);
            }
            if (curr.right != null){
                st.push(curr.right);
            }
            curr =curr.right;

        }
        while (!st.isEmpty()){
            TreeNode temp = st.pop();
            System.out.printf(" " + temp.data);
        }
    }
    // root -> L1 R1 -> L2 R2 L3 R3 -> ...
    public void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        q.add(root);
        while (!q.isEmpty()){
            if (current.left != null){
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }

            TreeNode t = q.poll();
            System.out.printf(" " + t.data);
            current = q.peek();
        }
    }
    // Left Right Root
    public void verticalOrderTraversal(TreeNode root){

    }
    // Left Right Root
    public void zigZagTraversal(TreeNode root){

    }

    public int countFullNode(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        q.add(root);
        int count = 0;
        while (!q.isEmpty()){
            if (current.left != null){
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }

            TreeNode t = q.poll();
            current = q.peek();
            count++;
        }
        return count;
    }

    public int countLeafNode(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        q.add(root);
        int count = 0;
        while (!q.isEmpty()){
            if (current.left != null){
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }
            if (current.left == null && current.right == null){
                count++;
            }

            TreeNode t = q.poll();
            current = q.peek();

        }
        return count;
    }

    public int countHalfLeafNode(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = root;
        q.add(root);
        int count = 0;
        while (!q.isEmpty()){
            if (current.left != null){
                q.add(current.left);
            }
            if (current.right != null){
                q.add(current.right);
            }
            if ((current.left == null && current.right != null) || (current.right == null && current.left != null)){
                count++;
            }

            TreeNode t = q.poll();
            current = q.peek();

        }
        return count;
    }

}
