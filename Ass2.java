package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

class Node2
{
    int key;
    Node2 left =null, right=null;
    Node2(int key){
        this.key=key;
    }
}
public class Ass2 {
    public static boolean isComplete(Node2 root){
        if(root==null){
            return true;
        }
        Queue<Node2> queue=new ArrayDeque<>();
        queue.add(root);

        Node2 curr;
        boolean flag=false;
        while(!queue.isEmpty()){
            curr=queue.poll();
            if(flag && (curr.left!=null || curr.right !=null)){
                return false;
            }
            if (curr.left ==null && curr.right!=null){
                return false;
            }
            if(curr.left!=null){
                queue.add(curr.left);
            }
            else{
                flag=true;
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            else{
                flag=true;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);
        root.right.right = new Node2(7);
        if(isComplete(root)){
            System.out.println("Complete Binary Tree");
        }
        else{
            System.out.println("Not a complete Binary Tree");
        }


    }
}
