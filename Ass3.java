package Trees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class Node3{
    int key;
    Node3 left=null,right=null;
    Node3(int key){
        this.key=key;
    }
}
public class Ass3 {
    public static void reverseOrderTraversal(Node3 root){
        if(root==null){
            return;
        }
        Queue<Node3> q=new ArrayDeque<>();
        q.add(root);
        Deque<Integer> stack=new ArrayDeque<>();
        Node3 curr;
        while (!q.isEmpty()){
            curr=q.poll();
            stack.push(curr.key);
            if(curr.right!=null){
                q.add(curr.right);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.poll()+" ");
        }
    }

    public static void main(String[] args) {
        Node3 root = new Node3(1);
        root.left = new Node3(2);
        root.right = new Node3(3);
        root.left.left = new Node3(4);
        root.right.left = new Node3(5);
        root.right.right = new Node3(6);
        root.right.left.left=new Node3(7);
        root.right.left.right=new Node3(8);
        reverseOrderTraversal(root);
    }

}
