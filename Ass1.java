package Trees;
//Q1. Given the root of a binary tree, return the spiral level order traversal of its nodes' values. The
//      solution should consider the binary tree nodes level by level in spiral order, i.e., all nodes present
// at level 1 should be processed first from left to right, followed by nodes of level 2 from right to left,
//        followed by nodes of level 3 from left to right and so on... In other words, odd levels should be
 //       processed from left to right, and even levels should be processed from right to left.
class Node1{
    int key;
    Node1 left=null, right=null;
    Node1(int data){
        this.key=data;
    }
}
public class Ass1 {
    public static boolean printLevelLtoR(Node1 root,int l){
        if(root==null){
            return false;
        }
        if(l==1){
            System.out.println(root.key+" ");
            return true;
        }
        boolean left=printLevelLtoR(root.left,l-1);
        boolean right=printLevelLtoR(root.right,l-1);

        return right||left;
    }
    public static boolean printLevelRtoL(Node1 root,int l){
        if(root==null){
            return false;
        }
        if(l==1){
            System.out.println(root.key+" ");
            return true;
        }
        boolean right=printLevelRtoL(root.right,l-1);
        boolean left=printLevelRtoL(root.left,l-1);

        return right||left;

    }
    public static void spiralOrderTraversal(Node1 root){
        if(root==null){
            return;
        }
        int l=1;
        while (printLevelLtoR(root,l++) && printLevelRtoL(root,l++));
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.right.left = new Node1(5);
        root.right.right = new Node1(6);
        root.right.left.left=new Node1(7);
        root.right.left.right=new Node1(8);

        spiralOrderTraversal(root);
    }
}
