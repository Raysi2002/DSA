package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeImpleIterative {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        System.out.println(root.preorder(root));
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
    }

    List<Integer> preorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return result;
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            result.add(root.data);
            if (root.right != null) {
                stack.push(root.right);
            }
            if(root.left != null)
                stack.push(root.left);
        }
        return result;
    }

}