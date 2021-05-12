package examination.io;

import java.util.Deque;
import java.util.LinkedList;

public class BinaryTree<T> {

    class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public T val;

        public TreeNode(T val) {
            this.val = val;
        }
    }

    private TreeNode root;
    private Deque<TreeNode> deque = new LinkedList<>();

    public void add(T val) {
        if (root == null) {
            root = new TreeNode(val);
            deque.offerLast(root);
        } else {
            TreeNode temp = deque.peekFirst();
            if (temp.left == null) {
                temp.left = new TreeNode(val);
                deque.offerLast(temp.left);
            } else {
                temp.right = new TreeNode(val);
                deque.offerLast(temp.right);
                deque.pollFirst();
            }
        }
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {
        BinaryTree<String> mytree=new BinaryTree<>();
        mytree.add("A");
        mytree.add("B");
        mytree.add("C");
        mytree.add("D");
        mytree.add("E");
        mytree.add("F");

        mytree.preOrder(mytree.root);
    }
}


