package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeImple {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(10);
        tree.right = new Node(12);
        tree.right.left = new Node(19);
        tree.right.right = new Node(20);
        System.out.println(tree.levelOrder(tree));
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int key){
        this.data = key;
    }

    public void inorder(Node tree){
        if(tree == null)
        return;
        inorder(tree.left);
        System.out.print(tree.data + "-> ");
        inorder(tree.right);
    }

    public void preorder(Node tree){
        if(tree == null)
            return;
        System.out.print(tree.data + "-> ");
        preorder(tree.left);
        preorder(tree.right);
    }

    public void postorder(Node tree){
        if(tree == null)
            return;
        postorder(tree.left);
        postorder(tree.right);
        System.out.print(tree.data + "-> ");
    }

    public List<List<Integer>> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            result.add(subList);
        }
        return result;
    }
}