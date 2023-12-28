package Trees;

import java.util.ArrayList;
import java.util.List;

class Node4{
    int key;
    Node4 left=null, right=null;
    Node4(int data){
        this.key=data;
    }
}
public class Ass4 {
    public static List<Integer> leftSideView(Node4 root){
        List<Integer> res=new ArrayList<>();
        leftView(root,res,0);
        return res;
    }
    public static void leftView(Node4 curr,List<Integer> res,int currDepth){
        if(curr==null){
            return;
        }
        if(currDepth==res.size()){

            res.add(curr.key);
        }
        leftView(curr.left,res,currDepth+1);
        leftView(curr.right,res,currDepth+1);
    }

    public static void main(String[] args) {
        Node4 root=new Node4(1);
        root.left=new Node4(2);
        root.right=new Node4(3);
        root.right.right=new Node4(6);
        root.right.left=new Node4(5);
        root.right.left.left=new Node4(7);
        root.right.left.right=new Node4(8);
        List<Integer> res=leftSideView(root);
        System.out.println(res);
    }

}
